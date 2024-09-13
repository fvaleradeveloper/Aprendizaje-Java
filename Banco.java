//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Banco {

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);


            double saldo = 1599.99;
            double retiro;
            double deposito;
            boolean vuelta = true;

            //Menú del sistema

            while (vuelta) {
                System.out.println("*****************************");
                System.out.println(" ");
                System.out.println("Nombre del cliente: Tony Stark");
                System.out.println("Tipo de cuenta: Corriente");
                System.out.println("Saldo disponible: 1.599,99$");
                System.out.println(" ");
                System.out.println("*****************************");
                System.out.println("  ");
                System.out.println("MENÚ DE OPCIONES");
                System.out.println("1.- Consultar saldo.");
                System.out.println("2.- Retirar.");
                System.out.println("3.- Depositar.");
                System.out.println("4.- Salir.");
                System.out.print("** Su opción: ");
                int opcionMenu = teclado.nextInt();

                //Procedimientos
                switch (opcionMenu) {
                    case 1:
                        System.out.print("Saldo disponible: ");
                        System.out.printf("Saldo disponible: %.2f$\n", saldo);
                        break;
                    case 2:
                        System.out.print("Cantidad a retirar: ");
                        retiro = teclado.nextDouble();
                        if (retiro > saldo) {
                            System.out.println("No puede retirar más de lo que tiene en su saldo.");
                        } else {
                            saldo -= retiro;
                            System.out.printf("Saldo actualizado: %.2f$\n", saldo);
                        }
                        break;
                    case 3:
                        System.out.print("Cantidad a depositar: ");
                        deposito = teclado.nextDouble();
                        saldo = saldo + deposito;
                        System.out.printf("Saldo actualizado: %.2f$\n", saldo);
                        break;
                    default:
                        System.out.println("Salir");
                        vuelta = false;
                        break;
                }
            }
        }
}