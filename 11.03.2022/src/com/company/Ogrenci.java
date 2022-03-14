package com.company;

public class Ogrenci {
    private String tcNO;
    private String adSoyad;
    private String adres;

    public Ogrenci(String tcNo,String adSoyad,String adres){
        this.tcNO = tcNo;
        this.adSoyad = adSoyad;
        this.adres = adres;
    }

    @Override
    public String toString(){
        return tcNO + "-" + adSoyad + "-" + adres;
    }
}