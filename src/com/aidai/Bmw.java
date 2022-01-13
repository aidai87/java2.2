package com.aidai;

public class Bmw  extends Car {
    public Bmw(int year, int volum, String model) {
        super(year, volum);
        this.model = model;
    }

    private String model;

    public String getModel() {
        return model;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("model: " + this.model);

    }
}
