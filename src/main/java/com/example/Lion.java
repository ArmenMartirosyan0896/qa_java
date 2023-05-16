package com.example;

import java.util.List;

public class Lion {

    private final boolean hasMane;
    private final Feline feline;

    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new LionException("Используйте допустимые значения пола животного - самей или самка");
        }

    }



    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }

    public static class LionException extends Exception {
        public LionException(String message) {
            super(message);
        }
    }
}
