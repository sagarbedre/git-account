class clay {

    public static void main(String[]args) {

       


        for (int i =1; i<=10; i++){

            int n=0;
            for (int j =1;j<=10; j++){

                int g= i+j;


                while( g<=5+n ){

                    System.out.print("* ");

                   n=n+2;
                }
               // else
               // System.out.print("  ");

               // n=n+2;
            }
            
            System.out.println();



        }
    }
}