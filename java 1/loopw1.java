import java.util.Scanner;

class loopw1{

public static void main(String []args){

Scanner sc= new Scanner(System.in);

System.out.println(" enter a starting point  ");
int  i =sc.nextInt();

System.out.println("enter a  ending  point");
int  n =sc.nextInt();
int sum=0;
int counter=0;
int sum1=0;
int counter1=0;
while (i<=n){



if (i%2==0){
System.out.println(i+"   "+"its even no");

sum = sum+i;
counter++;
}
else {
System.out.println(i+"   "+"its odd no");

sum1 = sum1+i;
counter1++;


}

i++;
}
System.out.println("sum of all evev no is "+ sum );
System.out.println("count of even no" + counter);

System.out.println("sum of all evev no is "+ sum1 );
System.out.println("count of even no" + counter1);
}
}

