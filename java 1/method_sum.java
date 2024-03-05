import java.util.Scanner;

class method_sum{


     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a no ");

        System.out.println(m1(sc.nextInt()));


        //m1(144);

        
    }


    public static int m1(int data) {
       int sum=0;


        while (data>0){

            int a=data % 10;
            sum=sum+a;

            data /=10;
           // count++;



        }
       // System.out.println(count);

       return sum;
    }





}