package OTP;

import java.util.Random;
import java.util.Scanner;

public class GenerateOTP {
    public static void main(String[] args) {
        
           
        System.out.println("Enter Length of OTP you Want");
            System.out.println("NM-"+String.valueOf(new GetOTP().OTP(new Scanner(System.in).nextInt())));
        /*valueof() - converts different types of value into String
          Scanner   - used to take input from user 
            NM      - String before OTP,just indicated my name i.e NM - Nikhil Mahajan
            
            */
    }

}

class GetOTP {

    public char[] OTP(int len) {
        String n="0123456789";
        
        Random r = new Random();
        char[] otp = new char[len];
        
        for(int i=0;i<len;i++)
        {
            otp[i]=n.charAt(r.nextInt(n.length()));
            
        }
        
       return otp;
    }
}
