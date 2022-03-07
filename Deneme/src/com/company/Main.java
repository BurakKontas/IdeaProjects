package com.company;

import java.util.*;

import static java.lang.Math.*;

public class Main {

    static double hesapla(double x) {
        return x + pow(x, 2) + pow(x, 3);
    }
    public static void main(String[] args) {
        /*      //List<Integer> liste = new ArrayList<Integer>();
        var liste = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            var sayi = scanner.nextInt();
            liste.add(sayi);
        }
        var sonucListesi = new ArrayList<Integer>();

        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) < 5) {
                var sonuc = hesapla(liste.get(i));
                sonucListesi.add((int) sonuc);
            }
        }
        for (var degisken : sonucListesi) {
            System.out.println(degisken);
        }
    }
    */
    var sayac = 0;
    var liste = List.of(1*1,2*2,3*3,4*4,5*5,6*6,7*7);
        for(var sayi:liste) {
            if(sayi > 10) {
                sayac++;
            }
        }
        System.out.println(sayac);
    }
}