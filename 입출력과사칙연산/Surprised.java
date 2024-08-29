//10926번

package 입출력과사칙연산;

import java.util.Scanner;

public class Surprised {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your name: ");
    String name = scanner.nextLine();

    System.out.println(name + "??!");

    scanner.close();
  }

}
