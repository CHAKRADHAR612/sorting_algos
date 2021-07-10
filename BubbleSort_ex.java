package sorting_algos;

public class BubbleSort_ex {

	public static void main(String[] args) {
		int[]arr= {23,-19,35,34,9,10,-12,-50};
		int k=arr.length-1;
		while(k>=0) {
		for(int i=0,j=i+1;j<arr.length;i++,j++) {
				if(arr[i]>arr[j]) {
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		}
		k--;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
