import java.util.ArrayList;
import java.util.List;

public class listinalist {
    public static void main(String[] args) {
        List<List<Integer>>col = new ArrayList<List<Integer>>();
        for(int i = 1; i <= 10; i++){
            List<Integer> row = new ArrayList<Integer>();
            for(int j = 1; j <= 10; j++){
                row.add(i*j);
            }
            col.add(row);
        }
        for(List<Integer> row:col){
            System.out.println(row);
        }
    }
}
