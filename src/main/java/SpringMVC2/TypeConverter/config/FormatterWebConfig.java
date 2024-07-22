package SpringMVC2.TypeConverter.config;

import SpringMVC2.TypeConverter.converter.IntegerToStringConverter;
import SpringMVC2.TypeConverter.converter.IpPortToStringConverter;
import SpringMVC2.TypeConverter.converter.StringToIntegerConverter;
import SpringMVC2.TypeConverter.converter.StringToIpPortConverter;
import SpringMVC2.TypeConverter.formatter.NumberFormatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class FormatterWebConfig implements WebMvcConfigurer {

    //컨버터 등록
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToIpPortConverter());
        registry.addConverter(new IpPortToStringConverter());
        registry.addFormatter(new NumberFormatter());
    }
}
