package br.com.dio.desafio.dominio;

import java.time.LocalDate;

/**
 * Representa uma mentoria com data e XP fixo adicional.
 */
public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    /**
     * Construtor padrão da mentoria.
     */
    public Mentoria() {
    }

    /**
     * Retorna a data da mentoria.
     * @return data da mentoria
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Define a data da mentoria.
     * @param data data a ser definida
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
