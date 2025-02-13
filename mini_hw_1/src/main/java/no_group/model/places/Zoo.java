package no_group.model.places;

import java.util.List;

import no_group.model.animals.Animal;
import no_group.service.Inventory;

public class Zoo {
    //TODO: IMPLEMENT
    public void addAnimal(Animal animal) {} //перед добавлением ветклиника должна проверить здоровье животного и дать вердикт
    public void amountAnimalsReport() {}
    public void consumptionReport() {}
    public void generalReport() {
        amountAnimalsReport();
        consumptionReport();
    }
    public void listSafeAnimals() {} 
    //тут мы должны вывести всех безопасный животных (то есть это автоматически травоядные животные)
    public void listAllInventoried() {}


    private Veterinary vet;
    private List<Animal> animals;
    private List<Inventory> inventoried;
}
