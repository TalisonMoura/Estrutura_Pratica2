package br.com.pratica2;
import java.util.LinkedList;
/*
    Fazer um programa usando lista que gere a entrada de dados de 200
    pessoas, separe as pessoas com a senha impar até o número 100,
    criando a lista de prioridades. Ao final deverão ser impressos a lista de
    prioridade e a lista ordenada das pessoas que estão na fila comum.

 */
public class Questao1 {
    public void LinkedList(){
        LinkedList<Integer> prioridadeList = new LinkedList<Integer>();
        LinkedList<Integer> comumList = new LinkedList<Integer>();
        for(int i = 1; i <= 200; i++) {
            comumList.add(i);
            if (i % 2 != 0 && i <= 100) {
                prioridadeList.add(i);
                comumList.remove(prioridadeList.indexOf(i));
            }
        }
        System.out.println("Lista de Prioridade: " + prioridadeList);
        System.out.println("Lista Comum: " + comumList);
    }
}
