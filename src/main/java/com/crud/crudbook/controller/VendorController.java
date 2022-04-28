package com.crud.crudbook.controller;

import com.crud.crudbook.entity.Vendor;
import com.crud.crudbook.service.VendorServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/vendor")
public class VendorController {
    @Autowired
    private VendorServiceInterface vendorServiceInterface;

    @GetMapping("allVendors")
    public List<Vendor> getAllVendors(){
        return vendorServiceInterface.getAllVendors();
    }

    @PostMapping("save")
    public Vendor saveVendor(@RequestBody Vendor vendor){
         return vendorServiceInterface.saveVendor(vendor);
    }

    @PutMapping("update")
    public Vendor updateVendor(@RequestBody Vendor vendor){
        return vendorServiceInterface.updateVendor(vendor);
    }

    @DeleteMapping("delete/{id}")
    public void deleteVendor(@PathVariable Long id){
        vendorServiceInterface.deleteVendor(id);
    }
}
