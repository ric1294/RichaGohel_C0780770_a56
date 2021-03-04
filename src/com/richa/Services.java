package com.richa;

public enum Services {
    PackageA(100f),
    PackageB(150f);

    private Float price;

    // getter method
    public Float getPrice()
    {
        return this.price;
    }

    // enum constructor - cannot be public or protected
    private Services(Float price)
    {
        this.price = price;
    }

}
