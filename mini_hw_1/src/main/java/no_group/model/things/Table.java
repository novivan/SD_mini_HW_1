package no_group.model.things;

public class Table extends Thing {
    @Override
    public void writeInfo() {
        System.out.println("This is a table with inventorial number = " + inventorialNumber + "\n");
    }

    public Table() {
        inventorialNumber = inventoriedCounter;
        inventoriedCounter++;
    }

    public Table(int iNumber) {
        inventorialNumber = iNumber;
    }
}
