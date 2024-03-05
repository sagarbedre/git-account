import java.util.Scanner;

class method_reverse{   


     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a no ");

        System.out.println(m1(sc.nextInt()));


       // m1(568);

        
    }


    public static int m1(int data) {
       int sum=0;

       int d= data;

       int c = d % 10;
        while (data>10){

            data /=10;
            



        }
       

        return c + data;
    
    }





}