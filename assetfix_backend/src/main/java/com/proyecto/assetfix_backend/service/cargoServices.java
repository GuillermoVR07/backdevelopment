package com.proyecto.assetfix_backend.service;
import com.proyecto.assetfix_backend.model.Cargo;
import com.proyecto.assetfix_backend.repository.cargoRepository;
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
public class cargoServices implements cargoRepository {
    @Autowired
    private cargoRepository cargoRepository;

    public cargoServices(){
    }
    public cargoServices(cargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    @Override
    public void flush() {
    }

    @Override
    public <S extends Cargo> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Cargo> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Cargo> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Cargo getOne(Long aLong) {
        return null;
    }

    @Override
    public Cargo getById(Long aLong) {
        return null;
    }

    @Override
    public Cargo getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Cargo> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Cargo> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Cargo> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Cargo> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Cargo> long count(Example<S> example) {
       return cargoRepository.count();
    }

    @Override
    public <S extends Cargo> boolean exists(Example<S> example) {
        return cargoRepository.exists(example);
    }

    @Override
    public <S extends Cargo, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Cargo> S save(S entity) {
        return cargoRepository.save(entity);
    }

    @Override
    public <S extends Cargo> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Cargo> findById(Long aLong) {
        return cargoRepository.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Cargo> findAll() {
        return cargoRepository.findAll();
    }

    @Override
    public List<Cargo> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {
        cargoRepository.deleteById(aLong);

    }

    @Override
    public void delete(Cargo entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Cargo> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Cargo> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Cargo> findAll(Pageable pageable) {
        return null;
    }
}
