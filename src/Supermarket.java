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
        System.out.println("Determine el número de cajas: ");
        numCajas = scn.nextInt();
        cajas = new Caja[numCajas];

        //Se determina el num de clientes (i.e. longitud del array de clientes)
        System.out.println("Determine el número de clientes: ");
        numClientes = scn.nextInt();
        clientes = new Cliente[numClientes];


        //Se generan los clientes que entran en el supermercado (NOTA: no en la cola de la caja!)
        for (int i=1 ; i <=numClientes ; i++){
            clientes[i-1] = new Cliente(i);
            System.out.println(clientes[i-1].getTiempo()+" "+clientes[i-1].getId()+"gasta: "+clientes[i-1].getGasto());
        }
        //Se generan las cajas
        for (int i=1 ; i <=numCajas ; i++){
            cajas[i-1] = new Caja();
        }

        //Distribuimos los clientes en las cajas segun tiempo de compra
        sortByTime(); //Distribuimos los cliente segun tiempo de compra

        int i = 0;
        int j = 0;
        while (i<=numClientes){
            if (j == numCajas) j=0;
            cajas[j].cola.add(clientes[i]);

            i++;
            j++;
            System.out.println("caja"+(j)+", cliente"+(i));
        }

        /*for (int j=0 ; j<=numCajas-1 || i<numClientes-1; j++,i++){
            cajas[j].cola.add(clientes[i]);
            System.out.println("caja"+(j)+", cliente"+(i));
        }
        System.out.println(i);
*/


    }

    static public void sortByTime(){
        boolean changed = true;
        Cliente clienteAux;

        while (changed) {
            changed = false;
            for (int i = 1; i < clientes.length; i++){
                if (clientes[i].getTiempo() < clientes[i-1].getTiempo()){
                    clienteAux = clientes[i];
                    clientes[i] = clientes[i-1];
                    clientes[i-1] = clienteAux;
                    changed = true;
                }
            }
        }
        /*for (int i=1 ; i <=numClientes ; i++){        //comprobar el sortByTime
            System.out.println(clientes[i-1].getTiempo()+" "+clientes[i-1].getId()+" gasta: "+clientes[i-1].getGasto());
        }*/
    }



}
