package com.codegym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class NextDayCalculatorTest {

    @org.junit.jupiter.api.Test
    void testnextDay1() {
        int day =1;
        int month =1;
        int year = 2018;
        String expected = "2/1/2018";
        String result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void testnextDay2() {
        int day =31;
        int month =1;
        int year = 2018;
        String expected = "1/2/2018";
        String result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void testnextDay3() {
        int day =30;
        int month =4;
        int year = 2018;
        String expected = "1/5/2018";
        String result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void testnextDay5() {
        int day =28;
        int month =2;
        int year = 2018;
        String expected = "1/3/2018";
        String result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void testnextDay6() {
        int day =29;
        int month =2;
        int year = 2020;
        String expected = "1/3/2020";
        String result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void testnextDay7() {
        int day =31;
        int month =12;
        int year = 2018;
        String expected = "1/1/2019";
        String result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void testnextDay8() {
        int day =31;
        int month =1;
        int year = 2018;
        String expected = "1/2/2018";
        String result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void testnextDay9() {
        int day =28;
        int month =2;
        int year = 2018;
        String expected = "1/3/2018";
        String result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void testnextDay10() {
        int day =31;
        int month =3;
        int year = 2018;
        String expected = "1/4/2018";
        String result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void testnextDay11() {
        int day =30;
        int month =4;
        int year = 2018;
        String expected = "1/5/2018";
        String result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void testnextDay12() {
        int day =31;
        int month =5;
        int year = 2018;
        String expected = "1/6/2018";
        String result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void testnextDay13() {
        int day =30;
        int month =6;
        int year = 2018;
        String expected = "1/7/2018";
        String result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }    @Test
    void testnextDay14() {
        int day =30;
        int month =7;
        int year = 2018;
        String expected = "1/8/2018";
        String result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void testnextDay15() {
        int day =31;
        int month =8;
        int year = 2018;
        String expected = "1/9/2018";
        String result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void testnextDay16() {
        int day =30;
        int month =9;
        int year = 2018;
        String expected = "1/10/2018";
        String result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void testnextDay17() {
        int day =30;
        int month =10;
        int year = 2018;
        String expected = "1/11/2018";
        String result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void testnextDay18() {
        int day =30;
        int month =11;
        int year = 2018;
        String expected = "1/12/2018";
        String result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void testnextDay19() {
        int day =31;
        int month =12;
        int year = 2018;
        String expected = "1/1/2019";
        String result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }

}