package no_group.model.animals;

public class Monkey extends Herbo {
    public Monkey() {
        inventorialNumber = inventoriedCounter;
        //inventoriedCounter++;
    }
    public Monkey(int fd) {
        inventorialNumber = inventoriedCounter;
        //inventoriedCounter++;
        food = fd;
        kindness = 4;
    }

    public Monkey(int fd, int kndns) {
        inventorialNumber = inventoriedCounter;
        //inventoriedCounter++;
        food = fd;
        kindness = kndns;
    }

    //будем считать, что прибавление за нас уже кто-то делает
    public Monkey(int f, int kndns, int inventorialnumber) {
        inventorialNumber = inventorialnumber;
        kindness = kndns;
        food = f;
    }

    @Override
    public void writeInfo() {
        System.out.println("Monkey");
        super.writeInfo();
    }
    
}
