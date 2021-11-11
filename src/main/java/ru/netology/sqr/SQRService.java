package ru.netology.sqr;

public class SQRService {
    public int SqrtValueCount(int lowLim, int uplim) {
        int count = 0;
        for (int i = 10; i < 99; i++) {
            if (i * i >= lowLim && i * i <= uplim) {
                count++;
            }
        }
        return count;
    }
}
