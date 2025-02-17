/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ordenadoreficiente;

import java.util.Scanner;

/**
 *
 * @author Pedro Henrique
 */
public class OrdenadorEficiente {

    public static void imprimirVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void imprimirVetorMaior(int[] vetorMenores) {
        for (int num : vetorMenores) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void imprimirVetorMenor(int[] vetorMaiores) {
        for (int num : vetorMaiores) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("Digite o tamanho par do vetor");
        Scanner s1 = new Scanner(System.in);
        int tamVetor = s1.nextInt();
        int[] vetor = new int[tamVetor];
        int tamMetade = vetor.length / 2;
        int[] vetorMenores = new int[tamMetade]; 
        int[] vetorMaiores = new int[tamMetade];

        System.out.println("Digite os valores do vetor");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = s1.nextInt();
        }
        //{8,2,5,6,3,4,7,1}
        //{1,2,3,4,5,6,7,8}
        for (int i = 0, j = vetor.length - 1; i < vetor.length / 2; i++, j--) {
            if (vetor[i] > vetor[j]) {
                int valor = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = valor;
            }
        }

        for (int i = 0; i < tamMetade; i++) {
            vetorMenores[i] = vetor[i];
            vetorMaiores[i] = vetor[i + tamMetade];
        }

        for (int i = 1; i < vetorMenores.length; i++) {
            int temp = vetorMenores[i];

            if (vetorMenores[i - 1] > vetorMenores[i]) {
                vetorMenores[i] = vetorMenores[i - 1];
                vetorMenores[i - 1] = temp;
            }
        }

        for (int i = 1; i < vetorMaiores.length; i++) {
            int temp = vetorMaiores[i];

            if (vetorMaiores[i - 1] > vetorMaiores[i]) {
                vetorMaiores[i] = vetorMaiores[i - 1];
                vetorMaiores[i - 1] = temp;
            }
        }

        imprimirVetor(vetor);
        imprimirVetorMenor(vetorMenores);
        imprimirVetorMaior(vetorMaiores);
    }
}