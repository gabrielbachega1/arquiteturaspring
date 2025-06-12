package io.github.gabrielbachega1.arquiteturaspring.montadora;

import java.awt.*;

public class HondaHRV extends Carro{

    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("HRV");
        setCor(Color.darkGray);
        setMontadora(Montadora.HONDA);
    }
}
