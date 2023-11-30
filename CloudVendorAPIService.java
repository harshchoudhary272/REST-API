package com.vendor.restvendor.controller;

import com.vendor.restvendor.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    CloudVendor cloudVendor;
    //Get API service//
    @GetMapping("{Vendor_id}")
    public CloudVendor getCloudVendorDetails(String Vendor_id)
    {
        return cloudVendor;
    }
    //Creating object//
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor created successfully";
    }
    //Updating existing object//
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor Updated successfully";
    }
    @DeleteMapping("{Vendor_id}")
    public String deleteCloudVendorDetails(String Vendor_id)
    {
        this.cloudVendor = null;
        return "Cloud vendor Deleted successfully";
    }

}
