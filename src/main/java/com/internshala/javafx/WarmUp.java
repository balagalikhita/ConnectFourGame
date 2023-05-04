package com.internshala.javafx;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WarmUp {
    public static void main(String[] args) {
//        int[] arr=new int[101];
//        for(int i=0;i<=100;i++){
//            arr[i]=i;
//        }
      int[]  arr=  IntStream.rangeClosed(0,100).toArray();
//      List<Integer> numList=new ArrayList();
//      for(int i=0;i<=100;i++){
//          numList.add(new Integer(i));
//      }
     List<Integer> numList= IntStream.rangeClosed(0,100)
             .boxed()
             .collect(Collectors.toList());
    }
}
