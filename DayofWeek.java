import java.time.LocalDate;
class DayofWeek{
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        String name = date.getDayOfWeek().toString(); // "MONDAY"
        return name.charAt(0) + name.substring(1).toLowerCase();

    }
}