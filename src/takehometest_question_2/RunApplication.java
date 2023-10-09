/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package takehometest_question_2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class RunApplication {
    Scanner Kb = new Scanner(System.in);
    /*
    When this method is called it will prompt for  name and property price,
    once is does so we create an instance of the EstateAgentSales class and call the report method 
    to outpu the final results for the user 
    */
    public void start()
    {
        System.out.print("Enter the current estate agent name: "); 
        String agentName = Kb.nextLine();
        
        System.out.print("Enter the property price: ");
        double propertyPrice = Kb.nextDouble();
        
         EstateAgentSales GG = new EstateAgentSales(agentName, propertyPrice); // create an isntance of the class with parameteres 


        GG.propertyReport();// calls methid from EstateAgentSales 
    }
}
