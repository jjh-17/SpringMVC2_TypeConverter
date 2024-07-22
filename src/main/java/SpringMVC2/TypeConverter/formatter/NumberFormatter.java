package SpringMVC2.TypeConverter.formatter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.format.Formatter;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

@Slf4j
public class NumberFormatter implements Formatter<Number> {

    // 문자 => 객체(숫자)
    // NumberFormat을 이용하여 숫자 중간에 쉼표 적용 + Locale로 나라별 숫자 포멧 제공
    @Override
    public Number parse(String text, Locale locale) throws ParseException {
        log.info("text={}, locale={}", text, locale);
        NumberFormat format = NumberFormat.getInstance(locale);
        return format.parse(text);
    }

    // 객체 => 문
    @Override
    public String print(Number object, Locale locale) {
        log.info("object={}, locale={}", object, locale);
        return NumberFormat.getInstance(locale).format(object);
    }
}
