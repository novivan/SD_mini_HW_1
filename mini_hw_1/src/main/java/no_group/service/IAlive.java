package no_group.service;

public interface IAlive {
    int Food();

    //Кажется, это будет ненжно
    default boolean isAlive() {
        return true;
    }    
}
