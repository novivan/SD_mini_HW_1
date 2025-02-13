package no_group.service;


/* было
 
public interface IInventory {
    int Number();
    int inventoriedCounter = 0; // public static final автоматически
}
 */

// стало
public abstract class Inventory {
    public abstract int Number();
    public static int inventoriedCounter = 0; 

    protected int inventorialNumber;
}