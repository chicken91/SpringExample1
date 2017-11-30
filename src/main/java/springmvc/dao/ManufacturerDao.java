package springmvc.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springmvc.model.Manufacturer;

import java.util.List;
import java.util.UUID;
@Repository
public class ManufacturerDao implements JpaRepository<Manufacturer,UUID> {
    public <S extends Manufacturer> S save(S entity) {
        return null;
    }

    public Manufacturer findOne(UUID uuid) {
        return null;
    }

    public boolean exists(UUID uuid) {
        return false;
    }

    public List<Manufacturer> findAll() {
        return null;
    }

    public List<Manufacturer> findAll(Sort sort) {
        return null;
    }

    public Page<Manufacturer> findAll(Pageable pageable) {
        return null;
    }

    public List<Manufacturer> findAll(Iterable<UUID> uuids) {
        return null;
    }

    public long count() {
        return 0;
    }

    public void delete(UUID uuid) {

    }

    public void delete(Manufacturer entity) {

    }

    public void delete(Iterable<? extends Manufacturer> entities) {

    }

    public void deleteAll() {

    }

    public void flush() {

    }

    public void deleteInBatch(Iterable<Manufacturer> entities) {

    }

    public void deleteAllInBatch() {

    }

    public Manufacturer getOne(UUID uuid) {
        return null;
    }

    public <S extends Manufacturer> S saveAndFlush(S entity) {
        return null;
    }

    public <S extends Manufacturer> List<S> save(Iterable<S> entities) {
        return null;
    }
}
