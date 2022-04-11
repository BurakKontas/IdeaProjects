package com.company;

public class FactoryBaglanti {
    private String okunanlar;
    private FactoryBaglanti(){}

    public static FactoryBaglanti DosyaBaglantisi(String dosyaYolu){
        return new FactoryBaglanti();
    }
    public static FactoryBaglanti VeritabanıBaglantisi(String baglantiStringi){
        return new FactoryBaglanti();
    }
    public String getOkunanlar() {
        return okunanlar;
    }
}
