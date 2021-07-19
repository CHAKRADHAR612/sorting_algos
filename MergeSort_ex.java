package sorting_algos;

public class MergeSort_ex {

	public static void main(String[] args) {
		int[] arr = { 13, -29, 50, 8, -11, 75, 1 };
		mergeSort(arr, 0, arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void mergeSort(int[] arr,int start,int end) {
		if(end-start<2) {
			return;
		}
		int mid=(start+end)/2;
		mergeSort(arr, start, mid);
		mergeSort(arr,mid,end);
		merge(arr,start,mid,end);
	}
	public static void merge(int[] arr, int start, int mid, int end) {
		if(arr[mid-1]<=arr[mid]) {
			return;
		}
		int i=start;
		int j=mid;
		int tempIndex=0;
		int[]temp=new int[end-start];
		while(i<mid && j<end) {
			temp[tempIndex++]= (arr[i]<=arr[j]) ? arr[i++] : arr[j++]; // we are storing the values in sorting order.
		}
		// if elements in the left are remained then we just have to copy them directly to the main array
		// but if the elements in the right are remained then we don't have to do anything \
		// because anyway we will just be overriding the value.
		System.arraycopy(arr, i, arr, start+tempIndex,mid-i);
		System.arraycopy(temp, 0, arr, start, tempIndex);
	}
	

}
