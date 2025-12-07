package br.com.dio.desafio.dominio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CursoTest {

    @Test
    public void calcularXp_deveRetornarXPcorreto() {
        Curso curso = new Curso();
        curso.setCargaHoraria(5);
        double xp = curso.calcularXp();
        assertEquals(Conteudo.XP_PADRAO * 5, xp);
    }
}
