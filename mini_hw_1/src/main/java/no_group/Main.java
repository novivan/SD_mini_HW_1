package no_group;

import no_group.model.places.Zoo;





public class Main {
    public static void main(String[] args) {
        /* 
        System.out.println("Hello world!");


        System.out.println("А теперь для примера создадим какой-то класс и что-нибудь у него спросим");
        // Создаем объект класса
        Tiger myFirstTigerInJava = new Tiger(15);
        int food = myFirstTigerInJava.Food();
        System.out.println("Сколько еды ест тигр? - " + food);
        */
        Zoo zoo = new Zoo();
        while (true) {
            System.out.println("Добро пожаловать в наш зоопарк! Вот все опции, которые у нас есть:");

            System.out.println("1. Добавить животное. Команда выглядит так: add <тип животного> <все \"поля\" этого типа животного через пробел в порядке описания в тз>");
            System.out.println("\tПримеры:");
            System.out.println("\t\t add Monkey 5 3");
            System.out.println("\t\t add Rabbit 5 3");
            System.out.println("\t\t add Tiger 3");
            System.out.println("\t\t add Wolf 3");

            System.out.println("2. Получить отчет по кол-ву животных. Команда: amount of animals");
            System.out.println("3. Получить отчет по кол-ву еды, потребляемой животными. Команда: consumption");
            System.out.println("4. Получить списки тех животных, которые могут быть помещены в контактный зоопарк. Команда: safe"); 
            System.out.println("5. Получить общий отчет по всему \"инвентарю\". Команда: full inventory");


            System.out.println("n. Выход из программы. Команда: exit");

            System.out.println("Названия команд и типы животных пишутся строго, как в инструкции выше!!!");
            System.out.println("Введите вашу команду:");
            //TODO: тут консольный ввод, проверка на корректность и вызов нужного метода
        }

                
    }
}