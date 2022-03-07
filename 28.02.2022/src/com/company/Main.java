package com.company;

class Kisi {
    private String ad;
    private String soyad;
    private byte yas;

    @Override
    public String toString() {
        return ad+" "+soyad+" "+yas;
    }
    public Kisi(String ad,String soyad,byte yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        var /*Kisi*/ user = new Kisi("Arda Eren","Yılmaz",(byte)20);
        System.out.println(user);
    }
}
