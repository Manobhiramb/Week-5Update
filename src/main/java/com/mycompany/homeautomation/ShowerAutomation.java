/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homeautomation;

/**
 *
 * @author furqan
 */
public class ShowerAutomation extends Automation{
    
    String ShowerResult;

    public ShowerAutomation(String ShowerAnswer) {
        ShowerResult = ShowerAnswer;
    }
    
         @Override
   void Specification() {
       
       switch(ShowerResult)
                {
                    case "Yes":
                    System.out.println("The Shower is on and it showering the water over person");
                    break;
                    
                    case "No":
                    System.out.println("The Shower is off and it is not showering the water over person");
                    break;                    
                }       
   }
}
