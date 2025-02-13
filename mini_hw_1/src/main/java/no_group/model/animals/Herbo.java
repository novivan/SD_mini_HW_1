package no_group.model.animals;

//от англ. "Herbivore" - травоядное
abstract public class Herbo extends Animal{
    int Kindness() {
        return kindness;
    }

    protected int kindness;
}