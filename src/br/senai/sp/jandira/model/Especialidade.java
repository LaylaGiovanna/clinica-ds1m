package br.senai.sp.jandira.model;

public class Especialidade {

    private Integer codigo;
    private String nome;
    private String descricao;
    private static int contador = 100;

    
    //Construtores da classe
    public Especialidade(String nome) {
        this.nome = nome;
    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        atualizarCodigo();
    }

    public Especialidade() {
        atualizarCodigo();
    }

    private void atualizarCodigo() {
        this.codigo = contador;
        contador++;
    }

    // Métodos de acesso getters and setters
    public Integer getCodigo() {
        return codigo;
    }
    
    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getContador() {
        return contador;
    }

    public String getEspecialidadeSeparadoPorPontoEVirgula(){
        return this.codigo + ";" + this.nome + ";" + this.descricao;
    }
    
    
}
