/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.paa.sortalgorithms;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Joao
 */
public class BubbleSort {
    
    public Map<String, Object> bubbleSort(int vetor[]){
        int movimentação=0, comparação=0;
        for(int i=0; i<vetor.length - 1; i++){
            for(int j=0; j<vetor.length - 1 - i; j++){
                comparação++;
                if(vetor[j] > vetor[j+1]){
                    movimentação++;
                    int aux = vetor[j+1];
                    movimentação++;
                    vetor[j+1] = vetor[j];
                    movimentação++;
                    vetor[j] = aux;
                }
            }
        }
        Map<String, Object> resultadoBolha = new HashMap<>();
        resultadoBolha.put("VetorOrdenado", vetor);
        resultadoBolha.put("Comparações", comparação);
        resultadoBolha.put("Movimentações", movimentação);
        return resultadoBolha;
    }
    
    public int funçaoNumeroComparaçao(int n){
        n = (n * n - n ) / 2;
        return n;
    }
    
    public int funçaoNumeroMovimentaçao(int n){
        n = (3 *(n * n) - 3 * n ) / 2;
        return n;
    }
    
}
