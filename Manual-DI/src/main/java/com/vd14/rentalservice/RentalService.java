package com.vd14.rentalservice;

import lombok.Getter;

import java.util.MissingResourceException;

@Getter
public class RentalService {
    private final StoreFinder storeFinder;

    public RentalService(StoreFinder storeFinder) {
        this.storeFinder = storeFinder;
    }

    public Store getStore(String storeName) {
        StoreDTO store = storeFinder.getStoreBy(storeName);

        if(store.getStoreName().equalsIgnoreCase(storeName)) {
            return new Store(store.getStoreId(), store.getStoreName(), store.getStoreAddress(), storeFinder.getStoreFinderIdentifier());
        }

        throw new MissingResourceException("Store not found", storeFinder.getStoreFinderIdentifier(), storeName);
    }
}
