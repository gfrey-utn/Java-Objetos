package repositories.jdbc;
import entities.Stat;
import enums.Pie;
import enums.Posicion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import repositories.interfaces.I_StatRepository;
public class StatRepository implements I_StatRepository{
    
    /*  Nota mental: Preguntar a Carlos
        Pregunta 1/1: ¿Hace falta un Stat_Repository?
        
        Porque hay una relación uno a uno entre Jugador y Stat.
        Y yo nunca voy a necesitar una stat (porque por sí sola no me dice nada),
        siempre voy a necesitar al jugador que está asociado a este conjunto de stats.
    */
    
    private Connection conn;
    public StatRepository(Connection conn) { this.conn = conn; }

    @Override public void save(Stat stat) {
        if (stat == null) return;
        try (PreparedStatement ps = conn.prepareStatement(
            "insert into stats (jugador_id,posicion,pie,altura,peso,ataque,defensa,pases,"
                    + "velocidad,tiro,valoracion,potencial) values (?,?,?,?,?,?,?,?,?,?,?,?)"
        )){
            ps.setInt(1, stat.getJugador_id());
            ps.setString(2, stat.getPosicion().toString());
            ps.setString(3, stat.getPie().toString());
            ps.setInt(4, stat.getAltura());
            ps.setInt(5, stat.getPeso());
            ps.setInt(6, stat.getAtaque());
            ps.setInt(7, stat.getDefensa());
            ps.setInt(8, stat.getPases());
            ps.setInt(9, stat.getVelocidad());
            ps.setInt(10, stat.getTiro());
            ps.setInt(11, stat.getValoracion());
            ps.setInt(12, stat.getPotencial());
            ps.execute();
            //ResultSet rs = ps.getGeneratedKeys();
            //if (rs.next()) stat.setJugador_id(rs.getInt(1));
            
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override public void remove(Stat stat) {
        if (stat == null) return;
        try (PreparedStatement ps = conn.prepareStatement(
                "delete from stats where jugador_id = ?")) {
            ps.setInt(1, stat.getJugador_id());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override public void update(Stat stat) {
        if (stat == null) return;
        try (PreparedStatement ps = conn.prepareStatement(
                "update stats set posicion=?, pie=?, altura=?, peso=?, ataque=?,"
                + "defensa=?, pases=?, velocidad=?, tiro=?, valoracion=?,"
                + "potencial=? where jugador_id=?")){
            ps.setString(1, stat.getPosicion().toString());
            ps.setString(2, stat.getPie().toString());
            ps.setInt(3, stat.getAltura());
            ps.setInt(4, stat.getPeso());
            ps.setInt(5, stat.getAtaque());
            ps.setInt(6, stat.getDefensa());
            ps.setInt(7, stat.getPases());
            ps.setInt(8, stat.getVelocidad());
            ps.setInt(9, stat.getTiro());
            ps.setInt(10, stat.getValoracion());
            ps.setInt(11, stat.getPotencial());
            ps.setInt(12, stat.getJugador_id());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public List<Stat> getAll() {
        List<Stat> list = new ArrayList();
        try (ResultSet rs = conn.createStatement().executeQuery("select * from stats");){
            while (rs.next()) {
                list.add(new Stat(
                   rs.getInt("jugador_id"),
                   Posicion.valueOf(rs.getString("posicion")),
                   Pie.valueOf(rs.getString("pie")),
                   rs.getInt("altura"),
                   rs.getInt("peso"),
                   rs.getInt("ataque"),
                   rs.getInt("defensa"),
                   rs.getInt("pases"),
                   rs.getInt("velocidad"),
                   rs.getInt("tiro"),
                   rs.getInt("valoracion"),
                   rs.getInt("potencial")
                ));
            }
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }
    
}