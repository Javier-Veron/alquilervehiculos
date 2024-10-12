public class Auto extends Vehiculo {

    int cantidadPasajeros;
    double velocidadMaxima;

    public Auto(int cantidadPasajeros, double velocidadMaxima){
        this.cantidadPasajeros = cantidadPasajeros;
        this.velocidadMaxima = velocidadMaxima;
    }

    //Metodo
    @Override
    public int cantidadPasajeros(){
        return cantidadPasajeros;
    }

    //Metodo Heredado
    @Override
    public double consumoCadaCienKM() {
        return 20+(this.cantidadPasajeros*10);
    }

    @Override
    public double velocidadMaxima() {
        return 0;
    }
}
