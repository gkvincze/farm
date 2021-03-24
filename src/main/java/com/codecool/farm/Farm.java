package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {

    private List<Animal> animals = new ArrayList<>();

    public List<Animal> getAnimals() {
        return this.animals;
    }

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public void feedAnimals() {
        for (Animal animal : animals) {
            animal.feed();
        }
    }

    public void butcher(Butcher butcher) {
        //for (Animal animal : animals) {
           // if (butcher.canButcher(animal)) {
              //  animals.remove(animal);
           // }
        //}
    }

    public boolean isEmpty() {
        return animals.isEmpty();
    }

    public List<String> getStatus() {
        List<String> status = new ArrayList<>();
        for (Animal animal : animals) {
            status.add("There is a " + animal.getSize() + " sized "
                    + animal + " in the farm.");
        }
        return status;
    }

}
