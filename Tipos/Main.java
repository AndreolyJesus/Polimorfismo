package Tipos;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();

        animal1.fazerSom();
        animal2.fazerSom();
    }
}
/*
    Nesse exemplo, temos uma classe abstrata Animal com um método fazerSom()
    que é sobrescrito pelas classes filhas Cachorro e Gato. Na classe Main,
    criamos instâncias de Cachorro e Gato e as atribuímos a variáveis do tipo Animal.
    Em seguida, chamamos o método fazerSom() em cada uma dessas variáveis.
    O resultado será que cada animal fará um som diferente,
    dependendo da implementação em sua classe filha.
    Esse é um exemplo de polimorfismo em Java.
 */