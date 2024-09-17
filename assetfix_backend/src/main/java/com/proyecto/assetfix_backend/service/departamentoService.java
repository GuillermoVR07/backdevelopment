package com.proyecto.assetfix_backend.service;

import com.proyecto.assetfix_backend.model.Departamento;
import com.proyecto.assetfix_backend.repository.departamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class departamentoService implements departamentoRepository {
    @Autowired
    private departamentoRepository departamentoRepository;
    public departamentoService() {}
    public departamentoService(departamentoRepository departamentoRepository) {
        this.departamentoRepository = departamentoRepository;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Departamento> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Departamento> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Departamento> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Departamento getOne(Long aLong) {
        return null;
    }

    @Override
    public Departamento getById(Long aLong) {
        return null;
    }

    @Override
    public Departamento getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Departamento> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Departamento> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Departamento> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Departamento> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Departamento> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Departamento> boolean exists(Example<S> example) {
        return departamentoRepository.exists(example);
    }

    @Override
    public <S extends Departamento, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Departamento> S save(S entity) {
        return departamentoRepository.save(entity);
    }

    @Override
    public <S extends Departamento> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Departamento> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Departamento> findAll() {
        return departamentoRepository.findAll();
    }

    @Override
    public List<Departamento> findAllById(Iterable<Long> longs) {
        return departamentoRepository.findAllById(longs);
    }

    @Override
    public long count() {
        return departamentoRepository.count();
    }

    @Override
    public void deleteById(Long aLong) {
         departamentoRepository.deleteById(aLong);
    }

    @Override
    public void delete(Departamento entity) {
     departamentoRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Departamento> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Departamento> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Departamento> findAll(Pageable pageable) {
        return null;
    }
}
