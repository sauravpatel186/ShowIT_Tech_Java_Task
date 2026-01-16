package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(9);
        nums.add(11);
        nums.add(17);
        nums.add(15);
        nums.add(12);
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i< nums.size(); i++){
            int num = nums.get(i);
            if(max < num){
                secondLargest = max; //Keep track of old max value
                max = num;

            }
            if(secondLargest < num && num < max){
                // check whether the current value is greater than second largest and smaller than max
                secondLargest = num;
            }
        }
        System.out.println(secondLargest);

    }
}
