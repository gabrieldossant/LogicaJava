import java.util.Scanner;

public class Atividade5 {

    public static void main (String[]args) {

        System.out.println("Digite um número: ");
        Scanner valor = new Scanner(System.in);
        int num = valor.nextInt();

        if (num > 0) {
            System.out.println("O numero e positivo ");
        }
        if (num < 0) {
            System.out.println("O numero e negativo ");
        } else {
            System.out.println("O numero digitado e igual a zero ");
        }
    }
}