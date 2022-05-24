package com.bridge.day4;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("welcome to the employee wage computation program");
        int wage_per_hour = 20;
        int working_day = 1;
        int working_hours = 0;
        int ftotal_Employee_Wage = 0;
        int ptotal_Employee_Wage = 0;
        int fworking_hours = 0;
        int pworking_hours = 0;
        while (working_day <= 20 && working_hours <= 100) {
            int check = (int) ((Math.random() * 10) % 3);
            switch (check) {
                case 1: {
                    fworking_hours += 8;
                    int daily_wage = wage_per_hour * fworking_hours;
                    ftotal_Employee_Wage = ftotal_Employee_Wage + daily_wage;
                    System.out.println("working day" + " " + working_day);
                    System.out.println("employee is present" + " , " + "employee is full time" + " , " + "daily wage is  " + daily_wage + " , " + "working hours is  " + fworking_hours);
                    break;
                }
                case 2: {
                    pworking_hours += 4;
                    int daily_wage = wage_per_hour * pworking_hours;
                    ptotal_Employee_Wage = ptotal_Employee_Wage + daily_wage;
                    System.out.println("working day" + " " + working_day);
                    System.out.println("employee is present" + " , " + "employee is part time" + " , " + "daily wage is  " + daily_wage + " , " + "working hours is  " + pworking_hours);
                    break;
                }
                default:
                    System.out.println("working day" + " " + working_day);
                    System.out.println("Employee is Absent ..");
            }
            working_day++;

        }
        System.out.println("total full time employee wage of the month is " + ftotal_Employee_Wage);
        System.out.println("total part time employee wage of the month is " + ptotal_Employee_Wage);
    }
}

