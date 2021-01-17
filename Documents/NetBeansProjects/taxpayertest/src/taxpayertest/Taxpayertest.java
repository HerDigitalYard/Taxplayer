/*
 * Prepared Name = Esha Shah 
 * Prepared ID = 12125265
 * Mention tutorÃ¢â‚¬â„¢s name = Naveed Ali
 * Purpose - read data from user - calculate the tax - distribute according groups - sort and search data    
 */
package taxpayertest;

// List of libraries 
import java.util.Scanner;
import java.util.ArrayList;

public class Taxpayertest 
{
    // N = Total Number of Taxpayer 
    final static int N = 6;

    public static void main(String[] args) 
    {

        int menu_option;
        boolean exitApp = false;
        Scanner take_menu_option = new Scanner(System.in);

        System.out.println("Welcome to the Income Tax System");
        System.out.println(" ");

        System.out.println("------------------ Menu Option ------------------");
        System.out.println(" ");

        System.out.println("1. Enter Your Personal Details ");
        System.out.println("2. Calculate the Tax and Classify the Tax groups and Store");
        System.out.println("3. Display all the taxpayers");
        System.out.println("4. Display the name and age of all Tax-payers from tax group1");
        System.out.println("5. Search a Tax-payer by age");
        System.out.println("6. Sort and Display the details of Tax-payers");
        System.out.println("7. Exit from the application");
        System.out.println("---------------------------------------------------");

        ArrayList<Taxpayer> store_details = new ArrayList();

        //Menu option
        do 
        {
            System.out.print("Choose menu item:");
            menu_option = take_menu_option.nextInt();
            System.out.println("---------------------------------------------------");

            switch (menu_option) 
            {
                case 1:  // Read, Validate and store data for N = 6 taxpayers
                    store_details = read_data();
                    break;

                case 2:  // Calculate and Store Tax, Group number for all taxpayers

                    //check wheather option 1 is selected first or not 
                    if (store_details.size() == 0) 
                    {
                        System.out.println("Please Enter you personal Details first");
                    } 
                    else 
                    {
                        // calculate the tax
                        for (Taxpayer calculateTax_obj : store_details) 
                        {
                            calculateTax_obj.calculateTax();
                        }
                        System.out.println("Tax are Calculated and Group numbers are stored accordingly.");
                    }
                    System.out.println(" ");
                    break;

                case 3:  // Display All the Taxpayers

                    //check wheather option 1 is selected first or not
                    if (store_details.size() == 0) 
                    {
                        System.out.println("Please Enter you personal Details first");
                    } 
                    else 
                    {
                        get_data(store_details);
                    }
                    System.out.println(" ");
                    break;

                case 4:
                    if (store_details.size() == 0) 
                    {
                        System.out.println("Please Enter you personal Details first");
                    } 
                    else 
                    {
                        tax_group_data(store_details);
                    }
                    System.out.println(" ");
                    break;

                case 5:  // Search the data through their age
                    if (store_details.size() == 0) 
                    {
                        System.out.println("Please Enter you personal Details first");
                    } 
                    else 
                    {
                        search_data(store_details);
                    }
                    System.out.println(" ");
                    break;

                case 6: // Sort the data in desending order through the name  
                    if (store_details.size() == 0) 
                    {
                        System.out.println("Please Enter you personal Details first");
                    }
                    else 
                    {
                        sort_data(store_details);
                    }
                    System.out.println(" ");
                    break;

                case 7: //Exit 
                    exitApp = true;
                    break;

                default: //If user will enter apart from 1 - 7
                    System.out.println("Invalid choice.");
                    System.out.println("Please select your option in between 1 to 7.");
            }
            System.out.println("---------------------------------------------------");

        } 
        while (!exitApp);
        System.out.println(" ");
        System.out.println("Thank You, See you again");
    }

