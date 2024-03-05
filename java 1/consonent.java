

import java.util.Scanner;

class consonent{

public static void main(String[]args){


    Scanner sc = new Scanner(System.in);

    System.out.println("enter A starting point ");


    char ch = sc.next().charAt(0);



    System.out.println("enter A ending point ");


    char nh = sc.next().charAt(0);

int sum =0;
    while(ch<=nh){


        if (ch !='a' ||  ch!='e' || ch!='i' || ch!='o' || ch!='u'){


            sum++;
        }

ch++;

    }
    System.out.println("total no of consonent "  + sum);

}


}