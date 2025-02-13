package no_group.model.things;

import no_group.service.Inventory;

abstract public class Thing extends Inventory{
    @Override
    public int Number() {
        return inventorialNumber;
    }

    public Thing() {
        inventorialNumber = inventoriedCounter;
        inventoriedCounter++;
    }

    //будем считать, что прибавление за нас уже кто-то делает
    public Thing(int iNumber) {
        inventorialNumber = iNumber;
    }
}