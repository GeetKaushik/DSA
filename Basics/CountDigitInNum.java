/* 
  import java.util.*;
  
  public class CountDigitInNum{
  
  public static void main(String[] args) {
    try (// write your code here 
    Scanner scan = new Scanner(System.in)) {
        int n = scan.nextInt();
        int d = 0;
        
        for(int i = 1; i < n; i*=10){
            if(n%i!=n) d++;
            else break;
        }
        System.out.println(d);
    }
   }
  }
  */

  // Count digits in number

import java.util.Scanner;

public class CountDigitInNum {
    public static void main(String[] args) {

      //Print
      System.out.println("Hello World");

      //Scan
      Scanner scn = new Scanner(System.in);
      int a = scn.nextInt();
      System.out.println(a);
    }
  }