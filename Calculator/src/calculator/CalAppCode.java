/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.ArrayList;
/**
 *
 * @author User
 */
public class CalAppCode {
    
    double number;
    double number2;
    double result ;
    String operation;

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
   

    public void setOperation(String operation) {
        this.operation = operation;
    }
    
    public String getOperation() {
        return operation;
    }
   
   
    
     public void setNumber(double number) {
       this.number = number;
       
    }

    
        public double getNumber() {
        return this.number;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
     public double getResult() {
        return result;
    }
  

    public static void main(String[] args) {
        
       new Calculator().setVisible(true);
        
    }
    

        public double getAns(){
            
           switch (operation)
           {
               case "+":
                   
                   result = number +number2;
                   break;
               
               case "-":
                   
                   result = number - number2;
                   break;
                   
               case "*":
                   
                   result = number * number2;
                   break;
               
               case "/":
                   
                   result = number /number2;
                   break;
               default:
                   break;
                  
           }
            
            
            return result;
        }
        
        
        
    
    
       

}
