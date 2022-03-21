package com.company;

class Dortgen{
    protected int kenar1;
    protected int kenar2;
    protected int kenar3;
    protected int kenar4;


    public Dortgen(int kenar1, int kenar2, int kenar3, int kenar4) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.kenar3 = kenar3;
        this.kenar4 = kenar4;
    }

    public int cevreHesapla() {
        return kenar1+kenar2+kenar3+kenar4;
    }
}

class Dikdorgen extends Dortgen {
    public Dikdorgen(int kisaKenar, int uzunKenar) {
        super(kisaKenar,kisaKenar,uzunKenar,uzunKenar);
        kenar1 = kisaKenar;
        kenar2 = kisaKenar;
        kenar3 = uzunKenar;
        kenar4 = uzunKenar;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        var dikdortgen = new Dikdorgen(10,20);
        System.out.println(dikdortgen.cevreHesapla());
    }
}
