package com.company;

import java.util.ArrayList;
import java.util.List;

class Kuyruk {
    private int elemanSayisi = 0;
    private int isaretci = 0;
    private List<Integer> kuyruk;

    public Kuyruk(int elemanSayisi) {
        this.elemanSayisi = elemanSayisi;
        kuyruk = new ArrayList<>();
    }

    int ekle(int eklenecek) {
        if(isaretci++ == elemanSayisi) return -1;
        kuyruk.add(eklenecek);
        return eklenecek;
    }

    int sil() {
        if(isaretci == 0) return -1;
        int deger = kuyruk.get(0);
        kuyruk.remove(0);
        isaretci--;
        return deger;
    }

     String listele() {
        var builder = new StringBuilder();
        for(int i=0;i< kuyruk.size();i++) builder.append(kuyruk.get(i)).append("<-");
        return builder.toString();
    }
}

public class Main {



    public static void main(String[] args) {
	// write your code here
        var kuyruk = new Kuyruk(5);
        System.out.println("Eklenecek: "+kuyruk.ekle(10));
        System.out.println(kuyruk.listele());
        System.out.println("Eklenecek: "+kuyruk.ekle(20));
        System.out.println(kuyruk.listele());
        System.out.println("Çıkartılan Eleman: "+kuyruk.sil());
        System.out.println(kuyruk.listele());
        System.out.println("Eklenecek: "+kuyruk.ekle(30));
        System.out.println(kuyruk.listele());
        System.out.println("Eklenecek: "+kuyruk.ekle(40));
        System.out.println(kuyruk.listele());
        System.out.println("Çıkartılan Eleman: "+kuyruk.sil());
        System.out.println(kuyruk.listele());
        System.out.println("Eklenecek: "+kuyruk.ekle(50));
        System.out.println(kuyruk.listele());
    }
}
