package no_group.di;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;



public class SimpleContainer {
    private Map<Class<?>, Object> instances = new HashMap<>();

    //добавление класса с его зависимостями в контейнер
    public <T> void register(Class<T> clas) throws Exception {
        if (instances.containsKey(clas)) {
            return;
        }
        Constructor<?>[] constructors = clas.getConstructors();
        if (constructors.length == 0) {
            //если нет публичных, будем хранить приватные
            constructors = clas.getDeclaredConstructors();
        }

        // Выбираем конструктор с наибольшим кол-вом параметров(зависимостей)
        Constructor<?> mx_constructor = constructors[0];
        for (Constructor<?> c : constructors) {
            if (c.getParameterCount() > mx_constructor.getParameterCount()) {
                mx_constructor = c;
            }
        }

        if (!mx_constructor.isAccessible()) {
            mx_constructor.setAccessible(true);
        }

        //теперь рекурсивно регистрируем зависимости конструктора
        Class<?>[] paramTypes = mx_constructor.getParameterTypes();
        Object[] dependencies = new Object[paramTypes.length];

        for (int i = 0; i < paramTypes.length; i++) {
            if(!instances.containsKey(paramTypes[i])) {
                register(paramTypes[i]);
            }
            dependencies[i] = instances.get(paramTypes[i]);
        }
        //Создаем сам объект и регистриуем его
        Object instance = mx_constructor.newInstance(dependencies);
        instances.put(clas, instance);
    }

    public <T> T get(Class<T> clas) {
        return clas.cast(instances.get(clas));
    }
}
