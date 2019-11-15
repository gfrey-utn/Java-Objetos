package repositories.jdbc;
import entities.Jugador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import repositories.interfaces.I_JugadorRepository;
public class JugadorRepository implements I_JugadorRepository {
    private Connection conn;
    public JugadorRepository(Connection conn) { this.conn = conn; }

    @Override public void save(Jugador jugador) {
        if (jugador == null) return;
        
        try (PreparedStatement ps = conn.prepareStatement(
            "insert into jugadores (nombre,apellido,numero,fechanacimiento,pais_id,equipo_id)"
            + "values (?,?,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS
        )){
            ps.setString(1, jugador.getNombre());
            ps.setString(2, jugador.getApellido());
            ps.setInt(3, jugador.getNumero());
            ps.setDate(4, jugador.getFechanacimiento());
            ps.setInt(5, jugador.getPais_id());
            ps.setInt(6, jugador.getEquipo_id());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) jugador.setId(rs.getInt(1));
            
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override public void remove(Jugador jugador) {
        if(jugador == null) return;
        try (PreparedStatement ps = conn.prepareStatement(
                "delete from jugadores where id = ?")) {
            ps.setInt(1, jugador.getId());
            ps.execute(); 
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override public void update(Jugador jugador) {
        if (jugador == null) return;
        try (PreparedStatement ps = conn.prepareStatement(
            "update jugadores set nombre=?, apellido=?, numero=?, fechanacimiento=?, " +
            "pais_id=?, equipo_id=? where id=?")){
            ps.setString(1, jugador.getNombre());
            ps.setString(2, jugador.getApellido());
            ps.setInt(3, jugador.getNumero());
            ps.setDate(4, jugador.getFechanacimiento());
            ps.setInt(5, jugador.getPais_id());
            ps.setInt(6, jugador.getEquipo_id());
            ps.setInt(7, jugador.getId());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public List<Jugador> getAll() {
        List<Jugador> list = new ArrayList();
        try (ResultSet rs = conn.createStatement().executeQuery("select * from jugadores");){
            while (rs.next()){
                list.add(new Jugador(
                   rs.getInt("id"),
                   rs.getString("nombre"),
                   rs.getString("apellido"),
                   rs.getInt("numero"),
                   rs.getDate("fechanacimiento"),
                   rs.getInt("pais_id"),
                   rs.getInt("equipo_id")
                ));
            }         
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }
    
}
