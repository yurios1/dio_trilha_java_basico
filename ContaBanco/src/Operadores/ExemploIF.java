package Operadores;

import java.util.Scanner;

public class ExemploIF {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite uma idade: ");
    int numberAge = scanner.nextInt();
    if (numberAge >= 18){
        System.out.println("Usuário maior de idade.");
    } else {
        System.out.println("Usuário menor de idade.");
    }
    }
}
