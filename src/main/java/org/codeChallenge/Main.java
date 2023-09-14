package org.codeChallenge;

import java.util.Arrays;
import java.util.*;
public class Main {

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

    // Driver Code
    public static void main(String[] arg)
    {

        int sumOfPair=1;
        Integer arr[] = {3, 4, 5, 6};
        System.out.println(printNumOfPairs(arr,sumOfPair));

        sumOfPair =  15;
        Integer arr1[] = {0, 15, 32, 2000, 15000};
        System.out.println(printNumOfPairs(arr1,sumOfPair));

        sumOfPair =  42;
        Integer[] arr2 = {1, 1, 10, 32, 41};

        System.out.println(printNumOfPairs(arr2,sumOfPair));
    }

    }
