import java.lang.*;
import java.util.*;
import java.io.*;

public class stringAdd{
    public static String stringAddition(String num1, String num2){
        
        int n1=num1.length()-1;
        int n2=num2.length()-1;
        int carry = 0;
        int sum = 0;
        //int sum1=0;
        //String ans;
        StringBuilder sb = new StringBuilder();
        while(n1>=0 || n2>=0)
        {
            sum=carry;
           // sum1=0;
            if(n1>=0)
            {
                sum=sum+(num1.charAt(n1)-48);
                n1--;
            }
            if(n2>=0)
            {
                sum=sum+(num2.charAt(n2)-48);
                n2--;                
            }
            sum = sum + carry;
            //sum1=sum1+sum%10;
            carry=sum/10;
            sum = sum % 10;
		    sb.append(sum);
            //ans.append(sum1+48);
        }
        if(carry > 0 )
        {
            sb.append(carry);
        }
        //reverse(ans.begin(),ans.end());
        return sb.reverse().toString();
        
    }
    
    
    public static void main(String[] args){
        
        String number1 = "0123456798";
        String number2 = "9876543210";
        String summation = stringAddition(number1, number2);
        System.out.println("The Summation is: "+ summation);
    }

}