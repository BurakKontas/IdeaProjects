package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
    /*
    static void Static(){
        System.out.println("Static");
    }
    void nonStatic(){
        System.out.println("Non-Static");
    };
    */
    public static void main(String[] args) {
	// write your code here
        //nonStatic();
        //Static();
        /*
        for (int i = 0; i < 10; i++) {
            var sayi = new Random().nextInt(0,10    );
            var nesneler = PaketYoneticisi.PaketOlustur(sayi);
            PaketYoneticisi.print(nesneler);
        }
        */
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        LocalDateTime time2 = LocalDateTime.of(2022,04,11,16,32);
        System.out.println(time2);
        LocalDateTime time3 = LocalDateTime.parse("11.04.2022 13:52", DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"));
        System.out.println(time3);
    }
}
