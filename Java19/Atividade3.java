import java.util.Scanner;

public class Atividade3 {

    public static void main (String[]args) {

        System.out.println("Informe o seu nome: ");
        Scanner in = new Scanner(System.in);
        String nome = in.next();

        System.out.println("Informe a sua idade: ");
        Scanner year = new Scanner(System.in);
        int idade = year.nextInt();

        System.out.println("Ola " + nome + " sua idade e " + idade );
    }
}