import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;

        System.out.println("Contador de digitos");
        System.out.print("Introduce un numero: ");
        n1 = sc.nextInt();


        if (n1 >= 0 && n1 <= 99999) {
            if (n1 < 10) {
                System.out.println("Solo tiene un digito");
            } else if (n1 < 100) {
                System.out.println("Tiene dos digitos");
            } else if (n1 < 1000) {
                System.out.println("Tiene tres digitos");
            } else if (n1 < 10000) {
                System.out.println("Tiene cuatro digitos");
            }
        } else {
            System.out.println("Tiene cinco digitos");
        }
    }
}
