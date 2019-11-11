package entities;
import java.sql.Date;
public class Jugador {
    private int id;
    private String nombre;
    private String apellido;
    private int numero;
    private Date fechanacimiento;
    private int pais_id;
    private int equipo_id;

    public Jugador() {
    }

    public Jugador(int id, String nombre, String apellido, int numero, Date fechanacimiento, int pais_id, int equipo_id) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.fechanacimiento = fechanacimiento;
        this.pais_id = pais_id;
        this.equipo_id = equipo_id;
    }

    public Jugador(String nombre, String apellido, int numero, Date fechanacimiento, int pais_id, int equipo_id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.fechanacimiento = fechanacimiento;
        this.pais_id = pais_id;
        this.equipo_id = equipo_id;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", numero=" + numero + ", fechanacimiento=" + fechanacimiento + ", pais_id=" + pais_id + ", equipo_id=" + equipo_id + '}';
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getPais_id() {
        return pais_id;
    }

    public void setPais_id(int pais_id) {
        this.pais_id = pais_id;
    }

    public int getEquipo_id() {
        return equipo_id;
    }

    public void setEquipo_id(int equipo_id) {
        this.equipo_id = equipo_id;
    }
    
}
