package com.company.MicaelaPerez;

import org.apache.log4j.Logger;

import java.sql.*;

public class AccesoABaseDeDatos {
    public static Logger logger = Logger.getLogger(Main.class);


    public static void main(String[] args) throws Exception {
        Odontologo odontologo = new Odontologo("Perez", "Micaela", "123456789");

        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(QuerysSQL.SQL_CREATE_TABLE);

            PreparedStatement psInsert = connection.prepareStatement(QuerysSQL.SQL_INSERT);
            psInsert.setInt(1, 1);
            psInsert.setString(2, odontologo.getApellido());
            psInsert.setString(3, odontologo.getNombre());
            psInsert.setString(4, odontologo.getMatricula());
            psInsert.execute();
            connection.setAutoCommit(false);

            PreparedStatement psUpdate = connection.prepareStatement(QuerysSQL.SQL_UPDATE);
            psUpdate.setString(1, odontologo.setMatricula("4536"));
            psUpdate.setString(2, odontologo.getApellido());
            psUpdate.execute();

            /*logger.error("");
            int a = 4/0;*/

            connection.commit();
            connection.setAutoCommit(true);

            String sql = "SELECT * FROM ODONTOLOGOS";
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(sql);

            logger.info(resultSet.next() ? "ID: " + resultSet.getInt(1) +
                    ", APELLIDO Y NOMBRE: " + resultSet.getString(2) + ", " + resultSet.getString(3) +
                    ", MATRICULA: " + resultSet.getString(4) : "La tabla está vacía");

        } catch (Exception ex) {
            logger.error(ex.getMessage());
            connection.rollback();
        } finally {
            connection.close();
        }

        Connection connection1 = getConnection();
        String select = QuerysSQL.SQL_SELECT;
        Statement stmt = connection1.createStatement();
        ResultSet resultSet = stmt.executeQuery(select);

       /* logger.info(resultSet.next() ? "ID: " + resultSet.getInt(1) +
                ", Apellido y nombre: " + resultSet.getString(2) + ", " + resultSet.getString(3) +
                ", matrícula: " + resultSet.getString(4) : "La tabla está vacía");*/
    }

    private static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
    }
}
