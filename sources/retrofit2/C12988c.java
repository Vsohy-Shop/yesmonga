package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* renamed from: retrofit2.c */
public interface C12988c<R, T> {

    /* renamed from: retrofit2.c$a */
    public static abstract class C12989a {
        /* renamed from: b */
        public static Type m56305b(int i, ParameterizedType parameterizedType) {
            return C12984b0.m56289g(i, parameterizedType);
        }

        /* renamed from: c */
        public static Class<?> m56306c(Type type) {
            return C12984b0.m56290h(type);
        }

        @Nullable
        /* renamed from: a */
        public abstract C12988c<?, ?> mo30478a(Type type, Annotation[] annotationArr, C13092x xVar);
    }

    /* renamed from: a */
    Type mo30476a();

    /* renamed from: b */
    T mo30477b(C12983b<R> bVar);
}
