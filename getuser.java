// get number from the user
import java.util.*;
class getuser{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=a+b;
        System.out.println(c);
    }
}


// if condition

import java.util.*;
class getuser{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if(a>0){
            System.out.println("positive");
        }
        else if(a<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}

//switch case

import java.util.*;
class getuser{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a){
            case 1:
            System.out.println("monday");
            break;

            case 2:
            System.out.println("tuesday");
            break;

            case 4:
            System.out.println("wednesday");
            break;
            case 5:
            System.out.println("thursday");
            break;
            case 6:
            System.out.println("friday");
            break;
            case 7:
            System.out.println("saturday");
            break;
            default:
            System.out.println("sunday");
            break;
        }
    }
}


// print the number from 1 to the useris number

import java.util.*;
class getuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}

//print the numbers as down from the user number

import java.util.*;
class getuser {
    public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
     int num=sc.nextInt();
         while(num>0){
             System.out.println(num);
             num--;
         }
  }  
}

//print the number from to 3, demonstrate that the block executed at least once

import java.util.*;
class getuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         do { 
             System.out.println(num);
             num++;
         } while (num<=3);
         }
  }  
