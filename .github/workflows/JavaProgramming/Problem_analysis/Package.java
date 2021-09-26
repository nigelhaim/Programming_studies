package Problem_analysis;

import java.util.*;

public class Package {
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        Scanner t_s = new Scanner(System.in);
        double gross = 0.0;
        double net = 0.0;
        double A = 500.0;

        // Gets the weight of the package
        System.out.print("Weight in Kg: ");
        int w = inp.nextInt();

        //Verifies the weight
        if (w > 0 && w <= 20)
        {  
            //Gets the distance
            System.out.print("Distance in Km: ");
            int d = inp.nextInt();
            // Verifies the distance 
            if (d > 0)
            {
                //Gets the type
                System.out.print("Package type A or B: ");
                char t = t_s.nextLine().charAt(0);
                System.out.println();

                //Verifies the type 
                if(t == 'A' || t == 'a' || t == 'B' || t == 'b')
                {   
                    //If distance is lessthan or equal to 500 km
                    if (d <= 500) 
                    {
                        //If type is A and if distance is lessthan or equal to 500 km
                        if (t == 'A' || t == 'a') 
                        {
                            if (w <= 5 && w > 0) {
                                gross = w * (10.50 * (1));
                                net = gross + (gross * 0.10);
                            }
                            if (w > 5 && w <= 10) {
                                gross = w * (15.75 * (1));
                                net = gross + (gross * 0.10);
                            }
                            if (w > 10 && w <= 20) {
                                gross = w * (20.65 * (1));
                                net = gross + (gross * 0.10);
                            }
            
                        }
                        //If type is B and if distance is lessthan or equal to 500 km
                        if (t == 'B' || t == 'b') {
                            if (w <= 5 && w > 0) {
                                gross = w * (11.75 * (1));
                                net = gross + (gross * 0.10);
                            }
                            if (w > 5 && w <= 10) {
                                gross = w * (18.50 * (1));
                                net = gross + (gross * 0.10);
                            }
                            if (w > 10 && w <= 20) {
                                gross = w * (23.65 * (1));
                                net = gross + (gross * 0.10);
                            }
            
                        }
                        else
                            {
                                System.out.println("Invalid Type");
                                System.out.println();
                            }
                    }
                    if (d > 500) 
                    {
                        //Verifies the type
                        if (t == 'A' || t == 'a' || t == 'B' || t == 'b')
                        {
                            //If type is A and if distance is morethan 500 km
                            if (t == 'A' || t == 'a') {
                                if (w <= 5 && w > 0) {
                                    gross = w * (10.50 * (d / A));
                                    net = gross + (gross * 0.10);
                                }
                                if (w > 5 && w <= 10) {
                                    gross = w * (15.75 * (d / A));
                                    net = gross + (gross * 0.10);
                                }
                                if (w > 10 && w <= 20) {
                                    gross = w * (20.65 * (d / A));
                                    net = gross + (gross * 0.10);
                                }
                
                            }
                             //If type is B and if distance is morethan 500 km
                            if (t == 'B' || t == 'b') {
                                if (w <= 5 && w > 0) {
                                    gross = w * (11.75 * (d / A));
                                    net = gross + (gross * 0.10);
                                }
                                if (w > 5 && w <= 10) {
                                    gross = w * (18.50 * (d / A));
                                    net = gross + (gross * 0.10);
                                }
                                if (w > 10 && w < 20) {
                                    gross = w * (23.65 * (d / A));
                                    net = gross + (gross * 0.10);
                                }
                            }
                                                        
                        }
                    }
                    System.out.println();
                    System.out.println("Charge: " + gross);
                    System.out.println("Total Charge: " + net);
                }
                else
                {
                    System.out.println("Invalid Type!");
                    System.out.println();
                }

            }
            else
            {
                System.out.println();
                System.out.println("Invalid Distance!");
                System.out.println();
            }
        }

        else
        {
            System.out.println();
            System.out.print("Invalid Weight!");
            System.out.println();
        }

        //Closes the scanner and end of the program
        System.out.println();
        inp.close();
        t_s.close();
    }
}
