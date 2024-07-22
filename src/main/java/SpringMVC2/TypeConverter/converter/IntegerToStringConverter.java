package SpringMVC2.TypeConverter.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

//Integer --> String Converter
@Slf4j
public class IntegerToStringConverter implements Converter<Integer, String> {

    @Override
    public String convert(Integer s) {
        log.info("convert source={}", s);
        return String.valueOf(s);
    }
}
