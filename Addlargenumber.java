import java.lang.*;
import java.util.*;
import java.io.*;

public class stringAdd{
    public static String stringAddition(String num1, String num2){
        
        int n1=num1.length()-1;
        int n2=num2.length()-1;
        int carry=0;
        int sum;
        int sum1=0;
        String ans;
        while(n1>=0 || n2>=0)
        {
            sum=carry;
            sum1=0;
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
            sum1=sum1+sum%10;
            carry=sum/10;
            ans.push_back(sum1+48);
        }
        if(carry)
        {
            ans.push_back(carry+48);
        }
        reverse(ans.begin(),ans.end());
        return ans;
        
    }
    
    
    public static void main(String[] args){
        
        String number1 = "01234567980123456789442198725197421697326426146519712";
        String number2 = "98765432109876543210012345678944219872519742169732642";
        String summation = stringAddition(number1, number2);
    }

}