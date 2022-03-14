package com.company;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


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
    public List<Double> doubleListesiAl(int elemanSayisi,double minimumDeger,double maximumDeger) {
        List<Double> liste = new ArrayList<>();
        for (int i = 0; i < elemanSayisi; i++) {
            liste.add(random.nextDouble(minimumDeger,maximumDeger));
        }
        return liste;
    }
}

public class Main {

    static <T> void listele(List<T> liste) {
        for(var eleman:liste) System.out.println(eleman);
        System.out.print("\n");//println pref
    }

    public static void main(String[] args) {
	// write your code here
        var r = new Rand();
        var sonuc = r.intListesiAl(10,150,500);
        listele(sonuc);
        var doubleSonuc = r.doubleListesiAl(10,50.15,60.987);
        listele(doubleSonuc);

        //////////////////////////////////////
                String dosyaYolu="C:/Users/konta/Desktop/Projects/Test/ogrenciler.txt";
                var ogrenciListesi = new OgrenciListesi(Path.of(dosyaYolu));
                while(true) {
                    System.out.println(ogrenciListesi.listele());
                    System.out.println("1. Ekle");
                    System.out.println("2. Sil");
                    System.out.println("3. Çıkış");
                    var scanner = new Scanner(System.in);
                    var secim = scanner.nextInt();
                    scanner.nextLine();
                    if (secim == 1) {
                        System.out.println("Tc:");
                        var tcNo = scanner.nextLine();
                        System.out.println("AdSoyad:");
                        var adSoyad = scanner.nextLine();
                        System.out.println("Adres:");
                        var adres = scanner.nextLine();
                        var yeniOgrenci = new Ogrenci(tcNo, adSoyad, adres);
                        ogrenciListesi.ekle(yeniOgrenci);
                    }
                    if (secim == 2){
                        System.out.println("Silinecek kaydın indisini giriniz:");
                        var indis = scanner.nextInt();
                        ogrenciListesi.sil(indis);
                    }
                    if (secim == 3) {
                        ogrenciListesi.dosyayaKaydet();
                        break;
                    }
                }
        /////////////////////////////////////

    }
}
