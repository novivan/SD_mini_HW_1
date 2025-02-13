package no_group.model.animals;

public class Rabbit extends Herbo{
    public Rabbit() {
        inventorialNumber = inventoriedCounter;
        inventoriedCounter++;
    }
    public Rabbit(int fd) {
        inventorialNumber = inventoriedCounter;
        inventoriedCounter++;
        food = fd;
        kindness = 4;
    }

    public Rabbit(int fd, int kndns) {
        inventorialNumber = inventoriedCounter++;
        food = fd;
        kindness = kndns;
    }

    //будем считать, что прибавление за нас уже кто-то делает
    public Rabbit(int f, int kndns, int inventorialnumber) {
        inventorialNumber = inventorialnumber;
        kindness = kndns;
        food = f;
    }
}
