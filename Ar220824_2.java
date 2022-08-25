import java.util.*;

public class Ar220824_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ascending = true;
        boolean descending = true;
        int[] result = new int[8];
        for(int i=0;i<8;i++){
            result[i] = sc.nextInt();
        }

        for(int i=0;i<8;i++){
            if(i>0){
                if(result[i-1] < result[i]){
                    descending = false;
                }else if(result[i-1] > result[i]){
                    ascending = false;
                }
            }
        }

        if(ascending){
            System.out.println("ascending");
        }else if(descending){
            System.out.println("descending");
        }else{
            System.out.println("mixed");
        }
    }
}
