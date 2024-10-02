package arrayPrograms;

public class Sum_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int sum(int arr[], int n) {
       
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		return sum;
    }

}
