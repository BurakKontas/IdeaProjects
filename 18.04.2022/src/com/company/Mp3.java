package com.company;

public class Mp3 implements IMuzikCalar{
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
}
