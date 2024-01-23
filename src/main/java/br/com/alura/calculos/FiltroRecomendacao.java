package br.com.alura.calculos;
//Essa Classe foi criada para sugerir uma recomendação baseada na classificacao de Filme ou Série
public class FiltroRecomendacao {
    //Como pode-se ver, esse filtro usa a Interface Classificavel como parâmetro
    //O Classificavel serve tanto para Filme ou Serie, obviamente se houver implementado em sua Classe
    //Através disso usamos o conceito de Polimorfismo
    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 5){
            System.out.println("Avaliação: " + classificavel.getClassificacao() + " - Está entre os melhores");
        } else if(classificavel.getClassificacao() > 3){
            System.out.println("Avaliação: " + classificavel.getClassificacao() + " - Bem avaliado no momento");
        } else{
            System.out.println("Avaliação: " + classificavel.getClassificacao() +  " - Coloque em suas lista para assistir depois");
        }
    }
}
