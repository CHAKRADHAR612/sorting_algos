package sorting_algos;

public class InsertionSort_ex {

	public static void main(String[] args) {
		int[] arr = { 13, -29, 50, 8, -11, 75, 1 };
		int firstUnsortedElement = 1;
		int newElement = arr[firstUnsortedElement];
		int j = 0, k = 0;
		for (int i = j+1; i < arr.length; i++) {
			newElement=arr[i];
			while (k >= 0) {
				if (newElement < arr[k]) {
					int temp = arr[k];
					arr[k] = newElement;
					arr[k+1]=temp;
				}
				k--;
			}
			j++;
			k = j;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
