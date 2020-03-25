package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    Kot kot = new Kot();
        System.out.println(kot.dajGłos());
    Pies pies = new Pies();
        System.out.println(pies.dajGłos());

//        ArrayList<Głos> zwierzeta = new ArrayList();
////        zwierzeta.add(kot);
////        zwierzeta.add(pies);
////        zwierzeta.stream().forEach(Głos-> System.out.println(Głos.dajGłos()));
////
        Lew lew1 = new Lew();
        Losos losos1 = new Losos();
        Slon slon1 = new Slon();
//        List<Lapy> innezwierzeta = new ArrayList<>();
//        innezwierzeta.add(lew1);
//        innezwierzeta.add(losos1);
//        innezwierzeta.add(slon1);
//        innezwierzeta.stream().forEach(Lapy-> System.out.println(Lapy.iloscLap()));

        ArrayList<Zwierzeta> wszystko = new ArrayList<>();
        wszystko.add(lew1);
        wszystko.add(losos1);
        wszystko.add(slon1);
        wszystko.add(kot);
        wszystko.add(pies);

        wszystko.stream().forEach(Zwierzeta-> System.out.println(Zwierzeta));
        System.out.println("PO MODYFIKACJI");
        lew1.zmianaLapy(9);
        kot.zmianaLapy(8);
        wszystko.stream().forEach(Zwierzeta-> System.out.println(Zwierzeta + " "));


    }
}
