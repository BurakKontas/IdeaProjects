package com.company;

import java.util.Random;

public class Main {

    static void Static(){
        System.out.println("Static");
    }
    void nonStatic(){
        System.out.println("Non-Static");
    };
    public static void main(String[] args) {
	// write your code here
        //nonStatic();
        //Static();
        for (int i = 0; i < 10; i++) {
            var sayi = new Random().nextInt(0,10    );
            var nesneler = PaketYoneticisi.PaketOlustur(sayi);
            PaketYoneticisi.print(nesneler);
        }

    }
}
