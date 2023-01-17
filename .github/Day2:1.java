import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
 
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        
        if (m>0){
            if(isPrime(m))
            {
                System.out.print("Prime Number");
            }
            else
            {
                System.out.print("Not Prime Number");
            }
        }
    }
}
