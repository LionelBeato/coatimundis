import com.sun.tools.javac.util.ArrayUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertTrue;

public class SortTest {
    

        int[] toSort = new int[]
                {5, 1, 89, 255, 7, 88, 200, 123, 66};
        int[] sortedInts = new int[]
                {1 ,5 ,7 ,66 ,88 ,89 ,123 ,200 ,255};
        int[] sortedRangeInts = new int[]
                {5, 1, 89, 7, 88, 200, 255, 123, 66};


    @Test
    public void givenIntArray_whenUsingSort_thenSortedArray(){
        Arrays.sort(toSort);
        assertTrue(Arrays.equals(toSort, sortedInts));
    }

    @Test
    public void givenIntArray_whenUsingRangeSort_thenRangeSortedArray(){
        Arrays.sort(toSort, 3, 7);
       assertTrue(Arrays.equals(toSort, sortedRangeInts));
    }

    @Test
    public void givenIntArray_whenUsingParallelSort_thenArraySorted(){
        Arrays.parallelSort(toSort);
        assertTrue(Arrays.equals(toSort, sortedInts));
    }

    @Test
    public void givenList_whenUsingSort_thenSortedList(){
        List<Integer> toSortedList = Arrays.stream(toSort)
                .boxed()
                .collect(Collectors.toList());

        Collections.sort(toSortedList);

        System.out.println(Arrays.toString(toSortedList.toArray()));
        System.out.println(Arrays.toString(sortedInts));

        Integer[] newArr = toSortedList.toArray(new Integer[toSortedList.size()]);

        Integer[] boxedArray = Arrays.stream(sortedInts)
                .boxed()
                .toArray(Integer[]::new);

        assertTrue(Arrays.equals(newArr , boxedArray));

    }



}
