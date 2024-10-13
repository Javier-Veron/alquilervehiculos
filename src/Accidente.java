public class Accidente {

    //Atributos
    String descripcion;

    int id,fecha;

    //Constructor
    public Accidente( int id,String descripcion,int fecha) {
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

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
