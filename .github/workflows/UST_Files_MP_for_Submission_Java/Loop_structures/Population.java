package Loop_structures;
/*
Submitted by: Nigel Haim N. Sebastian 

There are 9870 people in a town whose population increases by 
10 percent each yer. Write a java program that prints the annual 
population and determines how many years it will take for the population 
to go over 30,000.
*/

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
