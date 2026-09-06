package com.vd14.rentalservice;

import lombok.Getter;
import java.util.ArrayList;
import java.util.List;

@Getter
public class RemoteStores implements StoreDB {
    private final List<StoreDTO> stores;
    public RemoteStores() {
        stores = new ArrayList<>();
        stores.add(new StoreDTO(1, "GameLife", "Via Roma 7 - Italy"));
        stores.add(new StoreDTO(2, "GameStop", "Main Road 14 - London"));
    }
}
