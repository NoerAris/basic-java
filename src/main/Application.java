package main;

public class Application {

	public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        leftRotate(arr, 2);
        printArray(arr);
        
        //Autoboxing, convert primitive data type intto wrapper data type
        int a = 3;
        Integer j = a;
        
        //Unboxing, convert wrapper data type into primitive data type
        Integer b = new Integer(3);    
        int x = b;
        
        Integer c = 3;
        Integer d = 3;
        if (b == a) {
			System.out.println("Equals");
		}
	}
	

	    /*Function to left rotate arr[] of size n by d*/
	   static void leftRotate(int arr[], int d)
	    {
	        for (int i = 0; i < d; i++)
	            leftRotatebyOne(arr, arr.length);
	    }
	 
	   static void leftRotatebyOne(int arr[], int n)
	    {
	        int i, temp;
	        temp = arr[0];
	        for (i = 0; i < n - 1; i++)
	            arr[i] = arr[i + 1];
	        arr[n-1] = temp;
	    }
	 
	    /* utility function to print an array */
	   static void printArray(int arr[])
	    {
	        for (int i = 0; i < arr.length; i++)
	            System.out.print(arr[i] + " ");
	    }
	  
}
