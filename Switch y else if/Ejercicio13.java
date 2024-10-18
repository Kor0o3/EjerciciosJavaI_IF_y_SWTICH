import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, ano;

        System.out.print("Ingrese el numero de dia que desea: ");
        dia = sc.nextInt();
        System.out.print("Ingrese el numero del mes que desea: ");
        mes = sc.nextInt();
        System.out.print("Ingrese el numero de del año que desea: ");
        ano = sc.nextInt();

        if ( dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12){
            if (mes == 2){
                if (dia >= 1 && dia <= 29){
                    System.out.println("La fecha es correcta");
                } else {
                    System.out.println("La fecha es incorrecta");
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
                if (dia >= 1 && dia <= 30){
                    System.out.println("La fecha es correcta");
                } else {
                    System.out.println("La fecha es incorrecta");
                }
            } else {
                System.out.println("La fecha es correcta");
            }
        }   else {
            System.out.println("La fecha es incorrecta");
        }
    }
}
