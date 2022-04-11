package com.company;

public class Main {

    static void Static(){
        System.out.println("Static");
    }
    void nonStatic(){
        System.out.println("Non-Static");
    };
    public static void main(String[] args) {
	// write your code here
        //nonStatic();
        Static();
    }
}
