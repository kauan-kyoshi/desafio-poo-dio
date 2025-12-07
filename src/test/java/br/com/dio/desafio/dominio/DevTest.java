package br.com.dio.desafio.dominio;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class DevTest {

    @Test
    public void inscreverEProgredir_deveMoverConteudos() {
        Curso curso = new Curso();
        curso.setTitulo("c1");
        curso.setCargaHoraria(2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("m1");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Tester");
        dev.inscreverBootcamp(bootcamp);

        assertFalse(dev.getConteudosInscritos().isEmpty());
        dev.progredir();
        assertTrue(dev.getConteudosConcluidos().size() >= 1);
    }
}
