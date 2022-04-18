package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NakitOdeme implements Odeme {
    private String adSoyad;

    public NakitOdeme(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public void Ode(double miktar) throws IOException {
        Files.writeString(Path.of("asd"), adSoyad + " " + miktar + " TL nakit ödeme yaptı");
    }
}
