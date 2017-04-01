package com.test.demo;

import java.util.Scanner;

class HelooWorld
{
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=1;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();  
           
           for(int j=0; j<t; j++) 
               {
            a+=b* (int)Math.pow(2, i);
      System.out.println(a+" ");
        }
            System.out.println();
        in.close();
    }
}
}

                
