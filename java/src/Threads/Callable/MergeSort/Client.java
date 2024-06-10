package Threads.Callable.MergeSort;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Integer> list = Arrays.asList(2,4,8,7,5,9,6,2,4,5,6,32);

        ExecutorService es = Executors.newCachedThreadPool();
        MergeSorter ms = new MergeSorter(es ,list);

        Future<List<Integer>> future = es.submit(ms);

        List<Integer> SortedList = future.get();

        System.out.println(SortedList);
        es.shutdown();


    }
}
