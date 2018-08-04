package CodingChallenge;

import java.util.Scanner;

import static java.lang.StrictMath.pow;
import java.util.Scanner;
public class RecursiveFunctions
{
    public static void main(String[] args) 
    {
        int inputNumber, count = 0, tempNumber;
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the number:");
        inputNumber = src.nextInt();
        tempNumber = inputNumber;
        while(tempNumber > 0)
        {
            count++;
            tempNumber = tempNumber / 10;
        }
        RecursiveFunctions obj = new RecursiveFunctions();
        int result = obj.reverseFunction(inputNumber, count);
        System.out.println("Reverse:"+result);
    }
    int reverseFunction(int x, int length)
    {
        if(length == 1)
        {
            return x;
        }
        else
        {
            int b = x % 10;
            x = x / 10;
            return (int) ((b * pow(10, length - 1)) + reverseFunction(x, --length));
        }
    }
}