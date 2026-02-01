package com.employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {

    static ArrayList<Employee> employees = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    searchEmployee();
                    break;
                case 4:
                    System.exit(0);
                    System.out.println("Thankyou");
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    static void addEmployee() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        employees.add(new Employee(id, name, salary));
        System.out.println("Employee Added Successfully");
    }

    static void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No Employees Found");
        } else {
            for (Employee e : employees) {
                e.display();
            }
        }
    }

    static void searchEmployee() {
        System.out.print("Enter ID to Search: ");
        int id = sc.nextInt();

        for (Employee e : employees) {
            if (e.id == id) {
                e.display();
                return;
            }
        }
        System.out.println("Employee Not Found");
    }
}
