package Reloj;

public class Reloj {
    private int hora;
    private int minutos;

    private int segundos;

    public Reloj() {
        this.hora=0;
        this.minutos =0;
        this.segundos =0;
    }

    public Reloj(int hora, int minutos) throws IllegalArgumentException{
        setHora(hora);
        setMinutos(minutos);
        this.segundos=0;
    }

    public Reloj(int hora, int minutos, int segundos) throws IllegalArgumentException{
        setHora(hora);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) throws IllegalArgumentException{
        if(hora<0 || hora>23){
            throw new IllegalArgumentException("Hora incorrecta");
        }
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) throws IllegalArgumentException{
        if(minutos<0 || minutos>60){
            throw new IllegalArgumentException("Minutos incorrectos");
        }
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) throws IllegalArgumentException{
        if(segundos<0 || segundos>60){
            throw new IllegalArgumentException("Segundos incorrectos");
        }
        this.segundos = segundos;
    }

    public void incrementarSegundos(){
        this.segundos=this.segundos+1;
        if(this.segundos==60){
            this.segundos=0;
            this.minutos=this.minutos+1;
            if(this.minutos==60) {
                this.minutos=0;
                this.hora=this.hora+1;
                if(this.hora==24){
                    this.hora=0;
                }
            }
        }
    }
    public void incrementarSegundos(int segundos){
        while(segundos!=0){
            incrementarSegundos();
            segundos--;
        }
    }

    @Override
    public String toString() {
        String horaFormato;
        if(hora<10){
            horaFormato="0"+hora+":";
        }else{
            horaFormato =hora+":";
        }

        if(minutos<10){
            horaFormato=horaFormato+"0"+minutos+":";
        }else{
            horaFormato =horaFormato+ minutos+":";
        }

        if(segundos<10){
            horaFormato=horaFormato+ "0"+segundos;
        }else{
            horaFormato=horaFormato+segundos;
        }

        return  horaFormato;
    }
}
