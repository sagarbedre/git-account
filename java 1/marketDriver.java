class marketDriver{


    public static void main(String[]args){



        market m1 = new market();

        System.out.println(m1.getpenName());

        m1.setpenName("flair");

        System.out.println("new name " + m1.getpenName());


        System.out.println(m1.getpenPrice());

        m1.setpenPrice(123);
        System.out.println("new price " + m1.getpenPrice());
    }
}