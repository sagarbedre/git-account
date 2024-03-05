class animal 
{

	void sound (){

		System.out.println("wohooooo");

	}
}


class cat extends animal
{
	void sound (){
		System.out.println("mauuuu ......mauuuuu");
	}

	

} 



class dog extends animal
{

	void sound(){
		System.out.println("bhooo ......bhooooo");
	
	}
	
}



class operation 
{

	public static void main(String[] args) {
		
		cat c = new cat();
	c.sound();

	dog d = new dog();
	d.sound();
	}
}
