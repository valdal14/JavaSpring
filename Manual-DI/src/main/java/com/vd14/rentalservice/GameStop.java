package com.vd14.rentalservice;

import java.util.List;
import java.util.MissingResourceException;

public class GameStop implements StoreFinder {
    private static final String STORE_ID = "GAME_STOP";
    private final StoreDB storeDB;

    public GameStop(StoreDB storeDB) {
        this.storeDB = storeDB;
    }

    @Override
    public StoreDTO getStoreBy(String storeName) {
        List<StoreDTO> stores = storeDB.getStores();
        for (StoreDTO store : stores) {
            if(store.getStoreName().equalsIgnoreCase(storeName)) {
                return store;
            }
        }

        throw new MissingResourceException("Store not found", STORE_ID, storeName);
    }

    @Override
    public String getStoreFinderIdentifier() {
        return STORE_ID;
    }
}
