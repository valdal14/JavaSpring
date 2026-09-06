package com.vd14.rentalservice;

import lombok.Data;

@Data
public class Store {
    private int id;
    private String name;
    private String address;
    private String storeFinderIdentifier;

    public Store(int id, String name, String address, String storeFinderIdentifier) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.storeFinderIdentifier = storeFinderIdentifier;
    }
}
