package SpringMVC2.TypeConverter.config;

import SpringMVC2.TypeConverter.converter.IntegerToStringConverter;
import SpringMVC2.TypeConverter.converter.IpPortToStringConverter;
import SpringMVC2.TypeConverter.converter.StringToIntegerConverter;
import SpringMVC2.TypeConverter.converter.StringToIpPortConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class ConverterWebConfig implements WebMvcConfigurer {

    //컨버터 등록
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToIntegerConverter());
        registry.addConverter(new IntegerToStringConverter());
        registry.addConverter(new StringToIpPortConverter());
        registry.addConverter(new IpPortToStringConverter());
    }
}
