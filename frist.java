import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class frist {
    
      
            // variable

            // String name = "aman" ;
            // int age = 30;
            // String neighbour = "akku";
            // String friend = neighbour;
            // byte yr = 30;
            // int phone = 124567890;
            // long phone2 = 1234568900L;
            // float pi = 3.14F;
            // char letter = '@';
            // boolean isMale = false;

            // // non - primitive types
            // String name = new String( "Apu");
            // String friend = new String( "Akku");
            // String neighbour = name + " and " + friend;
            // System.out.println(neighbour.substring(0, 3));

            // int age = 30;
            // int physics = 97;
            // int chem =95;
            // int eng = 98;

            // int [] marks = new int[3];
            // marks[0] = 97;
            // marks[1] = 95;
            // marks[2] = 98;

            // // length
            // System.out.println(marks.length);

            // // sort
            // System.out.println(marks[0]);
            // Arrays.sort(marks);
            // System.out.println(marks[0]);

            // int [] marks = {97, 98, 95};
            // int[][] finalMarks = {{97, 98, 95}, {95, 95, 98}};
            // System.out.println(finalMarks[0][2]);

            // // casting
            // double price = 100.00;
            // double finalprice = price + 18;

            // System.out.println(finalprice);

            // int p = 100;
            // int fp = p + (int)18.0;
            // System.out.println(fp);

            // // constants
            // int age = 30;
            // age = 31;
            // age = 32;

            // final float PI = 3.14F;

            // operators
            // int a = 1;
            // int b = 2;
            // int sum = a + b;
            // System.out.println(sum);

            // int num = 1;
            // System.out.println(num++); //1
            // System.out.println(++num); //2


            // // math
            // // 5,6
            // // max
            // System.out.println(Math.max(5, 6));
            // System.out.println((int)(Math.random()*100));


            // how to input?
            // Scanner sc = new Scanner (System.in);
            // System.out.println("Enter your name: ");
            // String name = sc.nextLine();
            // System.out.println(name);

            // comparision operators
            // a == b
            // a != b
            // a > b
            // a < b
            // a >= b
            // a <= b

            // // conditinal statement
            // boolean isSunup = false;
            // if(isSunup == true)
            //     System.out.println("day");
            // else
            //     System.out.println("night");

            // int age = 30;
            // if (age > 18)
            //     System.out.println("adult");
            // else
            //     System.out.println("child");

            // // logical operators
            // // &&
            // int a = 30;
            // int b = 60;
            // if (a < 50 && b < 50)
            // System.out.println("both are lesser than 50");
            
            // // || 
            // if (a < 50 || b < 50)
            // System.out.println("atleast one is lesser than 50");

            // boolean isAdult = true;
            // if (isAdult == true) 
            // System.out.println("is Adult");
            // else
            // System.out.println("is not Adult");

            // Scanner sc = new Scanner(System.in);
            // System.out.println("enter the cash:10");
            // int cash =  sc.nextInt();
            // if(cash < 10){
            //     System.out.println("cannot buy anything");
            //     System.out.println("get more cash");
            // }   
            // else if(cash < 10 && cash < 50){
            //     System.out.println("can get 1 thing");
            // }
            // else{
            //     System.out.println("can get both");
            // }


            // conditional statement -- switch
            // int day = 1; //1 -moday ; 2 - tuesday

            // switch (day) {
            //     case 1 : 
            //         System.out.println("monday");
            //         break;
            //     case 2 :
            //         System.out.println("tuesday");
            //         break;
            //     case 3 :
            //         System.out.println("wedesday");
            //         break;
            
            //     default:
            //         System.out.println("invalid day");
            //         break;
            // }

            // loops
            // System.out.println("1");
            // System.out.println("2");
            // System.out.println("3");

            // // 1-100
            // for (int i = 100; i >= 1; i--) {
            //     System.out.println(i);
            // }

            // // while loop
            // int i = 100;
            // while (i >= 1) {
            //     System.out.println(i);
            //     i--;
            // }

            // // do whlie loop
            // int k = 100;
            // do {
            //     System.out.println(k);
            //     k--;
            // }while(k >= 1);

            // Scanner sc = new Scanner(System.in);
            // int n = 0;
            // do{
            //     System.out.println("Enter a number:");
            //     n = sc.nextInt();
            //     System.out.print("here is your num:");
            //     System.out.println(n);
            //     }while(n >= 0);
            //     System.out.println("enter positve no.!");

            
            // // break & contue
            // int i =0;
            // while (true) {
            //     if(i==3){
            //         i++;
            //         continue;
            //     }
            //     System.out.println(i);
            //     i ++;
            //     if (i > 5) {
            //         break;
            //     }
            // }

        //     // try - catch in exception handling.
        //     int[] marks = {97, 98, 95};
        //     try {
        //     System.out.println(marks[5]);
        // } catch (Exception exception) {
        //         // do somthing after catching.
        // }
        //     System.out.println("Hello");

    // public static void printJava(){
    //     System.out.println("hello java");
    // }

    // public static void printName(String name){
    //     System.out.println(name);
    // }
    
    // public static void printSum(int a, int b){
    //     System.out.println(a + b);
    // }

    public static void main(String[] args){
        //mini project
        Scanner sc = new Scanner(System.in);
        int mynum = (int)(Math.random()*100);
        int userNum;
        do{
            System.out.println("Guess a number between 0 and 100 or enter negetive number to stop:");
            userNum = sc.nextInt();
            if (mynum == userNum) {
                System.out.println("whoo....!! correct number");
            }
            else if (userNum < mynum) {
                System.out.println("number is small");
            }
            else {
                System.out.println("number is big");
            }
         }while(userNum >= 0);

         System.out.println("!!end!!");
     }
}

