/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javatutorial;

import java.util.Scanner;

/**
 *
 * @author Alex-PC
 */
public class JavaTutorial {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();
        
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);
        
    }
}
