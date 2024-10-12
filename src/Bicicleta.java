public class Bicicleta extends Vehiculo{

    double rodado;
    int cantidadPasajeros = 1;

    public Bicicleta(double rodado){
        this.rodado = rodado;
    }


    //Metodo

    @Override
    public int cantidadPasajeros(){
        return cantidadPasajeros;

    }
    //Metodo Heredado
    @Override
    public double consumoCadaCienKM() {
        return 1;
    }

    @Override
    public double velocidadMaxima() {
        return rodado*1.2;    }
}
