package SpringMVC2.TypeConverter.converter;

import SpringMVC2.TypeConverter.type.IpPort;
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

    @Test
    public void stringToIpPort() throws Exception {
        //given
        IpPort ipPort = new IpPort("127.0.0.1", 8080);

        StringToIpPortConverter converter = new StringToIpPortConverter();
        IpPort result = converter.convert("127.0.0.1:8080");

        //when

        //then
        Assertions.assertThat(result).isEqualTo(ipPort);
    }

    @Test
    public void IpPortToString() throws Exception {
        //given
        IpPort ipPort = new IpPort("127.0.0.1", 8080);

        IpPortToStringConverter converter = new IpPortToStringConverter();
        String result = converter.convert(ipPort);

        //when

        //then
        Assertions.assertThat(result).isEqualTo("127.0.0.1:8080");

    }
}