// // abstract class Deeep

// // {

// // 	abstract void sound();
// // }


// // class dog extends Deeep{

// // 	void sound (){

// // 		System.out.println("bark");
// // 	}
// // }


// // class Mamu 
// // {

// // 	public static void main(String [ ] args){

// // 		dog d1 = new dog();

// // 		d1.sound();
// // 	} 
// // }


// abstract class bike {

	

// 	bike(){

// 		System.out.println("hello from bike ");
// 	}

// 	public void change_gear(){

// 		System.out.println("gear changed ");
// 	}

// 	abstract void run();
// }


// class Mamu extends bike {


// 	public static void main(String[] args){


// 		bike b = new Mamu();

// 		b.change_gear();
		 

// 		b.run();
// 	}

// 	void run(){

// 			System.out.println("run works ... ");


// 		}
// }







interface bike {
	void run ();
	void change_gear();
}


// interface car{

// 	void color();
// 	void run();
// }


  class Mamu implements bike{

 public void run(){

	System.out.println("bike is running");
}

 public void change_gear (){

	System.out.println("bike is running");
}


public static void main(String[] args){

bike b = new Mamu();
b.run ();
b.change_gear();

}
}