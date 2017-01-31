 import java.security.*;
     import java.math.*;
     import java.util.*;
     import java.io.*;
     
     public class MD5 {
        public static void main(String args[]) throws Exception{
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Enter a name to be converted to be converted to md5 hash");
           String s=br.readLine();
           MessageDigest m=MessageDigest.getInstance("MD5");
           m.update(s.getBytes(),0,s.length());
           System.out.println("MD5: "+new BigInteger(1,m.digest()).toString(16));
       }
   }
