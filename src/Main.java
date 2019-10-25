import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        //1.Write a program to print a string in reverse:
     /*    System.out.println("Enter string to reverse:");
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";
       for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);

        }
        System.out.println("Reversed string is:");
        System.out.println(reverse);
        //2.find the length of an input string without lenght function
        char[] arr = str.toCharArray();
        int count = 0;

        for (char a : arr) {
            count += 1;
        }
        System.out.println("string count is " + count);


        //3.Prompt the user to input 10 values and store them into an array.
        // If there are any duplicate values in that array,
        // remove them and print out the remaining values.
        System.out.println("please enter 10 numbers: ");
        int[] arr2 = new int[10];
        for (int i = 0; i < 10; i++) {
            int int2 = read.nextInt();
            arr2[i] = int2;

        }
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr2[i] == arr2[j] && i != j) {
                    arr2[i] = 0;
                }
            }

        }
        System.out.println(Arrays.toString(arr2));*/

        //4.Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
        //Write a program that will print out all pairs from
        // arrays 1 and 2 that gives a sum of 13:
        //Expected output: (6,7) or (9,4)

     /*   int[] arr3 = new int[]{1, 7, 6, 5, 9};
        int[] arr4 = new int[]{2, 7, 6, 3, 4};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(arr3[i]+arr4[j] == 13){
                    System.out.println("(" + arr3[i] + "," + arr4[j] + ")");
                }
            }
        }*/
     //5.Prompt the user to input 10 values and store them into an array.
     // Output the total number of odd and even values in the array
        System.out.println("please enter 10 numbers: ");
        int[] arr5 = new int[10];
        int count1 = 0,count2 = 0;
        for (int i = 0; i < 10; i++) {
            int int5 = read.nextInt();
            arr5[i] = int5;
            if(arr5[i] % 2 == 0){
                count1 += 1;
            }
            else if(arr5[i] != 0){
                count2 += 1 ;
            }
        }
        System.out.println(Arrays.toString(arr5));

        System.out.println("There are " + count1 + " even numbers!");
        System.out.println("There are " + count2 + " odd numbers");
        }

    }

