package no_group.model.animals;

public class Tiger extends Predator {
    public Tiger() {
        inventorialNumber = inventoriedCounter;
        inventoriedCounter++;
    }
    public Tiger(int fd) {
        inventorialNumber = inventoriedCounter;
        inventoriedCounter++;
        food = fd;
    }

    //будем считать, что прибавление за нас уже кто-то делает
    public Tiger(int f, int inventorialnumber) {
        inventorialNumber = inventorialnumber;
        food = f;
    }
    //writeInfo сейчас наследуется от класса-родителя Predator (а он от Animal)
}
