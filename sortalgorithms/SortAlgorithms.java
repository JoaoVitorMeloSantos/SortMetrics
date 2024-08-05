/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ifmg.paa.sortalgorithms;

import java.util.Map;

/**
 *
 * @author Joao
 */
public class SortAlgorithms {

    public static void main(String[] args) {
        int vetor[] = {5,4,3,2,1};
        BubbleSort bolha = new BubbleSort();
        InsertionSort inserção = new InsertionSort();
        Map<String, Object> resultadosInserção = inserção.insertionSort(vetor);
        Map<String, Object> resultadosBolha = bolha.bubbleSort(vetor);
        
//        for(int i=0; i<((int[]) resultadosBolha.get("VetorOrdenado")).length; i++){
//            System.out.println(((int[]) resultadosBolha.get("VetorOrdenado"))[i]);
//        }
//        
//        System.out.println("Comparações: "+resultadosBolha.get("Comparações"));
//        System.out.println("Movimentações: "+resultadosBolha.get("Movimentações"));
//        System.out.println("Função número de comparações: "+ bolha.funçaoNumeroComparaçao(5));
//        System.out.println("função número de movimentações: "+ bolha.funçaoNumeroMovimentaçao(5));

        for(int i=0; i<((int[]) resultadosInserção.get("VetorOrdenado")).length; i++){
            System.out.println(((int[]) resultadosInserção.get("VetorOrdenado"))[i]);
        }
        System.out.println("Comparações: "+resultadosInserção.get("Comparações"));
        System.out.println("Movimentações: "+resultadosInserção.get("Movimentações"));
        System.out.println("Função número de comparações: "+ inserção.funçaoNumeroComparaçao(5));
        System.out.println("função número de movimentações: "+ inserção.funçaoNumeroMovimentaçao(5));        
    }
}
