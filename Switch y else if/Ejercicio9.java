import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Ordenar numeros");
        System.out.print("Ingrese el primer numero: ");
        n1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        n2 = sc.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        n3 = sc.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            if (n2 >= n3) {
                System.out.println("De mayor a menor: "+ n1 +", "+n2 +", "+n3);
            } else {
                System.out.println("De mayor a menor: "+ n1 +", "+n3 +", "+n2);
            }
        } else if (n2 >= n1 && n2 >= n3) {
            if (n1 >= n3) {
                System.out.println("De mayor a menor: "+ n2 +", "+n1 +", "+n3);
            } else {
                System.out.println("De mayot a menor: "+ n2 +", "+n3 +", "+n1);
            }
        } else {
            if (n1 >= n2) {
                System.out.println("De mayor a menor: "+ n3 +", "+n1+", "+n2);
            } else {
                System.out.println("De mayor a menor: "+ n3 +", "+n2 +", "+n1);
            }
        }
    }
}
