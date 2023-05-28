[컨버터 인터페이스]
public interface Converter<S, T> {
    T convert(S s);
}
}

-스프링 제공
-확장 가능