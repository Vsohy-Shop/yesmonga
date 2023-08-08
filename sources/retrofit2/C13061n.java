package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* renamed from: retrofit2.n */
public abstract class C13061n<T> {

    /* renamed from: retrofit2.n$a */
    public class C13062a extends C13061n<Iterable<T>> {
        public C13062a() {
        }

        /* renamed from: d */
        public void mo30534a(C13087u uVar, @Nullable Iterable<T> iterable) throws IOException {
            if (iterable != null) {
                for (T a : iterable) {
                    C13061n.this.mo30534a(uVar, a);
                }
            }
        }
    }

    /* renamed from: retrofit2.n$b */
    public class C13063b extends C13061n<Object> {
        public C13063b() {
        }

        /* renamed from: a */
        public void mo30534a(C13087u uVar, @Nullable Object obj) throws IOException {
            if (obj != null) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    C13061n.this.mo30534a(uVar, Array.get(obj, i));
                }
            }
        }
    }

    /* renamed from: retrofit2.n$c */
    public static final class C13064c<T> extends C13061n<T> {

        /* renamed from: a */
        public final Method f32061a;

        /* renamed from: b */
        public final int f32062b;

        /* renamed from: c */
        public final C13015f<T, RequestBody> f32063c;

        public C13064c(Method method, int i, C13015f<T, RequestBody> fVar) {
            this.f32061a = method;
            this.f32062b = i;
            this.f32063c = fVar;
        }

        /* renamed from: a */
        public void mo30534a(C13087u uVar, @Nullable T t) {
            if (t != null) {
                try {
                    uVar.mo30561l(this.f32063c.convert(t));
                } catch (IOException e) {
                    Method method = this.f32061a;
                    int i = this.f32062b;
                    throw C12984b0.m56298p(method, e, i, "Unable to convert " + t + " to RequestBody", new Object[0]);
                }
            } else {
                throw C12984b0.m56297o(this.f32061a, this.f32062b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    /* renamed from: retrofit2.n$d */
    public static final class C13065d<T> extends C13061n<T> {

        /* renamed from: a */
        public final String f32064a;

        /* renamed from: b */
        public final C13015f<T, String> f32065b;

        /* renamed from: c */
        public final boolean f32066c;

        public C13065d(String str, C13015f<T, String> fVar, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f32064a = str;
            this.f32065b = fVar;
            this.f32066c = z;
        }

        /* renamed from: a */
        public void mo30534a(C13087u uVar, @Nullable T t) throws IOException {
            String convert;
            if (t != null && (convert = this.f32065b.convert(t)) != null) {
                uVar.mo30552a(this.f32064a, convert, this.f32066c);
            }
        }
    }

    /* renamed from: retrofit2.n$e */
    public static final class C13066e<T> extends C13061n<Map<String, T>> {

        /* renamed from: a */
        public final Method f32067a;

        /* renamed from: b */
        public final int f32068b;

        /* renamed from: c */
        public final C13015f<T, String> f32069c;

        /* renamed from: d */
        public final boolean f32070d;

        public C13066e(Method method, int i, C13015f<T, String> fVar, boolean z) {
            this.f32067a = method;
            this.f32068b = i;
            this.f32069c = fVar;
            this.f32070d = z;
        }

        /* renamed from: d */
        public void mo30534a(C13087u uVar, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String convert = this.f32069c.convert(value);
                            if (convert != null) {
                                uVar.mo30552a(str, convert, this.f32070d);
                            } else {
                                Method method = this.f32067a;
                                int i = this.f32068b;
                                throw C12984b0.m56297o(method, i, "Field map value '" + value + "' converted to null by " + this.f32069c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f32067a;
                            int i2 = this.f32068b;
                            throw C12984b0.m56297o(method2, i2, "Field map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C12984b0.m56297o(this.f32067a, this.f32068b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C12984b0.m56297o(this.f32067a, this.f32068b, "Field map was null.", new Object[0]);
        }
    }

    /* renamed from: retrofit2.n$f */
    public static final class C13067f<T> extends C13061n<T> {

        /* renamed from: a */
        public final String f32071a;

        /* renamed from: b */
        public final C13015f<T, String> f32072b;

        public C13067f(String str, C13015f<T, String> fVar) {
            Objects.requireNonNull(str, "name == null");
            this.f32071a = str;
            this.f32072b = fVar;
        }

        /* renamed from: a */
        public void mo30534a(C13087u uVar, @Nullable T t) throws IOException {
            String convert;
            if (t != null && (convert = this.f32072b.convert(t)) != null) {
                uVar.mo30553b(this.f32071a, convert);
            }
        }
    }

    /* renamed from: retrofit2.n$g */
    public static final class C13068g<T> extends C13061n<Map<String, T>> {

        /* renamed from: a */
        public final Method f32073a;

        /* renamed from: b */
        public final int f32074b;

        /* renamed from: c */
        public final C13015f<T, String> f32075c;

        public C13068g(Method method, int i, C13015f<T, String> fVar) {
            this.f32073a = method;
            this.f32074b = i;
            this.f32075c = fVar;
        }

        /* renamed from: d */
        public void mo30534a(C13087u uVar, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            uVar.mo30553b(str, this.f32075c.convert(value));
                        } else {
                            Method method = this.f32073a;
                            int i = this.f32074b;
                            throw C12984b0.m56297o(method, i, "Header map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C12984b0.m56297o(this.f32073a, this.f32074b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C12984b0.m56297o(this.f32073a, this.f32074b, "Header map was null.", new Object[0]);
        }
    }

    /* renamed from: retrofit2.n$h */
    public static final class C13069h extends C13061n<Headers> {

        /* renamed from: a */
        public final Method f32076a;

        /* renamed from: b */
        public final int f32077b;

        public C13069h(Method method, int i) {
            this.f32076a = method;
            this.f32077b = i;
        }

        /* renamed from: d */
        public void mo30534a(C13087u uVar, @Nullable Headers headers) {
            if (headers != null) {
                uVar.mo30554c(headers);
                return;
            }
            throw C12984b0.m56297o(this.f32076a, this.f32077b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* renamed from: retrofit2.n$i */
    public static final class C13070i<T> extends C13061n<T> {

        /* renamed from: a */
        public final Method f32078a;

        /* renamed from: b */
        public final int f32079b;

        /* renamed from: c */
        public final Headers f32080c;

        /* renamed from: d */
        public final C13015f<T, RequestBody> f32081d;

        public C13070i(Method method, int i, Headers headers, C13015f<T, RequestBody> fVar) {
            this.f32078a = method;
            this.f32079b = i;
            this.f32080c = headers;
            this.f32081d = fVar;
        }

        /* renamed from: a */
        public void mo30534a(C13087u uVar, @Nullable T t) {
            if (t != null) {
                try {
                    uVar.mo30555d(this.f32080c, this.f32081d.convert(t));
                } catch (IOException e) {
                    Method method = this.f32078a;
                    int i = this.f32079b;
                    throw C12984b0.m56297o(method, i, "Unable to convert " + t + " to RequestBody", e);
                }
            }
        }
    }

    /* renamed from: retrofit2.n$j */
    public static final class C13071j<T> extends C13061n<Map<String, T>> {

        /* renamed from: a */
        public final Method f32082a;

        /* renamed from: b */
        public final int f32083b;

        /* renamed from: c */
        public final C13015f<T, RequestBody> f32084c;

        /* renamed from: d */
        public final String f32085d;

        public C13071j(Method method, int i, C13015f<T, RequestBody> fVar, String str) {
            this.f32082a = method;
            this.f32083b = i;
            this.f32084c = fVar;
            this.f32085d = str;
        }

        /* renamed from: d */
        public void mo30534a(C13087u uVar, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            uVar.mo30555d(Headers.m50347of("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f32085d), this.f32084c.convert(value));
                        } else {
                            Method method = this.f32082a;
                            int i = this.f32083b;
                            throw C12984b0.m56297o(method, i, "Part map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C12984b0.m56297o(this.f32082a, this.f32083b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C12984b0.m56297o(this.f32082a, this.f32083b, "Part map was null.", new Object[0]);
        }
    }

    /* renamed from: retrofit2.n$k */
    public static final class C13072k<T> extends C13061n<T> {

        /* renamed from: a */
        public final Method f32086a;

        /* renamed from: b */
        public final int f32087b;

        /* renamed from: c */
        public final String f32088c;

        /* renamed from: d */
        public final C13015f<T, String> f32089d;

        /* renamed from: e */
        public final boolean f32090e;

        public C13072k(Method method, int i, String str, C13015f<T, String> fVar, boolean z) {
            this.f32086a = method;
            this.f32087b = i;
            Objects.requireNonNull(str, "name == null");
            this.f32088c = str;
            this.f32089d = fVar;
            this.f32090e = z;
        }

        /* renamed from: a */
        public void mo30534a(C13087u uVar, @Nullable T t) throws IOException {
            if (t != null) {
                uVar.mo30557f(this.f32088c, this.f32089d.convert(t), this.f32090e);
                return;
            }
            Method method = this.f32086a;
            int i = this.f32087b;
            throw C12984b0.m56297o(method, i, "Path parameter \"" + this.f32088c + "\" value must not be null.", new Object[0]);
        }
    }

    /* renamed from: retrofit2.n$l */
    public static final class C13073l<T> extends C13061n<T> {

        /* renamed from: a */
        public final String f32091a;

        /* renamed from: b */
        public final C13015f<T, String> f32092b;

        /* renamed from: c */
        public final boolean f32093c;

        public C13073l(String str, C13015f<T, String> fVar, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f32091a = str;
            this.f32092b = fVar;
            this.f32093c = z;
        }

        /* renamed from: a */
        public void mo30534a(C13087u uVar, @Nullable T t) throws IOException {
            String convert;
            if (t != null && (convert = this.f32092b.convert(t)) != null) {
                uVar.mo30558g(this.f32091a, convert, this.f32093c);
            }
        }
    }

    /* renamed from: retrofit2.n$m */
    public static final class C13074m<T> extends C13061n<Map<String, T>> {

        /* renamed from: a */
        public final Method f32094a;

        /* renamed from: b */
        public final int f32095b;

        /* renamed from: c */
        public final C13015f<T, String> f32096c;

        /* renamed from: d */
        public final boolean f32097d;

        public C13074m(Method method, int i, C13015f<T, String> fVar, boolean z) {
            this.f32094a = method;
            this.f32095b = i;
            this.f32096c = fVar;
            this.f32097d = z;
        }

        /* renamed from: d */
        public void mo30534a(C13087u uVar, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String convert = this.f32096c.convert(value);
                            if (convert != null) {
                                uVar.mo30558g(str, convert, this.f32097d);
                            } else {
                                Method method = this.f32094a;
                                int i = this.f32095b;
                                throw C12984b0.m56297o(method, i, "Query map value '" + value + "' converted to null by " + this.f32096c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f32094a;
                            int i2 = this.f32095b;
                            throw C12984b0.m56297o(method2, i2, "Query map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C12984b0.m56297o(this.f32094a, this.f32095b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C12984b0.m56297o(this.f32094a, this.f32095b, "Query map was null", new Object[0]);
        }
    }

    /* renamed from: retrofit2.n$n */
    public static final class C13075n<T> extends C13061n<T> {

        /* renamed from: a */
        public final C13015f<T, String> f32098a;

        /* renamed from: b */
        public final boolean f32099b;

        public C13075n(C13015f<T, String> fVar, boolean z) {
            this.f32098a = fVar;
            this.f32099b = z;
        }

        /* renamed from: a */
        public void mo30534a(C13087u uVar, @Nullable T t) throws IOException {
            if (t != null) {
                uVar.mo30558g(this.f32098a.convert(t), (String) null, this.f32099b);
            }
        }
    }

    /* renamed from: retrofit2.n$o */
    public static final class C13076o extends C13061n<MultipartBody.Part> {

        /* renamed from: a */
        public static final C13076o f32100a = new C13076o();

        /* renamed from: d */
        public void mo30534a(C13087u uVar, @Nullable MultipartBody.Part part) {
            if (part != null) {
                uVar.mo30556e(part);
            }
        }
    }

    /* renamed from: retrofit2.n$p */
    public static final class C13077p extends C13061n<Object> {

        /* renamed from: a */
        public final Method f32101a;

        /* renamed from: b */
        public final int f32102b;

        public C13077p(Method method, int i) {
            this.f32101a = method;
            this.f32102b = i;
        }

        /* renamed from: a */
        public void mo30534a(C13087u uVar, @Nullable Object obj) {
            if (obj != null) {
                uVar.mo30562m(obj);
                return;
            }
            throw C12984b0.m56297o(this.f32101a, this.f32102b, "@Url parameter is null.", new Object[0]);
        }
    }

    /* renamed from: retrofit2.n$q */
    public static final class C13078q<T> extends C13061n<T> {

        /* renamed from: a */
        public final Class<T> f32103a;

        public C13078q(Class<T> cls) {
            this.f32103a = cls;
        }

        /* renamed from: a */
        public void mo30534a(C13087u uVar, @Nullable T t) {
            uVar.mo30559h(this.f32103a, t);
        }
    }

    /* renamed from: a */
    public abstract void mo30534a(C13087u uVar, @Nullable T t) throws IOException;

    /* renamed from: b */
    public final C13061n<Object> mo30535b() {
        return new C13063b();
    }

    /* renamed from: c */
    public final C13061n<Iterable<T>> mo30536c() {
        return new C13062a();
    }
}
