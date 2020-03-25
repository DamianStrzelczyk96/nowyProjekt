package com.company;

public class Pies implements Głos {

    @Override
    public String dajGłos() {
        StringBuilder bark = new StringBuilder();
        bark.append("HauHau");
        return bark.toString();
    }
}
