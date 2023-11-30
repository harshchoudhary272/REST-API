package com.vendor.restvendor.model;

public class CloudVendor {
    private String Vendor_id;
    private String Vendor_name;
    private String Vendor_address;
    private String Vendor_phoneno;

    public CloudVendor() {
    }

    public CloudVendor(String vendor_id, String vendor_name, String vendor_address, String vendor_phoneno) {
        this.Vendor_id = vendor_id;
        this.Vendor_name = vendor_name;
        this.Vendor_address = vendor_address;
        this.Vendor_phoneno = vendor_phoneno;
    }

    public String getVendor_id() {
        return Vendor_id;
    }

    public void setVendor_id(String vendor_id) {
        Vendor_id = vendor_id;
    }

    public String getVendor_name() {
        return Vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        Vendor_name = vendor_name;
    }

    public String getVendor_address() {
        return Vendor_address;
    }

    public void setVendor_address(String vendor_address) {
        Vendor_address = vendor_address;
    }

    public String getVendor_phoneno() {
        return Vendor_phoneno;
    }

    public void setVendor_phoneno(String vendor_phoneno) {
        Vendor_phoneno = vendor_phoneno;
    }








}
