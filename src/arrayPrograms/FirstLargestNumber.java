package arrayPrograms;

public class FirstLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,4,5,6,2,8};
		int largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > largest) {
				largest=arr[i];
			}
		}
		System.out.println(largest);
	}

}
