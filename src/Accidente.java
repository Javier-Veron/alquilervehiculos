import java.util.Date;

public class Accidente {

    //Atributos
    String descripcion;
    Date fecha;
    int id;

    public Accidente( int id,String descripcion, Date fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.id = id;
    }

    //Setter and Getters

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
