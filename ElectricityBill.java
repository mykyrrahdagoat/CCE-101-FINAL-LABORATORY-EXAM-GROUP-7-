/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package electricitybill;

import java.util.Scanner;
public class ElectricityBill {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("===ELECTRICITY BILL===");
        
        System.out.print("Customer:");
        String name = scan.nextLine();
        
        System.out.print("Consumption:");
        double consumption = scan.nextDouble();
      
        double rate = 12.0;
        double totalBill = (consumption * rate);
        double discount = (totalBill * 0.05);
        double finalAmount = (totalBill - discount);
        
        if (totalBill <=1999){
            System.out.println("Rate per kWh:"  + rate);
            System.out.println("Total Bill: " + totalBill);
            System.out.println("Final Amount: " + finalAmount);
            
           
        }else if (totalBill >=2000){
            System.out.println("Rate per kWh:"  + rate);
            System.out.println("Total Bill: " + totalBill);
            System.out.println("Discount: "+ discount);
            System.out.println("Final Amount: " + finalAmount);
            
        }       
        
    }
    
}

