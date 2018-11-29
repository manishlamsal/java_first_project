package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter your question number:");
        Scanner scanner = new Scanner(System.in);
        int question=scanner.nextInt();

        switch (question){

            case 1:

                System.out.println("number is:");
                int n=scanner.nextInt();

                if(n>0){
                    System.out.println("positive number:");

                }
                else if(n<0){
                    System.out.println("negative number:");
                }
                else{
                    System.out.println("zero");
                }

                break;

            case 2:
                System.out.println("enter a character:");
                char ch=scanner.next().charAt(0);

                if((ch>='a' && ch<='z' )||(ch>='A'&& ch<='Z')){

                    System.out.println("is alphabet");
                }
                else{
                    System.out.println("is not alphabet");
                }
                break;

            case 3:
                System.out.println("enter a year:");
                int year=scanner.nextInt();

                if(year%400==0){
                    System.out.println("this is a leap year:");
                }
                else if(year%100==0){
                    System.out.println("this is not a leap year:");

                }

                else if(year%4==0){
                    System.out.println("this is a leap year:");

                }else{
                    System.out.println("this is not a leap year:");
                }
                break;

            case 4:
                System.out.println(" enter number:");
                int r = scanner.nextInt();
                if ((r% 5 == 0) && ((r % 11 == 0))) {

                    System.out.println("the number is divisible by 5 or 11:");

                } else {
                    System.out.println("the number is not divisible by 5 or 11:");

                }

                break;

            case 5:
                System.out.println("Enter the amount:");

                int amount=scanner.nextInt();

                int thousand=amount/1000;
                amount=amount-thousand*1000;

                int fhundred=amount/500;
                amount=amount-fhundred*500;

                int hundred=amount/100;
                amount=amount-hundred*100;

                int fifty=amount/50;
                amount=amount-fifty*50;

                int twenty=amount/20;
                amount=amount-twenty*20;


                int ten=amount/10;
                amount=amount-twenty*10;

                int five=amount/5;
                amount=amount-five*5;

                int one=amount/1;
                amount=amount-one*1;

                System.out.println("Thousand::"+thousand);
                System.out.println("fhundred::"+hundred);
                System.out.println("hundred::"+hundred);
                System.out.println("fifty::"+fifty);
                System.out.println("Twenty::"+twenty);
                System.out.println("ten::"+ten);
                System.out.println("five::"+five);
                System.out.println("one::"+one);




                break;

            case 6:

                System.out.println("Enter any character:");

                char cha=scanner.next().charAt(0);

                if((cha>='a'&& cha <='z')||(cha>='A'&& cha<='B')){

                    System.out.println("is Alphabet:");
            }
            else if(cha>=0 && cha<=9){

             System.out.println("is an digit:");
            }
            else{
                System.out.println("is an special character:");
            }
            break;

            case 7:

              System.out.println("enter any letter:");
              char chars=scanner.next().charAt(0);
              if(chars>='a'&& chars<='z'){
                  System.out.println("this is lower case:");


              }
              else if(chars>='A'&& chars<='Z'){

              System.out.println("this is Upper case");
              }
              break;

            case 8:

             System.out.println("enter a day:");
             int week=scanner.nextInt();

             if(week==1){
                 System.out.println("sunday");
             }
             else if(week==2){
              System.out.println("monday");
             }
             else if(week==3){
                 System.out.println("tuesday");
             }
             else if(week==4){
                 System.out.println("wednesday");
             }
             else if(week==5){
                 System.out.println("thursday");
             }
             else if(week==6){
                 System.out.println("friday");
             }
             else if(week==7){
                 System.out.println("saturday");
             }
             else {
                 System.out.println("invalid");
             }
             break;

            case 9:

             System.out.println("Enter a month number from 1 to 12(1=january,12=December):");







                int month=scanner.nextInt();

                if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){

                 System.out.println("month has 31 days:");}

                 else if(month==4||month==6||month==9||month==11){

                  System.out.println("month has 30 days:");

                 }
                 else if(month==2){

                  System.out.println("month has 29 or 28 days:");
                }

                 else{

                     System.out.println("please enter valid number between 1 to 12");

                }

                 break;

            case 10:
                System.out.println("enter angle of a triangle:");
                int a=scanner.nextInt();
                int b=scanner.nextInt();
                int c=scanner.nextInt();

                if((a+b+c)==180 && a!=0 && b!=0 && c!=0){

                    System.out.println("triangle is valid:");

                }
               else{

                   System.out.println("triangle is invalid:");

                }
               break;

               case 11:

                System.out.println("enter side of triangle:");

                int e=scanner.nextInt();
                int f=scanner.nextInt();
                int g=scanner.nextInt();

                if((e+f)>g && (e+g)>f && (f+g)>e){

                 System.out.println("triangle is valid:");
                }
                else{
                    System.out.println("triangle is invalid:");
                }

                break;

            case 12:

                System.out.println("enter three side of triange:");

                int h=scanner.nextInt();
                int i=scanner.nextInt();
                int j=scanner.nextInt();

                if(h==i&&i==j&&h==j){

                    System.out.println("triangle is equilateral:");
                }

                else if(h==i||i==j||h==j){

                 System.out.println("triangle is isosceles:");
                }

                else{

                    System.out.println("triangle is scalene:");
                }
                break;

            case 13:

                System.out.println("Given quadratic equation:ax^2 + bx + c");
                double root1,root2;

                System.out.print("Enter a:");

                a = scanner.nextInt();

                System.out.print("Enter b:");

                b = scanner.nextInt();

                System.out.print("Enter c:");

                c = scanner.nextInt();

                System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x + "+c);

                h= b * b - 4 * a * c;

                if(h > 0)

                {

                    System.out.println("Roots are real and unequal");

                    root1= (-b + Math.sqrt(h))/(2*a);

                    root2 = (-b - Math.sqrt(h))/(2*a);

                    System.out.println("First root is:"+root1);

                    System.out.println("Second root is:"+root2);

                }

                else if(h == 0)

                {

                    System.out.println("Roots are real and equal");

                    root1 = (-b+Math.sqrt(h))/(2*a);

                    System.out.println("Root:");

                }

                else

                {

                    System.out.println("Roots are imaginary");

                }
                break;







                default:
                System.out.println("Your choices is wrong");

                }






    }
}
