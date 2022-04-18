package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class KartlaOdeme implements Odeme {
    private String adSoyad;
    private String kartNo;

    public KartlaOdeme(String adSoyad, String kartNo) {
        this.adSoyad = adSoyad;
        this.kartNo = kartNo;
    }

    public void Ode(double miktar) throws IOException {
        Files.writeString(Path.of("asd"), adSoyad + ' ' + kartNo + " kartıyla " + miktar + " TL ödeme yaptı");
    }
}
