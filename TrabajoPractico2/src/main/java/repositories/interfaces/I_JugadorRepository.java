package repositories.interfaces;
import entities.Equipo;
import entities.Jugador;
import entities.Pais;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public interface I_JugadorRepository {
    void save(Jugador jugador);
    void remove(Jugador jugador);
    void update(Jugador jugador);
    
    List<Jugador> getAll();
    
    default Jugador getById(int id){
        return getAll()
                .stream()
                .filter(j->j.getId() == id)
                .findFirst()
                .orElse(new Jugador());
    }
    
    default List<Jugador> getLikeNombre(String nombre){
        if (nombre == null) return new ArrayList<>();
        return getAll()
                .stream()
                .filter(j->j.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
    }
    
    default List<Jugador> getLikeApellido(String apellido){
        if (apellido == null) return new ArrayList<>();
        return getAll()
                .stream()
                .filter(j->j.getApellido().toLowerCase().contains(apellido.toLowerCase()))
                .collect(Collectors.toList());
    }
    
    default List<Jugador> getByNumero(int numero){
        return getAll()
                .stream()
                .filter(j->j.getNumero() == numero)
                .collect(Collectors.toList());
    }
    
    default List<Jugador> getByFechanacimiento(Date fecha){
        return getAll()
                .stream()
                .filter(f->f.getFechanacimiento() == fecha)
                .collect(Collectors.toList());
    }
    
    default List<Jugador> getByPais(Pais pais){
        return getAll()
                .stream()
                .filter(j->j.getPais_id() == pais.getId())
                .collect(Collectors.toList());
    }
    
    default List<Jugador> getByEquipo(Equipo equipo){
        return getAll()
                .stream()
                .filter(j->j.getEquipo_id() == equipo.getId())
                .collect(Collectors.toList());
    }
    
}
