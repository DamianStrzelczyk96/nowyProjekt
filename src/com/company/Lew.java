package com.company;

public class Lew extends Zwierzaki {
int lapy = 4;

    @Override
    public int iloscLap() {
        return lapy;
    }

    @Override
    public String dajGłos() {
        return "WRAAA";
    }

    @Override
    public void zmianaLapy(Integer lapy) {
        super.zmianaLapy(lapy);
        this.lapy = lapy;
    }

    @Override
    public String toString() {
        return "Lew posiada: " +
                lapy+" lapy i krzyczy: " + dajGłos()
                ;
    }
}
