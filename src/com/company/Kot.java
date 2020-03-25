package com.company;

public class Kot extends Zwierzaki{
int lapy =4;

    @Override
    public String dajGłos() {

        return "miał";
    }

    @Override
    public int iloscLap() {
        return lapy;
    }
    @Override
    public void zmianaLapy(Integer lapy) {
        super.zmianaLapy(lapy);
        this.lapy = lapy;
    }
    @Override
    public String toString() {
        return "Kot posiada: " +
                lapy+" lapy i krzyczy: " + dajGłos()
                ;
    }
}