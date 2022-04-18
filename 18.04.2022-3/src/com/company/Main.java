package com.company;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Odeme kartlaOdeme = new KartlaOdeme("Arda Burak Kontaş", "8465 1245 7986 2136");
        Odeme nakitOdeme = new NakitOdeme("Arda Burak Kontaş");
        OdemeYoneticisi odemeYoneticisi1 = new OdemeYoneticisi(kartlaOdeme);
        OdemeYoneticisi odemeYoneticisi2 = new OdemeYoneticisi(nakitOdeme);
        //dependency injection nasıl yazılır
        //constructor injection nasıl kullanılır
        odemeYoneticisi1.odemeYap(3999.99);
        odemeYoneticisi2.odemeYap(15.25);
    }
}
