package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springmvc.dao.ManufacturerDao;
import springmvc.model.Manufacturer;

import java.util.List;
import java.util.UUID;
@Service("manufacturerService")
@Transactional
public class ManufacturerServiceImpl implements ManufacturerService {

    @Autowired
    private ManufacturerDao manufacturerDao;

    public Manufacturer getById(UUID id) {
        return manufacturerDao.findOne(id);
    }

    public void addManufacturer(Manufacturer manufacturer) {
        manufacturerDao.save(manufacturer);
    }

    public void updateManufacturer(Manufacturer manufacturer) {
        Manufacturer entity = manufacturerDao.findOne(manufacturer.getId());
        if(entity!=null) {
            entity.setName(manufacturer.getName());
        }
    }

    public void deleteManufacturer(UUID id) {
        manufacturerDao.delete(id);
    }

    public List<Manufacturer> getAllManufacturer() {
        return manufacturerDao.findAll();
    }
}
