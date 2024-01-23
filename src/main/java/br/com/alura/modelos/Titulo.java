package br.com.alura.modelos;
//Usando o conceito de Herança
//Titulo serve tanto para a Classe Filme quanto para Série

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    //Getters e Setters
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //Métodos que não são básicos igual Getters e Setters
    public void exibeFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Lançado em: " + anoDeLancamento);
    }
    public void avalia (double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double exibeMedia (){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }
}
