package main;

public class LeftRotation {

	public static void main(String[] args) {
		int arr[] = {8, 3, 7, 9, 0, 4};
		leftRotation(arr, 3);
	}
	
	static void leftRotation(int arr[], int count) {
		for (int i = 0; i < count; i++) {
			rotation(arr, arr.length);
		}
		
		resultRotation(arr);
	}
	
	static void rotation(int arr[], int length) {
		int temporary;
		temporary = arr[0];
		for (int x = 0; x < length - 1; x++) {
			arr[x] = arr[x + 1];
		}
		arr[length - 1] = temporary;
	}
	
	static void resultRotation(int arr[]) {
		for (int x = 0; x < arr.length; x++) {
			System.out.print(arr[x] + " ");
		}
	}

}
