import java.util.Scanner;

class fact_count{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a no");

        int n = sc.nextInt();

        int i =1;
        int sum=0;
        int counter =0;


        while (i<=n){

            if (n%i==0){
                System.out.println(i);
                sum = sum +i;
                counter++;


            }
            i++;

        }
        System.out.println("sum of factor" + sum);
        System.out.println("count of factor" + counter);



    }

 
}