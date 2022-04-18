package com.company;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        var tel = new TusluTelefon();
        tel.ara();
        tel.reddet();
        System.out.println("******************************");
        var mp3 = new Mp3();
        mp3.oynat();
        mp3.degistir();
        mp3.dur();
        System.out.println("******************************");
        var smartPhone = new SmartPhone();
        smartPhone.ara();
        smartPhone.reddet();
        smartPhone.oynat();
        smartPhone.degistir();
        smartPhone.dur();
    }
}
