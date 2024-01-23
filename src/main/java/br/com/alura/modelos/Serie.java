package br.com.alura.modelos;

import br.com.alura.calculos.Classificavel;

//Extends é usado para referenciar de qual Classe eu estou Herdando os atributos e métodos
//Implements é usado para referenciar de qual Interface eu estou Herdando os métodos
public class Serie extends Titulo implements Classificavel {
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    //Getters e Setters
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    //Sobrescrita do método "getDuracaoEmMinutos" da Classe "Titulo"
    //"@Override" indica a sobrescrita de um método existente na classe super, ou melhor, Classe Titulo
    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    //Método usado da Interface Classificavel. Mesmo método criado na Classe Filme, porém, regra diferente
    @Override
    public int getClassificacao() {
        if (getAnoDeLancamento() < 1990) {
            return 10;
        }else if (getAnoDeLancamento() > 2000 && getAnoDeLancamento() < 2010){
            return 4;
        } else{
            return 2;
        }
    }
}
