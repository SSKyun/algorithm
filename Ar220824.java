import java.util.*;

public class Ar220824 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[] result = new String[count];
        for(int i=0;i<count;i++){
            int R = sc.nextInt();
            String S = sc.nextLine();
            S = S.trim();
            String[] Sarray = S.split("");
            result[i] = "";
            for(int j=0;j<Sarray.length;j++){
                result[i] += Sarray[j].repeat(R);
                
            }
        }
        for (String string : result) {
            System.out.println(string);
        }
        
    }
}
