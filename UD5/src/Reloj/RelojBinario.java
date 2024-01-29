package Reloj;

public class RelojBinario extends  Reloj{
    public RelojBinario(int hora, int minutos, int segundos) throws IllegalArgumentException {
        super(hora, minutos, segundos);
    }

    @Override
    public String toString() {
        String binarioHoras = String.format("%6s", Integer.toBinaryString(getHora())).replace(' ', '0');
        String binarioMinutos = String.format("%6s", Integer.toBinaryString(getMinutos())).replace(' ', '0');
        String binarioSegundos = String.format("%6s", Integer.toBinaryString(getSegundos())).replace(' ', '0');
        return binarioHoras + ":" + binarioMinutos + ":" + binarioSegundos;
    }


}
