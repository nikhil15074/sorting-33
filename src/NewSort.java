public class NewSort {
	
	public static int[] sort(int arr[]) 
    { 
        int n = arr.length; 

        for (int i = 0; i < n-1; i++) 
        { 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
        return arr;
    } 
	
	public static void printArray(int arr[]) {
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = {9,8,7,6,5,4,3,2,1};
		arr = sort(arr);
		printArray(arr);

	}

}
