package br.uni9.telas;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        
        // Criar duas arrayList
        List lista1 = new ArrayList(); 
        List lista2 = new ArrayList();

        // Lista 1 são os elemento
        lista1.add("Idade: ");
        lista1.add("Profissão: ");
        lista1.add("O que mais gosto: ");
        lista1.add("Quando posso, gosto de: ");
        lista1.add("A noite prefiro: ");
        lista1.add("Frase de Efeito: ");
        
        // Lista 2 são os valores dos elementos
        lista2.add(35);
        lista2.add("Estudante");
        lista2.add("Codar");
        lista2.add("Jogar videogame");
        lista2.add("Assistir séries");
        lista2.add("Fique Rico ou MORRA Tentando!!");
        
        // Enquanto o tamanho da lista 1 e 
        // o tamanho da lista 2 forem maior que 0
        while ((lista1.size()>0) && (lista2.size()>0)){
            
            // Cria uma variavel contadora que começa em 0
            int count = 0;
            
            // elemento vai pegar dentro de lista 1
            // a variavel q tiver na posição count
            Object elemento = lista1.get(count);
            
            // valor vai pegar dentro de lista 2
            // a variavel q tiver na posição count
            Object valor = lista2.get(count);
            
            // Printa na tela
            System.out.print(elemento);
            System.out.println(valor);
            
            // Remove da lista para ela diminuir e assim poder chegar a 0
            lista1.remove(count);
            lista2.remove(count);
            
            // variavel count passa a ter outro valor
            count++;
        }
    }
}
