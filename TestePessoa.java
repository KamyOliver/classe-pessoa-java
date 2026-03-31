public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Ana", 20, 1.6);
        Pessoa p3 = new Pessoa("Jose");
        Pessoa p4 = new Pessoa("Carlos", 10);
        Pessoa p5 = new Pessoa(12, "Juan");
        p1.mostrarDados();
        p2.mostrarDados();
        p3.mostrarDados();
        p4.mostrarDados();
        p5.mostrarDados();
    }
    

}
