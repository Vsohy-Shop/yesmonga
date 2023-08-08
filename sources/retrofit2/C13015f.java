package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* renamed from: retrofit2.f */
public interface C13015f<F, T> {

    /* renamed from: retrofit2.f$a */
    public static abstract class C13016a {
        /* renamed from: a */
        public static Type m56340a(int i, ParameterizedType parameterizedType) {
            return C12984b0.m56289g(i, parameterizedType);
        }

        /* renamed from: b */
        public static Class<?> m56341b(Type type) {
            return C12984b0.m56290h(type);
        }

        @Nullable
        /* renamed from: c */
        public C13015f<?, RequestBody> mo30440c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C13092x xVar) {
            return null;
        }

        @Nullable
        /* renamed from: d */
        public C13015f<ResponseBody, ?> mo30441d(Type type, Annotation[] annotationArr, C13092x xVar) {
            return null;
        }

        @Nullable
        /* renamed from: e */
        public C13015f<?, String> mo30494e(Type type, Annotation[] annotationArr, C13092x xVar) {
            return null;
        }
    }

    @Nullable
    T convert(F f) throws IOException;
}
