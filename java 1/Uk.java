import java.util.Scanner;

class Uk{

public static void main(String[]args){


Scanner sc = new Scanner(System.in);
System.out.println("enter the starting point");
char ch  = sc.next().charAt(0);
System.out.println("enter the ending point");
char nh  = sc.next().charAt(0);
int count_vowels =0;
int count_consonent =0;
while (ch<=nh){


if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){

System.out.println(ch+ "    "+ "vowels");
count_vowels++;
}

else {

System.out.println(ch+"     " +"consonent");
count_consonent++;
}

ch++;
}
System.out.println(" count of vowel"+ "   "+count_vowels);
System.out.println("count of consonent"+ "   " +count_consonent);


}

}