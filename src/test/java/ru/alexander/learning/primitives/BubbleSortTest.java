package ru.alexander.learning.primitives;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void testSort() {

        int[] arr = {7, 1, 9, 5, 3, 8};
        BubbleSort.sort(arr);
        Assert.assertEquals(1, arr[0]);
        Assert.assertEquals(3, arr[1]);
    }

    @Test
    public void testSingleElementArraySort() {
        int[] arr = {7};
        BubbleSort.sort(arr);
        Assert.assertEquals(7,arr[0]);
        //todo
    }

//    @Test
//    public void testEmptyArraySort() {
//        int[] arr = {};
//        BubbleSort.sort(arr);
//        Assert.
//        //todo
//    }

}
