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
public class WebConfig implements WebMvcConfigurer {

    //컨버터 등록
    @Override
    public void addFormatters(FormatterRegistry registry) {

//        //포메터 사용 시 주석 처리 필요 ==> 기능이 겹칠 시 컨버터가 우선됨
//        registry.addConverter(new StringToIntegerConverter());
//        registry.addConverter(new IntegerToStringConverter());


        registry.addConverter(new StringToIpPortConverter());
        registry.addConverter(new IpPortToStringConverter());

        registry.addFormatter(new NumberFormatter());
    }
}
