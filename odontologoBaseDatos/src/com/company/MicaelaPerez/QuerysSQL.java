package com.company.MicaelaPerez;

public class QuerysSQL {
    public static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS ODONTOLOGOS; CREATE TABLE ODONTOLOGOS"
            + "("
            + " ID INT PRIMARY KEY,"
            + " APELLIDO varchar(100) NOT NULL,"
            + " NOMBRE varchar(100) NOT NULL,"
            + " MATRICULA varchar(100) NOT NULL"
            + ")";

    public static final String SQL_INSERT = "INSERT INTO ODONTOLOGOS (ID, APELLIDO, NOMBRE, MATRICULA) VALUES (?, ?, ?, ?)";
    public static final String SQL_UPDATE = "UPDATE ODONTOLOGOS SET MATRICULA = ? WHERE APELLIDO = ?";

    public static final String SQL_SELECT = "SELECT * FROM ODONTOLOGOS";
}
