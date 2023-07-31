package com.mycompany.question;

public class EmployeeSalary {
    private String empName;
    private double bSalary,bonus,nSalary;

    public EmployeeSalary(double bonus){
        this.bonus = bonus;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getbSalary() {
        return bSalary;
    }

    public void setbSalary(double bSalary) {
        this.bSalary = bSalary;
    }

    public double bonusAmount(){
        this.nSalary= bSalary + bonus;
        return nSalary;
    }
}