package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {


    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
        this.array= intArray;


    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {

        Stream<String> remDup = Arrays.stream(array)
                .filter(num -> numberOfOccurances(num) < maxNumberOfDuplications);

        String[] removeDup = remDup.toArray(String[]::new);


        return removeDup;
    }


    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        Stream<String> removeDup = Arrays.stream(array)
                                    .filter(num-> numberOfOccurances(num)!=exactNumberOfDuplications);

        String[] remDupExactly = removeDup.toArray(String[]::new);

        return remDupExactly;
    }


    public Integer numberOfOccurances(String number){

        int count =0;

        for(String s : array){
            if(s == number)
                count++;

        }
        return count;

    }
}
