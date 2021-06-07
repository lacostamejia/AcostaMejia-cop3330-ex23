/*
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
*/


import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //Here is the scanner method used.

        //Variables used.
        boolean d = true;
        String x;

        System.out.print("Is the car silent when you turn the key? ");
        x = in.next();
        x = x.toUpperCase();

        if (x.equals("Y")) {
            System.out.print("Are the battery terminals corroded?");
            x = in.next();
            x = x.toUpperCase();
            if (x.equals("Y")) {
                System.out.println("Clean terminals and try starting again.");
                return;
            } else if (x.equals("N")) {
                System.out.println("The battery cables may be damaged\nReplace cables and try again.");
                return;
            }
        } else {
            System.out.print("Does the car make a slicking noise?");
            x = in.next();
            x = x.toUpperCase();

            if (x.equals("Y")) {
                System.out.println("Replace the battery.");
            }
            else if(x.equals("N")){
                System.out.print("Does the car crank up but fail to start?");
                x = in.next();
                x = x.toUpperCase();
                if(x.equals("Y")){
                    System.out.println("Check spark plug connections.");
                    return;
                }
                else if(x.equals("N")){
                    System.out.print("Does the engine start and then die?");
                    x = in.next();
                    x = x.toUpperCase();
                    if(x.equals("Y")){
                        System.out.print("Does you car have fuel injection?");
                        x = in.next();
                        x = x.toUpperCase();
                        if(x.equals("Y")){
                            System.out.println("Get it in for service.");
                            return;
                        }
                        else if(x.equals("N")){
                            System.out.println("Check to ensure the choke is opening and closing.");
                            return;
                        }
                    }
                    else{
                        System.out.println("This is not possible.");
                    }

                }
            }


        }
    }
}
