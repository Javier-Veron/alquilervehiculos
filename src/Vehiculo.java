import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Vehiculo {

    //Atributos
    String patente;
    int cantidadKM;
    List<Accidente> historialAccidentes = new ArrayList<Accidente>();

    //Metodos

    public int cantidadAccidentesPorAnio(int anio){
        int resultado = 0;
            for (Accidente a : historialAccidentes){
                if (a.fecha == anio) resultado +=1;
            }
        return resultado;
    }

    public void agregarAccidente(int id, String desc,int fecha){

        Accidente nuevoAccidente = new Accidente(id, desc, fecha);
        historialAccidentes.add(nuevoAccidente);
    }

    public double eficiencia(){
        return (cantidadPasajeros()*velocidadMaxima())/consumoCadaCienKM();
    }


    //Metodos Abstractos
    public abstract int cantidadPasajeros();

    public abstract double consumoCadaCienKM();

    public abstract double velocidadMaxima();

    //Setter and getters

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }


    public int getCantidadKM() {
        return cantidadKM;
    }

    public void setCantidadKM(int cantidadKM) {
        this.cantidadKM = cantidadKM;
    }

    public List<Accidente> getHistorialAccidentes() {
        return historialAccidentes;
    }

    public void setHistorialAccidentes(List<Accidente> historialAccidentes) {
        this.historialAccidentes = historialAccidentes;
    }

}
