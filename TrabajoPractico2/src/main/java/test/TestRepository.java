package test;
import connectors.Connector;
import entities.Equipo;
import entities.Jugador;
import entities.Liga;
import entities.Pais;
import entities.Stat;
import enums.Pie;
import enums.Posicion;
import java.sql.Connection;
import java.sql.Date;
import repositories.interfaces.I_EquipoRepository;
import repositories.interfaces.I_JugadorRepository;
import repositories.interfaces.I_LigaRepository;
import repositories.interfaces.I_PaisRepository;
import repositories.interfaces.I_StatRepository;
import repositories.jdbc.EquipoRepository;
import repositories.jdbc.JugadorRepository;
import repositories.jdbc.LigaRepository;
import repositories.jdbc.PaisRepository;
import repositories.jdbc.StatRepository;
public class TestRepository {
    public static void main(String[] args) {
        try (Connection conn = Connector.getConnection()){
            
            // Test PaisRepository
            I_PaisRepository pr = new PaisRepository(conn);
            
            System.out.println("----- TEST REPOSITORIO PAÍSES -----");
            System.out.println("*** Agregado de Países ***");
            
            Pais canada = new Pais("Canada");
            Pais estadosUnidos = new Pais("Estados Unidos");
            Pais mexico = new Pais("México");
            Pais bolivia = new Pais("Bolivia");
            Pais ecuador = new Pais("Ecuador");
            
            pr.save(canada);
            pr.save(estadosUnidos);
            pr.save(mexico);
            pr.save(bolivia);
            pr.save(ecuador);
            
            System.out.println(canada);
            System.out.println(estadosUnidos);
            System.out.println(mexico);
            System.out.println(bolivia);
            System.out.println(ecuador);
            
            System.out.println("\n*** Se agregan Canadá, USA, México, Bolivia y Ecuador al final de la lista ***");
            System.out.println("*** Se elimina el país de ID=25 y se cambia el nombre del país cuyo ID=26 a Sudáfrica ***");
            
            pr.remove(pr.getById(25));
            
            Pais pais = pr.getById(26);
            pais.setNombre("Sudáfrica");
            pr.update(pais);
            
            pr.getAll().forEach(System.out::println);
            
            System.out.println("\n*** Se buscan los países que contienen \"ia\" ***");
            pr.getLikeNombre("ia").forEach(System.out::println);

            // Test LigaRepository
            I_LigaRepository lr = new LigaRepository(conn);
            
            System.out.println("----- TEST REPOSITORIO LIGAS -----");
            System.out.println("*** Agregado de Ligas ***");
            
            Liga bMetro = new Liga(2, "Primera B Metropolitana", 3);
            Liga league1 = new Liga(15, "EFL League One", 3);
            
            lr.save(bMetro);
            lr.save(league1);
            
            System.out.println(bMetro);
            System.out.println(league1);
            
            System.out.println("\n*** Se agregan la B Metro (3° ARG) y la League One (3° ING) al final de la lista ***");
            System.out.println("*** Se elimina la liga de ID=12 y se modifican los campos de la liga cuyo ID=13 ***");

            lr.remove(lr.getById(12));
            
            Liga liga = lr.getById(13);
            liga.setPais_id(27);
            liga.setNombre("Major League Soccer");
            liga.setDivision(1);
            lr.update(liga);
            
            lr.getAll().forEach(System.out::println);
            
            System.out.println("\n*** Se buscan las ligas de Argentina ***");
            lr.getByPais(pr.getById(2)).forEach(System.out::println);
            
            System.out.println("\n*** Se buscan las ligas que contengan \"liga\" en su nombre ***");
            lr.getLikeNombre("liga").forEach(System.out::println);
            
            System.out.println("\n*** Se buscan todas las terceras divisiones ***");
            lr.getByDivision(3).forEach(System.out::println);
            
            // Test EquipoRepository
            I_EquipoRepository er = new EquipoRepository(conn);
            
            System.out.println("----- TEST REPOSITORIO EQUIPOS -----");
            System.out.println("*** Agregado de Equipos ***");
            
            Equipo velez = new Equipo("Vélez", 9);
            Equipo valencia = new Equipo("Valencia", 3);
            Equipo atalanta = new Equipo("Atalanta", 4);
            
            er.save(velez);
            er.save(valencia);
            er.save(atalanta);
            
            System.out.println(velez);
            System.out.println(valencia);
            System.out.println(atalanta);
            
            System.out.println("\n*** Se agregan a Vélez, Valencia y Atalanta al final de la lista ***");
            System.out.println("*** Se elimina el equipo de ID=43 y se modifican los campos del equipo cuyo ID=44 ***");

            er.remove(er.getById(43));
            
            Equipo equipo = er.getById(44);
            equipo.setNombre("Bordeaux");
            equipo.setLiga_id(6);
            er.update(equipo);
            
            er.getAll().forEach(System.out::println);
            
            System.out.println("\n*** Se buscan los equipos con \"Madrid\" en el nombre ***");
            er.getLikeNombre("Madrid").forEach(System.out::println);
            
            System.out.println("\n*** Se buscan los equipos de la Premier League ***");
            er.getByLiga(lr.getById(1)).forEach(System.out::println);
            
            // Test JugadorRepository
            I_JugadorRepository jr = new JugadorRepository(conn);
            
            System.out.println("----- TEST REPOSITORIO JUGADORES -----");
            System.out.println("*** Agregado de Jugadores ***");
            
            Jugador tevez = new Jugador("Carlos", "Tévez", 10, new Date(1984, 5, 2), 2, 31);
            Jugador deJong = new Jugador("Frenkie", "De Jong", 21, new Date(1997, 5, 12), 13, 9);
            Jugador fati = new Jugador("Anssumane", "Fati", 31, new Date(2002, 10, 31), 11, 9);
            
            jr.save(tevez);
            jr.save(deJong);
            jr.save(fati);
            
            System.out.println(tevez);
            System.out.println(deJong);
            System.out.println(fati);
            
            System.out.println("\n*** Se agregan a Tévez, F. de Jong y A. Fati al final de la lista ***");
            System.out.println("*** Se elimina al jugador de ID=78 y se modifican los campos del jugador cuyo ID=79 ***");

            jr.remove(jr.getById(78));
            
            Jugador jugador = jr.getById(79);
            jugador.setNombre("Mason");
            jugador.setApellido("Greenwood");
            jugador.setNumero(26);
            jugador.setFechanacimiento(new Date(2001, 10, 1));
            jugador.setPais_id(15);
            jugador.setEquipo_id(5);
            jr.update(jugador);
            
            jr.getAll().forEach(System.out::println);
            
            System.out.println("\n*** Se buscan los jugadores que contengan \"Ma\" en su nombre ***");
            jr.getLikeNombre("Ma").forEach(System.out::println);
            
            System.out.println("\n*** Se buscan los jugadores que contengan \"De\" en su apellido ***");
            jr.getLikeApellido("De").forEach(System.out::println);
            
            System.out.println("\n*** Se buscan los jugadores que lleven la camiseta número 10 ***");
            jr.getByNumero(10).forEach(System.out::println);
            
            System.out.println("\n*** Se buscan los jugadores nacidos el 5/2/1992 ***");
            jr.getByFechanacimiento(new Date(1992, 2, 5)).forEach(System.out::println);
            // TO BE DONE
            
            System.out.println("\n*** Se buscan los jugadores argentinos ***");
            jr.getByPais(pr.getById(2)).forEach(System.out::println);
            
            System.out.println("\n*** Se buscan los jugadores que jueguen en River ***");
            jr.getByEquipo(er.getById(34)).forEach(System.out::println);
            
            // Test StatRepository
            I_StatRepository sr = new StatRepository(conn);
            
            System.out.println("----- TEST REPOSITORIO STATS -----");
            System.out.println("*** Agregado de Stats ***");
            
            Stat sTevez = new Stat(78, Posicion.Delantero, Pie.Diestro, 173, 75, 82, 32, 79, 75, 83, 78, 78);
            Stat sDeJong = new Stat(79, Posicion.Volante, Pie.Diestro, 180, 74, 76, 69, 80, 84, 66, 86, 92);
            Stat sFati = new Stat(80, Posicion.Delantero, Pie.Diestro, 178, 65, 73, 47, 71, 87, 72, 71, 90);

            sr.save(sTevez);
            sr.save(sDeJong);
            sr.save(sFati);
            
            System.out.println(sTevez);
            System.out.println(sDeJong);
            System.out.println(sFati);
            
            System.out.println("\n*** Se agregan los stats de Tévez, F. de Jong y A. Fati al final de la lista ***");
            System.out.println("*** Se elimina al stat con jugador_Id=78 y se modifican los campos del jugador cuyo jugador_Id=79 ***");

            sr.remove(sr.getByJugador_id(78));
            
            Stat stat = sr.getByJugador_id(79);
            stat.setPosicion(Posicion.Delantero);
            stat.setPie(Pie.Zurdo);
            stat.setAltura(stat.getAltura() + 1);
            stat.setPeso(stat.getPeso() + 1);
            stat.setAtaque(stat.getAtaque() + 1);
            stat.setDefensa(stat.getDefensa() - 1);
            stat.setPases(stat.getPases() + 1);
            stat.setVelocidad(stat.getVelocidad() + 1);
            stat.setTiro(stat.getTiro() + 2);
            stat.setValoracion(stat.getValoracion() + 1);
            stat.setPotencial(stat.getPotencial() + 1);
            sr.update(stat);
            
//            Para ayudar en el testeo (si no, ouede tirar error por Duplicate Entry,
//              ya que los jugador_id deben ser únicos):
/*
            sr.remove(sr.getByJugador_id(78));
            sr.remove(sr.getByJugador_id(79));
            sr.remove(sr.getByJugador_id(80));
*/
            sr.getAll().forEach(System.out::println);
            
            System.out.println("\n*** Se buscan todos los delanteros ***");
            sr.getByPosicion(Posicion.Delantero).forEach(System.out::println);
            
            System.out.println("\n*** Se buscan todos los jugadores diestros ***");
            sr.getByPie(Pie.Diestro).forEach(System.out::println);
            
            System.out.println("\n*** Se buscan todos los jugadores que midan 188 cm. ***");
            sr.getByAltura(188).forEach(System.out::println);
            
            System.out.println("\n*** Se buscan todos los jugadores que pesen 73 kg. ***");
            sr.getByPeso(73).forEach(System.out::println);
            
            System.out.println("\n*** Se buscan todos los jugadores con Ataque=90 ***");
            sr.getByAtaque(90).forEach(System.out::println);
            
            System.out.println("\n*** Se buscan todos los jugadores con Defensa=95 ***");
            sr.getByDefensa(95).forEach(System.out::println);
            
            System.out.println("\n*** Se buscan todos los jugadores con Pases=82 ***");
            sr.getByPases(82).forEach(System.out::println);
            
            System.out.println("\n*** Se buscan todos los jugadores con Velocidad=86 ***");
            sr.getByVelocidad(86).forEach(System.out::println);
            
            System.out.println("\n*** Se buscan todos los jugadores con Tiro=90 ***");
            sr.getByTiro(90).forEach(System.out::println);
            
            System.out.println("\n*** Se buscan todos los jugadores con 89 de Valoración ***");
            sr.getByValoracion(89).forEach(System.out::println);

            System.out.println("\n*** Se buscan todos los jugadores con 93 de Potencial ***");
            sr.getByPotencial(93).forEach(System.out::println);
                        
            jr.getAll().forEach(j->System.out.println(j.getFechanacimiento()));
            
        } catch (Exception e) { e.printStackTrace(); }
    }
}
