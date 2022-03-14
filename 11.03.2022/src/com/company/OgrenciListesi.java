package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class OgrenciListesi {
    private Path dosyaYolu;
    List<Ogrenci> ogrenciler;

    private Ogrenci parseEt(String satir) {
        var parcalar = satir.split("-");
        return new Ogrenci(parcalar[0],parcalar[1],parcalar[2]);
    }

    public OgrenciListesi(Path dosyaYolu) {
        ogrenciler = new ArrayList<>();
        this.dosyaYolu = dosyaYolu;
        try {
            if(Files.exists(dosyaYolu)) {
                var satirlar = Files.readAllLines(dosyaYolu);
                for (var satir : satirlar) {
                    Ogrenci o = parseEt(satir);
                    ogrenciler.add(o);
                }
            } else {
                Files.createFile(dosyaYolu);
            }
        } catch (IOException err) {
            System.out.println(err.getMessage());
        } finally {
            //dosya kapatma işlemi

        }
    }

    public void ekle(Ogrenci ogrenci) {
        ogrenciler.add(ogrenci);
    }

    public void sil(int index) {
        ogrenciler.remove(index);
    }

    public void dosyayaKaydet(){
        List<String> output = new ArrayList<>();
        for(var ogrenci:ogrenciler)
            output.add(ogrenci.toString());
        try{
            Files.write(dosyaYolu,output);
        } catch (IOException err) {
            System.out.println(err.getMessage());
        }
    }
    public String listele() {
        String output = "-";
        for(var ogrenci:ogrenciler)
            output += ogrenci.toString() + "\n";
        return output;
    }
}
