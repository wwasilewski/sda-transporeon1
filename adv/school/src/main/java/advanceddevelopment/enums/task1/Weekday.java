package advanceddevelopment.enums.task1;

public enum Weekday {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekDay() {
        return this != SATURDAY && this != SUNDAY;
    }

    public boolean isHoliday() {
        return this == SATURDAY || this == SUNDAY;
    }

    public void whichIsGreater(Weekday weekday) {
        if (this.ordinal() > weekday.ordinal()) {
            System.out.println("after: " + weekday);
        }
        System.out.println("before: " + weekday);
    }
}
