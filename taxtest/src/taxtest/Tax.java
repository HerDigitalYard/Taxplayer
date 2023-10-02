package taxtest;

public class Tax {

    public Tax() {
        // Welcome Message
        System.out.println("********** Welcome to the IncomeTax Finding System **********");
    }

    public double calculateTax(double empSalary) {

        double findTax = 0.0;       //local veriable for tax finder

        // code to calculate tax based on tax brackets shown in Table 1
        if (empSalary > 0 && empSalary < 18200) {
            findTax = 0.0;
        } else if (empSalary > 18201 && empSalary < 37000) {
            findTax = (empSalary - 18200) * 0.19;
        } else if (empSalary > 37001 && empSalary < 87000) {
            findTax = ((empSalary - 37000) * 0.325) + 3572;
        } else if (empSalary > 87001 && empSalary < 180000) {
            findTax = ((empSalary - 87000) * 0.37) + 19822;
        } else if (empSalary > 180000) {
            findTax = ((empSalary - 180000) * 0.45) + 54097;
        }
        return findTax;
    }

    public int highestTaxGroup(int group1, int group2, int group3, int group4, int group5) {
        int highestGroup = 0;

        // code to determine and return tax group number with highest number of employees
        if (group1 > group2 && group1 > group3 && group1 > group4 && group1 > group5) {
            highestGroup = 1;
        } else if (group2 > group3 && group2 > group4 && group2 > group5) {
            highestGroup = 2;
        } else if (group3 > group4 && group3 > group5) {
            highestGroup = 3;
        } else if (group4 > group5) {
            highestGroup = 4;
        } else {
            highestGroup = 5;
        }
        return highestGroup;
    }
}
