package com.company;

import java.util.ArrayList;
import java.util.List;

public class PaketYoneticisi {
    public static List<Paket> PaketOlustur(int paketSayisi){
        var paketListesi = new ArrayList<Paket>();
        for (int i = 0;i<paketSayisi;i++) {
            paketListesi.add(new Paket(i));
        }
        return paketListesi;
    }
    public static void print(List<Paket> liste){
        for(var paket:liste){
            System.out.println(paket);
        }
    }
}
