/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queetion1;

/**
 *
 * @author lab_services_student
 */
public class ProductSales {
  //getting the constructors
    int total;
    double average;
    int maximum;
    int minimum;
    
    ProductSales (int toatl, double average,int maximum,int minimum){
        this.total = total;
        this.average = average;
        this.maximum = maximum;
        this.minimum = minimum;
    }
   
    private static final int[][] salesData = {
        {300, 150, 700},//the first year
        {250, 200, 600}//the second year
    };

    public static int calculateTotalSales() {
        int total = 0;
        for (int[] year : salesData) {
            for (int q : year) {
                total += q;
            }
        }
        return total; 
        //it  must return the total of 2200
    }

    public static double calculateAverageSales() {
        return (double) calculateTotalSales() / 6; 
    }

    public static int findMaximumSales() {
        int max = salesData[0][0];
        for (int[] year : salesData) {
            for (int q : year) {
                if (q > max) max = q;
            }
        }
        return max; 
// must be equals to 700
    }

    public static int findMinimumSales() {
        int min = salesData[0][0];
        for (int[] year : salesData) {
            for (int q : year) {
                if (q < min) min = q;
            }
        }
        return min; 
//must equal  150
    }

    // PUBLIC INTERFACE METHODS (for unit tests)
    public static int getTotalSales() {
        return calculateTotalSales(); 
    }
    public static double getAverageSales() {
        return calculateAverageSales(); 
    }
    public static int getMaxSales() {
        return findMaximumSales();
    }
    public static int getMinSales() { 
        return findMinimumSales();
    }
}
