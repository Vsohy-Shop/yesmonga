package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kotlin.coroutines.C11045c;
import okhttp3.C12451Response;
import okhttp3.Call;
import okhttp3.ResponseBody;
import retrofit2.C12984b0;

/* renamed from: retrofit2.j */
public abstract class C13049j<ResponseT, ReturnT> extends C13095y<ReturnT> {

    /* renamed from: a */
    public final C13089v f32032a;

    /* renamed from: b */
    public final Call.Factory f32033b;

    /* renamed from: c */
    public final C13015f<ResponseBody, ResponseT> f32034c;

    /* renamed from: retrofit2.j$a */
    public static final class C13050a<ResponseT, ReturnT> extends C13049j<ResponseT, ReturnT> {

        /* renamed from: d */
        public final C12988c<ResponseT, ReturnT> f32035d;

        public C13050a(C13089v vVar, Call.Factory factory, C13015f<ResponseBody, ResponseT> fVar, C12988c<ResponseT, ReturnT> cVar) {
            super(vVar, factory, fVar);
            this.f32035d = cVar;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [retrofit2.b, retrofit2.b<ResponseT>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ReturnT mo30523c(retrofit2.C12983b<ResponseT> r1, java.lang.Object[] r2) {
            /*
                r0 = this;
                retrofit2.c<ResponseT, ReturnT> r2 = r0.f32035d
                java.lang.Object r1 = r2.mo30477b(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: retrofit2.C13049j.C13050a.mo30523c(retrofit2.b, java.lang.Object[]):java.lang.Object");
        }
    }

    /* renamed from: retrofit2.j$b */
    public static final class C13051b<ResponseT> extends C13049j<ResponseT, Object> {

        /* renamed from: d */
        public final C12988c<ResponseT, C12983b<ResponseT>> f32036d;

        /* renamed from: e */
        public final boolean f32037e;

        public C13051b(C13089v vVar, Call.Factory factory, C13015f<ResponseBody, ResponseT> fVar, C12988c<ResponseT, C12983b<ResponseT>> cVar, boolean z) {
            super(vVar, factory, fVar);
            this.f32036d = cVar;
            this.f32037e = z;
        }

        /* renamed from: c */
        public Object mo30523c(C12983b<ResponseT> bVar, Object[] objArr) {
            C12983b bVar2 = (C12983b) this.f32036d.mo30477b(bVar);
            C11045c cVar = objArr[objArr.length - 1];
            try {
                if (this.f32037e) {
                    return KotlinExtensions.m56263b(bVar2, cVar);
                }
                return KotlinExtensions.m56262a(bVar2, cVar);
            } catch (Exception e) {
                return KotlinExtensions.m56266e(e, cVar);
            }
        }
    }

    /* renamed from: retrofit2.j$c */
    public static final class C13052c<ResponseT> extends C13049j<ResponseT, Object> {

        /* renamed from: d */
        public final C12988c<ResponseT, C12983b<ResponseT>> f32038d;

        public C13052c(C13089v vVar, Call.Factory factory, C13015f<ResponseBody, ResponseT> fVar, C12988c<ResponseT, C12983b<ResponseT>> cVar) {
            super(vVar, factory, fVar);
            this.f32038d = cVar;
        }

        /* renamed from: c */
        public Object mo30523c(C12983b<ResponseT> bVar, Object[] objArr) {
            C12983b bVar2 = (C12983b) this.f32038d.mo30477b(bVar);
            C11045c cVar = objArr[objArr.length - 1];
            try {
                return KotlinExtensions.m56264c(bVar2, cVar);
            } catch (Exception e) {
                return KotlinExtensions.m56266e(e, cVar);
            }
        }
    }

    public C13049j(C13089v vVar, Call.Factory factory, C13015f<ResponseBody, ResponseT> fVar) {
        this.f32032a = vVar;
        this.f32033b = factory;
        this.f32034c = fVar;
    }

    /* renamed from: d */
    public static <ResponseT, ReturnT> C12988c<ResponseT, ReturnT> m56356d(C13092x xVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return xVar.mo30581b(type, annotationArr);
        } catch (RuntimeException e) {
            throw C12984b0.m56296n(method, e, "Unable to create call adapter for %s", type);
        }
    }

    /* renamed from: e */
    public static <ResponseT> C13015f<ResponseBody, ResponseT> m56357e(C13092x xVar, Method method, Type type) {
        try {
            return xVar.mo30593n(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw C12984b0.m56296n(method, e, "Unable to create converter for %s", type);
        }
    }

    /* renamed from: f */
    public static <ResponseT, ReturnT> C13049j<ResponseT, ReturnT> m56358f(C13092x xVar, Method method, C13089v vVar) {
        Type type;
        boolean z;
        boolean z2 = vVar.f32134k;
        Annotation[] annotations = method.getAnnotations();
        Class<C13091w> cls = C13091w.class;
        if (z2) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type f = C12984b0.m56288f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (C12984b0.m56290h(f) != cls || !(f instanceof ParameterizedType)) {
                z = false;
            } else {
                f = C12984b0.m56289g(0, (ParameterizedType) f);
                z = true;
            }
            type = new C12984b0.C12986b((Type) null, C12983b.class, f);
            annotations = C12982a0.m56281a(annotations);
        } else {
            type = method.getGenericReturnType();
            z = false;
        }
        C12988c d = m56356d(xVar, method, type, annotations);
        Type a = d.mo30476a();
        if (a == C12451Response.class) {
            throw C12984b0.m56295m(method, "'" + C12984b0.m56290h(a).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        } else if (a == cls) {
            throw C12984b0.m56295m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        } else if (!vVar.f32126c.equals("HEAD") || Void.class.equals(a)) {
            C13015f e = m56357e(xVar, method, a);
            Call.Factory factory = xVar.f32165b;
            if (!z2) {
                return new C13050a(vVar, factory, e, d);
            }
            if (z) {
                return new C13052c(vVar, factory, e, d);
            }
            return new C13051b(vVar, factory, e, d, false);
        } else {
            throw C12984b0.m56295m(method, "HEAD method must use Void as response type.", new Object[0]);
        }
    }

    @Nullable
    /* renamed from: a */
    public final ReturnT mo30522a(Object[] objArr) {
        return mo30523c(new C13054l(this.f32032a, objArr, this.f32033b, this.f32034c), objArr);
    }

    @Nullable
    /* renamed from: c */
    public abstract ReturnT mo30523c(C12983b<ResponseT> bVar, Object[] objArr);
}
