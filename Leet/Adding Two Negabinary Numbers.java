//nt
class Solution {
    public int[] addNegabinary(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        int n = arr1.length;
        int m = arr2.length;
        int carry = 0;
        int i = n - 1, j = m - 1;
        while(i >= 0 && j >= 0) {
            int val = arr1[i] + arr2[j] + carry; // calculate current value
            int digit = 0;
            if (val < 0) {
// special case : when arr1[i] == 0 and arr2[j] == 0 and carry = -1, 
// borrow value from i - 2, set carry and digit both to 1
// e.g considering [1] + [1] which will leads to result [-1, 0], which 
// means -( (-2)^1 ), to represent this value, we need borrow (-2)^2 from 
//higher bit, and set current bit to 1 which means(-2)^1, that's why set digit and carry to 1
//                   [1]
//                   [1]
//                [-1,0] 
//               [1,1,0]. borrow from arr[i - 1] to represent arr[i] = -1
                carry = 1;
                digit = 1;
            } 
            else {
                carry = -(val / 2);
                digit = val % 2;
            }
            list.add(0, digit);
            --i;
            --j;
        }
        while(i >= 0) {
            int val = arr1[i] + carry;
            int digit = 0;
            if (val < 0) {
                carry = 1;
                digit = 1;
            } 
            else {
                carry = -(val / 2);
                digit = val % 2;
            }
            list.add(0, digit);
            --i;
        }
        while(j >= 0) {
            int val = arr2[j] + carry;
            int digit = 0;
            if (val < 0) {
                carry = 1;
                digit = 1;
            } 
            else {
                carry = -(val / 2);
                digit = val % 2;
            }
            list.add(0, digit);
            --j;
        }
        if (carry != 0) {
            if (carry == -1) {
                list.add(0, 1);
                list.add(0, 1);
            }
            else {
                //carry == 1
                list.add(0, carry);
            }
        }
        // remove leading zeros
        while(list.size() > 1 && list.get(0) == 0) {
            list.remove(0);
        }
        int[] ans = new int[list.size()];
        for (int k = 0; k < list.size(); ++k) {
            ans[k] = list.get(k);
        }
        return ans;
    }
}
