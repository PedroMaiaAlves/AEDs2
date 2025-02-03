/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.revisaorecursividade;

import java.util.Scanner;

/**
 *
 * @author Pedro Henrique
 */
public class RevisaoRecursividade {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int op;

        do {
            System.out.println("Escolha opcao:");
            System.out.println("1. Somar numeros pares");
            System.out.println("2. Somar todos os elementos de um array");
            System.out.println("3. Contar quantas repeticoes houve em um vetor");
            System.out.println("Opcao: ");

            op = leitor.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Escolha o limite");
                    int limite = leitor.nextInt();
                    System.out.println("Resultado: " + somaPares(limite));
                    break;
                case 2:
                    System.out.println("Escolha o tamanho do vetor");
                    int tamanho = leitor.nextInt();
                    double[] vetor = new double[tamanho];
                    for (int j = 0; j < tamanho; j++) {
                        System.out.println("Valores do vetor: ");
                        vetor[j] = leitor.nextDouble();
                    }
                    System.out.println("Resultado: " + somaElementos(vetor, vetor.length -1));
                    break;
                case 3:
                    System.out.println("Escolha o tamanho do vetor");
                    int tamanho2 = leitor.nextInt();
                    int[] vetor2 = new int[tamanho2];
                    for (int j = 0; j < tamanho2; j++) {
                        System.out.println("Valores do vetor: ");
                        vetor2[j] = leitor.nextInt();
                    }
                    System.out.println("Escolha o numero que queria conferir se repete: ");
                    int num = leitor.nextInt();
                    System.out.println("Esse número se repetiu esse tanto de vez: " + contaElementos(vetor2, vetor2.length - 1, num));
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
            }
        } while (op != 4);
    }

    public static int somaPares(int limite) {
        if (limite == 0) {
            return 0;
        } else if (limite % 2 == 0) {
            return limite + somaPares(limite - 1);
        } else {
            return 0 + somaPares(limite - 1);
        }
    }
    
    public static double somaElementos(double[]vetor, int i){
        if(i < 0){
            return 0;
        } else {
            return vetor[i] + somaElementos(vetor, i-1);
        }
    }
    
    public static int contaElementos(int[]vetor, int i, int num){
        int contador = 0;
        if(i < 0){
            return contador;
        } else {
            if(vetor[i] == num){
                contador++;
            }
        }
        return contador + contaElementos(vetor, i - 1, num);
    }
}
// 0, 1, 2, 0

