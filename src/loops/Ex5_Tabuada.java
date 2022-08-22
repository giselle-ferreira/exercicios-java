package loops;

/*
Desenvolva um gerador de tabuada capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10.
O usuário deve informar de qual número ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
 */

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int result;

        System.out.println("Fazer a tabuada de: ");
        int numero = scan.nextInt();
        System.out.println("Tabuada de " + numero + ":\n");

        for (int i = 1 ; i <= 10 ; i++ ){
            result = numero * i;
            System.out.println(i + " X " + numero + " = " + result);
        }

    }
}
