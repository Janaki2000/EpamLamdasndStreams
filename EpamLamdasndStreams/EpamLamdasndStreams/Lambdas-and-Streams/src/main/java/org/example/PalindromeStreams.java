package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PalindromeStreams {

    public static void main(String args[])
    {
        List<String> l1=new ArrayList<String>();
        l1.add("madam");
        l1.add("mam");
        l1.add("1001");
        l1.add("damad");
        l1=palindromeCheck(list1);

        for(String str:l1) {
            System.out.println(str);
        }
    }
    static List<String> palindromeCheck(List<String> list)
    {
        List<String> list2=new ArrayList<String>();
        for(String str:list)
        {
String t = str.replaceAll("\\s+", "").toLowerCase();
            if( IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!= t.charAt(t.length()-j-1)))
                list2.add(str);
}
        return list2;
    }
}