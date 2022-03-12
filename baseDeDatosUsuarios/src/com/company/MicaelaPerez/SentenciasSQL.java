package com.company.MicaelaPerez;

public class SentenciasSQL {

    public final static String SQL_CREATE = "DROP TABLE IF EXISTS empleado;\n" + "CREATE TABLE empleado (id INT PRIMARY KEY, "
            + "nombre VARCHAR(25),"
            + "apellido VARCHAR(25),"
            + "edad INT,"
            + "antiguedad INT)";

    public final static String SQL_INSERT = "INSERT INTO empleado VALUES(";

    public final static String SQL_DELETE = "DELETE FROM empleado WHERE apellido = 'lopez'";

    public final static String SQL_QUERY = "SELECT * FROM empleado WHERE apellido = 'lopez'";

    public static String generarInsertParaEmpleado(Integer id, String nombre, String apellido, Integer edad, Integer antiguedad){
        return SQL_INSERT + id + ", '" + nombre + "', '" + apellido + "', " + edad + ", " + antiguedad + ");";
    }

    public final static String SQL_UPDATE = "UPDATE empleado SET nombre = 'tomas' WHERE nombre = 'mabel'";
}
