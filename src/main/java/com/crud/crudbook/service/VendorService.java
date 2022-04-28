package com.crud.crudbook.service;

import com.crud.crudbook.entity.Vendor;
import com.crud.crudbook.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService implements VendorServiceInterface{
    @Autowired
    private VendorRepository vendorRepository;


    @Override
    public List<Vendor> getAllVendors() { return vendorRepository.findAll(); }

    @Override
    public Vendor saveVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    @Override
    public Vendor updateVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    @Override
    public void deleteVendor(Long id) {
        vendorRepository.deleteById(id);
    }
}
