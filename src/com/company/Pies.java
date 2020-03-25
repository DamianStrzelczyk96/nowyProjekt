package com.company;

public class Pies extends Zwierzaki {
    int lapy = 4;
    @Override
    public String dajGłos() {
        StringBuilder bark = new StringBuilder();
        bark.append("HauHau");
        return bark.toString();
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
        return "Pies posiada: " +
                lapy+" lapy i krzyczy: " + dajGłos()
                ;
    }
}
