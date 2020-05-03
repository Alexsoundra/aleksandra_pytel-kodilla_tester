public class LeapYear {

    static void isLeapYear(int year){
        boolean isLeapYear;
        isLeapYear = year % 4 == 0;

        if (isLeapYear)
            System.out.println(year +  " rok przestępny");
        else
            System.out.println(year +  " rok nie przestępny");
    }

    public static void main(String[] args) {
        isLeapYear(1688);
        isLeapYear(2000);
        isLeapYear(2020);
        isLeapYear(1989);
        isLeapYear(3022);
    }
}