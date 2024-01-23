import br.com.alura.calculos.CalculadoraDeTempo;
import br.com.alura.calculos.FiltroRecomendacao;
import br.com.alura.modelos.Filme;
import br.com.alura.modelos.Serie;
//Ao colocar a Classe "Filme" e "Serie" em um pacote eu preciso importalá-la para fazer sua referência
//É necessário colocar todos os métodos dessa Classe como "Public". Sem o "Public" não é possível invocá-los

public class Principal {
    public static void main(String[] args) {
        //Criando e atribuindo valores ao Objeto Filme
        Filme topGun = new Filme();
        topGun.setNome("Top Gun: Maverick");
        topGun.setDuracaoEmMinutos(189);
        topGun.setAnoDeLancamento(1970);

        //Chamando métodos
        topGun.exibeFichaTecnica();
        System.out.println("Duração em minutos: " + topGun.getDuracaoEmMinutos());

        topGun.avalia(4);
        topGun.avalia(3);
        topGun.avalia(5);

        System.out.println("Média: " + topGun.exibeMedia() + "\n");

        //Criando e atribuindo valores ao Objeto Serie
        Serie theMentalist = new Serie();
        theMentalist.setNome("The Mentalist");
        theMentalist.setAnoDeLancamento(1950);
        theMentalist.setTemporadas(15);
        theMentalist.setEpisodiosPorTemporada(10);

        //Chamando métodos
        //Como não setei nada para duração, o valor é zero.
        theMentalist.exibeFichaTecnica();
        System.out.println("Duração em minutos: " + theMentalist.getDuracaoEmMinutos());

        // Como o cálculo é diferente de série para filme, iremos sobrescrever esse método!
        //A sobrescrita é feita na Classe Serie
        theMentalist.setMinutosPorEpisodio(25);
        System.out.println("Duração em minutos: " + theMentalist.getDuracaoEmMinutos() + "\n");

        //Criando e chamando o método de somar o tempo dos Filmes
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(topGun);
        System.out.println("Tempo total: " + calculadora.getTempoTotal() + " minutos");

        //Como eu criei o método inclui apenas para Filme, ele não permite incluir Séries
        //Para isso funcionar eu preciso fazer uma sobrecarga nesse método apontando para Série
        calculadora.inclui(theMentalist);
        System.out.println("Tempo total: " + calculadora.getTempoTotal() + " minutos\n");

        //Usando Polimorfismo através da Interface Classificavel
        //Como foi implementada tanto na Classe Filme como em Serie, posso usar para classificar os dois
        FiltroRecomendacao filtro = new FiltroRecomendacao();

        //Recomendação de um filme
        filtro.filtra(topGun);

        //Recomendação de uma série
        filtro.filtra(theMentalist);
    }
}
