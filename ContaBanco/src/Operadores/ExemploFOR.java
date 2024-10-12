package Operadores;

import java.util.Scanner;

public class ExemploFOR {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.next();
        int contarVogais = 0;
        for(int i = 0; i < palavra.length(); i++){
            char letra = palavra.charAt(i);
            String vogais = "aeiouAEIOU";
            if(vogais.indexOf(letra) != -1) {
                contarVogais++;
            }
        }
        System.out.println("A palavra " + palavra + " tem " + contarVogais + (contarVogais == 1 ? " vogal." : " vogais."));
        scanner.close();
    }
}
