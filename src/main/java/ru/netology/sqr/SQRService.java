package ru.netology.sqr;

public class SQRService {
    public int sqrOfNumbersRange(int lower, int upper) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lower && i * i <= upper) {
                count = count;
                count++;
            }
        }
        return count;
    }
}




