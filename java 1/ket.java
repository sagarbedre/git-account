import java.util.Scanner;
class ket {

public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.print(" plz enter an ending ppoint ");

int n = sc.nextInt();
int i =1;
int even=0;
int odd =0;
int sum=0;
int sum1=0;
while( i <= n ){

if (i%2==0){

System.out.println(i+" its a even no");

 even++;
 sum = sum+ i;
}

else{
System.out.println(i+" its a odd no");

 odd++;
sum1 = sum1+ i;
}

i++;



}

System.out.println("sum of all even no ="+"    "+ sum );
System.out.println("sum of all odd no ="+"    "+ sum1);
System.out.println("count of all even no ="+"    "+ even );
System.out.println("count of all odd no ="+"    "+ odd );
}


}