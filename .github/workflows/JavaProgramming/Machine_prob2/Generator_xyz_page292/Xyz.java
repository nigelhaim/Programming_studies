package Machine_prob2.Generator_xyz_page292;

public class Xyz 
{
    public static void main(String[] args) 
    {
        System.out.println();
        System.out.println("The values of y are: ");
        double x = 1;
        System.out.println("x\tz\ty");
        while (x <= 5)
        {
            for (double z = 2; z <= 6; z++)
            {
                if (x != z)
                {
                    double y = (x * z) / (x - z);
                    if(y < 0)
                    {
                        System.out.printf(x + "\t" + z + "\t" + "%.4f%n", y);
                    }
                    else
                    {
                        System.out.printf(x + "\t" + z + "\t" + " %.4f%n", y);
                    } 
                }
                else
                {
                    System.out.println(x + "\t" + z + "\t" + " Function Undefined!");
                }
            }
            x++;
        }
    }
}
