package com.aidai;

public class Main {

    public static void main(String[] args) {
        createObject("Bmw").print();
        createObject("Tesla").print();
        createObject("Tayota").print();
    }
    static Printable createObject(String name){
        switch (name){
            case "Bmw":
                return new Bmw(2020,4,"X5");
            case "Tesla":
                return new Tesla(2022,2,"60 kWt");
            case "Tayota":
                return new Tayota(2015,3,"AWD");
            default:return null;



        }
    }

}
