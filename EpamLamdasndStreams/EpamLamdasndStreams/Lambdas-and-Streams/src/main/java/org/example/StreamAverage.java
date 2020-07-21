package org.example;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class StreamAverage {
    public static void main(String args[]) {
        IntStream s=IntStream.of(35,8,20,30,10,95,62,70,12,34,78,31,56);
        OptionalDouble o=s.average();
        if(o.isPresent())
        {
            System.out.println("Average of stream is found to be: " +o.getAsDouble());
        }
        else
        {
            System.out.println(-1);
        }
    }
}