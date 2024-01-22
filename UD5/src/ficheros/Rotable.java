package ficheros;

public interface Rotable {

    int VERTICAL_A_APISADO=90;
    int APAISADO_A_VERTICAL=-90;
    public abstract void rotarSentidoAgujas();
    public abstract void rotarSentidoContrarioAgujas();

    default void rotar360grados(){
        System.out.println("Se queda igual");
    }

    static  double radianesAGrados(double radiones){
        return radiones *180.0/Math.PI;
    }


}
