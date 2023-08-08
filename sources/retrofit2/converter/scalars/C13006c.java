package retrofit2.converter.scalars;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.C13015f;
import retrofit2.C13092x;
import retrofit2.converter.scalars.C12996b;

/* renamed from: retrofit2.converter.scalars.c */
public final class C13006c extends C13015f.C13016a {
    /* renamed from: f */
    public static C13006c m56324f() {
        return new C13006c();
    }

    @Nullable
    /* renamed from: c */
    public C13015f<?, RequestBody> mo30440c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C13092x xVar) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return C12995a.f31999a;
        }
        return null;
    }

    @Nullable
    /* renamed from: d */
    public C13015f<ResponseBody, ?> mo30441d(Type type, Annotation[] annotationArr, C13092x xVar) {
        if (type == String.class) {
            return C12996b.C13005i.f32009a;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return C12996b.C12997a.f32001a;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return C12996b.C12998b.f32002a;
        }
        if (type == Character.class || type == Character.TYPE) {
            return C12996b.C12999c.f32003a;
        }
        if (type == Double.class || type == Double.TYPE) {
            return C12996b.C13000d.f32004a;
        }
        if (type == Float.class || type == Float.TYPE) {
            return C12996b.C13001e.f32005a;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return C12996b.C13002f.f32006a;
        }
        if (type == Long.class || type == Long.TYPE) {
            return C12996b.C13003g.f32007a;
        }
        if (type == Short.class || type == Short.TYPE) {
            return C12996b.C13004h.f32008a;
        }
        return null;
    }
}
