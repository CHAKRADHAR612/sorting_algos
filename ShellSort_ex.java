package sorting_algos;

public class ShellSort_ex {
	public static void main(String[]args) {
		int[] arr = { 13, -29, 50, 8, -11, 75, 1 };
		int gap=arr.length/2;
		int newElement;
		while(gap>0) {
		for(int i=gap;i<arr.length;i++) {
			newElement=arr[i];
			int j;
			for(j=i;j>=gap && arr[j-gap]>newElement;j-=gap) {
				arr[j]=arr[j-gap]; //we override the new Element position with the j-gap value
			}
			arr[j]=newElement; // if the element is less than the new Element then we don't change the positions
		}
		gap/=2;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
