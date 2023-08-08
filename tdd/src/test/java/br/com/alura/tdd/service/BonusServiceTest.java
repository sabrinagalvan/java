package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {

        BonusService service = new BonusService();

//        try {
//            service.calcularBonus(new Funcionario("Sabrina", LocalDate.now(), new BigDecimal("25000.00")));
//            fail("Não deu a exception!");
//        } catch (Exception e) {
//            assertEquals("Funcionário com salário acima de R$10'000,00 não tem direito a bônus!", e.getMessage());
//        }

        assertThrows(IllegalArgumentException.class,() -> service.calcularBonus(new Funcionario("Sabrina", LocalDate.now(), new BigDecimal("25000.00"))));

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
