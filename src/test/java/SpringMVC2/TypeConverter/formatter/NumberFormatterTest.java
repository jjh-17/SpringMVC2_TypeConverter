package SpringMVC2.TypeConverter.formatter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Locale;

class NumberFormatterTest {

    NumberFormatter formatter = new NumberFormatter();


    @Test
    public void parse() throws Exception {
        //given
        Number result = formatter.parse("1,000", Locale.KOREA);

        //then
        Assertions.assertThat(result).isEqualTo(1000L);
    }

    @Test
    public void print() throws Exception {
        //given
        String result = formatter.print(1000, Locale.KOREA);

        //then
        Assertions.assertThat(result).isEqualTo("1,000");
    }
}