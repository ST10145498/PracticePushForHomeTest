/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package takehometest_question_2;

/**
 *
 * @author USER
 */
public class EstateAgentSales extends EstateAgent {
    //contructor 
    public EstateAgentSales(String name, double propertyPrice) { // parameters 
        super(name,propertyPrice); // calls the contructor of the super class 
    }
    
    /*
    We use this method to output the final report with the name of the agent , price of the property 
    and the commission that the agent will recieve 
    When called it will display all the given details in order required 
    */
      public void propertyReport()
      {
        System.out.println(" ");
        System.out.println("ESTATE AGENT REPORT \n"
                +          "*******************");
        System.out.println("ESTATE AGENT NAME: " + getAgentName());//get name to put on report 
        System.out.println("PROPERTY PRICE: R " + getPropertyPrice());//get price to put on report 
        System.out.println("AGENT COMMISSION: R " + getAgentCommission());//get commision to put on report 
      }
    
}
