abstract class Default
{

	abstract void sound();
}


class dog {

	void sound (){

		System.out.println("bark");
	}
}


class abstract 
{

	public static void main(String [ ] args){

		dog d1 = new dog();

		d1.sound();
	} 
}