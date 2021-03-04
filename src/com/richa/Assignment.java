package com.richa;

import javax.swing.*;

//program class
public class Assignment extends calculateValue {
    //Instance fields
    private String firstName;
    private String lastName;
    private Services services;
    private Options options;
    private Items items;
    private float servicesCost;
    private float optionsCost;
    private float itemsCost;
    private float totalCost;

    // Constructors
    public Assignment(String firstName, String lastName, Services services, Options options, Items items, float servicesCost, float optionsCost, float itemsCost, float totalCost) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.services = services;
        this.options = options;
        this.items = items;
        this.servicesCost = servicesCost;
        this.optionsCost = optionsCost;
        this.itemsCost = itemsCost;
        this.totalCost = totalCost;
    }

    //constructor overloading
    public Assignment() {
    }

    //Instance methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public float getServicesCost() {
        return servicesCost;
    }

    public void setServicesCost(float servicesCost) {
        this.servicesCost = servicesCost;
    }

    public float getOptionsCost() {
        return optionsCost;
    }

    public void setOptionsCost(float optionsCost) {
        this.optionsCost = optionsCost;
    }

    public float getItemsCost() {
        return itemsCost;
    }

    public void setItemsCost(float itemsCost) {
        this.itemsCost = itemsCost;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }

    //Method Overriding
    @Override
    public void displayTotalCost(Float s, Float o , Float i ){
        this.setTotalCost(s + o + i);
        JOptionPane.showMessageDialog(null,
                "Your total cost is  $ "+this.getTotalCost());
    }

    public void askUserInput(){

        Services[] services = Services.values();
        Object service = JOptionPane.showInputDialog(null, "Please select service",
                "Services", JOptionPane.QUESTION_MESSAGE, null, services, null);
        this.setServices(Services.valueOf(service.toString()));
        this.setServicesCost(this.getServices().getPrice());

        Options[] options = Options.values();
        Object option = JOptionPane.showInputDialog(null, "Please select Options ",
                "Services", JOptionPane.QUESTION_MESSAGE, null, options, null);
        this.setOptions(Options.valueOf(option.toString()));
        this.setOptionsCost(this.getOptions().getStorage());

        Items[] items = Items.values();
        Object item = JOptionPane.showInputDialog(null, "Please select items ",
                "Services", JOptionPane.QUESTION_MESSAGE, null, items, null);
        this.setItems(Items.valueOf(item.toString()));
        this.setItemsCost(this.getItems().getBoxes());

        //Method overloading
        calculateValue cv = new calculateValue();
        cv.displayServicesCost(this.getServices().getPrice());
        cv.displayOptionsCost(this.getOptions().getStorage());
        cv.displayItemsCost(this.getItems().getBoxes());

    }





}
