package repositories.interfaces;
import entities.Stat;
import enums.Pie;
import enums.Posicion;
import java.util.List;
import java.util.stream.Collectors;
public interface I_StatRepository {
    /*  Nota mental: Preguntar a Carlos
        Pregunta 1/1: ¿Hace falta un Stat_Repository?
        
        Porque hay una relación uno a uno entre Jugador y Stat.
        Y yo nunca voy a necesitar una stat (porque por sí sola no me dice nada),
        siempre voy a necesitar al jugador que está asociado a este conjunto de stats.
    */
    void save(Stat stat);
    void remove(Stat stat);
    void update(Stat stat);
    
    List<Stat> getAll();
    
    default Stat getByJugador_id(int id){
        return getAll()
                .stream()
                .filter(s->s.getJugador_id() == id)
                .findFirst()
                .orElse(new Stat());
    }
    
    default List<Stat> getByPosicion(Posicion posicion){
        return getAll()
                .stream()
                .filter(s->s.getPosicion() == posicion)
                .collect(Collectors.toList());
    }
    
    default List<Stat> getByPie(Pie pie){
        return getAll()
                .stream()
                .filter(s->s.getPie() == pie)
                .collect(Collectors.toList());
    }
    
    default List<Stat> getByAltura(int altura){
        return getAll()
                .stream()
                .filter(s->s.getAltura() == altura)
                .collect(Collectors.toList());
    }
    
    default List<Stat> getByPeso(int peso){
        return getAll()
                .stream()
                .filter(s->s.getPeso() == peso)
                .collect(Collectors.toList());
    }
    
    default List<Stat> getByAtaque(int ataque){
        return getAll()
                .stream()
                .filter(s->s.getAtaque() == ataque)
                .collect(Collectors.toList());
    }
    
    default List<Stat> getByDefensa(int defensa){
        return getAll()
                .stream()
                .filter(s->s.getDefensa() == defensa)
                .collect(Collectors.toList());
    }
    
    default List<Stat> getByPases(int pases){
        return getAll()
                .stream()
                .filter(s->s.getPases() == pases)
                .collect(Collectors.toList());
    }
    
    default List<Stat> getByVelocidad(int velocidad){
        return getAll()
                .stream()
                .filter(s->s.getVelocidad() == velocidad)
                .collect(Collectors.toList());
    }
    
    default List<Stat> getByTiro(int tiro){
        return getAll()
                .stream()
                .filter(s->s.getTiro() == tiro)
                .collect(Collectors.toList());
    }
    
    default List<Stat> getByValoracion(int valoracion){
        return getAll()
                .stream()
                .filter(s->s.getValoracion() == valoracion)
                .collect(Collectors.toList());
    }

    default List<Stat> getByPotencial(int potencial){
        return getAll()
                .stream()
                .filter(s->s.getPotencial() == potencial)
                .collect(Collectors.toList());
    }
    
    /*
    default List<Stat> getAlturaBetween(int alturaMin, int alturaMax){}
    default List<Stat> getPesoBetween(int pesoMin, int pesoMax){}
    default List<Stat> getAtaqueBetween(int ataqueMin, int ataqueMax){}
    default List<Stat> getDefensaBetween(int defensaMin, int defensaMax){}
    default List<Stat> getPasesBetween(int pasesMin, int pasesMax){}
    default List<Stat> getVelocidadBetween(int velocidadMin, int velocidadMax){}
    default List<Stat> getTiroBetween(int tiroMin, int tiroMax){}
    default List<Stat> getValoracionBetween(int valoracionMin, int valoracionMax){}
    default List<Stat> getPotencialBetween(int potencialMin, int potencialMax){}
    */
    
}
