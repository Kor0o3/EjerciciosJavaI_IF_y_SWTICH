import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();

        if (numero % 10 == 0) {
            System.out.println(numero +" es multiplo de 10");
        } else {
            System.out.println(numero +" no es multiplo de 10");
        }
    }
}