package SpringMVC2.TypeConverter.controller;

import SpringMVC2.TypeConverter.type.IpPort;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


//뷰 템플릿에 컨버터 적용 ==> 객체를 문자로 변환
@Controller
public class ConverterController {

    @Data
    @AllArgsConstructor
    static class Form {
        private IpPort ipPort;
    }

    @GetMapping("/converter-view")
    public String converterView(Model model) {
        model.addAttribute("number", 10000);
        model.addAttribute("ipPort", new IpPort("127.0.0.1", 8080));

        return "converter-view";
    }

    @GetMapping("/converter/edit")
    public String converterForm(Model model) {
        IpPort ipPort = new IpPort("127.0.0.1", 8080);
        Form form = new Form(ipPort);

        model.addAttribute("form", form);
        return "converter-form";
    }


    /*
    1. 사용자가 문자로 ipPort 입력 후 제출
    2. @ModelAttribute가 StringToIpPortConverter 수행
     */
    @PostMapping("/converter/edit")
    public String converterEdit(@ModelAttribute Form form, Model model) {
        IpPort ipPort = form.getIpPort();
        model.addAttribute("ipPort", ipPort);
        return "converter-view";
    }

}
