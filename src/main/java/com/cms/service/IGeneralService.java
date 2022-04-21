package com.cms.service;

import java.util.List;

public interface IGeneralService <T>{
    List<T> findAll();
    T findByID(Long id);
    void save(T t);
    void remove(Long id);
}
