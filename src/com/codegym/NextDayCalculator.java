package com.codegym;

public class NextDayCalculator {
    public static String nextDay(int day, int month, int year) {
        if (day == 30 || day == 31 || day == 29 || day == 28) {
            switch (month) {
                case 10:
                case 7:
                case 8:
                case 5:
                case 3:
                case 1:
                    day = 1;
                    month++;
                    break;
                case 4:
                case 6:
                case 9:
                case 11: {
                    day = 1;
                    month++;
                    break;
                }

                case 12: {
                    day = 1;
                    month = 1;
                    year++;
                    break;
                }
                case 2:
                    if (year % 4 == 0) {
                        if (year % 100 == 0) {
                            if (year % 400 == 0) {
                                day = 1;
                                month++;
                            }
                        } else {
                            day = 1;
                            month++;
                        }
                    } else {
                        day = 1;
                        month++;
                        ;
                    }
            }
        } else {
            day++;
        }
        return "" + day + "/" + month + "/" + year;
    }
}
