import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Rodados {

    List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    public List<Vehiculo> vehiculosQueConsumenMenosDe(double consumo){
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

    public List<Vehiculo> vehiculosMasAccidentadosEn(Date anio){

        List<Vehiculo> listaResultado = new ArrayList<Vehiculo>();
        listaResultado.add(null); //corrige listaResultado.get(0) que esta más adelante.
        for (Vehiculo v: vehiculos){
            //recorrido por cada posicion TOP 5

            /* ALTERNATIVA PARA NO REPETIR CODIGO, PREGUNTAR SI ES VALIDO
            for (int i = 0; i < 5; i++){
                if (v.cantidadAccidentesPorAnio(anio) > listaResultado.get(i).cantidadAccidentesPorAnio(anio)) {
                    listaResultado.add(i, v);
                    break; //UNA VEZ QUE LO COLOCA EN LA NUEVA LISTA TEMPORAL,
                           //CORTA EL CICLO 'FOR' PARA NO REEMPLAZAR EN EL RESTO DE POSICIONES
            }
            */

            if (v.cantidadAccidentesPorAnio(anio) > listaResultado.get(0).cantidadAccidentesPorAnio(anio)) {
                listaResultado.addFirst(v); //Corrige .add(0)
            }
            else if (v.cantidadAccidentesPorAnio(anio) > listaResultado.get(1).cantidadAccidentesPorAnio(anio)) {
                listaResultado.add(1, v);
            }
            else if (v.cantidadAccidentesPorAnio(anio) > listaResultado.get(2).cantidadAccidentesPorAnio(anio)) {
                listaResultado.add(2, v);
            }
            else if (v.cantidadAccidentesPorAnio(anio) > listaResultado.get(3).cantidadAccidentesPorAnio(anio)) {
                listaResultado.add(3, v);
            }
            else if (v.cantidadAccidentesPorAnio(anio) > listaResultado.get(4).cantidadAccidentesPorAnio(anio)) {
                listaResultado.add(4, v);
            }
        }

        return listaResultado;
    }

    public List<Vehiculo> vehiculosConMayorKilometraje(){

        List<Vehiculo> listaResultado = new ArrayList<Vehiculo>();
        listaResultado.add(null);
        for (Vehiculo v: vehiculos){
            //recorrido por cada posicion TOP 5

            /* ALTERNATIVA PARA NO REPETIR CODIGO, PREGUNTAR SI ES VALIDO
            for (int i = 0; i < 5; i++){
                if (v.getCantidadKM() > listaResultado.get(i).getCantidadKM()) {
                    listaResultado.add(i, v);
                    break;
            }
            */

            if (v.getCantidadKM() > listaResultado.get(0).getCantidadKM()) {
                listaResultado.addFirst(v);
            }
            else if (v.getCantidadKM() > listaResultado.get(1).getCantidadKM()) {
                listaResultado.add(1, v);
            }
            else if (v.getCantidadKM() > listaResultado.get(2).getCantidadKM()) {
                listaResultado.add(2, v);
            }
            else if (v.getCantidadKM() > listaResultado.get(3).getCantidadKM()) {
                listaResultado.add(3, v);
            }
            else if (v.getCantidadKM() > listaResultado.get(4).getCantidadKM()) {
                listaResultado.add(4, v);
            }
        }

        return listaResultado;
    }
}
