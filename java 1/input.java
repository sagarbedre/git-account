import java.util.Scanner;

class input{
public static void main(String[] args ){

Scanner sc = new Scanner(System.in);
System.out.println("enter your char" );
   char ch=sc.next().charAt(0);

   if (ch>='a'&& ch<='z'){
System.out.println("char is in lowercase" );
} 
else if (ch>='A'&& ch<='Z'){
System.out.println("char is in Uppercasecase" );
} 
 else if (ch>='0'&& ch<='9'){
System.out.println("char is digit" );
} 
else {
    System.out.println("char is special char" );       }
}

}