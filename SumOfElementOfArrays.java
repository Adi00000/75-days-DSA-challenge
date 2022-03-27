import java.util.Scanner;

public class SumOfElementOfArrays{
        public static void main(String[]args){
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int sum = 0;
            int[] arr = new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i] = i;
            }
            for(int i=0;i<arr.length;i++){
                sum = sum + arr[i];
            }
            System.out.println("Sum of an element of an array "+sum);
        }
    }
