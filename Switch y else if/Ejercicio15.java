import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        String operador;
        int n1, n2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el operador (S,R,M y D): ");
        operador = sc.nextLine();
        System.out.print("Ingrese el n1: ");
        n1 = sc.nextInt();
        System.out.print("Ingrese el n2: ");
        n2 = sc.nextInt();

        switch (operador.toLowerCase()){
            case "s":
                System.out.println("El resultado es: " + (n1+n2));
                break;
                case "m":
                    System.out.println("El resultado es: " + (n1*n2));
                    break;
                    case "d":
                        System.out.println("El resultado es: " + (n1/n2));
                        break;
            case "r":
                System.out.println("El resultado es: " + (n1-n2));
                break;
                default:
                    System.out.println("Operador no valido");
        }
    }
}
