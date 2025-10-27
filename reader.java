
import java.io.IOException;
import java.util.Scanner;

public class reader {
    public static void main(String[] args) throws IOException {

        // first method
        // System.err.println("Input a number");
        // int num = System.in.read();
        // System.err.println(num);

        // second method
        // System.err.println("Input second number");
        // InputStreamReader in=new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // int n = Integer.parseInt(bf.readLine());
        // System.err.println(n);

        // third method
        try {
            Scanner sc = new Scanner(System.in);
            System.err.println(sc);
            sc.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            System.err.println("in final state");
            
        }
       

    }
}
