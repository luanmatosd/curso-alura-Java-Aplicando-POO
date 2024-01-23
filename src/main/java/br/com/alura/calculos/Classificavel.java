package br.com.alura.calculos;
//Essa Interface foi criado, pois, eu desejo agora classficar o Filme e a Série
//Invez de usar aquele método de Média da Classe Titulo, usarei essa Interface para as classificações

public interface Classificavel {
    //Método que será comum a toda Classe que fizer sua implementação
    //Esse método deve ser obrigatóriamente chamado pela Classe que a implantou
    int getClassificacao();
}
