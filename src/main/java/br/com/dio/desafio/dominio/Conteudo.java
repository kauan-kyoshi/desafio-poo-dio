package br.com.dio.desafio.dominio;

/**
 * Representa um conteúdo genérico do bootcamp (abstração).
 * Cursos e mentorias estendem essa classe e implementam o cálculo de XP.
 */
public abstract class Conteudo {

    /** Valor base de XP para conteúdos. */
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    /**
     * Calcula o XP deste conteúdo.
     * @return quantidade de XP
     */
    public abstract double calcularXp();

    /**
     * Retorna o título do conteúdo.
     * @return título
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o título do conteúdo.
     * @param titulo título a ser definido
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Retorna a descrição do conteúdo.
     * @return descrição
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do conteúdo.
     * @param descricao descrição a ser definida
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
