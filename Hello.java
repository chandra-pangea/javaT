

public class Hello {
    public static void main(String[] args) {
        int a = 125;
        int b = 123;
        int c = 123;
        System.out.println((a==b|c!=b));
        int result1 = 2 + 3 * 4;     // 2 + 12 = 14
        int result2 = (2 + 3) * 4;   // 5 * 4 = 20
        
        if (result1 < result2) {
            System.out.println("CHUMMA BUBU");
        }else if(result1>0) {
            System.out.println("IFELSE");
       }else{
           System.out.println("ELSE");
       }
    }
}
