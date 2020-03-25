package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    Kot kot = new Kot();
        System.out.println(kot.dajGłos());
    Pies pies = new Pies();
        System.out.println(pies.dajGłos());

        ArrayList<Głos> zwierzeta = new ArrayList();
        zwierzeta.add(kot);
        zwierzeta.add(pies);
        zwierzeta.stream().forEach(Głos-> System.out.println(Głos.dajGłos()));
    }
}
