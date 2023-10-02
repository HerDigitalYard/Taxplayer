/*
 * Prepared Name = Esha Shah 
 * Prepared ID = 12125265
 * Mention tutorÃ¢â‚¬â„¢s name = Naveed Ali
 * Purpose - calculate the tax - distribute according groups 
 */
package taxpayertest;

public class Taxpayer 
{

    //fields to store name, age, taxable income, tax, group number   
    String emp_name;
    int emp_age;
    Double emp_income;
    Double tax = 0.0;
    int tax_group = 0;

    // Calculate and Store Tax, Group number for all taxpayers
    public double calculateTax() 
    {

        double findTax = 0.0;       //local veriable for tax finder
        
        // code to calculate tax based on tax brackets shown in Table 1 case study
        if (this.emp_income > 0 && this.emp_income < 18200) 
        {
            findTax = 0.0;
            tax_group = 1;
        } 
        else if (this.emp_income > 18201 && this.emp_income < 37000) 
        {
            findTax = (this.emp_income - 18200) * 0.19;
            tax_group = 2;
        } 
        else if (this.emp_income > 37001 && this.emp_income < 87000) 
        {
            findTax = ((this.emp_income - 37000) * 0.325) + 3572;
            tax_group = 3;
        } 
        else if (this.emp_income > 87001 && this.emp_income < 180000) 
        {
            findTax = ((this.emp_income - 87000) * 0.37) + 19822;
            tax_group = 4;
        } 
        else if (this.emp_income > 180000) 
        {
            findTax = ((this.emp_income - 180000) * 0.45) + 54097;
            tax_group = 5;
        }
        return this.tax = findTax;
    }
}
