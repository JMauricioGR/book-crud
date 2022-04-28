package com.crud.crudbook.service;

import com.crud.crudbook.entity.Vendor;

import java.util.List;

public interface VendorServiceInterface {

    List<Vendor> getAllVendors();

    Vendor saveVendor(Vendor vendor);

    Vendor updateVendor(Vendor vendor);

    void deleteVendor(Long id);
}
