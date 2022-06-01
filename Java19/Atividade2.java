import java.util.Scanner;

public class Atividade2 {

    public static void main (String[]args) {

        System.out.println("Informe o seu nome: ");
        Scanner in = new Scanner(System.in);

        String nome = in.next();
        System.out.println("Olá, " + nome + ".");
    }
}