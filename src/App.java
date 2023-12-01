//                    Assignment 23 CoolNumbers
//                       Logan Weisgerber
//                        10/16/2023


import java.util.Scanner;

class App {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);


    System.out.println("Enter a number: ");
    int a = kb.nextInt();

    CoolNumbersCheck cc = new CoolNumbersCheck();
    System.out.println("There are " + cc.countCoolNumbers(a) + " cool numbers between 6 & " + a);
  }
}
