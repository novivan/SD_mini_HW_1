package no_group.model.things;


public class Computer extends Thing {
    @Override
    public void writeInfo() {
        System.out.println("This is a computer with inventorial number = " + inventorialNumber + "\n");
    }


    public Computer() {
        inventorialNumber = inventoriedCounter;
        inventoriedCounter++;
    }

    public Computer(int iNumber) {
        inventorialNumber = iNumber;
    }
}