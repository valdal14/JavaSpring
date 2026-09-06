package com.vd14.rentalservice;

import lombok.Data;

@Data
public class StoreDTO {
    private int storeId;
    private String storeName;
    private String storeAddress;

    public StoreDTO(int storeId, String storeName, String storeAddress) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeAddress = storeAddress;
    }
}
