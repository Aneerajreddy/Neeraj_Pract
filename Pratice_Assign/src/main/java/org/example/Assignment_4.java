package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class Assignment_4 {
    //    Where do we use a break statement?
// In simple terms to break is used to end continuous tasks or loops
    public static void BreakStatement() {
        for (int i = 0; ; i++) { //Here I am creating infinity loop where it does not have any limits
            if (i == 10) { // So to break the infinity loop I have used If condition statement to so that if it finds the 10 th position number the loop should stop .
                break;
            }
            System.out.println(i);

        }
    }

    //    Real time example with for, while and do while
    public static void ExampleOfForLoop() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

    }

    public static void ExampleOfWhileLoop() {
        int i = 0;

        while (i < 10) {

            System.out.println(i);
            i++;
        }
    }

    public static void ExampleOfDoWhileLoop() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 10);


    }

    //    Explore for each loop
    //Used only when you need to iterate through all elements, in forward order.
    public static void ForEachLoop() {

        int[] numbers = {10, 20, 30, 40};
        for (int num : numbers)//BY Using For each loop through going through each item one by one // : this symbol means  "in"
        {
            System.out.println("Number: " + num);
        }
    }
//    Difference between for and for each
//for loop You control the index (like 0, 1, 2...).like you Can go forward, backward, or skip elements and You can change values directly using the index.
public static void ForLoopExample() {
    int[] nums = {10, 20, 30};
    for (int i = 0; i < nums.length; i++) {
        System.out.println(nums[i]);
    }
}
// for each loop You don’t see the index and  used to go through all items one by one.
public static void ForEachLoopExample() {
    int[] nums = {10, 20, 30};
    for (int num : nums) {
        System.out.println(num);
    }

}

//    What is SDLC lifecycle
    // SDLC stands for software development life cycle
    //it is a step-by-step process used to plan, develop, test, and deliver software.

//    For a java application, create a file, Insert altair technologies inside it, write the file to a specific location with appropriate filename
public static void FileCreartionUsingJava() throws IOException {
    String filePath = "C:/Users/neera/OneDrive/Desktop/altair.txt";

    // Write to file
    FileWriter writer = new FileWriter(filePath);
    writer.write("Insert altair technologies ");
    writer.close();
}

    public static void main (String [] Args) throws IOException {

       BreakStatement();
       ExampleOfForLoop();
       ExampleOfWhileLoop();
       ExampleOfDoWhileLoop();
       ForEachLoop();
       ForLoopExample();
       ForEachLoopExample();
       FileCreartionUsingJava();




    }




}
