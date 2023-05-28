package SpringMVC2.TypeConverter.converter;

import SpringMVC2.TypeConverter.type.IpPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

//사용자 정의 타입 컨버터: IP, Port를 입력받아 IpPort 객체로 변환
@Slf4j
public class IpPortToStringConverter implements Converter<IpPort, String> {

    @Override
    public String convert(IpPort source) {

        String ip = source.getIp();
        int port = source.getPort();

        return ip + ":" + port;
    }
}
