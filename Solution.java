import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Solution {

    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        System.out.println(testLongest(input));
    }

    private static String testLongest(String a){
        int l=a.length();
        if(l==1)
            return a;
        else{
            for(int i=l/2 ; i>=0; i--){
                if(a.substring(0,i).equals(a.substring(l-i))){
                    return a.substring(0,i);
                }
            }
        }
        return "";
    }
}
