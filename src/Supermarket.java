import java.util.Scanner;

/**
 * Created by 47767573t on 11/11/15.
 */
public class Supermarket {

    static private int numClientes;;
    static private int numCajas;

    public static void main(String[] args) throws InterruptedException {
        Scanner scn = new Scanner(System.in);

        //Se determina el num de cajas (i.e. longitud del array de cajas)
        System.out.println("Determine el número de cajas: ");
        numCajas = Integer.parseInt(scn.nextLine());

        //Se determina el num de clientes (i.e. longitud del array de clientes)
        System.out.println("Determine el número de clientes: ");
        numClientes = Integer.parseInt(scn.nextLine());

        Caja cajas = new Caja(numCajas);
        Cliente[] clientes = new Cliente[numClientes];

        for (int i = 0; i < numClientes; i++) {
            clientes[i] = new Cliente(i, cajas);
            clientes[i].start();
        }
    }
}
