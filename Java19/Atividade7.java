import java.util.Scanner;

public class Atividade7 {

    public static void main (String[]args) {

        System.out.println("Digite o primeiro número: ");
        Scanner v1 = new Scanner(System.in);
        int n1 = v1.nextInt();

        System.out.println("Digite o segundo número: ");
        Scanner v2 = new Scanner(System.in);
        int n2 = v2.nextInt();

        System.out.println("Digite o terceiro e ultimo número: ");
        Scanner v3 = new Scanner(System.in);
        int n3 = v3.nextInt();

        if (n1 < n2 && n1 < n3) {
            int soma = n2 + n3;
            System.out.println("Os maiores numeros digitados: " +  n2 + " e " + n3 + " e a soma deles é: " + soma);
        } else if (n2 < n1 && n2 < n3) {
            int soma = n1 + n3;
            System.out.println("Os maiores numeros digitados: " + n1 + " e " + n3 + " e a soma deles é: " + soma);
        } else if (n3 < n1 && n3 < n2) {
            int soma = n1 + n2;
            System.out.println("Os maiores numeros digitados: " + n1 + " e " + n2 + " e a soma deles é: " + soma);
        } 
    }
}