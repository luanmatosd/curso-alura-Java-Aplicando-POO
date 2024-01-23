package br.com.alura.modelos;
import br.com.alura.calculos.Classificavel;

//Extends é usado para referenciar de qual Classe eu estou Herdando os atributos e métodos
//Implements é usado para referenciar de qual Interface eu estou Herdando os métodos
public class Filme extends Titulo implements Classificavel {
    private String diretor;

    //Esse método pode ser diferente da Classe série, não necessita seguir a mesma regra!
    @Override
    public int getClassificacao() {
        return (int) (exibeMedia());
    }
}
