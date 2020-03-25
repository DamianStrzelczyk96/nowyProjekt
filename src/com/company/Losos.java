package com.company;

public class Losos extends Zwierzaki {
    int lapy = 0;
    @Override
    public int iloscLap() {
        return lapy;
    }


    @Override
    public String dajGłos() {
        return null;
    }
    @Override
    public void zmianaLapy(Integer lapy) {
        super.zmianaLapy(lapy);
        this.lapy = lapy;
    }
}
