/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoramedia;

/**
 *
 * @author FATEC ZONA LESTE
 */
  import java.util.Scanner;

public class Calculadoramedia {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora de Média de Notas");
        System.out.println("-----------------------------");
        
        // Solicita e lê as 4 notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        
        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();
        
        // Calcula a média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        // Exibe o resultado
        System.out.println("-----------------------------");
        System.out.printf("A média das notas é: %.2f%n", media);
        
        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}

   
       
    