 import java.util.Scanner;
 class unknown{


    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
         System.out.println("enter starting point");
        int a = sc.nextInt();
        System.out.println("enter ending point ");
        int b = sc.nextInt();

        for (int i = a ; i<= b ; i++){

            is_prime(i);
        }
    }
         public static void is_prime(int a){
            //int n= 1;
            int counter=0;

           for (int j = 1 ; j<= a; j++){

                if (a % j==0){

                
                    counter++;

                    //n++;


                }



            }

            if (counter == 2){

                System.out.println("fuck you"+ a);
            }

        
        
        




    }



}