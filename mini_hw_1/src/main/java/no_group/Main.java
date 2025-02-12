package no_group;

/* TODO: доделать все классы!!!
    дописать, кто от кого наследуется + все по тз в целом переделать
*/

import no_group.model.animals.Tiger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        System.out.println("А теперь для примера создадим какой-то класс и что-нибудь у него спросим");
        // Создаем объект класса
        Tiger myFirstTigerInJava = new Tiger();
        int food = myFirstTigerInJava.Food();
        System.out.println("Сколько еды ест тигр? - " + food);
        
    }
}