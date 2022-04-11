package com.company;

public class Paket {
    static int paketsayisi;
    private int paketNo;

    Paket(int no){
        paketNo = paketsayisi++;
    }

    public int getPaketNo() {
        return paketNo;
    }
    @Override
    public String toString(){
        return "Paket No: " + paketNo;
    }
}
