class Solution {
public int getSecondLargest(int[] arr) {
        // code here
        
            if (arr.length<2) return -1;
            
            int first= -1, second= -1;
            
            for (int num:arr){
                if (num>first){
                    second=first;
                    first=num;
                } else if (num != first && num> second){
                    second = num;
                }    
                
            }
            return second;
        }
        public static void main (String[] args){
            Solution sol = new Solution();
            int[] arr1={10,20,4,45,99};
            int[] arr2={10,10,10};
            int[] arr3={5};
            int[] arr4={5,1};
            
            System.out.println(sol.getSecondLargest(arr2));
        }
    }
    
    
    