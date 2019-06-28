import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeapYearShould {

    @Test
    public void be_Not_LeapYear_When_Year_Is_Not_Divisible_By_Four() {
        LeapYear leapYear = new LeapYear();

        assertThat(leapYear.isLeapYear(1997)).isFalse();
    }

    @Test
    public void be_LeapYear_When_Year_Is_Divisible_By_Four() {
        LeapYear leapYear = new LeapYear();

        assertThat(leapYear.isLeapYear(1996)).isTrue();
    }

    @Test
    public void be_LeapYear_When_Yeas_Is_Divisible_By_400() {
        LeapYear leapYear = new LeapYear();

        assertThat(leapYear.isLeapYear(1600)).isTrue();
    }

    @Test
    public void is_Not_A_LeapYear_When_Year_Is_Divisible_By_4_And_100_But_Not_Divisible_By_400() {
        LeapYear leapYear = new LeapYear();

        assertThat(leapYear.isLeapYear(1800)).isFalse();
    }
}
