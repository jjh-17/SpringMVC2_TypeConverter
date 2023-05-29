[컨버터 인터페이스]
public interface Converter<S, T> {
    T convert(S s);
}
}

-스프링 제공
-확장 가능
-스프링 내부에는 많은 컨버터들이 정의되어 있으며, 사용자가 컨버터를 추가하면 보다 높은 우선순위를 가진다.

[ConversionService 인터페이스]
-개별 컨버터를 모두 묶어 편리하게 사용할 수 있도록 함
-클라이언트는 ConversionService에만 의존하면 되므로, 컨버터 등록/관리에 대하여 몰라도 된다.
    ==> 클라이언트와 서버의 관심사를 나누는 것 - ISP