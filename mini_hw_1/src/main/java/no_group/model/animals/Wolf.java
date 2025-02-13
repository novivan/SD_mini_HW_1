package no_group.model.animals;

public class Wolf extends Predator {
    public Wolf() {
        inventorialNumber = inventoriedCounter;
        inventoriedCounter++;
    }
    public Wolf(int fd) {
        inventorialNumber = inventoriedCounter;
        inventoriedCounter++;
        food = fd;
    }

    //будем считать, что прибавление за нас уже кто-то делает
    public Wolf(int f, int inventorialnumber) {
        inventorialNumber = inventorialnumber;
        food = f;
    }
    //writeInfo сейчас наследуется от класса-родителя Predator (а он от Animal)
}