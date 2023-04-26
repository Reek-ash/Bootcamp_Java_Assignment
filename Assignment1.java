import java.util.Scanner;

public class Assignment1 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter positive numbers: ");
    int num = 0;
    int sum = 0;

    while (true) {
      num = sc.nextInt();
      if (num < 0) {
        break;
      }
      sum = sum + num;
    }

    System.out.println("SUM: " + sum);
  }
}
