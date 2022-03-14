package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Rand {
    private List<Integer> liste;
    Random random;

    public Rand(){
        liste = new ArrayList<>();
        random = new Random();
    }

    public List<Integer> intListesiAl(int elemanSayisi) {
        for (int i = 0; i < elemanSayisi; i++)
            liste.add(random.nextInt());
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
        var sonuc = r.intListesiAl(10);
        listele(sonuc);
    }
}
