import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***********************************");

        String encabezadoInicial = """
                Nombre del cliente: Tony Stark
                Tipo de cuenta: Corriente
                Saldo disponible: 1599.99$
                """;


        String opciones = """
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        double saldoActual = 1599.99;
        double saldoRetirado = 0;
        double saldoDeposito = 0;

        System.out.println(encabezadoInicial);

        int opcion = 0;

        do {
            System.out.println("***********************************");
            System.out.println("** Escriba el número de la opción deseada**");
            System.out.println(opciones);
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("El saldo actualizado es: " + saldoActual + "$");
                    break;
                case 2:
                    System.out.println("¿Cuál es el valor que deseas retirar?");
                    saldoRetirado = scanner.nextDouble();
                    if (saldoRetirado > saldoActual) {
                        System.out.println("Saldo insuficiente");
                    }
                    else {
                        saldoActual = saldoActual - saldoRetirado;
                        System.out.println("Saldo restante: " + saldoActual + "$");
                    }
                    break;
                case 3:
                    System.out.println("¿Cuál es el valor que vas a depositar?");
                    saldoDeposito = scanner.nextDouble();
                    saldoActual = saldoActual + saldoDeposito;
                    System.out.println("El saldo actualizado es: " + saldoActual + "$");
                    break;
                case 9:
                    System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios");
            }

        } while(opcion != 9);

        scanner.close();
    }
}