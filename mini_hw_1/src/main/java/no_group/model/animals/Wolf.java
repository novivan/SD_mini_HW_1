package no_group.model.animals;

public class Wolf extends Predator {
    @Override
    public int Food() {
        System.out.println("I am a wolf and I eat meat");
        return 7;
    }
}