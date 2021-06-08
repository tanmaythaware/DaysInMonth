public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){

        if(year <= 1 || year >= 9999){
            return false;
        }
        if(year%4==0 && year%100 != 0){
            return true;
        } else if(year%400 == 0){
            return true;
        } else {
            return false;
        }

    }

    public static int getDaysInMonth (int month, int year){

        if((month > 12 || month < 1)||(year > 9999 || year < 1)){
            return -1;
        }

        int days = 0;

        if(isLeapYear(year) == true){

            switch (month){
                case 1:
                    days = 31;
                    break;
                case 2:
                    days = 29;
                    break;
                case 3:
                    days = 31;
                    break;
                case 4:
                    days = 30;
                    break;
                case 5:
                    days = 31;
                    break;
                case 6:
                    days = 30;
                    break;
                case 7:
                    days = 31;
                    break;
                case 8:
                    days = 31;
                    break;
                case 9:
                    days = 30;
                    break;
                case 10:
                    days = 31;
                    break;
                case 11:
                    days = 30;
                    break;
                case 12:
                    days = 31;
                    break;
            }

        }

        if(isLeapYear(year) == false){

            switch (month){
                case 1:
                    days = 31;
                    break;
                case 2:
                    days = 28;
                    break;
                case 3:
                    days = 31;
                    break;
                case 4:
                    days = 30;
                    break;
                case 5:
                    days = 31;
                    break;
                case 6:
                    days = 30;
                    break;
                case 7:
                    days = 31;
                    break;
                case 8:
                    days = 31;
                    break;
                case 9:
                    days = 30;
                    break;
                case 10:
                    days = 31;
                    break;
                case 11:
                    days = 30;
                    break;
                case 12:
                    days = 31;
                    break;
            }

        }

        return days;

    }

}
