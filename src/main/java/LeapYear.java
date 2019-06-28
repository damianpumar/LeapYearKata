public class LeapYear {

    public boolean isLeapYear(int year) {
        return this.isDivisibleBy(year, 100)
                ? this.isDivisibleBy(year, 400)
                : this.isDivisibleBy(year, 4);
    }

    private boolean isDivisibleBy(int year, int divider) {
        return year % divider == 0;
    }
}
