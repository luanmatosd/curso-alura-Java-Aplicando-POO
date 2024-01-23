package br.com.alura.calculos;
import br.com.alura.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    //Método usado para somar as horas dos filmes e armazenar na variaável "tempoTotal"
    /*
    public void inclui(Filme filme){
        tempoTotal += filme.getDuracaoEmMinutos();
    }

    //Usando sobrecarga de método
    public void inclui(Serie serie){
        tempoTotal += serie.getDuracaoEmMinutos();
    }*/

    //Sobrecarga de método não é uma boa prática
    //Pois, para cada novo caso será preciso copiar e colar o mesmo método
    //Abaixo, a maneira correta de fazer esse método usando Polimorfismo (evita duplicação de métodos):

    //Usando Polimorfismo
    //Polimorfismo = muitas formas de chamar
    //Como Filme e Serie pertencem a Titulo, com esse método, eu não sei quem ele irá chamar, se é Filme ou Série
    //Quando eu chamo "titulo.getDuracaoMinutos" ele não invoca da Classe Titulo, mas sim de quem chamou ele
    //Seja Filme ou Serie, ele invoca da subclasse que o chamou, não da Super Classe
    //Pois, as subclasses herdaram esse método da Super Classe
    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
