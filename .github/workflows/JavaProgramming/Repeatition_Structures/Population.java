package Repeatition_Structures;


public class Population 
{
    public static void main(String[] args) 
    {
        //Initiates the population size     
        int population = 9870;
        int year = 0;
        while (population <= 30000)
        {
            population += (population * 0.10);
            year++;
            //IF population is > 30,000 then the program will abort printing 
            if (population < 30000)
            {
                System.out.println("Year " + year);
                System.out.println("Annual Population: " + population);
            }
        }

        System.out.println();

        System.out.print("It will take " + (year) + " years to reach 30,000");
        System.out.println();
        System.out.println();
    }    
}
