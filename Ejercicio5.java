import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sigilo;
        String thydra;

        System.out.println("Ayuda a Viuda Negra a infiltrarse en la base hydra(nivel 85)");
        System.out.print("Ingrese su nivel de sigilo: ");
        sigilo = sc.nextFloat();
        System.out.print("Tiene traje de hydra (si/no): ");
        thydra = sc.next();

        if (sigilo >= 85 || thydra.equalsIgnoreCase("si")) {
            System.out.println("Viuda Negra ha conseguido infiltrase en hydra");
        } else {
            System.out.println("Viuda Negra no lo ha conseguido");
        }
    }
}
