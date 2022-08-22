package loops;

/*
Faça um programa que leia 5 números e informe o maior número e a média desses números
 */

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;

        do {
            System.out.println("Informe um número: ");
            numero = scan.nextInt();
            soma += numero;

            if(numero > maior) maior = numero;

            count += 1;
        } while(count < 5);

        System.out.println("Maior número: " + maior);
        System.out.println("A média dos números é: " + soma/5);
    }
}