    // Read, Validate and store data for N = 6 taxpayers
    public static ArrayList<Taxpayer> read_data() 
    {
        ArrayList<Taxpayer> store_details = new ArrayList();

        Scanner take_emp_name = new Scanner(System.in);
        Scanner take_emp_age = new Scanner(System.in);
        Scanner take_emp_Salary = new Scanner(System.in);

        for (int i = 0; i < N; i++) // Read the data from User
        {
            Taxpayer set_details_obj = new Taxpayer();

            System.out.print("Enter the Name of employee " + (i + 1) + ":");
            set_details_obj.emp_name = take_emp_name.nextLine();
            System.out.println("Enter the Age of employee " + (i + 1));

            int check_age = 0;

            // Validation for age (checks wheater age is in between 18 to 64 or not)
            do 
            {
                System.out.print("(Age should be 18 - 64) : ");
                check_age = take_emp_age.nextInt();
            } 
            while (check_age < 18 || check_age > 64);
            set_details_obj.emp_age = check_age;

            System.out.println("Enter the Income of employee " + (i + 1));

            double check_income = 0.0;
            // Validation for Income (checks wheater Income is in between 1 to 999000 or not)
            do 
            {
                System.out.print("(Income should be 1 - 999000) : ");
                check_income = take_emp_age.nextInt();
            } 
            while (check_income < 1 || check_income > 999000);
            set_details_obj.emp_income = check_income;
            System.out.println("  ");

            // Store the data into Array (store_details)
            store_details.add(set_details_obj);
        }
        return store_details;
    }

    // Display All the Taxpayers
    public static void get_data(ArrayList<Taxpayer> get_details) 
    {
        for (Taxpayer get_displaydetails_obj : get_details) 
        {
            System.out.println("Name: " + get_displaydetails_obj.emp_name);
            System.out.println("Age: " + get_displaydetails_obj.emp_age);
            System.out.println("Income: " + get_displaydetails_obj.emp_income);
            System.out.println("Tax: " + get_displaydetails_obj.tax);
            System.out.println("TaxGroup Number : " + get_displaydetails_obj.tax_group);
            System.out.println(" ");
        }
    }

    //Display     
    public static void tax_group_data(ArrayList<Taxpayer> store_details) 
    {

        ArrayList<Taxpayer> tax_group = new ArrayList();

        for (Taxpayer tax_group_obj : store_details) 
        {
            if (tax_group_obj.tax_group == 1) 
            {
                tax_group.add(tax_group_obj);
            }
        }

        if (tax_group.size() == 0) 
        {
            System.out.println("No Taxpayer in Group 1");
        } 
        else
        {
            for (Taxpayer tax_group_get_obj : tax_group) 
            {
                System.out.println("Employee's Name :  " + tax_group_get_obj.emp_name);
                System.out.println("Employee's Age  : " + tax_group_get_obj.emp_age);
                System.out.println(" ");
            }
        }
    }

    // Search 
    public static void search_data(ArrayList<Taxpayer> store_details) 
    {
        int key;

        Scanner take_search_age = new Scanner(System.in);
        System.out.print(" Enter your Age for search: ");
        key = take_search_age.nextInt();
        System.out.println(" ");

        ArrayList<Taxpayer> search = new ArrayList();

        for (Taxpayer search_obj : store_details) 
        {
            if (search_obj.emp_age == key) 
            {
                search.add(search_obj);
            }
        }

        if (search.size() == 0) 
        {
            System.out.println("There is no data for this age.");
        } 
        else 
        {
            for (Taxpayer search_get_obj : search) {
                System.out.println("Employee's Name :  " + search_get_obj.emp_name);
                System.out.println("Employee's Age  : " + search_get_obj.emp_age);
                System.out.println("Employee's Salary : " + search_get_obj.emp_income);
                System.out.println("Employee's Tax : " + search_get_obj.tax);
                System.out.println("Employee's Tax GroupNumber : " + search_get_obj.tax_group);
                System.out.println(" ");
            }
        }
    }

    // Sort the data in desending order through the name  
    public static void sort_data(ArrayList<Taxpayer> store_details) 
    {

        for (int i = 0; i < (store_details.size() - 1); i++) 
        {
            int temp = i;

            for (int j = i + 1; j < store_details.size(); j++) {
                
                Taxpayer sort_var = store_details.get(j);
                Taxpayer sort_var1 = store_details.get(temp);

                if (sort_var.emp_name.compareTo(sort_var1.emp_name) > 0) 
                {

                    temp = j;
                }
                Taxpayer namet = store_details.get(i);
                Taxpayer namek = store_details.get(temp);
                store_details.set(i, namek);
                store_details.set(temp, namet);

            }
        }

        for (Taxpayer sort_get_obj : store_details) 
        {
            System.out.println("Name :  " + sort_get_obj.emp_name);
            System.out.println("Age  : " + sort_get_obj.emp_age);
            System.out.println("Salary : " + sort_get_obj.emp_income);
            System.out.println("Tax : " + sort_get_obj.tax);
            System.out.println("Tax GroupNumber : " + sort_get_obj.tax_group);
            System.out.println(" ");

        }

    }
}
