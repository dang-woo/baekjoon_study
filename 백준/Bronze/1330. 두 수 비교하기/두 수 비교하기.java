// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;
// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();
    //
    if (A > B)
      System.out.println(">");
    else if (A < B)
      System.out.println("<");
    else
      System.out.println("==");
    
    sc.close();
    
  }


}