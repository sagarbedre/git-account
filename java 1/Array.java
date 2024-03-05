class Array
{

	public static void main(String []args){


		int arr [] = { 10,20,30,40,50,60};

		int y = arr.length-1;

          System.out.println(y);



		for (int i = 0; i < 3;i++){

			int x = arr[y];
			System.out.println(x);


			for (int j = 0 ;i < arr.length;i++ ){




				arr[0]=arr[y];
				System.out.println(arr[i]);
			}

		}



		// System.out.println(arr[]);





			}
}