import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes;

        System.out.println("Horoscopo machin");
        System.out.print("Ingrese el numero de dia: ");
        dia = sc.nextInt();
        System.out.print("Ingrese el numero de mes: ");
        mes = sc.nextInt();

        if (dia >=21 && mes == 3 || dia <=19 && mes == 4 ){
            System.out.println("Tu horoscopo es Aries");
        } else if (dia >=20 && mes == 4 || dia <=20 && mes == 5 ){
            System.out.println("Tu horoscopo es Tauro");
        } else if (dia >=21 && mes == 5 || dia <=20 && mes == 6 ) {
            System.out.println("Tu horoscopo es Geminis");
        } else if (dia >=21 && mes == 6 || dia <=22 && mes == 7) {
            System.out.println("Tu horoscopo es Cancer");
        } else if (dia >=23 && mes == 7 || dia <=22 && mes == 8) {
            System.out.println("Tu horoscopo es Leo");
        } else if (dia >=23 && mes == 8 || dia <=22 && mes == 9) {
            System.out.println("Tu horoscopo es Virgo");
        } else if (dia >=23 && mes == 9 || dia <=22 && mes == 10) {
            System.out.println("Tu horoscopo es Libra");
        } else if (dia >=23 && mes == 10 || dia <=21 && mes == 11) {
            System.out.println("Tu horoscopo es Escorpio");
        } else if (dia >=22 && mes == 11 || dia <=21 && mes == 12) {
            System.out.println("Tu horoscopo es Sagitario");
        } else if (dia >=22 && mes == 12 || dia <=19 && mes == 1) {
            System.out.println("Tu horoscopo es Capricornio");
        } else if (dia >=22 && mes == 1 || dia <=21 && mes == 2) {
            System.out.println("Tu horoscopo es Acuario");
        } else if (dia >=19 && mes == 2 || dia <=20 && mes == 3) {
            System.out.println("Tu horoscopo es Piscis");
        } else {
            System.out.println("La horoscopo machin no machinea");
        }
    }
}

