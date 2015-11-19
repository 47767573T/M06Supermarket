import java.util.Random;

/**
 * Created by 47767573t on 11/11/15.
 */
public class Cliente extends Thread {

    int id;
    int tiempoCompra;
    int tiempoPago;
    double gasto;
    Caja caja = null;


    //::::::::::::::::::::::::::::::::::::::::::::CONTRUCTORES

    public Cliente(int id, Caja caja) {
        this.id =  id;
        this.caja = caja;
    }


    //::::::::::::::::::::::::::::::::::::::::GETTER Y SETTERS

    public void setTiempo() {
        Random rnd = new Random();
        tiempoCompra = rnd.nextInt(20000);
        tiempoPago = rnd.nextInt(20000);
    }

    public void setGasto(int tiempo) {
        Random rnd = new Random();
        gasto = (rnd.nextInt(100)+1)*(tiempo/1000);
    }


    //::::::::::::::::::::::::::::::::::::::::EJECUCION

    public void run(){
        setTiempo();                    //Determinamos aleatoriamente el tiempo de compra y de pago
        try {
            sleep(tiempoCompra);        //espera el tiempo de compra
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int cajaElegida = caja.randomCajaSeleccion();

        try {
            setGasto(tiempoCompra);     //Calculamos el gasto aleatorio pero teniendo en cuenta el tiempo de comprar proporcionalmente
            caja.Ocupar(cajaElegida);
            sleep(tiempoPago);          //espera el tiempo pagando la compra
            caja.Vaciar(cajaElegida, this.gasto);
            caja.contadorTiempo(this.tiempoPago);
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Cliente(" + this.id + ") de la caja(" + cajaElegida
                + ") ha tardado " + (this.tiempoPago / 1000)
                + "s en pagar " + this.gasto + "euros y "
                + (this.tiempoCompra / 1000) + "s comprando");
        System.out.println("Tiempo medio total incremental de compra: "+(caja.getTiempoMedio()/1000));

    }
}
