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
        LinkedList<Integer> prioridade = new LinkedList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i = 1; i <= 200; i++) {
            list.add(i);
            if (i % 2 != 0 && i <= 100) {
                prioridade.add(i);
                list.remove(prioridade.indexOf(i));
            }
        }
        System.out.println("Lista de Prioridade: " + prioridade);
        System.out.println("Lista Comum: " + list);
    }
}
