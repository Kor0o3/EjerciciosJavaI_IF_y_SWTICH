import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pbase;
        String iva, codprom;

        System.out.print("Ingrese el precio base: ");
        pbase = sc.nextFloat();
        sc.nextLine();

        System.out.print("Ingrese el IVA aplicado (general, reducido o superreducido): ");
        iva = sc.nextLine();
        System.out.print("Ingrese el codigo promocional (nopro, mitad, meno5 o porc5): ");
        codprom = sc.nextLine();

        float general = (pbase * 21) / 100 + pbase;
        float reducido = (pbase * 10) / 100 + pbase;
        float superreducido = (pbase * 5) / 100 + pbase;

        if (iva.equalsIgnoreCase("general") || iva.equalsIgnoreCase("reducido") || iva.equalsIgnoreCase("superreducido")) {
            if (iva.equalsIgnoreCase("general")) {
                if (codprom.equalsIgnoreCase("nopro")) {
                    System.out.println("El precio final es: " + general);
                } else if (codprom.equalsIgnoreCase("mitad")) {
                    System.out.println("El precio final es: " + general / 2);
                } else if (codprom.equalsIgnoreCase("meno5")) {
                    System.out.println("El precio final es: " + (general - 5));
                } else if (codprom.equalsIgnoreCase("porc5")) {
                    System.out.println("El precio final es: " + general * 0.5);
                } else {
                    System.out.println("Descuento no valido");
                }
            }

            if (iva.equalsIgnoreCase("reducido")) {
                if (codprom.equalsIgnoreCase("nopro")) {
                    System.out.println("El precio final es: " + reducido);
                } else if (codprom.equalsIgnoreCase("mitad")) {
                    System.out.println("El precio final es: " + reducido / 2);
                } else if (codprom.equalsIgnoreCase("meno5")) {
                    System.out.println("El precio final es: " + (reducido - 5));
                } else if (codprom.equalsIgnoreCase("porc5")) {
                    System.out.println("El precio final es: " + reducido * 0.5);
                } else {
                    System.out.println("Descuento no valido");
                }
            }

            if (iva.equalsIgnoreCase("superreducido")) {
                if (codprom.equalsIgnoreCase("nopro")) {
                    System.out.println("El precio final es: " + superreducido);
                } else if (codprom.equalsIgnoreCase("mitad")) {
                    System.out.println("El precio final es: " + superreducido / 2);
                } else if (codprom.equalsIgnoreCase("meno5")) {
                    System.out.println("El precio final es: " + (superreducido - 5));
                } else if (codprom.equalsIgnoreCase("porc5")) {
                    System.out.println("El precio final es: " + superreducido * 0.5);
                }
            } else {
                System.out.println("Descuento no valido");
            }

        } else {
            System.out.println("Error monumental");
        }

    }
}
