package com.company;


import com.company.practice.Department;
import com.company.practice.Employee;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner reader= new Scanner(System.in);
//        System.out.println("Enter the numbers in ");
//        IntSummaryStatistics numbers= Arrays.stream(reader.nextLine().split(" "))
//                .mapToInt(e->Integer.parseInt(e)).summaryStatistics();
//        System.out.println(numbers);
//
//        String s = "Priyanshu";
//        int[] nums = {10, 12, 23, 34, 34};
//        int aa= s.chars().parallel().peek(x->System.out.println(x)).peek(x->System.out.println((char)x)).sum();
     //   int sum = s.toCharArray().
//                map(x -> (int)x * (int)x)
//                .peek(e -> System.out.println(e+ " thread: " + Thread.currentThread().getId()))
//                .sum();
//        System.out.println("Sum of number =" + aa);

        Employee e= new Employee(1,"Priyanshu","dev");
        e.CheckThisAndObjectRefferSame(e);
        Department d= new Department(1,"Dev -fix bug");
  System.out.println(d);
    }
}
