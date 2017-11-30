package springmvc.service;

import springmvc.model.Manufacturer;

import java.util.List;
import java.util.UUID;

public interface ManufacturerService {
    Manufacturer getById(UUID id);

    void addManufacturer(Manufacturer manufacturer);

    void updateManufacturer(Manufacturer manufacturer);

    void deleteManufacturer(UUID id);

    List<Manufacturer> getAllManufacturer();
}
