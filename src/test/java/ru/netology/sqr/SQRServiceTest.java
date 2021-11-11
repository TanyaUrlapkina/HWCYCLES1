package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void shouldSqrtValueCount() {
            SQRService service = new SQRService();
            int lowLim=200;
            int upLim=300;
            int expected=3;
            int actual = service.SqrtValueCount(lowLim,upLim);
            assertEquals(expected,actual);
        }
    }
