package SpringMVC2.TypeConverter.formatter;

import SpringMVC2.TypeConverter.converter.IpPortToStringConverter;
import SpringMVC2.TypeConverter.converter.StringToIpPortConverter;
import SpringMVC2.TypeConverter.type.IpPort;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.format.support.DefaultFormattingConversionService;

public class FormattingConversionServiceTest {

    @Test
    public void formattingConversionServiceTest() throws Exception {
        //given
        DefaultFormattingConversionService defaultFormattingConversionService
                = new DefaultFormattingConversionService();

        //when
        //컨버터 등록
        defaultFormattingConversionService.addConverter(new StringToIpPortConverter());
        defaultFormattingConversionService.addConverter(new IpPortToStringConverter());

        //포멧터 등록 ==> DefaultFormattingConversionService는 ConversionService 상속
        defaultFormattingConversionService.addFormatter(new NumberFormatter());

        IpPort convertResult = defaultFormattingConversionService
                .convert("127.0.0.1:8080", IpPort.class);
        String formatterResult = defaultFormattingConversionService
                .convert(1000, String.class);

        //then
        Assertions.assertThat(convertResult).isEqualTo(new IpPort("127.0.0.1", 8080));
        Assertions.assertThat(formatterResult).isEqualTo("1,000");
    }
}
