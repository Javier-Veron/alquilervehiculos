public class Auto extends Vehiculo {

    int cantidadPasajeros;
    double velocidadMaxima;

    //Constructor
    public Auto(int cantidadPasajeros, double velocidadMaxima){
        this.cantidadPasajeros = cantidadPasajeros;
        this.velocidadMaxima = velocidadMaxima;
    }

    //Metodos Heredado

    @Override
    public int cantidadPasajeros(){
        return cantidadPasajeros;
    }

    @Override
    public double consumoCadaCienKM() {
        return 20+(this.cantidadPasajeros*10);
    }

    @Override
    public double velocidadMaxima() {
        return this.velocidadMaxima;
    }
}
