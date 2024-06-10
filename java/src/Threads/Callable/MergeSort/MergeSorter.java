package Threads.Callable.MergeSort;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {

    List<Integer> listToSort;
    ExecutorService es;

    MergeSorter(ExecutorService es,List<Integer> args){
        this.es = es;
        this.listToSort = args;
    }

    @Override
    public List<Integer> call() throws Exception {

        if(listToSort.size() <= 1){
            return listToSort;
        }
        List<Integer> firstHalf = new ArrayList<>();
        List<Integer> secondHalf = new ArrayList<>();

        for (int i = 0; i < listToSort.size(); i++) {
            if(i < listToSort.size()/2){
                firstHalf.add(listToSort.get(i));
            }else{
                secondHalf.add(listToSort.get(i));
            }
        }

        MergeSorter sortedForLeftHalf = new MergeSorter(es,firstHalf);
        MergeSorter sortedForRightHalf = new MergeSorter(es,secondHalf);

        Future<List<Integer>> promiseOfSortedFirstHalf = es.submit(sortedForLeftHalf);
        Future<List<Integer>> promiseOfSortedSecondHalf = es.submit(sortedForRightHalf);

        List<Integer> sortedFirstHalf = promiseOfSortedFirstHalf.get();
        List<Integer> sortedSecondHalf = promiseOfSortedSecondHalf.get();
        List<Integer> sortedList = new ArrayList<>();

        int i=0;
        int j=0;
        int k=0;

        while(i< sortedFirstHalf.size() && j < sortedSecondHalf.size()) {
            if(sortedFirstHalf.get(i) <= sortedSecondHalf.get(j)){
                sortedList.add(sortedFirstHalf.get(i));
                i++;
                k++;
            }else{

                sortedList.add(sortedSecondHalf.get(j));
                j++;
                k++;
            }
        }
        while( i< sortedFirstHalf.size()){

            sortedList.add(sortedFirstHalf.get(i));

            i++;
            k++;
        }
        while(j < sortedSecondHalf.size()) {
           sortedList.add(sortedSecondHalf.get(j));
           j++;
           k++;
        }

        return sortedList;

    }
}
