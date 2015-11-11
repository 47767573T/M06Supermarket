import java.util.Scanner;

/**
 * Created by 47767573t on 11/11/15.
 */
public class Supermarket {

    static private int numClientes;
    static private Cliente[] clientes;
    static private int numCajas;
    static private Caja[] cajas;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        //Se determina el num de cajas (i.e. longitud del array de cajas)
        System.out.println("Determine el número de cajas del supermercado: ");
        numCajas = scn.nextInt();
        cajas = new Caja[numCajas];

        //Se determina el num de cajas (i.e. longitud del array de clientes)
        System.out.println("Determine el número de clientes: ");
        numClientes = scn.nextInt();
        clientes = new Cliente[numClientes];


        //::::::::::::::::::::::::::::EJERCICIO 1::::::::::::::::::::::::::::::::::::::::::::::::::::::


    }


}
