package com.richa;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;

public class CalculateValue {
    public void displayServicesCost(float servicevalue )
    {
        JOptionPane.showMessageDialog(null,
                "Your Service cost price is $ "+servicevalue + "/hr");

    }


    public void displayOptionsCost(float optionValue)
    {
        JOptionPane.showMessageDialog(null,
                "Your Option cost price is $ "+optionValue + "/day");

    }


    public void displayItemsCost(Float boxes) {
        JOptionPane.showMessageDialog(null,
                "Your Item cost price is $ "+boxes + "/box");

    }


    public void displayTotalCost(Float s, Float o , Float i){

        JOptionPane.showMessageDialog(null,
                "Your total cost price is null");
    }

}
