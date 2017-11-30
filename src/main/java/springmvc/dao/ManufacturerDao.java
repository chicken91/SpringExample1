package springmvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springmvc.model.Manufacturer;

import java.util.UUID;
//@Repository("manufacturerDao")
public interface ManufacturerDao extends JpaRepository<Manufacturer,UUID> {
}
