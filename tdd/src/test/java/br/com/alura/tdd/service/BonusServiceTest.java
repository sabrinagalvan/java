package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    @Test
    void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {

        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Sabrina", LocalDate.now(), new BigDecimal("25000.00")));

        assertEquals(new BigDecimal("0.00"), bonus);

    }

    @Test
    void bonusDeveriaSerDezPorCentoDoSalario() {

        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Sabrina", LocalDate.now(), new BigDecimal("2500.00")));

        assertEquals(new BigDecimal("250.00"), bonus);

    }

    @Test
    void bonusDeveriaSerDezPorCentoParaSalarioDeExatamenteDezMilReais() {

        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Sabrina", LocalDate.now(), new BigDecimal("10000.00")));

        assertEquals(new BigDecimal("1000.00"), bonus);

    }

}
