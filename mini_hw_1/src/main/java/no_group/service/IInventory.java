package no_group.service;

public interface IInventory {
    int Number();

    //Кажется, это будет ненжно
    default boolean isInventory() {
        return true;
    }
   
}