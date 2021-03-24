package com.codecool.farm.animal;

public class Cattle extends Animal {
    private int size;

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void feed() {
        this.size += 2;
    }
}
