import java.util.*;


public class Ar220824_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        float[] score = new float[count];
        float max=0, result = 0;
        for(int i=0;i<count;i++){
            score[i] = sc.nextInt();
            if(score[i] > max){
                max = score[i];
            }
        }
        for(int i=0;i<count;i++){
            result += (score[i]/max)*100;
            
        }
        System.out.println(result/count);
    }
}
