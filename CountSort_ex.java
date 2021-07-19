package sorting_algos;

public class CountSort_ex {

	public static void countSort(int[] arr,int[] count_arr,int n,int m) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				count++;
			}
		}
		count_arr[m]=count;
	}
	public static void main(String[] args) {
		int[] arr= {2,3,1,2,5,3,6,4,9,10,7};
		int[] count_arr=new int[10];
		for(int i=1,j=0;i<=10 && j<10;i++,j++) {
			countSort(arr,count_arr,i,j);
		}
		for(int i=0,j=0;i<count_arr.length;i++) {
			int c=count_arr[i];
			while(c>0) {
				arr[j]=i+1;
				j++;
				c--;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
	}

}
