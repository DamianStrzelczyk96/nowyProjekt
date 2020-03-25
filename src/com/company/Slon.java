package com.company;

public class Slon extends Zwierzaki {
int lapy = 4;
    @Override
    public int iloscLap() {
        return lapy;
    }

    @Override
    public String dajGłos() {
        return "wrrr";
    }

    @Override
    public void zmianaLapy(Integer lapy) {
        super.zmianaLapy(lapy);
        this.lapy = lapy;

    }
    @Override
    public String toString() {
        return "Slon posiada: " +
                lapy+" lapy i krzyczy: " + dajGłos()
                ;
    }
}
