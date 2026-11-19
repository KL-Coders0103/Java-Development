package arrayDemo;

public class FindFrequencyOfElement {

	public static void main(String[] args) {
		int arr[] = {2,2,1,4,1,2,3,1};
		int i,j,k;
		
		for(i=0; i<arr.length; i++) {
			boolean alreadyPresent = false;
			for(k=0; k<i; k++) {
				if(arr[i] == arr[k]) {
					alreadyPresent = true;
					break;
				}
			}
			
			if(alreadyPresent) continue;
			
			int count = 0;
			for(j=0; j<arr.length; j++) {
				if(arr[i] == arr[j]) count++;
			}
			System.out.println(arr[i] + " " + count);
		}

	}

}
