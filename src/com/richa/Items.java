package com.richa;

public enum Items {
    SmallBox(2.50f),
    LargeBox(4.50f);

    private Float boxes;

    // getter method
    public Float getBoxes()
    {
        return this.boxes;
    }

    // enum constructor - cannot be public or protected
    private Items(Float boxes)
    {
        this.boxes = boxes;
    }

}
