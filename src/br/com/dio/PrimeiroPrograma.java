package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        /*int a = 5;
        int b = 3;
        System.out.println("Hello World from IntelliJ " + (a + b));*/

        Gato gato = new Gato("Bichano", "branco", 5);
        System.out.println(gato);
    }
}
