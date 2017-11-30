package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.model.Manufacturer;
import springmvc.service.ManufacturerService;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/")
public class ManufacturerController {
    @Autowired
    private ManufacturerService service;

    @RequestMapping(value ={ "/","/listM"}, method = RequestMethod.GET)
    public String listManufacturers(ModelMap model){
        List<Manufacturer> manufacturers = service.getAllManufacturer();
        model.addAttribute("manufacturers", manufacturers);
        return "manufacturersList";
    }
    @RequestMapping(value = "/addM", method = RequestMethod.GET)
    public String newManufacturer(ModelMap model){
        Manufacturer manufacturer = new Manufacturer();
        model.addAttribute("manufacturer", manufacturer);
        model.addAttribute("edit",false);
        return "addManufacturer";
    }
    @RequestMapping(value = "/addM", method = RequestMethod.POST)
    public String saveManufacturer(@Valid Manufacturer manufacturer, BindingResult result,
                                   ModelMap model){
        if(result.hasErrors()){
            return "addManufacturer";
        }
        service.addManufacturer(manufacturer);
        model.addAttribute("success","Manufacturer" + manufacturer.getName()+ "added successfully");
        return "redirect:/listM";
        //"success"
    }
    @RequestMapping( value = "/edit-{id}-manufacturer", method = RequestMethod.GET)
    public String editManufacturer(@PathVariable UUID id, ModelMap model){
        Manufacturer manufacturer = service.getById(id);
        model.addAttribute("manufacturer", manufacturer);
        model.addAttribute("edit", true);
        return "addManufacturer";
    }
    @RequestMapping(value = "/edit-{id}-manufacturer", method = RequestMethod.POST)
    public String updateManufacturer(@Valid Manufacturer manufacturer, BindingResult result,
                                     ModelMap model, @PathVariable UUID id){
        if(result.hasErrors()){
            return "addManufacturer";
        }
        service.updateManufacturer(manufacturer);
        model.addAttribute("success","Manufacturer" + manufacturer.getName()+ "updated successfully" );
        return "redirect:/listM";
        //manufacturerList
    }
    @RequestMapping(value = "/delete-{id}-manufacturer", method = RequestMethod.GET)
    public String deleteManufacturer(@PathVariable UUID id){
        service.deleteManufacturer(id);
        return "redirect:/listM";
    }
}
