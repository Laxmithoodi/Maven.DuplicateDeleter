package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {




    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
        this.array = intArray;


    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        Stream<Integer> removeDup = Arrays.stream(array)
                .filter(num -> numberOfOccurances(num)<maxNumberOfDuplications);

        Integer[] test = removeDup.toArray(Integer[]::new);


       return  test;



    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        Stream<Integer> remDup = Arrays.stream(array)
                .filter(num -> numberOfOccurances(num)!=exactNumberOfDuplications);

        Integer[] remoDupExactly = remDup.toArray(Integer[]::new);


        return remoDupExactly;
    }




    public Integer numberOfOccurances(Integer number){

        int count =0;
        for(Integer s: array){
            if(s == number)
                count++;
        }
        return count;
    }


}
