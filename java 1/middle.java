import java.util.Scanner;

class middle{   


     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a no ");
        int a= sc.nextInt();
        System.out.println("enter a no ");
        int b= sc.nextInt();
        System.out.println("enter a no ");
        int c= sc.nextInt();

        System.out.println(m1(a,b,c));


       // m1(568);

        
    }


    public static int m1(int data,int data1, int data2) {

        if (data > data1 &&  data> data2  &&  data < data1 &&  data < data2 ){

           // System.out.println(data);
           return data;
        }
       else if (data1 > data ||  data1>  data2  &&  data1 < data ||  data1 < data2 ){

          //  System.out.println(data1);
          return data1;
        }
      else {
        //System.out.println(data2);
        return data2;


      }
    
    }





}