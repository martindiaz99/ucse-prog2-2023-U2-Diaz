package org.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class CalculadorCombustibleTest {
    //public CalculadorCombustible calculadorCombustible = new CalculadorCombustible();

    @Test
    public void testCalcularCombustible(){

        int distancia = 100;
        int combustibleEsperado = 4;


        int combustibleReal = 0;


        Avion avion = mock(AvionComercial.class);


        when(avion.volar(distancia)).thenReturn(4);


    }

}