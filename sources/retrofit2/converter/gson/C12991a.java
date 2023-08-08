package retrofit2.converter.gson;

import com.google.gson.C33614e;
import com.google.gson.reflect.C33707a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.C13015f;
import retrofit2.C13092x;

/* renamed from: retrofit2.converter.gson.a */
public final class C12991a extends C13015f.C13016a {

    /* renamed from: a */
    public final C33614e f31992a;

    public C12991a(C33614e eVar) {
        this.f31992a = eVar;
    }

    /* renamed from: f */
    public static C12991a m56308f() {
        return m56309g(new C33614e());
    }

    /* renamed from: g */
    public static C12991a m56309g(C33614e eVar) {
        if (eVar != null) {
            return new C12991a(eVar);
        }
        throw new NullPointerException("gson == null");
    }

    /* renamed from: c */
    public C13015f<?, RequestBody> mo30440c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C13092x xVar) {
        return new C12992b(this.f31992a, this.f31992a.mo97481p(C33707a.get(type)));
    }

    /* renamed from: d */
    public C13015f<ResponseBody, ?> mo30441d(Type type, Annotation[] annotationArr, C13092x xVar) {
        return new C12993c(this.f31992a, this.f31992a.mo97481p(C33707a.get(type)));
    }
}
