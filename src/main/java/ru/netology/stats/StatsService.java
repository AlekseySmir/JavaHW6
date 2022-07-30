package ru.netology.stats;

import java.util.Arrays;

public class StatsService {


    public int SumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int average = 0;
        if (sales.length > 0) {
            int sum = 0;
            for (int i = 0; i < sales.length; i++) {
                sum += sales[i];
            }
            average = sum / sales.length;
        }
        return average;
    }

    public int maxMonthSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minMonthSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lessThanAverage(int[] sales) {

        int LessAver = 0;
        int average = averageSales(sales);
        for (int sale : sales){
            if (sale < average){
                LessAver = LessAver + 1;
            }

        }
        return LessAver;
    }
    public int moreThanAverage(int[] sales) {

        int moreAver = 0;
        int average = averageSales(sales);
        for (int sale : sales) {
            if (sale > average) {
                moreAver = moreAver + 1;
            }

        }
        return moreAver;

    }
}
