package com.livelyc0der.eksplor.models;

public final class Place {

    private int nameId;

    private int imageId;

    public Place(int nameId, int imageId) {
        this.nameId = nameId;
        this.imageId = imageId;
    }

    public int getNameId() {
        return nameId;
    }

    public int getImageId() {
        return imageId;
    }
}
