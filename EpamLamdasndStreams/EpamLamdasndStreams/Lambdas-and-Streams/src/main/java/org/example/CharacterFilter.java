package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CharacterFilter {

    public static void main(String args[]) {
        List<String> l = new ArrayList<String>();

        l.add("abc");
        l.add("def");
        l.add("aab");
        l.add("aka");
        l.add("amar");
        l.add("adi");
        l.add("nita");

        l=filterOut(l);

        for(String str:list1) {
            System.out.println(str);
        }
    }
    static List<String> filterOut(List<String> list) {
        return list.stream().filter(x -> x.startsWith("a")).filter(x -> x.length()==3).collect(Collectors.toList());
    }
}