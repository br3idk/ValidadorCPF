package ValidadorCPF;
//link do artigo: https://www.geradorcpf.com/algoritmo_do_cpf.htm
import java.util.Scanner;

public class ValidadorCPF {

    String CPF;

    public boolean ValidarCPF(String CPF) {

        String cpf_inserido;

        System.out.println("Digite um CPF:");

        Scanner input = new Scanner(System.in);

        cpf_inserido = input.nextLine();
        
        String cpf_armazenado;

        for (int i = 0; i < cpf_inserido.length(); i++) {
            System.out.println(cpf_inserido.charAt(i));
        }


        for (int i = 0; i < cpf_inserido.length(); i++) {
            
        }




        return true;
    }


}
