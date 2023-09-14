package org.codeChallenge;

import java.util.Arrays;
import java.util.*;
public class PairSumCheck {

    static int printNumOfPairs(Integer arr[], int sum)
    {
        int count = 0;

        Set arr1 = new TreeSet<Integer>(Arrays.asList(arr));
        Integer arr2[] =    Arrays.copyOf(arr1.toArray(),arr1.size(),Integer[].class);

        for (int i = 0; i < arr2.length; i++)
            for (int j = i + 1; j < arr2.length; j++)
                if (arr2[i] + arr2[j] == sum)
                    count++;
        return count;
    }

}
