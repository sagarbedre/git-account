class Untitled12
{

   public static void main (String[]args){
int n=5;
   char ch = 'A'; 
   
   int a = 1;
       for(int i = 1; i <= 5 ; i++){
       
           for( int j =1; j <=n ; j++ ){

            if (i % 2==1)

               System.out.print(a+++" ");

               else 
               System.out.print(ch+++ " ");
           }
          
           System.out.println();
           n--;
           

           ch= 'A';


       }
   }
}