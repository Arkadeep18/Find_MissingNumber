package practice_prev;

public class Find_MissingNum {
	static int FindMissing(int arr[]) {
		int n=arr.length+1;
		int sumExpected=n*(n+1)/2;
		int sumActual=0;
		
		for(int a=0;a<arr.length;a++) {
			sumActual+=arr[a];
		}
		int ans=sumExpected-sumActual;
		return ans;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,9,10};
		
		int missingNum = FindMissing(arr);
		System.out.println("The missing number is:"+missingNum);
		
	}
	
}
