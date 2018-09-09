package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] tab = {1,2,3,9,8,6,5,7};
	boolean swapped;
	int counter = 0;
	do {
	    swapped = false;
        for (int i=1; i <tab.length; ++i){
            if (tab[i-1] > tab[i]) {
                int temp = tab[i - 1];
                tab[i - 1] = tab[i];
                tab[i] = temp;
                counter++;
                swapped = true;
            }
        }
	}
    while (swapped);
    System.out.println(Arrays.toString(tab)+ " nr prob "+ counter);
    }
}
