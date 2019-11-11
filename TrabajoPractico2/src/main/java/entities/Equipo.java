package entities;
public class Equipo {
    private int id;
    private String nombre;
    private int liga_id;

    public Equipo() {
    }

    public Equipo(int id, String nombre, int liga_id) {
        this.id = id;
        this.nombre = nombre;
        this.liga_id = liga_id;
    }

    public Equipo(String nombre, int liga_id) {
        this.nombre = nombre;
        this.liga_id = liga_id;
    }

    @Override
    public String toString() {
        return "Equipo{" + "id=" + id + ", nombre=" + nombre + ", liga_id=" + liga_id + '}';
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

    public int getLiga_id() {
        return liga_id;
    }

    public void setLiga_id(int liga_id) {
        this.liga_id = liga_id;
    }
    
}
