package no_group.model.animals;

public class Tiger extends Predator {
    public Tiger() {
        inventorialNumber = inventoriedCounter;
        //inventoriedCounter++;
    }
    public Tiger(int fd) {
        inventorialNumber = inventoriedCounter;
        //inventoriedCounter++;
        food = fd;
    }

    //будем считать, что прибавление за нас уже кто-то делает
    public Tiger(int f, int inventorialnumber) {
        inventorialNumber = inventorialnumber;
        food = f;
    }
    @Override
    public void writeInfo() {
        System.out.println("Tiger");
        super.writeInfo();
    }
}
