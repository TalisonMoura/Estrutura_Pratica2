package br.com.pratica2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.LinkedList;
import java.io.IOException;

/*
        Um casal está fazendo a lista de convidados para o seu casamento. A
        noiva possui uma lista com 60 convidados e o noivo com 55 convidados.
        Implemente um algoritmo que crie uma lista para cada um (noivo e
        noiva). Em seguida faça a união das listas e imprima o nome de cada
        convidado por ordem alfabética.
 */
public class Questao2 {
    public void ConviteCasamento() {
        String convNoivo, convNoiva;
        String pathNoiva = "ListaNoiva.txt";
        String pathNoivo = "ListaNoivo.txt";
        LinkedList<String> NoivaList = new LinkedList<String>();
        LinkedList<String> NoivoList = new LinkedList<String>();
        LinkedList<String> Convidados = new LinkedList<String>();
        try {
            FileReader frNoivo = new FileReader(pathNoivo);
            FileReader frNoiva = new FileReader(pathNoiva);
            BufferedReader bufferNoivo = new BufferedReader(frNoivo);
            BufferedReader bufferNoiva = new BufferedReader(frNoiva);

            while ((convNoivo = bufferNoivo.readLine()) != null) {
                NoivoList.add(convNoivo);
            }
            while ((convNoiva = bufferNoiva.readLine()) != null) {
                NoivaList.add(convNoiva);
            }

            Convidados.addAll(NoivoList);
            Convidados.addAll(NoivaList);
            Collections.sort(Convidados);

            for (String nome : Convidados) {
                System.out.println(nome);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
