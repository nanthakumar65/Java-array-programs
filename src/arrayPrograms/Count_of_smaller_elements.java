package arrayPrograms;

public class Count_of_smaller_elements {

	public static void main(String[] args) {
		
	}
	
	public int countOfElements(int []arr,int n,int x)
    {
		int count =0;
        for(int i=0;i<n;i++) {
        	if(arr[i] <=x) {
        		count++;
        	}
        }
        return count;
    }
}
