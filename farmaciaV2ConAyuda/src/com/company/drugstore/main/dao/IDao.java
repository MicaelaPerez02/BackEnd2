package com.company.drugstore.main.dao;

public interface IDao<T> {
    T save(T entity);
    T findById(Integer id);
}
