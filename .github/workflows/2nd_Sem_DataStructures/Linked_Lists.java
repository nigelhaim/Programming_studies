import java.util.*;
public class Linked_Lists 
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int select = 0;
        LinkedList UpperCaseList = new LinkedList<String>();
        LinkedList LowerCaseList = new LinkedList<String>();
        LinkedList Strs = new LinkedList<String>();
        while(select != 7)
        {
            Menu();
            select = Menu_selector();

            if(select == 1){
                String n = inputString();
                String status = Checker(n);
                if("up".equals(status)){
                    UpperCaseList.add(n);
                }

                else if("low".equals(status)){
                    LowerCaseList.add(n);
                }
                else{
                    Strs.add(n);
                }
            }

            else if(select == 2){
                printer(Strs);
            }

            else if(select == 3){
                printer(UpperCaseList);
            }

            else if(select == 4){
                printer(LowerCaseList);
            }

            else if(select == 5){
                System.out.print("Word to delete: ");
                String d = in.next();
                deleter(UpperCaseList, d);
            }

            else if(select == 6){
                System.out.print("Word to delete: ");
                String d = in.next();
                deleter(LowerCaseList, d);
            }

            System.out.println("\n");
        }

        System.out.println("System exit\n");
        System.exit(0);
    }    

    public static void Menu(){//Displays the main menu
        System.out.println("Menu\n");

        System.out.println("1. Add a string");
        System.out.println("2. Display list of strings");
        System.out.println("3. Display list of uppercase words");
        System.out.println("4. Display list of lowercase words");
        System.out.println("5. Delete an uppercase word");
        System.out.println("6. Delete a lowercase word");
        System.out.println("7. End program");
    }

    public static int Menu_selector(){
        System.out.print("Please select action (1 - 7): ");
        int num = in.nextInt();
        return num;
    }

    public static String inputString(){
        Scanner str_in = new Scanner(System.in);
        System.out.print("\nInput new string: ");
        return str_in.nextLine();
    }

    public static void printer(LinkedList list){
        boolean item = checkItems(list);
        if(item){
            System.out.println("\nThe list of strings:");
            for(int p = 0; p < list.size(); p++){
                System.out.print(list.get(p));
                if(p == list.size() - 1){
                    System.out.print("");
                }
                else{
                    System.out.print(", ");
                }
            }
        }
        else{
            System.out.println("\nThe list is empty!");
        }
    }

    public static String Checker(String input){
        String String_status = "";
        for(int i = 0; i < input.length(); i++){
            char a = input.charAt(i);
            if(input.toUpperCase().equals(input) && (a >= 'A' && a <= 'Z')){
                String_status = "up";
            }
            else if(input.toLowerCase().equals(input) && (a >= 'a' && a <= 'z')){
                String_status = "low";
            }
            else{
                String_status = "string";
                break;
            }
        }
        return String_status;
    }

    public static void deleter(LinkedList a, String b){
        for(int i = 0; i < a.size(); i++){
            if(a.get(i).equals(b)){
                a.remove(i);
                return;
            }
        }
        System.out.println("Word does not exist");
    }
    public static boolean checkItems(LinkedList list){
        boolean check;
        if(list.size() != 0){
            check = true;
        }
        else{
            check = false;
        }
        return check;
    }
}
