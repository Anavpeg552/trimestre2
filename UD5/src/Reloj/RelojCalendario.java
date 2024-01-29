package Reloj;

public class RelojCalendario extends Reloj{

    private int dia;
    private int mes;
    private int anio;

    private final int[] mesDia ={31,28,31,30,31,30,31,31,30,31,30,31};

    public RelojCalendario(int hora, int minutos, int segundos, int dia, int mes, int anio) throws IllegalArgumentException {
        super(hora, minutos, segundos);
        setAnio(anio);
        setDia(dia);
        setMes(mes);
    }

    public RelojCalendario(int dia, int mes, int anio) throws IllegalArgumentException{
        setAnio(anio);
        setDia(dia);
        setMes(mes);
    }

    public int getDia() {
        return dia;
    }

    private void setDia(int dia) throws IllegalArgumentException{
        if(dia<1 || dia>31){
            throw new IllegalArgumentException("Dia Incorrecto");
        }
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    private void setMes(int mes) throws IllegalArgumentException{
        if(mes<1 || mes>12){
            throw new IllegalArgumentException("Mes Incorrecto");
        }

        if(getDia() > mesDia[mes-1]){
            throw new IllegalArgumentException("Mes Incorrecto");
        }
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    private void setAnio(int anio) throws IllegalArgumentException {

        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
            mesDia[1] = 29;
        } else {
            mesDia[1] = 28;
        }

        if (anio < 1800 || anio > 2024) {
            throw new IllegalArgumentException("Anio Incorrecto");
        }
        this.anio = anio;

    }

    @Override
    public String toString() {
        return dia+"-"+mes+"-"+anio +"______"+ super.toString();
    }
}
