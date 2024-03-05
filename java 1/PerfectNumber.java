

import java.util.Scanner;
class PerfectNumber
{
public static void main (String[]args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
//int i=1;
//int sum=0;
int count = 0;
int counter1= 0;
 int counter2 = 0;
while (n>0){

    count ++;
   int  a = n %10;
   int  b = n / 10 ;
  int   c = b % 10 ;

if (a>c){

    counter1++;
}
 
else if (a< c){

    counter2++;
}
    n = b;

}
if (counter1 == count && counter2 == count){

    System.out.println("not a bouncy");
}

else {
    System.out.println(" bouncy number");
    
}
}


}