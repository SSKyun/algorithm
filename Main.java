import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String input = br.readLine();
        String[] string = input.split("");

        for(int i=0;i<alphabet.length;i++){
            if(alphabet[i] == string[0]){
                System.out.println("asdf");
            }
        }


        bw.flush();
        bw.close();
	}
}