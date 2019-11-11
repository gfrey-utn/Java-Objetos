package entities;
public class Pais {
    private int id;
    private String nombre;

    public Pais() {
    }

    public Pais(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pais{" + "id=" + id + ", nombre=" + nombre + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
