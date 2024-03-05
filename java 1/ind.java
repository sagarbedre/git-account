import java.util.Scanner;
class ket {

public static void main(string[]args){

Scanner sc = new Scanner(System.in);

System.out.print(" plz enter an ending ppoint ");

int n = sc.nextInt();
int i =1;
while( i <= n ){

if (i%2==0){

System.out.print(i+" its a even no");

int even++;
int sum = sum+ i;
}

else{
System.out.print(i+" its a odd no");

int odd++;
int sum1 = sum1+ i;
}

i++;



}

System.out.print("sum of all even no ="+"    "+ sum );
System.out.print("sum of all odd no ="+"    "+ sum1);
System.out.print("count of all even no ="+"    "+ even );
System.out.print("count of all odd no ="+"    "+ odd );
}


}