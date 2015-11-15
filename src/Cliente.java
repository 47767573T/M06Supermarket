import java.util.Random;

/**
 * Created by 47767573t on 11/11/15.
 */
public class Cliente {

    int id;
    int ticket;
    int tiempo;
    double gasto;


    //::::::::::::::::::::::::::::::::::::::::::::CONTRUCTORES

    public Cliente(int id, int ticket) {
        this.id =  id;
        this.ticket = ticket;
        tiempo = tiempoRandom();
    }

    public Cliente(int id) {
        this.id =  id;
        tiempo = tiempoRandom();
        gasto = gastoRandom();
    }

    //::::::::::::::::::::::::::::::::::::::::GETTER Y SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public double getGasto() {
        return gasto;
    }

    //::::::::::::::::::::::::::::::::::::::::METODOS GENERALES
    public int tiempoRandom (){
        Random rnd = new Random();
        return rnd.nextInt(100000)+2000;
    }

    public int gastoRandom (){
        Random rnd = new Random();
        return rnd.nextInt(100)+1;
    }


}
