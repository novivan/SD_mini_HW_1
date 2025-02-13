package no_group.model.things;

public class Table extends Thing {
    public Table() {
        inventorialNumber = inventoriedCounter;
        inventoriedCounter++;
    }

    public Table(int iNumber) {
        inventorialNumber = iNumber;
    }
}
