package com.company;

public class TusluTelefon implements ITelefon{
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
