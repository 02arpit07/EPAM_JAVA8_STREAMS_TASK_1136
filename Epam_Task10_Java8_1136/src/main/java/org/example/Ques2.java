package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Ques2 {

     //lambda operator usage

    public static void main(String args[])
    {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("aaaaabcde");
        list.add("abc");
        list.add("abcd");

        list = findStrings(list);

        for(String str : list)
            System.out.println(str);
    }

    static List<String> findStrings(List<String> list)
    {
      //it will return all string which starts with a  and of length 3
        return list.stream().filter(str -> str.startsWith("a")).filter(str -> str.length()==3).collect(Collectors.toList());
    }
}
