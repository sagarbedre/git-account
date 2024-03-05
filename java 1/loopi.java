import java.util.Scanner;

class loopi{

public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter a no");

int n = sc.nextInt();
int count = 0;
int sum =0;
while(n>0){
int a= n%10;
if(a%2==1)
{
System.out.println("all odd no " + a);
count++;
sum =sum+ a;

}

n= n/10;
}

System.out.println("count of odd no is " + count);
System.out.println("sum of odd no is " + sum);
}


}