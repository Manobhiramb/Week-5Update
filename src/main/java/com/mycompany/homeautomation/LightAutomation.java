/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homeautomation;

import java.util.Scanner;

public class LightAutomation extends Automation {

    String LightResult;

    public LightAutomation(String LightAnswer) {
        LightResult = LightAnswer;
    }

    @Override
    void Specification() {
               
        switch(LightResult)
                {
                    case "Yes":
                    System.out.println("The Door Of the room is now Opened then light is automatically on");
                    break;
                    
                    case "No":
                    System.out.println("The Door Of the room is now Closed then light is automatically off");
                    break;                    
                }      
    }
}
