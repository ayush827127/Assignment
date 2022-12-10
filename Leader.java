public class Leader {

	public static void main(String[] args) {

		int arr[] = {7,6,5,3,10,188,5,4};
		int lead = arr[0];
		
		for(int i = 0; i < arr.length - 1; i++) {
			if(lead < arr[i+1]) {
				lead = arr[i+1];
			}
		}
		System.out.println("The Leader is "+lead);
		
	}

}