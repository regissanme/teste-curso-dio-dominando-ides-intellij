package br.com.dio;

import br.com.dio.model.Gato;
/**
 * Curso: "Dominando IDE's Java" da DIO para o Bootcamp Java Cognizant"
 * Especialista da DIO: Camila Cavalcante
 * #teamJavaCog
 *
 * Criação o programa principal
 *
 * @author Reginaldo Santos de Medeiros data: 12/12/2021
 */
public class PrimeiroPrograma {
    public static void main(String[] args) {
        /*int a = 5;
        int b = 3;
        System.out.println("Hello World from IntelliJ " + (a + b));*/

        Gato gato = new Gato("Bichano", "branco", 5);
        System.out.println(gato);
        Livro livro = new Livro("The Foundation", 600);
        System.out.println(livro);
        Livro livro1 = new Livro("Robôs", 600);
        System.out.println(livro1);
    }
}
class Livro {
    private String nome;
    private int numPaginas;

    public Livro(String nome, int numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}