package edu.cnm.deepdive;

import java.util.Arrays;

public class Array2 {

  public boolean either24(int[] nums) {
    boolean found2 = false;
    boolean found4 = false;
    for (int i = 0; i < nums.length -1; i++) {
      if (nums[i] == 2 && nums[i + 1] == 2) {
        found2 = true;
      }
      if (nums[i] == 4 && nums[i + 1] == 4) {
        found4 = true;
      }
    }
    return (found2 ^ found4);
//    if (found2 && found4) {
//      return false;
//    } else if (!found2 && !found4) {
//      return false;
//    } else {
//      return true;
//    }
  }

  public int[] pre4(int[] nums) {
      int[] x = {};
      for (int i = 0; i< nums.length; i++) {
        if (nums[i] == 4){
          x = Arrays.copyOf(nums,i);
          break;
        }
      }
      return x;
    }
  }
//    for (int i = 0; i < nums.length; i++) {
//      if (nums[i] == 4 && i > 0) {
//        int[] newNums;
//        newNums = new int[i];
//        for (int j = 0; j < newNums.length; j++) {
//          newNums[j] = nums[j];
//        }
//        if (nums[0] != 4) {
//          return newNums;
//        }
//      }
//    }
//    int[] bar;
//    bar = new int[0];
//    return bar;
//  }
}
