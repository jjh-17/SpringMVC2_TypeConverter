package SpringMVC2.TypeConverter.controller;

import SpringMVC2.TypeConverter.type.IpPort;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
타입 컨버터 간단 예제 컨트롤러
 */
@RestController
@Slf4j
public class SimpleConverterController {

    //문자를 숫자로 변환
    @GetMapping("/convert-v1")
    public String convertV1(HttpServletRequest request) {
        String data = request.getParameter("data"); //문자 타입 조회
        Integer intData = Integer.valueOf(data);       //타입 변경
        log.info("intData = {}", intData);
        return "ok";
    }

    //@RequestParam을 이용하여 문자를 숫자로 간편히 받기
    @GetMapping("/convert-v2")
    public String convertV2(@RequestParam Integer data) {
        log.info("data = {}", data);
        return "ok";
    }

    //IpPort
    @GetMapping("/ip-port")
    public String ipPort(@RequestParam IpPort ipPort) {
        log.info("IP = {} / PORT = {}", ipPort.getIp(), ipPort.getPort());
        return "ok";
    }
}
