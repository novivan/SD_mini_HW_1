package no_group.model.things;


public class Computer extends Thing {
    public Computer() {
        inventorialNumber = inventoriedCounter;
        inventoriedCounter++;
    }

    public Computer(int iNumber) {
        inventorialNumber = iNumber;
    }
}