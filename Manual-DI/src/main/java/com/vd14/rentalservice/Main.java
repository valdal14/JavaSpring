package com.vd14.rentalservice;

public class Main {

    public static void main(String[] args) {
        // Composition Layer
        RemoteStores remoteStores = new RemoteStores();
        GameLife gameLife = new GameLife(remoteStores);
        RentalService rentalService = new RentalService(gameLife);
        Store gameLifeStore = rentalService.getStore("GameLife");
        System.out.println("Game Life Store ID        : " + gameLifeStore.getId());
        System.out.println("Game Life Store Name      : " + gameLifeStore.getName());
        System.out.println("Game Life Store Address   : " + gameLifeStore.getAddress());
        System.out.println("Game Life Store Identifier: " + gameLifeStore.getStoreFinderIdentifier());
    }
}
