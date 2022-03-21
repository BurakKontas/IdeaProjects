package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var dikdortgen = new Dikdorgen(10,20);
        System.out.println(dikdortgen.cevreHesapla());
        var kare = new Kare(20);
        System.out.println(kare.cevreHesapla());
    }
}
