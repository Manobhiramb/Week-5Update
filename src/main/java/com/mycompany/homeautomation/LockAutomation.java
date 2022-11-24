/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homeautomation;

/**
 *
 * @author furqan
 */
public class LockAutomation extends Automation{
    
     String LockResult;

    public LockAutomation(String LockAnswer) {
        LockResult = LockAnswer;
    }
    
         @Override
   void Specification() {
      switch(LockResult)
                {
                    case "Yes":
                    System.out.println("The House is not locked so lock the house");
                    break;
                    
                    case "No":
                    System.out.println("The House is locked so if you want then unlock the house");
                    break;                    
                }  
   }
}