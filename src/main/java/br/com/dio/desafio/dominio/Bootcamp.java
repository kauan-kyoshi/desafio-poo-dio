package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Representa um Bootcamp que agrega conteúdos (cursos e mentorias)
 * e mantém a lista de desenvolvedores inscritos.
 */
public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();


    /**
     * Retorna o nome do bootcamp.
     * @return nome do bootcamp
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do bootcamp.
     * @param nome nome a ser atribuído
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a descrição do bootcamp.
     * @return descrição do bootcamp
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do bootcamp.
     * @param descricao descrição a ser atribuída
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Data inicial do bootcamp (data de criação).
     * @return data inicial
     */
    public LocalDate getDataInicial() {
        return dataInicial;
    }

    /**
     * Data final do bootcamp (dataInicial + 45 dias).
     * @return data final
     */
    public LocalDate getDataFinal() {
        return dataFinal;
    }

    /**
     * Retorna o conjunto de desenvolvedores inscritos.
     * @return conjunto de `Dev` inscritos
     */
    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    /**
     * Define o conjunto de desenvolvedores inscritos.
     * @param devsInscritos conjunto de desenvolvedores
     */
    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    /**
     * Retorna o conjunto de conteúdos (cursos e mentorias) do bootcamp.
     * @return conjunto de `Conteudo`
     */
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    /**
     * Define os conteúdos do bootcamp.
     * @param conteudos conjunto de conteúdos
     */
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}
