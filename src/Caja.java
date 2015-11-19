import java.util.Random;

/**
 * Created by 47767573t on 11/11/15.
 */
public class Caja{

    private int totalCajas;
    private boolean[] cajas;        //Determina si esta vacia=false u ocupada=true
    private double[] ganancias;         //Registra las ganacias de cada caja
    private double tiempoMedio;
    private double clientela;

    public Caja(int numCajas) {
        this.totalCajas = numCajas;
        cajas = new boolean[numCajas];
        ganancias = new double[numCajas];
    }

    public int randomCajaSeleccion(){
        Random rnd = new Random();
        return rnd.nextInt(totalCajas);
    }

    public void contadorTiempo(double tiempoNuevo){
        this.tiempoMedio += tiempoNuevo;
    }

    public double getTiempoMedio(){
        clientela++;
        return tiempoMedio/clientela;

    }

    public synchronized void Ocupar (int cajaOcupada) {
        cajas[cajaOcupada] = false;
        while (!cajas[cajaOcupada]){
            cajas[cajaOcupada] = true;
        }
    }

    public synchronized void Vaciar (int cajaOcupada, double gastado) {
        cajas[cajaOcupada] = false;
        while (cajas[cajaOcupada]){
            ganancias[cajaOcupada] += gastado;

            cajas[cajaOcupada] = true;
            notify();
        }
    }

    public double getGanancias (int numCaja){
        return ganancias[numCaja];
    }

    public double recuentoGananciasTotal (){
        double sumaTotal = 0;
        while(totalCajas >= 0){
            sumaTotal += getGanancias(totalCajas);
            totalCajas--;
        }
        return sumaTotal;
    }
}
