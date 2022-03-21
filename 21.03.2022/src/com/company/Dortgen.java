package com.company;

public class Dortgen {
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
        return kenar1 + kenar2 + kenar3 + kenar4;
    }
}
