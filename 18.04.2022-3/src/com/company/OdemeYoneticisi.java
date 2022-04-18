package com.company;

import java.io.IOException;

public class OdemeYoneticisi {
    private Odeme odeme;

    public OdemeYoneticisi(Odeme odeme) {
        this.odeme = odeme;
    }

    public void odemeYap(double miktar) throws IOException {
        odeme.Ode(miktar);
    }
}
