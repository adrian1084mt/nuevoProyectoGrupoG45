package com.nuevo.proyecto.service;

import com.nuevo.proyecto.model.Skate;
import com.nuevo.proyecto.repository.SkateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SkateService {

    @Autowired
    private SkateRepository skateRepository;

    public SkateService() {
    }

    public <S extends Skate> S save(S entity) {
        return skateRepository.save(entity);
    }

    public <S extends Skate> Iterable<S> saveAll(Iterable<S> entities) {
        return skateRepository.saveAll(entities);
    }

    public Optional<Skate> findById(Integer integer) {
        return skateRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return skateRepository.existsById(integer);
    }

    public Iterable<Skate> findAll() {
        return skateRepository.findAll();
    }

    public Iterable<Skate> findAllById(Iterable<Integer> integers) {
        return skateRepository.findAllById(integers);
    }

    public long count() {
        return skateRepository.count();
    }

    public void deleteById(Integer integer) {
        skateRepository.deleteById(integer);
    }

  /*  public void delete(Integer entity) {
        skateRepository.delete(entity);
    }
  */
    public void deleteAllById(Iterable<? extends Integer> integers) {
        skateRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Skate> entities) {
        skateRepository.deleteAll(entities);
    }

    public void deleteAll() {
        skateRepository.deleteAll();
    }
}
