import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        int respuesa = 0;

        while (respuesa != 4) {
            System.out.println("""
                    1.- Registrar medico
                    2.- Registrar paciente
                    3.- Registrar consulta
                    4.-Salir""");
            System.out.print("Eliga una opcion: ");
            respuesa = scaner.nextInt();

            switch (respuesa) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    return;
            }
        }

    }
}