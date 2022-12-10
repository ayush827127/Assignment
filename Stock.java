public class Stock {

	public static void main(String[] args) {

		int arr[] = {7,6,4,3,1};
		int buy = arr[0];
		int sell = arr[0];
		
		for(int i = 0; i < arr.length - 1; i++) {
			if(buy > arr[i+1] ) {
				buy = arr[i+1];
				sell = arr[i+1];
			}
			else{
			if(sell < arr[i+1]){
			   sell = arr[i+1];
			}
			}
		}
		System.out.println("The Buy rate is "+buy);
		System.out.println("The sell rate is "+sell);
	    System.out.println("The Maximum profit is "+ (sell - buy) );

	}

}



