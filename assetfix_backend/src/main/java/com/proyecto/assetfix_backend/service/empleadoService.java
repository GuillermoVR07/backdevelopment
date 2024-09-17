package com.proyecto.assetfix_backend.service;

import com.proyecto.assetfix_backend.model.Empleado;
import com.proyecto.assetfix_backend.repository.empleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class empleadoService implements empleadoRepository {
    @Autowired
    private empleadoRepository empleadoRepository;
    public empleadoService(){}
    public empleadoService(empleadoRepository empleadoRepository_){
        this.empleadoRepository = empleadoRepository_;
    }

    public void UpdateEmployee(Long id, Empleado empleado) {

            Optional<Empleado> actualizarEmpleado = empleadoRepository.findById(id);
            if(actualizarEmpleado.isPresent()){
                actualizarEmpleado.get().setNombre(empleado.getNombre());
                actualizarEmpleado.get().setApellido(empleado.getApellido());
                actualizarEmpleado.get().setCi(empleado.getCi());
                actualizarEmpleado.get().setEmail(empleado.getEmail());
                actualizarEmpleado.get().setPassword(empleado.getPassword());
                actualizarEmpleado.get().setTelefono(empleado.getTelefono());
                actualizarEmpleado.get().setFecha_nacimiento(empleado.getFecha_nacimiento());
                actualizarEmpleado.get().setIdrol(empleado.getIdrol());
                actualizarEmpleado.get().setIdDepartamento(empleado.getIdDepartamento());
                ResponseEntity.ok(empleadoRepository.save(actualizarEmpleado.get()));
            }else{
                ResponseEntity.notFound().build();
            }

    }
    @Override
    public void flush() {
    }
    @Override
    public <S extends Empleado> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Empleado> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Empleado> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Empleado getOne(Long aLong) {
        return null;
    }

    @Override
    public Empleado getById(Long aLong) {
        return empleadoRepository.getById(aLong);
    }

    @Override
    public Empleado getReferenceById(Long aLong) {
        return empleadoRepository.getReferenceById(aLong);
    }

    @Override
    public <S extends Empleado> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Empleado> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Empleado> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Empleado> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Empleado> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Empleado> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Empleado, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Empleado> S save(S entity) {
        return empleadoRepository.save(entity);
    }

    @Override
    public <S extends Empleado> List<S> saveAll(Iterable<S> entities) {
        return empleadoRepository.saveAll(entities);
    }

    @Override
    public Optional<Empleado> findById(Long aLong) {
        return Optional.of(empleadoRepository.findById(aLong).get());
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Empleado> findAll() {
        return empleadoRepository.findAll();
    }

    @Override
    public List<Empleado> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return empleadoRepository.count();
    }

    @Override
    public void deleteById(Long aLong) {
        empleadoRepository.deleteById(aLong);

    }

    @Override
    public void delete(Empleado entity) {
        empleadoRepository.delete(entity);

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Empleado> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Empleado> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Empleado> findAll(Pageable pageable) {
        return null;
    }
}
