# Taxplayer

Write a java console application that allows the user to read, validate, store, display, sort and search data (name, age, taxable income, tax, tax group) for N taxpayers. N should be declared as a constant and it should be equal to the largest digit of your student id number (e.g. if your ID number is S1267222 then N should be equal to 7 and you can declare it as final int N=7;). The name, age and taxable income must be read from the keyboard and tax and tax group must be calculated using Table.


| Taxable Income	      | Income Tax	                                | Tax Group   |
|-----------------------|---------------------------------------------|-------------|
| 1. $0 – $18200	      | $0	                                        | Group 1     |
| 2. $18201– $37000	    | $0 plus 19c for each $1 over $18200	        | Group 2     |
| 3. $37001 - $87000	  | $3572 plus 32.5c for each $1 over $37000	  | Group 3     |
| 4. $87001 - $180000	  | $19822 plus 37c for each $1 over $87000	    | Group 4     |
| 5. $180001 and over	  | $54097 plus 45c for each $1 over $180000	  | Group 5     |


Your application should display and execute a menu with the following options. A switch statement must be used to execute the following menu options.
1.	Read, validate and store data for N taxpayers
2.	Calculate and store tax and tax group for all taxpayers
3.	Display all taxpayers
4.	Display the name and age of all taxpayers from tax group 1
5.	Search a taxpayer by age
6.	Sort and display taxpayers
7.	Exit from the application


**Read, validate and store data for N taxpayers**
This option reads name, age and taxable income for N taxpayers from the keyboard and stores them in an Array or ArrayList. If the age is less than 18 and greater than 64 then an appropriate message should be displayed and the user should be asked to enter the age again. Similarly if the taxable income is less than $1 and greater than $999000 then an appropriate message should be displayed and the user should be asked to enter the taxable income again.

**Calculate and store tax and group number for all taxpayers**
This option calculates the tax and group number based on Table 1 for each taxpayer and then stores tax and group number in Array or ArrayList.

**Display all taxpayers**
This option displays the data (name, age, taxable income, tax, group number) for all taxpayers.
 
**Display the name and age of all taxpayers from tax group 1**
This option displays the name and age of all taxpayers from tax group 1. If there is no taxpayer in group 1 then it displays an appropriate message.

**Search a taxpayer by age**
This option asks user to enter the taxpayer’s age and searches for it. If the age is found then it displays an appropriate message with taxpayer details (name, age, taxable income, tax, group number). If age is not found then it displays an appropriate message “taxpayer with given age is not found”. If there is more than one taxpayer with the given age then it displays all of them. A built-in search algorithm is not allowed in this assignment.

**Sort and display taxpayers**
This option sorts (by name) all taxpayers stored in Array or ArrayList in descending order and displays all sorted taxpayers (name, age, taxable income, tax, group number). You can use any sorting algorithm. A built-in sort algorithm for sorting is not allowed in this assignment.

**Exit from the application**
The application should display an appropriate message with student name and then exit from the application.

