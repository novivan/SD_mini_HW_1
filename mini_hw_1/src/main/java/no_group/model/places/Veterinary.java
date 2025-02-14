package no_group.model.places;

import no_group.model.animals.Animal;

public class Veterinary {
    public boolean checkHealth(Animal animal) {
        return (animal.Food() > 2);
    }
}