package br.com.pratica2;
import java.util.LinkedList;

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
