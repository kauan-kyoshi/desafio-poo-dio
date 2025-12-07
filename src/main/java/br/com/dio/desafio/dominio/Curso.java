package br.com.dio.desafio.dominio;

/**
 * Representa um Curso com carga horária e cálculo de XP proporcional.
 */
public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    /**
     * Construtor padrão do Curso.
     */
    public Curso() {
    }

    /**
     * Retorna a carga horária do curso.
     * @return carga horária em horas
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * Define a carga horária do curso.
     * @param cargaHoraria horas de carga horária
     */
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
