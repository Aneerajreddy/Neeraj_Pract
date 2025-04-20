package org.example;

public class Assignment_3 {

// What is difference between While, do while and for loop execution, Print first 100 numbers using each loop?

//    Use while when you don't know how many times to loop and the condition determines when to stop.
//    Use do-while when you need to execute the loop body at least once before checking the condition.
//    Use for when you know exactly how many times you need to iterate, often with a counter or iterator.


    public static void UsingForLoop() {

        for (int i = 0; i < 101; i++) {
            System.out.println(i);
        }
    }

    public static void UsingWhileLoop() {
        int i = 0;
        while (i < 101) {
            System.out.println(i);
            i++;
        }
    }

    public static void UsingDoWhileLoop() {
        int i = 0;

        do {
            System.out.println(i);
            i++;
        } while (i < 101);
    }
//  Write all types of 4 methods for multiplication of two numbers?

    //Method 1
    public static void MultiplyMethod1(){
        int a = 10;
        int b = 2;
        int c = a*b;

        System.out.println("Multiplying two numbers"+c);
    }
    public static void MultiplyMethod2(int a, int b){

        int c = a*b;

        System.out.println("Multiplying two numbers"+c);
    }

    public static int MultiplyMethod3(){
        int a =3 ;
        int b= 4;
       return a*b;


    }
    public static int MultiplyMethod4(int a , int b){

        return a*b;


    }



    public static void main(String [] Args){

        UsingForLoop();
        UsingWhileLoop();
        UsingDoWhileLoop();
        MultiplyMethod1();
        MultiplyMethod2(2,3);
        System.out.println(MultiplyMethod3());
        System.out.println(MultiplyMethod4(5,10));


    }

}
