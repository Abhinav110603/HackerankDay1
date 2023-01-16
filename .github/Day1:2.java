import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        
        int x = a;
        int y = 2*x;
        
        int temp = x;
        x = y;
        y = temp;
        
        System.out.print(x + "\t" + y);
    }
}
