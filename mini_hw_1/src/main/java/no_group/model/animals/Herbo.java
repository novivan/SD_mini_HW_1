package no_group.model.animals;

//от англ. "Herbivore" - травоядное
abstract public class Herbo extends Animal{
    @Override
    public void writeInfo() {
        super.writeInfo();
        System.out.println("Kindness = " + kindness);
    }

    public int Kindness() {
        return kindness;
    }

    protected int kindness;
}