package com.company.drugstore.main.service;

import com.company.drugstore.main.dao.IDao;
import com.company.drugstore.main.dao.impl.MedicineDao;
import com.company.drugstore.main.model.Medicine;

public class Service {

    private IDao<Medicine> dao;

    public Service(){
        dao = new MedicineDao();
    }

    public Medicine save(Medicine medicineToSave){
        return dao.save(medicineToSave);
    }

    public Medicine findById(Integer id){
        return dao.findById(id);
    }
}
