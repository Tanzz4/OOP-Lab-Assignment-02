
/*
Lab Assignment 02
problem No. = 03
Take some information about your self. (i.e. Name, Department, Age, CGPA, Section)
 */

import java.util.Scanner;

public class problem_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name = input.nextLine();
        System.out.print("Enter your Age : ");
        int age = input.nextInt();
        System.out.print("Enter your CGPA : ");
        float cgpa = input.nextFloat();
        input.nextLine();//DUMMY CHAR { in here it's Enter}
        System.out.print("Enter your Department Name : ");
        String department = input.nextLine();
        System.out.print("Enter your Section : ");
        String section = input.nextLine();

        System.out.println("Your name is :"+name);
        System.out.println("Your age is : "+age);
        System.out.println("Your department name is : "+department);
        System.out.println("Your Section is : "+section);
        System.out.println("Your CGPA is : "+cgpa);
    }
}
