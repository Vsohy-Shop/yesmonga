package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kotlin.C11079d2;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.C13015f;
import retrofit2.http.C13044w;

/* renamed from: retrofit2.a */
public final class C12975a extends C13015f.C13016a {

    /* renamed from: a */
    public boolean f31977a = true;

    /* renamed from: retrofit2.a$a */
    public static final class C12976a implements C13015f<ResponseBody, ResponseBody> {

        /* renamed from: a */
        public static final C12976a f31978a = new C12976a();

        /* renamed from: a */
        public ResponseBody convert(ResponseBody responseBody) throws IOException {
            try {
                return C12984b0.m56283a(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    /* renamed from: retrofit2.a$b */
    public static final class C12977b implements C13015f<RequestBody, RequestBody> {

        /* renamed from: a */
        public static final C12977b f31979a = new C12977b();

        /* renamed from: a */
        public RequestBody convert(RequestBody requestBody) {
            return requestBody;
        }
    }

    /* renamed from: retrofit2.a$c */
    public static final class C12978c implements C13015f<ResponseBody, ResponseBody> {

        /* renamed from: a */
        public static final C12978c f31980a = new C12978c();

        /* renamed from: a */
        public ResponseBody convert(ResponseBody responseBody) {
            return responseBody;
        }
    }

    /* renamed from: retrofit2.a$d */
    public static final class C12979d implements C13015f<Object, String> {

        /* renamed from: a */
        public static final C12979d f31981a = new C12979d();

        /* renamed from: a */
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: retrofit2.a$e */
    public static final class C12980e implements C13015f<ResponseBody, C11079d2> {

        /* renamed from: a */
        public static final C12980e f31982a = new C12980e();

        /* renamed from: a */
        public C11079d2 convert(ResponseBody responseBody) {
            responseBody.close();
            return C11079d2.f28267a;
        }
    }

    /* renamed from: retrofit2.a$f */
    public static final class C12981f implements C13015f<ResponseBody, Void> {

        /* renamed from: a */
        public static final C12981f f31983a = new C12981f();

        /* renamed from: a */
        public Void convert(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    @Nullable
    /* renamed from: c */
    public C13015f<?, RequestBody> mo30440c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C13092x xVar) {
        if (RequestBody.class.isAssignableFrom(C12984b0.m56290h(type))) {
            return C12977b.f31979a;
        }
        return null;
    }

    @Nullable
    /* renamed from: d */
    public C13015f<ResponseBody, ?> mo30441d(Type type, Annotation[] annotationArr, C13092x xVar) {
        if (type == ResponseBody.class) {
            if (C12984b0.m56294l(annotationArr, C13044w.class)) {
                return C12978c.f31980a;
            }
            return C12976a.f31978a;
        } else if (type == Void.class) {
            return C12981f.f31983a;
        } else {
            if (!this.f31977a || type != C11079d2.class) {
                return null;
            }
            try {
                return C12980e.f31982a;
            } catch (NoClassDefFoundError unused) {
                this.f31977a = false;
                return null;
            }
        }
    }
}
