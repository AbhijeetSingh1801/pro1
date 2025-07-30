class Solution {
  public boolean isValid(String s) {
    int n = s.length();

    char[] arr = new char[n];
    int i = 0;

    for (char c : s.toCharArray()){
      switch (c) {
        case '(':
          arr[i] = c;
          i++;
          break;
        case '{':
          arr[i] = c;
          i++;
          break;
        case '[' :
          arr[i] = c;
          i++;
          break;
        case ')' :
          if(i==0) return false;
          else if (arr[i-1] != '(') return false;
          i--;
          break;
        case '}':
          if(i==0) return false;
          else if (arr[i-1] != '{') return false;
          i--;
          break;
        case ']':
          if(i==0) return false;
          else if (arr[i-1] != '[') return false;
          i--;
          break;
      }
    }

    return i==0;
  }

  public int removeElement(int[] nums, int val) {
    int k = 0;
    for(int i =0; i<nums.length; i++) {
      if (nums[i] != val){
        nums[k] = nums[i];
        k++;
      }
    }
    return k;
  }
}


public class Main {
    public static void main(String[] args) {

      Solution sol =  new Solution();
      boolean ans = sol.isValid("{}[]");

      System.out.println(ans);

    }
}
