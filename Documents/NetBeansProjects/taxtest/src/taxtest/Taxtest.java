// Esha Shah (12125265)
package taxtest;

import java.util.Scanner;

public class Taxtest {

    public static void main(String[] args) {

        // declare variables/constants
        final int N = 6;
        double minIncome = Double.POSITIVE_INFINITY;
        double maxIncome = Double.NEGATIVE_INFINITY;
        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        int group4 = 0;
        int group5 = 0;
        int highestTaxableGroup = 0;

        //object of Tax Class
        Tax obj_findTax = new Tax();

        System.out.println(" ");
        System.out.println("N =" + N);

        // Take Salary From User, Calculate and display Tax
        Scanner take_empSalary = new Scanner(System.in);
        for (int i = 1; i <= 6; i++) {
            System.out.print("Enter the taxable income for employee" + i + ":");
            double empSalary = take_empSalary.nextDouble();
            System.out.printf("Income of employee %d is : %.2f \n", i, empSalary);

            //calculatedTax
            double calculatedTax = obj_findTax.calculateTax(empSalary);
            System.out.printf("Tax, employee has to pay is : $%.2f", calculatedTax);

            // Find Highest and Lowest Tax
            if (calculatedTax >= maxIncome) {
                maxIncome = calculatedTax;
            }
            if (calculatedTax < minIncome) {
                minIncome = calculatedTax;
            }

            System.out.println("\n");

            if (empSalary >= 0 && empSalary <= 18200) {
                group1++;
            } else if (empSalary >= 18201 && empSalary <= 37000) {
                group2++;
            } else if (empSalary >= 37001 && empSalary <= 87000) {
                group3++;
            } else if (empSalary >= 87001 && empSalary <= 180000) {
                group4++;
            } else if (empSalary > 180001) {
                group5++;
            }


        }

        // Highest Taxable Group
        highestTaxableGroup = obj_findTax.highestTaxGroup(group1, group2, group3, group4, group5);

        // generate and display report
        System.out.println("---------- Report ----------");
        System.out.printf("\nHighest tax: %.2f", maxIncome);
        System.out.printf("\nLowest tax: %.2f \n", minIncome);
        System.out.println("Number of employees in Group 1:"+group1);
        System.out.println("Number of employees in Group 5:"+group5);
        System.out.println("Tax group number with highest number of employees:"+highestTaxableGroup);
        System.out.println("");
        System.out.print("----------------------------");

        // display exit message
        System.out.println("");
        System.out.print("********** Thank You ********** \n");

    }
}
