package com.example.videojuegos.services;

import java.util.List;

public interface BaseService<E> {

    List<E> findAll () throws Exception;
    E findById(long id) throws Exception;
    E saveOne(E entity) throws Exception;
    boolean deleteById (long id) throws Exception;
    E updateOne (E entity, long id) throws Exception;

}
