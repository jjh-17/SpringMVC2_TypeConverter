package SpringMVC2.TypeConverter.converter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ConverterTest {

    @Test
    public void stringToInteger() throws Exception {
        //given
        StringToIntegerConverter converter = new StringToIntegerConverter();
        Integer result = converter.convert("10");

        //when

        //then
        Assertions.assertThat(result).isEqualTo(10);
    }

    @Test
    public void integerToString() throws Exception {
        //given
        IntegerToStringConverter converter = new IntegerToStringConverter();
        String result = converter.convert(10);

        //when

        //then
        Assertions.assertThat(result).isEqualTo("10");
    }
}