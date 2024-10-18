import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota;

        System.out.print("Ingrese la nota: ");
        nota = sc.nextFloat();

        if (nota >= 0 && nota <= 10) {
            if (nota >= 0 && nota < 5) {
                System.out.println("Isuficiente");
            } else if (nota == 5) {
                System.out.println("suficiente");
            } else if (nota == 6) {
                System.out.println("bien");
            } else if (nota == 7 || nota == 8) {
                System.out.println("notable");
            } else {
                System.out.println("Sobresaliente");
            }
        } else {
            System.out.println("Rango no valido");
        }
    }
}
