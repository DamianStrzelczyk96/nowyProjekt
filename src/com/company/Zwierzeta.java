package com.company;

public interface Zwierzeta extends Lapy,Głos {

    @Override
    String dajGłos();

    @Override
    int iloscLap();
}
