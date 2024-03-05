import java.util.Scanner;

class gno{
public static void main(String[] args ){

Scanner sc = new Scanner(System.in);
 System.out.print("enter your no" );
int a =sc.nextInt();
 System.out.println("enter your no");
int b =sc.nextInt();
 System.out.println("enter your no");
int c =sc.nextInt();

  if (a>b && a>c){
System.out.println("a is greater" + a);
}
else if (c>b && c>a){
System.out.println("c is greater "+c);
}
else{
System.out.println("b is greater "+b);
}

}
}