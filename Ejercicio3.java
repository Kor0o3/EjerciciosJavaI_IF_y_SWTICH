import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float fuerza, ira;

        System.out.println("Hulk debe detener a Thanos que tiene un nivel de fuerza de 90");
        System.out.print("Intruduce la fuerza de Hulk: ");
        fuerza = sc.nextFloat();
        System.out.print("Intruduce la ira de Hulk: ");
        ira = sc.nextFloat();

        if (ira > 70) {
           fuerza = fuerza*2;
           System.out.println("La fuerza se ha doblado a: "+ fuerza);
        }

        if (fuerza >= 90) {
            System.out.println("Hulk ha podido detener a thanos");
        } else {
            System.out.println("Hulk no ha podido detener a thanos");
        }
    }
}
