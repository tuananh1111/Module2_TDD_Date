public class NextDayCalculator {
    public static int nextDay(int day, int month, int year) {
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day==31)
                     return 1;

            case 4:
            case 6:
            case 9:
            case 11:
                if (day==30) return 1;
                break;
            case 2:
                if (month2(day,month,year)){
                    if (day==29){
                         return 1;
                    }
                }else if (day==28)
                    return 1;

        }
        return day+1;
    }

    public static int nextMonth(int day,int month, int year) {
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day==31)
                     month+=1;
                break;
            case 12:
                if (day==31)
                    month=1;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day==30)
                    month=month+1;
                break;

            case 2:
                if (month2(day,month,year)){
                    if (day==29){
                         month+=1;
                         break;
                    }
                }else if (day==28)
                    month+=1;
                return month;
        }
        return month;
    }
    public static boolean month2(int day,int month, int year){
            boolean isleapYear4 = year % 4 == 0;
            if (isleapYear4) {
                boolean isLeapYear100 = year % 100 == 0;
                if (isLeapYear100) {
                    boolean isLeapYear400 = year % 400 == 0;
                    if (isLeapYear400) {
                        return true;
                    }
                }
                return true;
            }
            return false;

    }
    public static int nextYear(int day, int month, int year){
        if (day==31){
            if (month==12){
                    year+=1;
            }
        }return year;
    }

}
