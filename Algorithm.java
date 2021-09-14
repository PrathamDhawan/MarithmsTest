//psedo code

//Find the smallest element. Swap it with the first element.
//Find the second-smallest element. Swap it with the second element.
//Find the third-smallest element. Swap it with the third element.
//Repeat finding the next-smallest element, and swapping it into the correct position until the array is sorted.

//solution
class Algorithms{ // my class.

	static void myAlgoForSorting(int arr[]){ //function declaration

		// function definition

		for(int i=0;i<arr.length-1;i++){  //algorithm to sort the array using selection sort.
			
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[j]<arr[i]){ // if element is larger than the next element then execute it.

					int temp = arr[j]; //swapping elements
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		for(int element: arr) //display sorted array.
			System.out.print(element+" ");
	}

	public static void main(String[] args) { // main function
		
		int arr[] = {45, 56, 78, 9, 102, 6465, 0}; //my array

		myAlgoForSorting(arr); //function call to sort array.
	}
}