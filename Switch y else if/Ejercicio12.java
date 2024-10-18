import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String figura;
        float base, altura, lado1, lado2, lado3, radio;

        System.out.print("Ingrese el figura: ");
        figura = sc.nextLine();

        if (figura.equalsIgnoreCase("Cuadrado")) {
            System.out.print("Ingrese su base: ");
            base = sc.nextFloat();
            System.out.println("Su area es: " + base * base);
        } else if (figura.equalsIgnoreCase("Rectangulo")) {
            System.out.print("Ingrese su altura: ");
            altura = sc.nextFloat();
            System.out.print("Ingrese su base: ");
            base = sc.nextFloat();
            System.out.println("Su area es: " + base * altura);
        } else if (figura.equalsIgnoreCase("Triangulo")) {
            System.out.print("Ingrese su lado: ");
            lado1 = sc.nextFloat();
            System.out.print("Ingrese su base: ");
            base = sc.nextFloat();
            System.out.println("Su area es: " + (base * lado1) / 2);
        } else if (figura.equalsIgnoreCase("Circulo")) {
            System.out.print("Ingrese su radio: ");
            radio = sc.nextFloat();
            System.out.print("Su area es: " + 3.141592654 * radio * radio);
        } else {
            System.out.print("Figura no valida");
        }
    }
}
