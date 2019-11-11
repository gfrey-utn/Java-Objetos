package test;

import connectors.Connector;
import java.sql.Connection;
import java.sql.Statement;

public class TestConnection {
    public static void main(String[] args) {
        try (Connection conn = Connector.getConnection()){
            Statement st = conn.createStatement();
            String query = "insert into paises (nombre) values ( + "
                    + "'Perú')";
            st.execute(query);
            
            conn.createStatement().execute(""
                    + "insert into paises (nombre) values ( + "
                    + "'Venezuela')"
            );
        } catch (Exception e) { e.printStackTrace(); }
    }
}
