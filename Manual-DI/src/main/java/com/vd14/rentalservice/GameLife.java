package com.vd14.rentalservice;

import java.util.MissingResourceException;

public class GameLife implements StoreFinder{
    private static final String STORE_ID = "GAME_LIFE";
    private final StoreDB storeDB;

    public GameLife(StoreDB storeDB) {
        this.storeDB = storeDB;
    }

    @Override
    public StoreDTO getStoreBy(String storeName) {
        return storeDB.getStores().stream()
                .filter(store -> store.getStoreName().equalsIgnoreCase(storeName))
                .findFirst()
                .orElseThrow(() -> new MissingResourceException("Store not found", STORE_ID, storeName));
    }

    @Override
    public String getStoreFinderIdentifier() {
        return STORE_ID + "_REMOTE_STORE_LIFE";
    }
}
