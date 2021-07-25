package com.company.practice;

public class Employee {
    private  int id;
    private String name;
    private String Department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        Department = department;
    }
    public  void CheckThisAndObjectRefferSame(Employee e){
        System.out.println(" Cally and istance are same: "+( e==this));
    }
    public  String getIdName(){

        System.out.println("Name and Id : "+getName()+ getId() );
        return getName()+ getId();
    }
    public  void addSkills(String[] skills){

        for (String skill : skills) {
            System.out.println(skill);
        }

    }
}
