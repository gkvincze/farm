package com.codecool.farm.animal;

public abstract class Animal {
    private int size = 0;

    public int getSize() {
        return this.size;
    }

    public abstract void feed();
}
