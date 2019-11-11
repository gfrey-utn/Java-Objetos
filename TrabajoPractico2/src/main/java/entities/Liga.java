package entities;
public class Liga {
    private int id;
    private int pais_id;
    private String nombre;
    private int division;

    public Liga() {
    }

    public Liga(int id, int pais_id, String nombre, int division) {
        this.id = id;
        this.pais_id = pais_id;
        this.nombre = nombre;
        this.division = division;
    }

    public Liga(int pais_id, String nombre, int division) {
        this.pais_id = pais_id;
        this.nombre = nombre;
        this.division = division;
    }

    @Override
    public String toString() {
        return "Liga{" + "id=" + id + ", pais_id=" + pais_id + ", nombre=" + nombre + ", division=" + division + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPais_id() {
        return pais_id;
    }

    public void setPais_id(int pais_id) {
        this.pais_id = pais_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }
    
}
