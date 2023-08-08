package br.com.alura.tdd.test;

import br.com.alura.tdd.modelo.Calculadora;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void deveriaSomarDoisNumerosPositivos() {

        Calculadora calc = new Calculadora();
        int soma = calc.somar(3, 7);

        Assert.assertEquals(10, soma);

    }

}
