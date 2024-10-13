import java.util.*;

public class Rodados {

    List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    public List<Vehiculo> vehiculosQueConsumenMenosDe(int consumo){
        List<Vehiculo> temp = new ArrayList<Vehiculo>();

        for (Vehiculo v: vehiculos){
            if(v.consumoCadaCienKM()<consumo) temp.add(v);
        }
        return temp;
    }

    public Vehiculo vehiculoMasEficiente(){
        Vehiculo resultado=null;
        double temp = 0;

        for (Vehiculo v: vehiculos){
            if (v.eficiencia() > temp) {
                temp = v.eficiencia();
                resultado = v;
            }
        }
        return resultado;
    }

    public int cantidadTotalPasajerosTransportablesA(double velocidad){
        int pasajeros = 0;
        for (Vehiculo v: vehiculos){
            if (v.velocidadMaxima() > velocidad)
                pasajeros += v.cantidadPasajeros();
        }
        return pasajeros;
    }

    public List<Vehiculo> vehiculosMasAccidentadosEn(int anio){
        List<Vehiculo> listaFiltrada = new ArrayList<Vehiculo>();

        List<Vehiculo> listaResultado = new ArrayList<Vehiculo>();

        //Filtra la lista Vehiculos
        for (Vehiculo v: vehiculos) {
            if (v.cantidadAccidentesPorAnio(anio) > 0) {
                listaFiltrada.add(v);
            }
        }

        //Ingresa los valores filtrados de forma ordenada a la lista resultado
        for (Vehiculo vehiculo: listaFiltrada){
            if (listaResultado.isEmpty()){
                listaResultado.add(vehiculo);
            }
            else{
                int j = listaResultado.size();
                for(int i=0; i < j;i++){
                    if (listaResultado.get(i).cantidadAccidentesPorAnio(anio) < vehiculo.cantidadAccidentesPorAnio(anio)) {
                        listaResultado.add(i,vehiculo);
                        break;
                    }
                }
                if (j == listaResultado.size()) listaResultado.add(vehiculo);
            }
        }


        return listaResultado;
    }

    public List<Vehiculo> vehiculosConMayorKilometraje(){

        List<Vehiculo> listaResultado = new ArrayList<Vehiculo>();

        //Ingresa los valores filtrados de forma ordenada a la lista resultado
        for (Vehiculo vehiculo: vehiculos){
            if (listaResultado.isEmpty()){
                listaResultado.add(vehiculo);
            }
            else{
                int j = listaResultado.size();
                for(int i=0; i < j;i++){
                    if (listaResultado.get(i).getCantidadKM() < vehiculo.getCantidadKM()) {
                        listaResultado.add(i,vehiculo);
                        break;
                    }
                }
                if (j == listaResultado.size()) listaResultado.add(vehiculo);
            }
        }


        return listaResultado;

    /* //OPCION ALTERNATIVA


        List<Vehiculo> listaOrdenada = new ArrayList<Vehiculo>();
        listaOrdenada = vehiculos;
        listaOrdenada.sort(Comparator.comparingInt(Vehiculo::getCantidadKM).reversed());
        return listaOrdenada;

     */

    }

    //GETTERS AND SETTERS


    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}
