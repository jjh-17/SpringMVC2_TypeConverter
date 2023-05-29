package SpringMVC2.TypeConverter.converter;

import SpringMVC2.TypeConverter.type.IpPort;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.core.convert.support.DefaultConversionService;

public class ConversionServiceTest {

    @Test
    public void conversionServiceTest() throws Exception {
        //given
        DefaultConversionService defaultConversionService = new DefaultConversionService();
        defaultConversionService.addConverter(new StringToIntegerConverter());
        defaultConversionService.addConverter(new IntegerToStringConverter());
        defaultConversionService.addConverter(new StringToIpPortConverter());
        defaultConversionService.addConverter(new IpPortToStringConverter());

        //when
        Integer result1 = defaultConversionService.convert("10", Integer.class);
        String result2 = defaultConversionService.convert(10, String.class);
        IpPort result3 = defaultConversionService.convert("127.0.0.1:8080", IpPort.class);
        String result4 = defaultConversionService.convert(new IpPort("127.0.0.1", 8080), String.class);

        //then
        Assertions.assertThat(result1).isEqualTo(10);
        Assertions.assertThat(result2).isEqualTo("10");
        Assertions.assertThat(result3).isEqualTo(new IpPort("127.0.0.1", 8080));
        Assertions.assertThat(result4).isEqualTo("127.0.0.1:8080");

    }
}
