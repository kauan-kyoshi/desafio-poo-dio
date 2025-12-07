package br.com.dio.desafio.dominio;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class MentoriaTest {

    @Test
    public void calcularXp_deveRetornarValorMaiorQuePadrao() {
        Mentoria m = new Mentoria();
        m.setData(LocalDate.now());
        double xp = m.calcularXp();
        assertTrue(xp > Conteudo.XP_PADRAO);
    }
}
