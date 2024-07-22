package SpringMVC2.TypeConverter.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

//String --> Integer Converter
@Slf4j
public class StringToIntegerConverter implements Converter<String, Integer> {

    @Override
    public Integer convert(String s) {
        log.info("convert source={}", s);
        return Integer.valueOf(s);
    }
}
