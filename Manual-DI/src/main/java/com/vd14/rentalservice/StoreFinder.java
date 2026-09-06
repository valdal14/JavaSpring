package com.vd14.rentalservice;

public interface StoreFinder {
    StoreDTO getStoreBy(String storeName);
    String getStoreFinderIdentifier();
}
