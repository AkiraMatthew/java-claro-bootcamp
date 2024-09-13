package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {
    //atributo
    private List<Integer> numberList;

    public OrdenacaoNumeros(){
        this.numberList = new ArrayList<>();
    }

    public void addNumber(int number){
        this.numberList.add(number);
    }

    public List<Integer> orderAscendant(){
        List<Integer> ascendantNumbers = new ArrayList<>(this.numberList);
        if(!numberList.isEmpty()){
            Collections.sort(ascendantNumbers);
            return ascendantNumbers;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public List<Integer> orderDescendant(){
        List<Integer> descendantNumbers = new ArrayList<>(this.numberList);
        if(!numberList.isEmpty()){
            //Collections.sort(descendantNumbers, Comparator.reverseOrder());
            //or
            descendantNumbers.sort(Comparator.reverseOrder());
            return descendantNumbers;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void showNumbers(){
        if (!numberList.isEmpty()) {
            System.out.println(this.numberList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.addNumber(2);
        numeros.addNumber(5);
        numeros.addNumber(4);
        numeros.addNumber(1);
        numeros.addNumber(99);

        // Exibindo a lista de números adicionados
        numeros.showNumbers();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.orderAscendant());

        // Exibindo a lista
        numeros.showNumbers();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.orderDescendant());

        // Exibindo a lista
        numeros.showNumbers();
    }
}
