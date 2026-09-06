package com.vd14.rentalservice.tests;

import com.vd14.rentalservice.RemoteStores;
import org.junit.Assert;
import org.junit.Test;

public class StoredStoresTests {

    @Test
    public void testStoresInit(){
        RemoteStores stores = makeSUT();
        int expectedStores = 2;
        int actualStores = stores.getStores().size();
        Assert.assertEquals(expectedStores, actualStores);
    }

    public RemoteStores makeSUT() {
        return new RemoteStores();
    }
}
