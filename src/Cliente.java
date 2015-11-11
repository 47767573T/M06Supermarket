import java.util.Random;

/**
 * Created by 47767573t on 11/11/15.
 */
public class Cliente {

    int id;
    int ticket;
    long tiempo;


    //::::::::::::::::::::::::::::::::::::::::::::CONTRUCTORES

    public Cliente(int id, int ticket) {
        this.id =  id;
        this.ticket = ticket;
        tiempo = tiempoRandom();
    }

    public Cliente(int id) {
        this.id =  id;
        tiempo = tiempoRandom();
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

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    //::::::::::::::::::::::::::::::::::::::::METODOS GENERALES

    public long tiempoRandom (){
        Random rnd = new Random(100000);
        return rnd.nextLong()+20000;
    }


}
