package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void shouldSqrtValueCount() {
            SQRService run = new SQRService();
            int lowLim=200;
            int upLim=300;
            int expected=3;
            int actual = run.SqrtValueCount(lowLim,upLim);
            assertEquals(expected,actual);
        }
    }
