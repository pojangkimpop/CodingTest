//10869번

package 입출력과사칙연산;

import java.util.Scanner;

public class Sachic {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Input A: ");
    int A = scanner.nextInt();

    System.out.println("Input B: ");
    int B = scanner.nextInt();

    System.out.println("A+B=" + (A + B));
    System.out.println("A-B=" + (A - B));
    System.out.println("A*B=" + (A * B));
    System.out.println("A/B=" + (A / B));
    System.out.println("A%B=" + (A % B));

    scanner.close();
  }

}
