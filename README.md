# Assignment
This is assignment for Softnerve Technology


# Leader_in_the_Array
Find the The Leader in the given array Using Java


Solution :-

	public int leader_of_the_array(int[] arr) {
		int lead = arr[0];
		
		for(int i = 0; i < arr.length - 1; i++) {
			if(lead < arr[i+1]) {
				lead = arr[i+1];
			}
		}
		return lead;
	}
  
  
  
  
  # Best-Time-to-Buy-and-Sell-Stock
find the maximum profit you can gain in the given array






	public int stock(int[] arr) {

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
		return (sell - buy);

	}
  
  
  
  # sum-of-all-subset-XOR-totals
The XOR total of any array and it all possible subset





    private int res;
	
	public  int subset(int[] nums){
		dfs(nums,0,0);
		return res;
	}
	
	private void dfs(int[] nums, int depth, int prev){
		res += prev;
		for(int i = depth; i < nums.length; i++){
			prev^= nums[i];
			dfs(nums,++depth,prev);
			prev ^= nums[i];
		}
	}
