public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    Pessoa(){

    }

    Pessoa(String nome){
        this(nome, 0, 0);
    }

    Pessoa(String nome, int idade){
        this(nome, idade, 0);
    }

    Pessoa(int idade, String nome){
        this(nome, idade, 0);
    }

    Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    void mostrarDados(){
       System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Altura: " + altura);
    System.out.println("-------------------"); 
    }
}
