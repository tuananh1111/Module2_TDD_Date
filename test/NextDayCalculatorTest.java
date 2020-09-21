import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    void findNextDay() {
        int day = 1;
        int month = 1;
        int year = 2018;
        int expected = 2;
        int result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(result, expected);
    }
    @Test
    void findNextDay1() {
        int day = 31;
        int month = 1;
        int year = 2018;
        int expectedDay = 1;
        int expectedMonth=2;
        int resultDay = NextDayCalculator.nextDay(day,month,year);
        int resultMonth=NextDayCalculator.nextMonth(day,month,year);
        assertEquals(resultDay, expectedDay);
        assertEquals(resultMonth, expectedMonth);
    }
    @Test
    void findNextDay2() {
        int day = 30;
        int month = 4;
        int year = 2018;
        int expectedDay = 1;
        int expectedMonth=5;
        int resultDay = NextDayCalculator.nextDay(day,month,year);
        int resultMonth=NextDayCalculator.nextMonth(day,month,year);
        assertEquals(resultDay, expectedDay);
        assertEquals(resultMonth, expectedMonth);
    }
    @Test
    void findNextDay3() {
        int day = 28;
        int month = 2;
        int year = 2018;
        int expectedDay = 1;
        int expectedMonth=3;
        int resultDay = NextDayCalculator.nextDay(day,month,year);
        int resultMonth=NextDayCalculator.nextMonth(day,month,year);
        assertEquals(resultDay, expectedDay);
        assertEquals(resultMonth, expectedMonth);
    }
    @Test
    void findNextDay4() {
        int day = 28;
        int month = 2;
        int year = 2018;
        int expectedDay = 1;
        int expectedMonth=3;
        int resultDay = NextDayCalculator.nextDay(day,month,year);
        int resultMonth=NextDayCalculator.nextMonth(day,month,year);
        assertEquals(resultDay, expectedDay);
        assertEquals(resultMonth, expectedMonth);
    }
    @Test
    void findNextDay5() {
        int day = 29;
        int month = 2;
        int year = 2020;
        int expectedDay = 1;
        int expectedMonth=3;
        int resultDay = NextDayCalculator.nextDay(day,month,year);
        int resultMonth=NextDayCalculator.nextMonth(day,month,year);
        assertEquals(resultDay, expectedDay);
        assertEquals(resultMonth, expectedMonth);
    }
    @Test
    void findNextDay6() {
        int day = 31;
        int month = 12;
        int year = 2018;
        int expectedDay = 1;
        int expectedMonth=1;
        int expectedYear=2019;
        int resultDay = NextDayCalculator.nextDay(day,month,year);
        int resultMonth=NextDayCalculator.nextMonth(day,month,year);
        int resultYear= NextDayCalculator.nextYear(day,month,year);
        assertEquals(resultDay, expectedDay);
        assertEquals(resultMonth, expectedMonth);
        assertEquals(resultYear,expectedYear);
    }

}