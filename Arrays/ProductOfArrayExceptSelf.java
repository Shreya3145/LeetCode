package Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefixArray[] = new int[n];
        int suffixArray[] = new int[n];
        int res[] = new int[n];

        prefixArray[0] = 1;
        for(int i = 1; i < n; i++){
            prefixArray[i] = nums[i - 1] * prefixArray[i - 1];
        }

        suffixArray[n - 1] = 1;
        for(int i = n - 2; i >= 0; i--){
            suffixArray[i] = nums[i + 1] *  suffixArray[i + 1];
        }

        for(int i = 0; i < n; i++){
            res[i] = prefixArray[i] * suffixArray[i];
        }
        return res;
    }

    
}

/* Naive Approach
public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];

        Arrays.fill(arr, 1);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i != j){
                    arr[i] *= nums[j];
                }
            }
        }
        return arr;
    }
 */