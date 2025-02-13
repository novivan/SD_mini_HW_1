package no_group.model.animals;

import no_group.service.IAlive;
import no_group.service.Inventory;

abstract public class Animal extends Inventory implements IAlive {
    @Override
    public int Number() {
        return inventorialNumber;
    }
    @Override
    public int Food() {
        return food;
    }
    @Override
    public void writeInfo() {
        System.out.println("Food = " + food);
        System.out.println("Inventorial number = " + inventorialNumber);
    }

    public Animal() {
        inventorialNumber = inventoriedCounter;
        inventoriedCounter++;
    }
    public Animal(int fd) {
        inventorialNumber = inventoriedCounter;
        inventoriedCounter++;
        food = fd;
    }

    //будем считать, что прибавление за нас уже кто-то делает
    public Animal(int f, int inventorialnumber) {
        inventorialNumber = inventorialnumber;
        food = f;
    }

    
    protected int food;
}