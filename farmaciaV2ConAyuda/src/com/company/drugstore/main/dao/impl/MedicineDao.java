package com.company.drugstore.main.dao.impl;

import com.company.drugstore.main.dao.IDao;
import com.company.drugstore.main.model.Medicine;

public class MedicineDao implements IDao<Medicine> {
    @Override
    public Medicine save(Medicine entity) {
        //[1] Obtener y levantar el controlador

        //[2] Abrir la conexión a la base de datos, y usar esa conexión para crear un objeto tipo PreparedStatement
        //[2a] Ejecutar la sentencia SQL, procesar su respuesta

        //[3] Retornamos la entidad con el nuevo id generado.

        return entity;
    }

    @Override
    public Medicine findById(Integer id) {
        //[1] Obtener y levantar el controlador

        //[2] Abrir la conexión a la base de datos, y usar esa conexión para crear un objeto tipo PreparedStatement
        //[2a] Ejecutar la sentencia SQL, procesar su respuesta

        //[3] Retornamos la entidad con el nuevo id generado.

        return null;
    }
}
