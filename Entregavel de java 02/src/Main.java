//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class pessoa {
    String nome;
    int idade;
    String cidade;

    pessoa(String nome, int idade, String cidade){
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;

    }
}
class Carro {
    String modelo;
    int ano;
    String cor;

    Carro(String modelo, int ano, String cor){
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;

    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("exercicios 1 - pessoa");

        pessoa pessoa1 = new pessoa("Ana", 28, "São luis");
        pessoa pessoa2 = new pessoa("Bruno", 35, "Fortaleza");
        pessoa pessoa3 = new pessoa("Carla", 22, "Teresina");

        System.out.println(pessoa1.nome + " - " + pessoa1.idade + " anos" + " - " + pessoa1.cidade);
        System.out.println(pessoa2.nome + " - " + pessoa2.idade + " anos" + " - " + pessoa2.cidade);
        System.out.println(pessoa3.nome + " - " + pessoa3.idade + " anos" + " - " + pessoa3.cidade);

        if (pessoa1.idade >= pessoa2.idade && pessoa1.idade >= pessoa3.idade){
            System.out.println("A pessoa mais velha é:" + pessoa1.nome);
        } else if (pessoa2.idade >= pessoa1.idade && pessoa2.idade >= pessoa3.idade) {
            System.out.println("A pessoa mais velha é:" + pessoa2.nome);
        } else {
            System.out.println("A pessoa mais velha é:" + pessoa3.nome);
        }

        System.out.println();
        System.out.println("Exercicios 2 - carro");

        Carro carro1 = new Carro("Civic", 2020, "preto");
        Carro carro2 = new Carro("Corolla", 2022, "branco");

        carro1.cor = "roxo";

        System.out.println(carro1.modelo + " - " + carro1.ano + " - " + carro1.cor);
        System.out.println(carro2.modelo + " - " + carro1.ano + " - " + carro2.cor);

        System.out.println("A alteração no carro1 não afetou o carro2 porque cada objeto tem seu proprio espaço de memoria, mesmo sendo da mesmsa clasee.");




    }
}

