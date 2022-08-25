import java.util.Scanner;
 
public class Ar220824_4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score1 = sc.nextInt();
        int score2 = sc.nextInt();

        int result1 = (score1/100) + ((score1/10%10)*10) +((score1%10)*100);
        int result2 = (score2/100) + ((score2/10%10)*10) +((score2%10)*100);
        if(result1 > result2){
            System.out.println(result1);
        }else{
            System.out.println(result2);
        }
        
	}
 
}