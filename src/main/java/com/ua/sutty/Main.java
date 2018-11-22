package com.ua.sutty;

import interfaces.task5.ArrayCollection;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayCollection<Double> arrayCollection = new ArrayCollectionImpl<>();
        arrayCollection.add(1.0);
        arrayCollection.add(1.0);
        arrayCollection.add(1.0);
        arrayCollection.add(1.0);
        arrayCollection.add(1.0);
        System.out.println(Arrays.toString(arrayCollection.getArray()));

    }

}
