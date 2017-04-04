package com.gmail.osbornroad.beeradviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Натусик on 04.04.2017.
 */

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if ("amber".equals(color)) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}