package com.company;

public class SmartPhone implements ITelefon,IMuzikCalar{
    @Override
    public void oynat() {
        System.out.println("Müzik oynatılıyor...");
    }

    @Override
    public void dur() {
        System.out.println("Müzik Durduruldu.");
    }

    @Override
    public void degistir() {
        System.out.println("Müzik Değiştirildi.");
        oynat();
    }

    @Override
    public void ara(){
        System.out.println("Bağlanıyor...");
        System.out.println("Aranıyor...");
    }

    @Override
    public void reddet() {
        System.out.println("Kapandı.");
    }
}
