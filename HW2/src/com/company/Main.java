package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextLine().equals("new rifle")){
            if (scanner.nextLine().equals("flintlock")){
                Flintlock flintlock = new Flintlock();
                activitiesForRifles(flintlock);
            }
            if (scanner.nextLine().equals("manual repeating rifle")){
                ManualRepeatingRifle manualRepeatingRifle = new ManualRepeatingRifle(scanner.nextInt());
                activitiesForRifles(manualRepeatingRifle);
            }
        }
        if (scanner.nextLine().equals("new plane")){
            if (scanner.nextLine().equals("plane")){
                Plane plane = new Plane(scanner.nextLine(),scanner.nextInt());
                activitiesForPlanes(plane);
            }
            if (scanner.nextLine().equals("bomber")){
                Bomber plane = new Bomber(scanner.nextLine(),scanner.nextInt());
                activitiesForPlanes(plane);
            }
            if (scanner.nextLine().equals("attack aircraft")){
                AttackAircraft plane = new AttackAircraft(scanner.nextLine(),scanner.nextInt());
                activitiesForPlanes(plane);
            }
        }
    }

    public static void activitiesForRifles(Flintlock flintlock) {
        String op = "something";
        Scanner scanner = new Scanner(System.in);
        while(!op.equals("end")) {
            op = scanner.next();
            if(op.equals("add")) {

            }
            if(op.equals("get")) {

            }
            if(op.equals("remove")) {

            }
        }

    }

    public static void activitiesForPlanes(Plane plane) {
        String op = "something";
        Scanner scanner = new Scanner(System.in);
        while(!op.equals("end")) {
            op = scanner.next();
            if(op.equals("add")) {

            }
            if(op.equals("get")) {

            }
            if(op.equals("remove")) {

            }
        }

    }
}
