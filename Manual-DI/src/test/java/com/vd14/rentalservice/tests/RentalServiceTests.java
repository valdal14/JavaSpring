package com.vd14.rentalservice.tests;

import com.vd14.rentalservice.*;
import org.junit.Assert;
import org.junit.Test;

public class RentalServiceTests {
    private final RemoteStores remoteStores = new RemoteStores();

    @Test
    public void testGetStoreByNameUsingGameStopFinder() {
        RentalService sut = makeSUT(new GameStop(remoteStores));
        sut.getStore("GameStop");

        Store expectedStore = new Store(2, "GameStop", "Main Road 14 - London", "GAME_STOP");
        Store actualStore = sut.getStore("GameStop");
        Assert.assertEquals(expectedStore, actualStore);
    }

    @Test
    public void testGetStoreByNameUsingGameLifeFinder() {
        RentalService sut = makeSUT(new GameLife(remoteStores));
        sut.getStore("GameLife");

        Store expectedStore = new Store(1, "GameLife", "Via Roma 7 - Italy", "GAME_LIFE_REMOTE_STORE_LIFE");
        Store actualStore = sut.getStore("GameLife");
        Assert.assertEquals(expectedStore, actualStore);
    }

    public RentalService makeSUT(StoreFinder finder) {
        return new RentalService(finder);
    }
}
