package no_group.model.places;

import java.util.ArrayList;
import java.util.List;

import no_group.model.animals.Animal;
import no_group.model.animals.Herbo;
import no_group.service.Inventory;

import no_group.di.SimpleContainer;

public class Zoo {
    public Zoo() {
        animals = new ArrayList<Animal>();
        inventoried = new ArrayList<Inventory>();
        vet = new Veterinary();
    }

    public Zoo(Veterinary vt) {
        animals = new ArrayList<> ();
        inventoried = new ArrayList<> ();
        vet = vt;
    }

    public void addAnimal(Animal animal) {
        if (vet.checkHealth(animal)) {
            System.out.println("Animal have been added to the zoo successfully");
            animals.add(animal);
            inventoried.add(animal);
        } else {
            System.out.println("Animal is not healthy enough to be added to the zoo");
            Inventory.inventoriedCounter--;
        }
    }
    public void amountAnimalsReport() {
        if (animals.isEmpty()) {
            System.out.println("There are no animals in the zoo");
            return;
        }
        if (animals.size() == 1) {
            System.out.println("There is 1 animal in the zoo");
            return;
        }
        System.out.println("There are " + animals.size() + " animals in the zoo");
    }
    public void consumptionReport() {
        amountAnimalsReport();
        for (int i = 0; i < animals.size(); i++) {
            System.out.println("Animal with inventorial number " + animals.get(i).Number() + " consumes " + animals.get(i).Food() + " kilos of food per day");
        }
        System.out.println("");
    }
    public void generalReport() {
        amountAnimalsReport();
        for (int i = 0; i < animals.size(); i++) {
            System.out.println("");
            animals.get(i).writeInfo();
            System.out.println("");
        }
    }

    public void listSafeAnimals() {
        int printed_counter = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Herbo && ((Herbo)animals.get(i)).Kindness() > 5) {
                animals.get(i).writeInfo();
                System.out.println("");
                printed_counter++;
            }
        }
        if (printed_counter == 0) {
            System.out.println("There are no safe animals in the zoo");
            System.out.println("");
        }
    } 
    
    public void listAllInventoried() {
        if (inventoried.isEmpty()) {
            System.out.println("There aro no invetoried animals or tools in the zoo");
            System.out.println("");
            return;
        }
        System.out.println("There are " + inventoried.size() + " inventoried animals or tools in the zoo");
        for (int i = 0; i < inventoried.size(); i++) {
            inventoried.get(i).writeInfo();
            System.out.println("");
        }
    }


    private Veterinary vet;
    private List<Animal> animals;
    private List<Inventory> inventoried;
}
