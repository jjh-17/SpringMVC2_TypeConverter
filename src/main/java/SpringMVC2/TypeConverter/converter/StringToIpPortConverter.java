package SpringMVC2.TypeConverter.converter;

import SpringMVC2.TypeConverter.type.IpPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

//사용자 정의 타입 컨버터: IP, Port를 입력받아 IpPort 객체로 변환
@Slf4j
public class StringToIpPortConverter implements Converter<String, IpPort> {

    @Override
    public IpPort convert(String s) {
        log.info("convert source={}", s);
        String[] split = s.split(":");

        String ip = split[0];
        int port = Integer.parseInt(split[1]);

        return new IpPort(ip, port);
    }
}
