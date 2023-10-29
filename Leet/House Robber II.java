//nt
class Solution {
    public int rob(int[] nums) {
        
		//2 solution arrays
        int[][] solution = new int[nums.length][2];
        
        if(nums.length == 1)
            return nums[0];
        
		//base cases
        solution[0][0] = nums[0];
        solution[0][1] = 0;
        solution[1][0] = solution[0][0];
        solution[1][1] = nums[1];
        
		//iterate over solution array
        for(int i = 2; i < solution.length; i++){
			//if on last house, set path with the start house = to prior max
			//keep dichotemy of take or leave cell on the path without the start house
            if(i == solution.length-1){
                solution[i][0] = solution[i-1][0];
                solution[i][1] = Math.max(solution[i-2][1] + nums[i], solution[i-1][1]);
                break;
            }
			//Bellman Equation
            solution[i][0] = Math.max(solution[i-2][0] + nums[i], solution[i-1][0]);
            solution[i][1] = Math.max(solution[i-2][1] + nums[i], solution[i-1][1]);
        }
        
		//return max of path without and with start house which is our solution
        return Math.max(solution[nums.length-1][1], solution[nums.length-1][0]);
    }
}
