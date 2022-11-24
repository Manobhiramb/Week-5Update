/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homeautomation;

/**
 *
 * @author furqan
 */
public class PlugAutomation extends Automation{
    
     String PlugResult;

    public PlugAutomation(String PlugAnswer) {
        PlugResult = PlugAnswer;
    }
    
         @Override
   void Specification() {
       switch(PlugResult)
                {
                    case "Yes":
                    System.out.println("The Mobile is fully charged so off the switch and unplug the mobile");
                    break;
                    
                    case "No":
                    System.out.println("The Mobile is not fully charged so on the switch and plug the mobile");
                    break;                    
                }  
   }
}
