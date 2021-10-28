import java.util.*;
public class Java_notes 
{
    public static void main(String[] args) 
    {
        Scanner note = new Scanner(System.in);
        System.out.println("THIS IS MAINLY USED FOR OUTPUT OF THE PROGRAM!");
        System.out.println("DO NOT EDIT!");
        
        System.out.println();
        System.out.println("Notes and their variables");

        System.out.println("A - Slashes with symbols (For printing outputs)");
        System.out.println("B - Different printing formats");
        System.out.println();
        System.out.print("Print desired note: ");
        char var = note.nextLine().charAt(0);
        System.out.println();
        
        if (var == 'A' || var == 'a')
        {
            System.out.println("Slash with characters and their use.");
            System.out.println();
            
            System.out.println("\\n" + "     -  New line");
            System.out.println("\\\\" + "     -  printing a backslash");
            System.out.println("\\t" + "     -  Cursor moves to the next tab");
            System.out.println("\\b" + "     -  Back slash - Erases 1 character on the program");
            System.out.println("\\r" + "     -  Return - Cursor moves to the beginning of the current line (not the next line)");
            System.out.println("\\'" + "     -  Prints a single quotation mark");
            System.out.println("\\\"" + "     -  Prints a double quotation mark");
        }
        if (var == 'B' || var == 'b')
        {
            System.out.println("printf" + "     -  Formating a print");
            System.out.println("Format Specifiers:");
            System.out.println("%.2f" + "     -  Formating a floating point in a number of decimal places");
            System.out.println();
            System.out.println("Other Variables");
            System.out.println("%s" + "     -  results a string");
            System.out.println("%c" + "     -  results a unicode character");
            System.out.println("%d" + "     -  results a formatted integer");
            System.out.println("%e" + "     -  results a decimal in scientific notaion");
            System.out.println("%f" + "     -  results a formatted as a decimal number");
            System.out.println("%" + "      -  results a percentage (%)");
            System.out.println("%n" + "     -  Line separator");


            System.out.println();
            System.out.print("Do you want to try an example? (y/n): ");
            char var_b = note.nextLine().toUpperCase().charAt(0);

            switch (var_b)
            {
                case 'Y':
                    System.out.print("Input a decimal number: ");  
                    double number = note.nextDouble();
                    
                    System.out.print("Number of decimal places: ");  
                    int decimal = note.nextInt();

                    System.out.print("For the case of " + "%." + decimal + "f =    ");
                    
                    String dec="%."+decimal+"f";

                    Formatter fmt = new Formatter();
                    fmt.format(dec, number);
                    System.out.println( fmt);
                    
            }
        }

        System.out.println();
        note.close();
    }        
}
