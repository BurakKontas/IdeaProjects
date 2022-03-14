package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Rand {
    Random random;

    public Rand(){
        random = new Random();
    }

    public List<Integer> intListesiAl(int elemanSayisi) {
        List<Integer> liste = new ArrayList<>();
        for (int i = 0; i < elemanSayisi; i++)
            liste.add(random.nextInt());
        return liste;
    }

    public List<Integer> intListesiAl(int elemanSayisi,int minimumDeger) {
        List<Integer> liste = new ArrayList<>();
        for (int i = 0; i < elemanSayisi; i++) {
            liste.add(random.nextInt(minimumDeger,Integer.MAX_VALUE));
        }
        return liste;
    }
    public List<Integer> intListesiAl(int elemanSayisi,int minimumDeger,int maximumDeger) {
        List<Integer> liste = new ArrayList<>();
        for (int i = 0; i < elemanSayisi; i++) {
            liste.add(random.nextInt(minimumDeger,maximumDeger));
        }
        return liste;
    }
}

public class Main {

    static void listele(List<Integer> liste) {
        for(var eleman:liste) System.out.println(eleman);
    }

    public static void main(String[] args) {
	// write your code here
        var r = new Rand();
        var sonuc = r.intListesiAl(10,150,500);
        listele(sonuc);
    }
}