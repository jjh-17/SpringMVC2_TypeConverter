package SpringMVC2.TypeConverter.type;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode //모든 필드를 사용하여 equals(), hashcode() 생성 ==> IpPort 객체로 a.equals(b) 가능
public class IpPort {

    private final String ip;
    private final int port;

    public IpPort(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }
}
