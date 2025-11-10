/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queetion1;

/**
 *
 * @author lab_services_student
 */
public class main {
    public static void main (String[] args){
       
     // ProductSalesReport.java

   
        // Two-dimensional array holding local retail company product sales data for two (2) years
        int[][] sales = {
            {300, 150,700}, //first year
            {250, 200,600}, // second year
            
        };
        
      ProductSales product = new ProductSales(2200,367,700,150);
      
        // Displaying the report
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("-------------------------------");
        System.out.println("Year\tQ1\tQ2\tQ3");
        System.out.println("-------------------------------");
        System.out.println("YEAR 1\t" + sales[0][0] + "\t" + sales[0][1]+ "     "+sales[0][2]);
        System.out.println("YEAR 2\t" + sales[1][0] + "\t" + sales[1][0]+ "     "+sales[1][2]);
        
        System.out.println("-------------------------------");
        
        // the actual report
        System.out.println("PRODUCT SALES REPORT- 2025");
        System.out.println("**************************");
        System.out.println("Total sales  : "+product.calculateTotalSales());
        System.out.println("Average sales: "+product.calculateAverageSales());
        System.out.println("Maximum sale : "+product.findMaximumSales());
        System.out.println("Minimum sale: "+product.findMinimumSales());
        System.out.println("**************************");
        
    }
    
    
}
