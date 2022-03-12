package com.company.MicaelaPerez;

import org.apache.log4j.Logger;

import java.sql.*;

public class ObteniendoAccesoDeDatos {

    public static Logger logger = Logger.getLogger(ObteniendoAccesoDeDatos.class);

    public static void hacerAlgoEnLaBaseDeDatos(String url, String usuario, String password){
        cargarElControlador();
        try (Connection generarConexion = generarConexión(url, usuario, password);
             Statement stm = generarConexion.createStatement()){

            stm.execute(SentenciasSQL.SQL_CREATE);

            stm.executeUpdate(SentenciasSQL.generarInsertParaEmpleado(1,"Mica","perez",19,1));
            stm.executeUpdate(SentenciasSQL.generarInsertParaEmpleado(2,"laura", "gonzales", 25,5));
            stm.executeUpdate(SentenciasSQL.generarInsertParaEmpleado(3,"carina", "lopez", 52,25));

            stm.executeUpdate(SentenciasSQL.SQL_UPDATE);

            ResultSet rs = stm.executeQuery(SentenciasSQL.SQL_QUERY);
            rs.next();
            logger.info(rs.getString("nombre")+"-"+rs.getString("apellido"));

            ResultSet rsEliminar = stm.executeQuery(SentenciasSQL.SQL_QUERY);
            rsEliminar.next();
            logger.info(rsEliminar.getString("nombre")+"-"+rs.getString("apellido"));

            stm.executeUpdate(SentenciasSQL.SQL_DELETE);
        }catch (Exception ex){
            logger.error(ex.getMessage());
        }
    }

    public static void cargarElControlador(){
        try {
            Class.forName("org.h2.Driver");
        }
        catch(ClassNotFoundException ex) {
            logger.error("Error: unable to load driver class!");
            System.exit(1);
        }
    }

    //conectar con la base de datos, esto se repite siempre, no se modifica nada
    public static Connection generarConexión(String url, String usuario, String contraseña) throws SQLException {
        return DriverManager.getConnection(url, usuario, contraseña);
    }
}
