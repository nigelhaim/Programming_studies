import java.util.*;//Import utility class
public class MP3LinkedList
{
    static Scanner in = new Scanner(System.in);//Initiates static scanner
    public static void main(String[] args) 
    {
        int select = 0;//Initiates menu selector

        /*Initiates the Linked lists for: 
            Strings
            Three letter words
            Four letter words
            Morethan four letter words*/
        LinkedList Strs    = new LinkedList<String>();
        LinkedList three_w = new LinkedList<String>();
        LinkedList four_w  = new LinkedList<String>();
        LinkedList more_w  = new LinkedList<String>();
        //Initiates the while loop that breaks when the program is exited
        while(select != 8) 
        {
            Menu();//Displays the main menu
            select = Menu_selector();//Selects which method in the menu

            /*If 1 is selected it will run the method that adds the string
            It will also check if it is a word
            and how many characters and stores in their
            specific linked lists*/
            if(select == 1)
            {
                String  n      = inputString();//The string input 
                boolean status = Checker(n);//Calls the method that checks if it is a word
                boolean space  = Space_check(n);//Checks if it is a word it is applicable for the string list
                if(status == true)//If the string is a word
                {
                    int num_char = character_counter(n);//Counts how many characters
                    if(num_char == 3)//If it is a 3 letter word
                    {
                        three_w.add(n);//Adds to the 3 word list
                        Collections.sort(three_w);//Sorts the list
                    }
                    if(num_char == 4)//If it is a 3 letter word
                    {
                        four_w.add(n);//Adds to the 4 word list
                        Collections.sort(four_w);//Sorts the list
                    }
                    else if(num_char > 4)//If it is more than  letters
                    {
                        more_w.add(n);//Adds to the more than 4 letter word list
                        Collections.sort(more_w);//Sorts the list
                    }
                }
                if(status == false && space == true)
                {
                    Strs.add(n);//If it is a string then adds to the string linked list
                    Collections.sort(Strs);
                }
            }
            else if(select == 2)//If the selected menu is 2
            {
                printer(Strs);//Prints the string linked list
            }
            else if(select == 3)//If the selected menu is 3
            {
                printer(three_w);//Prints the 3 letter word linked list
            }
            else if(select == 4)//If the selected menu is 4
            {
                printer(four_w);//Prints the 4 letter word linked list
            }
            else if(select == 5)//If the selected menu is 5
            {
                System.out.print("Word to delete: ");
                String d = in.next();
                deleter(three_w, d);//Deletes the string in the list based from the input string
            }
            else if(select == 6)//If the selected menu is 6
            {
                System.out.print("Word to delete: ");
                String d = in.next();
                deleter(four_w, d);//Deletes the strign in the list based from the input string
            }
            else if(select == 7)//If the selected menu is 7
            {
                printer(more_w);//Displays the words that is more than 4 characters
            }
            System.out.println("\n");
        }

        System.out.println("System exit\n");//Exits the program
        System.exit(0);
    }
    public static void Menu(){//Displays the main menu
        System.out.println("Menu\n");

        System.out.println("1. Add a string");
        System.out.println("2. Display list of strings");
        System.out.println("3. Display list of 3-letter words");
        System.out.println("4. Display list of 4-letter words");
        System.out.println("5. Delete a 3-letter word");
        System.out.println("6. Delete a 4-letter word");
        System.out.println("7. Display list of words with more than 4 characters");
        System.out.println("8. Quit");
    }

    /*Selects the number which 
    part of the program will be used*/
    public static int Menu_selector()
    {
        System.out.print("Please select action (1 - 8): ");
        int num = in.nextInt();
        return num;//Returns what number of the selected part of the program
    }
    /* A method that returns the string 
    input when 1 in the menu is selected */
    public static String inputString()
    {
        Scanner str_in = new Scanner(System.in);
        System.out.print("\nInput new string: ");
        return str_in.nextLine();
    }

    /* Checks if the string is a word or not 
    based from the individual characters */
    public static boolean Checker(String input)
    {
        boolean String_status = false;//Initiates the boolean 
        for(int i = 0; i < character_counter(input); i++)
        {
            char a = input.charAt(i);
            /*Loops every character if it is upper or lower case 
            characters based from the ASCII chart*/
            if((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z'))
            {
                String_status = true;//Returns true
            }
            else
            {//if 1 character is not w letter then it breaks and returns false
                String_status = false;
                break;
            }
        }
        return String_status;
    }
    /* Method that checks the string if is in sentence form */
    public static boolean Space_check(String input)
    {
        boolean Space_status = false;
        for(int i = 0; i < character_counter(input); i++)
        {
            char a = input.charAt(i);
            if(a == ' ')
            {
                Space_status = true;
                break;
            }
            else
            {
                Space_status = false;
            }
        }
        return Space_status;
    }

    public static int character_counter(String input)
    {
        int count = 0;
        for(int i = 0; i < input.split("").length; i++)
        {
            count++;
        }
        return count;
    }

    public static void printer(LinkedList list){
        boolean item = checkItems(list);
        if(item){
            System.out.println("\nThe list of strings:");
            for(int p = 0; p < list.size(); p++)
            {
                System.out.print(list.get(p));
                if(p == list.size() - 1)
                {
                    System.out.print("");
                }
                else
                {
                    System.out.print(", ");
                }
            }
        }
        else{
            System.out.println("\nThe list is empty!");
        }
    }

    public static void deleter(LinkedList a, String b)
    {
        for(int i = 0; i < a.size(); i++){
            if(a.get(i).equals(b))
            {
                a.remove(i);
                return;
            }
        }
        System.out.println("Word does not exist");
    }

    public static boolean checkItems(LinkedList list)
    {
        boolean check;
        if(list.size() != 0)
        {
            check = true;
        }
        else
        {
            check = false;
        }
        return check;
    }
}