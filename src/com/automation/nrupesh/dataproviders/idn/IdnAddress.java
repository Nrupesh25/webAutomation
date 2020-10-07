package com.automation.nrupesh.dataproviders.idn;

import com.beust.jcommander.internal.Nullable;

public class IdnAddress {
    @Nullable
    public String name;
    @Nullable
    public String phonenumber;
    public String homeaddress;
    public String road;
    public String postalcode;
    @Nullable
    public String city;
    public String l1province;
    public String l2city;
    public String l3kacamatan;
    public boolean defaultaddress;


    public IdnAddress(String name, String phonenumber, String homeaddress, String road, String postalcode,
                      String l1province, String l2city, String l3kacamatan, boolean defaultaddress) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.homeaddress = homeaddress;
        this.road = road;
        this.postalcode = postalcode;
        this.l1province = l1province;
        this.l2city = l2city;
        this.l3kacamatan = l3kacamatan;
        this.defaultaddress = defaultaddress;
    }
}
