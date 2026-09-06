package com.vd14.rentalservice;

import java.util.List;

@FunctionalInterface
public interface StoreDB {
    List<StoreDTO> getStores();
}
