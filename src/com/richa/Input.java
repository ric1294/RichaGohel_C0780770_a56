package com.richa;

import javax.swing.*;

//main class
public class Input{
    public static void main(String args[]) {
        try{
            boolean isLimitReached = true; // flags
            Assignment a = new Assignment();
            for (int i = 0; i < 3; i++) {
                String fName = JOptionPane.showInputDialog("Enter your First Name:"); // joptions for input /output
                String lName = JOptionPane.showInputDialog("Enter your Last Name:");
                a.setFirstName(fName);
                a.setLastName(lName);
                if (a.getFirstName().equals("Richa") && a.getLastName().equals("Gohel")) {
                    a.askUserInput();
                    a.displayTotalCost(a.getServicesCost(), a.getOptionsCost() , a.getItemsCost());
                    isLimitReached = false;
                    break;
                } else {
                    continue;
                }
            }
            if(isLimitReached){
                JOptionPane.showMessageDialog(null,
                        "You have exceeded your try’s, goodbye.");
            }

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
