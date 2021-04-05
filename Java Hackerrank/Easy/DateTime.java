import java.time.LocalDate;
class Result {


    public static String findDay(int month, int day, int year) {
        
        LocalDate dt = LocalDate.of(year,month,day); //taking input of year,month and day from user and returning the name of the day
        return ""+dt.getDayOfWeek();

    }

}