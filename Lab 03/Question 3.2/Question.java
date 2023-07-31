package com.mycompany.question;
public class Question {

    public static void main(String[] args) {
        Employeesalary s1=new Employeesalary(10000.00);
        s1.setEmpName("Naveen");
        s1.setbSalary(50000.00);

        double bAmount= s1.bonusAmount();
        System.out.println("New Salary is: "+bAmount);
    }
}