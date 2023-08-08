package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import okhttp3.ResponseBody;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.C13015f;

@IgnoreJRERequirement
/* renamed from: retrofit2.m */
public final class C13059m extends C13015f.C13016a {

    /* renamed from: a */
    public static final C13015f.C13016a f32057a = new C13059m();

    @IgnoreJRERequirement
    /* renamed from: retrofit2.m$a */
    public static final class C13060a<T> implements C13015f<ResponseBody, Optional<T>> {

        /* renamed from: a */
        public final C13015f<ResponseBody, T> f32058a;

        public C13060a(C13015f<ResponseBody, T> fVar) {
            this.f32058a = fVar;
        }

        /* renamed from: a */
        public Optional<T> convert(ResponseBody responseBody) throws IOException {
            return Optional.ofNullable(this.f32058a.convert(responseBody));
        }
    }

    @Nullable
    /* renamed from: d */
    public C13015f<ResponseBody, ?> mo30441d(Type type, Annotation[] annotationArr, C13092x xVar) {
        if (C13015f.C13016a.m56341b(type) != Optional.class) {
            return null;
        }
        return new C13060a(xVar.mo30593n(C13015f.C13016a.m56340a(0, (ParameterizedType) type), annotationArr));
    }
}
