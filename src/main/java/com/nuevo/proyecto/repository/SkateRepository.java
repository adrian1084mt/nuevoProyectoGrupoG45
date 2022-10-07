package com.nuevo.proyecto.repository;

import com.nuevo.proyecto.model.Skate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class SkateRepository {

    @Autowired
    private SkateRepositoryInterface skateRepositoryInterface;

    public SkateRepository() {
        //Constructo vacio
    }

    public <S extends Skate> S save(S entity) {
        return skateRepositoryInterface.save(entity);
    }

    public <S extends Skate> Iterable<S> saveAll(Iterable<S> entities) {
        return skateRepositoryInterface.saveAll(entities);
    }

    public Optional<Skate> findById(Integer integer) {
        return skateRepositoryInterface.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return skateRepositoryInterface.existsById(integer);
    }

    public Iterable<Skate> findAll() {
        return skateRepositoryInterface.findAll();
    }

    public Iterable<Skate> findAllById(Iterable<Integer> integers) {
        return skateRepositoryInterface.findAllById(integers);
    }

    public long count() {
        return skateRepositoryInterface.count();
    }

    public void deleteById(Integer integer) {
        skateRepositoryInterface.deleteById(integer);
    }

    public void delete(Skate entity) {
        skateRepositoryInterface.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        skateRepositoryInterface.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Skate> entities) {
        skateRepositoryInterface.deleteAll(entities);
    }

    public void deleteAll() {
        skateRepositoryInterface.deleteAll();
    }
}
