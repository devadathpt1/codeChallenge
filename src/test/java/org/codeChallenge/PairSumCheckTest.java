package org.codeChallenge;

import org.junit.Test;

public class PairSumCheckTest {

    @Test
    public void pairTc1() {
        int sumOfPair=1;
        Integer arr[] = {3, 4, 5, 6};
        System.out.println(PairSumCheck.printNumOfPairs(arr,sumOfPair));
    }

    @Test
    public void pairTc2() {
        int sumOfPair =  15;
        Integer arr1[] = {0, 15, 32, 2000, 15000};
        System.out.println(PairSumCheck.printNumOfPairs(arr1,sumOfPair));
    }
    @Test
    public void pairTc3() {
        int sumOfPair =  42;
        Integer[] arr2 = {1, 1, 10, 32, 41};
        System.out.println(PairSumCheck.printNumOfPairs(arr2,sumOfPair));

    }
}
