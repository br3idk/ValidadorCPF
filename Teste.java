package ValidadorCPF;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        
        String cpf_inserido;

        System.out.println("\nDigite um CPF:");

        Scanner input = new Scanner(System.in);

        cpf_inserido = input.nextLine();

        //System.out.println("o CPF é: " + cpf_inserido);

        String cpf_armazenado = "";

        for (int i = 0; i < cpf_inserido.length(); i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println();
            }
        }



    }
}
