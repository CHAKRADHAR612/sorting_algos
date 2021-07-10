package sorting_algos;

public class SelectionSort_ex {
	public static int findMax(int[]arr,int index) {
		int maxIndex=0;
		int max=arr[maxIndex];
		for(int i=0;i<=index;i++) {
			if(arr[i]>max) {
				maxIndex=i;
				max=arr[i];
			}
		}
		return maxIndex;
	}
	public static void main(String[] args) {
		int[]arr= {13,-29,50,8,-11,50,1};
		int lastUnsortedIndex=arr.length-1;
		int largest=findMax(arr,lastUnsortedIndex); // initially array is totally unsorted
		System.out.println("largest:"+largest);
		while(lastUnsortedIndex>=0) {
		for(int i=0;i<=lastUnsortedIndex;i++) {
			if(i==lastUnsortedIndex) {
					int temp=arr[largest];
					arr[largest]=arr[i];
					arr[i]=temp;
					lastUnsortedIndex--;
					largest=findMax(arr,lastUnsortedIndex);
			}
		}
		}
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
	}
}
