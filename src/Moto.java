public class Moto extends Vehiculo {

    //Atributos

    boolean habilitado;
    double cilindrada;

    //Constructores

    public Moto(double cilindrada){
        this.cilindrada = cilindrada;
    }

    public Moto(double cilindrada, boolean habilitado){
        this.cilindrada = cilindrada;
        this.habilitado = habilitado;
    }
    //Metodo Heredado

    @Override
    public int cantidadPasajeros(){
        if (cilindrada >= 75) return 2;
        return 1;
    }
    @Override
    public double consumoCadaCienKM() {
        return 50+(cilindrada/10);
    }

    @Override
    public double velocidadMaxima() {
        return (cilindrada/2);
    }
}
