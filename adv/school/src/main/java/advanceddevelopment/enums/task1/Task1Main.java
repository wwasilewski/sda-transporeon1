package advanceddevelopment.enums.task1;

public class Task1Main {

    public static void main(String[] args) {

        System.out.println("Monday weekday?: " + Weekday.MONDAY.isWeekDay());
        System.out.println("Friday weekday?: " + Weekday.FRIDAY.isWeekDay());
        System.out.println("Sunday holiday?: " + Weekday.SUNDAY.isHoliday());

    }
}
