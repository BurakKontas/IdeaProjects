package com.company;

class Kuyruk {
    int elemanSayisi = 0;
    int isaretci = 0;
    int[] kuyruk;

    public Kuyruk(int elemanSayisi) {
        this.elemanSayisi = elemanSayisi;
        kuyruk = new int[elemanSayisi];
    }

    int ekle(int eklenecek) {
        kuyruk[isaretci]=eklenecek;
        isaretci++;
        return eklenecek;
    }

    int sil() {
        int deger = kuyruk[0];
        for (int i = 1; i < isaretci; i++) kuyruk[i-1] = kuyruk[i];
        isaretci--;
        return deger;
    }

     String listele() {
        String cikti = "";
        for(int i=0;i<isaretci;i++) cikti += kuyruk[i]+"<-";
        return cikti;
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
