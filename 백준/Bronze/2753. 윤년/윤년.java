
import java.util.Scanner;
//첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
// 첫째 줄에 윤년이면 1, 아니면 0을 출력한다.

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
  
    //
    if (A%4 == 0 && A%100 != 0 || A %400 == 0)
      System.out.println(1);
    else 
      System.out.println(0);
    
    
    sc.close();
    
  }


}