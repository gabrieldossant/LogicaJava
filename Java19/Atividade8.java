import java.util.Scanner;

public class Atividade8 {
    public static void main (String[]args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = in.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = in.nextInt();

        if (n2 == 0) {
            while (n2 == 0) {
                System.out.println("O segundo numero é igual a zero. ");
                System.out.println("Digite outro número: ");
                n2 = in.nextInt();
            }
            double divisao = n1 / n2;
            System.out.println("A divisao dos numeros digitados sao. " + divisao);
        }
    } 
}