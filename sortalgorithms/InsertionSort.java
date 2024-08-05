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
public class InsertionSort {
    
    public Map<String, Object> insertionSort(int vetor[]){
        int movimentação=0, comparação=0; 
        for (int i = 1; i < vetor.length; i++){
            int aux = vetor[i];
            movimentação++;
            int j = i - 1;
            while ((j >= 0) && (aux < vetor[j])){
                comparação++;
                vetor[j + 1] = vetor[j];
                movimentação++;
                j--;
            }
            vetor[j + 1] = aux;
            movimentação++;
        }
        Map<String, Object> resultadoInserção = new HashMap<>();
        resultadoInserção.put("VetorOrdenado", vetor);
        resultadoInserção.put("Comparações", comparação);
        resultadoInserção.put("Movimentações", movimentação);
        return resultadoInserção;
    }
    
    public int funçaoNumeroComparaçao(int n){
        n = (n * n - n ) / 2;
        return n;
    }
    
    public int funçaoNumeroMovimentaçao(int n){
        n = (n * n + 3 * n - 4) / 2;
        return n;
    }
    
}
