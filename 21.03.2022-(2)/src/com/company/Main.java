package com.company;

/*
* TODO:
*  Dortgen adında bir sınıf oluşturucaz;
*  2 farklı biri dolu biri boş yapıcıları olacak
*  get ve setlerle kenarları değiştirilebilecek
*  çevre döndürecek
*/

import java.util.ArrayList;
import java.util.List;

class Dortgen{
    private int a;
    private int b;
    private int c;
    private int d;

    public Dortgen(){

    }

    public Dortgen(int kenar1,int kenar2,int kenar3,int kenar4){
        this.a = kenar1;
        this.b = kenar2;
        this.c = kenar3;
        this.d = kenar4;
    }

    public List<Integer> getKenarlar(){
        var liste = new ArrayList<Integer>();
        liste.add(a);
        liste.add(b);
        liste.add(c);
        liste.add(d);
        return liste;
    }
    public void setKenarlar(int kenar1,int kenar2,int kenar3,int kenar4){
        this.a = kenar1;
        this.b = kenar2;
        this.c = kenar3;
        this.d = kenar4;
    }

    public int cevrenHesapla(){
        return a+b+c+d;
    }
    @Override
    public String toString(){
        return "Dortgen";
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
    var arda = new Dortgen();
    var eren = new Dortgen(5,4,2,7);
    System.out.println(eren.cevrenHesapla());
    arda.setKenarlar(6,5,4,9);
    System.out.println(arda.cevrenHesapla());
    System.out.println(arda);
    }
}
