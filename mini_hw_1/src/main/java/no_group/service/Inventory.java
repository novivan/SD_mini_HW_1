package no_group.service;


public abstract class Inventory {
    public abstract int Number();
    public abstract void writeInfo();

    public static int inventoriedCounter = 0; 
    

    protected int inventorialNumber;
}