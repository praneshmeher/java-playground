package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class MaxElement {
	
    public static int majorityElement(Integer[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        return map.entrySet().stream().max((key1,key2)->key1.getValue()-key2.getValue()).get().getKey();
    }

	public static void main(String[] args) {
		Integer arr[] = {1,2,3,4,5,5};
		System.out.println(MaxElement.majorityElement(arr));
		
		Integer i = Arrays.asList(arr).stream().max((k1,k2)->k1.compareTo(k2)).get();
		System.out.println(i);
	}

}
