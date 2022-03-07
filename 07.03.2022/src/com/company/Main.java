package com.company;

public class Main {
    static int elemanSayisi = 10;
    static int isaretci = 0;
    static int[] kuyruk = new int[elemanSayisi];

    static void ekle(int eklenecek) {
        kuyruk[isaretci]=eklenecek;
        isaretci++;
    }

    static int sil() {
        int deger = kuyruk[0];
        for (int i = 0; i < isaretci; i++) kuyruk[i-1] = kuyruk[i];
        isaretci--;
        return deger;
    }

    static String listele() {
        String cikti = "";
        for(int i=0;i<isaretci;i++) cikti += kuyruk[i]+"<-";
        return cikti;
    }

    public static void main(String[] args) {
	// write your code here
    ekle(5);
    System.out.println(listele());
    ekle(2);
    System.out.println(listele());
    System.out.println("Çıkartılan Eleman "+sil());
    System.out.println(listele());
    }
}
