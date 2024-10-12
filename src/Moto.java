public class Moto extends Vehiculo {

    boolean habilitado;
    double cilindrada;

    public Moto(double cilindrada){
        this.cilindrada = cilindrada;
    }

    public Moto(double cilindrada, boolean habilitado){
        this.cilindrada = cilindrada;
        this.habilitado = habilitado;
    }
    //Metodo

    @Override
    public int cantidadPasajeros(){
        if (cilindrada >= 75) return 2;
        return 1;
    }
    //Metodo Heredado
    @Override
    public double consumoCadaCienKM() {
        return 50+(cilindrada/10);
    }

    @Override
    public double velocidadMaxima() {
        return (cilindrada/2);
    }
}
