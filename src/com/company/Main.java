package com.company;

import java.util.ArrayList;
import java.util.List;

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
        
        Lew lew1 = new Lew();
        Losos losos1 = new Losos();
        Slon slon1 = new Slon();
        List<Lapy> innezwierzeta = new ArrayList<>();
        innezwierzeta.add(lew1);
        innezwierzeta.add(losos1);
        innezwierzeta.add(slon1);
        innezwierzeta.stream().forEach(Lapy-> System.out.println(Lapy.iloscLap()));


    }
}
