package com.richa;

public enum Options {
    Small(8f),
    Large(20.11f);

    private Float storage;

    // getter method
    public Float getStorage()
    {
        return this.storage;
    }

    // enum constructor - cannot be public or protected
    private Options(Float storage)
    {
        this.storage = storage;
    }

}
