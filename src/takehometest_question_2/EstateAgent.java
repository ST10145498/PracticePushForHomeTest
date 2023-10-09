/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package takehometest_question_2;

/**
 *
 * @author USER
 */
public abstract class EstateAgent implements iEstateAgent {
    //declare variables 
     String name;
     double propertyPrice;
     double agentCommission;

/*
     contructor with parameters for name and price 
     */
    public EstateAgent(String name, double propertyPrice) {
        this.name = name;
        this.propertyPrice = propertyPrice;
    }
    
      public String getAgentName() { //method is being implemented form the interface "iEstateAgent"
        return name;
    }

    public double getPropertyPrice() {//method is being implemented form the interface "iEstateAgent"
        return propertyPrice;
    }

    public double getAgentCommission() {
        return 0.2 * getPropertyPrice(); // calculation to find the commission price and return it for output 
    }
    
    
}
