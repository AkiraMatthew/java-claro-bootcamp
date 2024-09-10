package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class SomaNumeros {
    // attributes
    private List<Integer> numeros;

    // constructor
    public SomaNumeros(){
        this.numeros = new ArrayList<>();
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        /*somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);*/

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        if(!numeros.isEmpty())
            for(Integer n: numeros)
                soma += n;
        return soma;
    }

    public int encontrarMaiorNumero(){
        // checa se a lista está vazia ou nao
        if(!numeros.isEmpty()){
            // retorna o valor máximo dentro do ArrayList
            return Collections.max(numeros);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero(){
        // checa se a lista está vazia ou nao
        if(!numeros.isEmpty()){
            // retorna o valor mínimo dentro do ArrayList
            return Collections.min(numeros);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        if(!numeros.isEmpty()){
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
}
