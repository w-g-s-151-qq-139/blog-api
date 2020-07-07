package com.wgs.blog;

import com.google.common.collect.Lists;
import org.apache.commons.collections.ListUtils;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
//      int[] nums = {1,2,3,4,5,6,7};
//      StringBuffer stringBuffer = new StringBuffer();
//      for(int i : nums)
//          stringBuffer.append(i);
//      stringBuffer.reverse();
//      for(int i=0;i<nums.length;i++)
//          nums[i] = Integer.parseInt(stringBuffer.substring(i,i+1));
        List<Integer> datas = new ArrayList();
        List<List<Integer>> partitionList = Lists.partition(datas,255);
        for(List<Integer> data : partitionList){
            //插入操作
        }
    }
}

abstract class TT{
    public abstract void tt();
}
