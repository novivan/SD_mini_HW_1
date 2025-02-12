package no_group.model.animals;

public class Tiger extends Predator {

    public Tiger() {
        
    }

    @Override
    public int Food() {
        System.out.println("I am a tiger and I eat meat");
        return 10;
    }
}
