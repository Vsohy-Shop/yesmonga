package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import kotlin.coroutines.C11045c;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import retrofit2.C13061n;
import retrofit2.http.C13022a;
import retrofit2.http.C13023b;
import retrofit2.http.C13024c;
import retrofit2.http.C13025d;
import retrofit2.http.C13026e;
import retrofit2.http.C13027f;
import retrofit2.http.C13028g;
import retrofit2.http.C13029h;
import retrofit2.http.C13030i;
import retrofit2.http.C13031j;
import retrofit2.http.C13032k;
import retrofit2.http.C13033l;
import retrofit2.http.C13034m;
import retrofit2.http.C13035n;
import retrofit2.http.C13036o;
import retrofit2.http.C13037p;
import retrofit2.http.C13038q;
import retrofit2.http.C13039r;
import retrofit2.http.C13040s;
import retrofit2.http.C13041t;
import retrofit2.http.C13042u;
import retrofit2.http.C13043v;
import retrofit2.http.C13045x;
import retrofit2.http.C13046y;

/* renamed from: retrofit2.v */
public final class C13089v {

    /* renamed from: a */
    public final Method f32124a;

    /* renamed from: b */
    public final HttpUrl f32125b;

    /* renamed from: c */
    public final String f32126c;
    @Nullable

    /* renamed from: d */
    public final String f32127d;
    @Nullable

    /* renamed from: e */
    public final Headers f32128e;
    @Nullable

    /* renamed from: f */
    public final MediaType f32129f;

    /* renamed from: g */
    public final boolean f32130g;

    /* renamed from: h */
    public final boolean f32131h;

    /* renamed from: i */
    public final boolean f32132i;

    /* renamed from: j */
    public final C13061n<?>[] f32133j;

    /* renamed from: k */
    public final boolean f32134k;

    /* renamed from: retrofit2.v$a */
    public static final class C13090a {

        /* renamed from: x */
        public static final String f32135x = "[a-zA-Z][a-zA-Z0-9_-]*";

        /* renamed from: y */
        public static final Pattern f32136y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: z */
        public static final Pattern f32137z = Pattern.compile(f32135x);

        /* renamed from: a */
        public final C13092x f32138a;

        /* renamed from: b */
        public final Method f32139b;

        /* renamed from: c */
        public final Annotation[] f32140c;

        /* renamed from: d */
        public final Annotation[][] f32141d;

        /* renamed from: e */
        public final Type[] f32142e;

        /* renamed from: f */
        public boolean f32143f;

        /* renamed from: g */
        public boolean f32144g;

        /* renamed from: h */
        public boolean f32145h;

        /* renamed from: i */
        public boolean f32146i;

        /* renamed from: j */
        public boolean f32147j;

        /* renamed from: k */
        public boolean f32148k;

        /* renamed from: l */
        public boolean f32149l;

        /* renamed from: m */
        public boolean f32150m;
        @Nullable

        /* renamed from: n */
        public String f32151n;

        /* renamed from: o */
        public boolean f32152o;

        /* renamed from: p */
        public boolean f32153p;

        /* renamed from: q */
        public boolean f32154q;
        @Nullable

        /* renamed from: r */
        public String f32155r;
        @Nullable

        /* renamed from: s */
        public Headers f32156s;
        @Nullable

        /* renamed from: t */
        public MediaType f32157t;
        @Nullable

        /* renamed from: u */
        public Set<String> f32158u;
        @Nullable

        /* renamed from: v */
        public C13061n<?>[] f32159v;

        /* renamed from: w */
        public boolean f32160w;

        public C13090a(C13092x xVar, Method method) {
            this.f32138a = xVar;
            this.f32139b = method;
            this.f32140c = method.getAnnotations();
            this.f32142e = method.getGenericParameterTypes();
            this.f32141d = method.getParameterAnnotations();
        }

        /* renamed from: a */
        public static Class<?> m56434a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            if (Short.TYPE == cls) {
                return Short.class;
            }
            return cls;
        }

        /* renamed from: h */
        public static Set<String> m56435h(String str) {
            Matcher matcher = f32136y.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        /* renamed from: b */
        public C13089v mo30564b() {
            for (Annotation e : this.f32140c) {
                mo30567e(e);
            }
            if (this.f32151n != null) {
                if (!this.f32152o) {
                    if (this.f32154q) {
                        throw C12984b0.m56295m(this.f32139b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (this.f32153p) {
                        throw C12984b0.m56295m(this.f32139b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f32141d.length;
                this.f32159v = new C13061n[length];
                int i = length - 1;
                int i2 = 0;
                while (true) {
                    boolean z = true;
                    if (i2 >= length) {
                        break;
                    }
                    C13061n<?>[] nVarArr = this.f32159v;
                    Type type = this.f32142e[i2];
                    Annotation[] annotationArr = this.f32141d[i2];
                    if (i2 != i) {
                        z = false;
                    }
                    nVarArr[i2] = mo30568f(i2, type, annotationArr, z);
                    i2++;
                }
                if (this.f32155r != null || this.f32150m) {
                    boolean z2 = this.f32153p;
                    if (!z2 && !this.f32154q && !this.f32152o && this.f32145h) {
                        throw C12984b0.m56295m(this.f32139b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                    } else if (z2 && !this.f32143f) {
                        throw C12984b0.m56295m(this.f32139b, "Form-encoded method must contain at least one @Field.", new Object[0]);
                    } else if (!this.f32154q || this.f32144g) {
                        return new C13089v(this);
                    } else {
                        throw C12984b0.m56295m(this.f32139b, "Multipart method must contain at least one @Part.", new Object[0]);
                    }
                } else {
                    throw C12984b0.m56295m(this.f32139b, "Missing either @%s URL or @Url parameter.", this.f32151n);
                }
            } else {
                throw C12984b0.m56295m(this.f32139b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }

        /* renamed from: c */
        public final Headers mo30565c(String[] strArr) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw C12984b0.m56295m(this.f32139b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.f32157t = MediaType.get(trim);
                    } catch (IllegalArgumentException e) {
                        throw C12984b0.m56296n(this.f32139b, e, "Malformed content type: %s", trim);
                    }
                } else {
                    builder.add(substring, trim);
                }
            }
            return builder.build();
        }

        /* renamed from: d */
        public final void mo30566d(String str, String str2, boolean z) {
            String str3 = this.f32151n;
            if (str3 == null) {
                this.f32151n = str;
                this.f32152o = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (f32136y.matcher(substring).find()) {
                            throw C12984b0.m56295m(this.f32139b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f32155r = str2;
                    this.f32158u = m56435h(str2);
                    return;
                }
                return;
            }
            throw C12984b0.m56295m(this.f32139b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* renamed from: e */
        public final void mo30567e(Annotation annotation) {
            if (annotation instanceof C13023b) {
                mo30566d("DELETE", ((C13023b) annotation).value(), false);
            } else if (annotation instanceof C13027f) {
                mo30566d("GET", ((C13027f) annotation).value(), false);
            } else if (annotation instanceof C13028g) {
                mo30566d("HEAD", ((C13028g) annotation).value(), false);
            } else if (annotation instanceof C13035n) {
                mo30566d("PATCH", ((C13035n) annotation).value(), true);
            } else if (annotation instanceof C13036o) {
                mo30566d("POST", ((C13036o) annotation).value(), true);
            } else if (annotation instanceof C13037p) {
                mo30566d("PUT", ((C13037p) annotation).value(), true);
            } else if (annotation instanceof C13034m) {
                mo30566d("OPTIONS", ((C13034m) annotation).value(), false);
            } else if (annotation instanceof C13029h) {
                C13029h hVar = (C13029h) annotation;
                mo30566d(hVar.method(), hVar.path(), hVar.hasBody());
            } else if (annotation instanceof C13032k) {
                String[] value = ((C13032k) annotation).value();
                if (value.length != 0) {
                    this.f32156s = mo30565c(value);
                    return;
                }
                throw C12984b0.m56295m(this.f32139b, "@Headers annotation is empty.", new Object[0]);
            } else if (annotation instanceof C13033l) {
                if (!this.f32153p) {
                    this.f32154q = true;
                    return;
                }
                throw C12984b0.m56295m(this.f32139b, "Only one encoding annotation is allowed.", new Object[0]);
            } else if (!(annotation instanceof C13026e)) {
            } else {
                if (!this.f32154q) {
                    this.f32153p = true;
                    return;
                }
                throw C12984b0.m56295m(this.f32139b, "Only one encoding annotation is allowed.", new Object[0]);
            }
        }

        @Nullable
        /* renamed from: f */
        public final C13061n<?> mo30568f(int i, Type type, @Nullable Annotation[] annotationArr, boolean z) {
            C13061n<?> nVar;
            if (annotationArr != null) {
                nVar = null;
                for (Annotation g : annotationArr) {
                    C13061n<?> g2 = mo30569g(i, type, annotationArr, g);
                    if (g2 != null) {
                        if (nVar == null) {
                            nVar = g2;
                        } else {
                            throw C12984b0.m56297o(this.f32139b, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                    }
                }
            } else {
                nVar = null;
            }
            if (nVar != null) {
                return nVar;
            }
            if (z) {
                try {
                    if (C12984b0.m56290h(type) == C11045c.class) {
                        this.f32160w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw C12984b0.m56297o(this.f32139b, i, "No Retrofit annotation found.", new Object[0]);
        }

        @Nullable
        /* renamed from: g */
        public final C13061n<?> mo30569g(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            Class<String> cls = String.class;
            if (annotation instanceof C13046y) {
                mo30571j(i, type);
                if (this.f32150m) {
                    throw C12984b0.m56297o(this.f32139b, i, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f32146i) {
                    throw C12984b0.m56297o(this.f32139b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f32147j) {
                    throw C12984b0.m56297o(this.f32139b, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                } else if (this.f32148k) {
                    throw C12984b0.m56297o(this.f32139b, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f32149l) {
                    throw C12984b0.m56297o(this.f32139b, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f32155r == null) {
                    this.f32150m = true;
                    if (type == HttpUrl.class || type == cls || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new C13061n.C13077p(this.f32139b, i);
                    }
                    throw C12984b0.m56297o(this.f32139b, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw C12984b0.m56297o(this.f32139b, i, "@Url cannot be used with @%s URL", this.f32151n);
                }
            } else if (annotation instanceof C13040s) {
                mo30571j(i, type);
                if (this.f32147j) {
                    throw C12984b0.m56297o(this.f32139b, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f32148k) {
                    throw C12984b0.m56297o(this.f32139b, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f32149l) {
                    throw C12984b0.m56297o(this.f32139b, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f32150m) {
                    throw C12984b0.m56297o(this.f32139b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f32155r != null) {
                    this.f32146i = true;
                    C13040s sVar = (C13040s) annotation;
                    String value = sVar.value();
                    mo30570i(i, value);
                    return new C13061n.C13072k(this.f32139b, i, value, this.f32138a.mo30594o(type, annotationArr), sVar.encoded());
                } else {
                    throw C12984b0.m56297o(this.f32139b, i, "@Path can only be used with relative url on @%s", this.f32151n);
                }
            } else {
                Class<Iterable> cls2 = Iterable.class;
                if (annotation instanceof C13041t) {
                    mo30571j(i, type);
                    C13041t tVar = (C13041t) annotation;
                    String value2 = tVar.value();
                    boolean encoded = tVar.encoded();
                    Class<?> h = C12984b0.m56290h(type);
                    this.f32147j = true;
                    if (cls2.isAssignableFrom(h)) {
                        if (type instanceof ParameterizedType) {
                            return new C13061n.C13073l(value2, this.f32138a.mo30594o(C12984b0.m56289g(0, (ParameterizedType) type), annotationArr), encoded).mo30536c();
                        }
                        throw C12984b0.m56297o(this.f32139b, i, h.getSimpleName() + " must include generic type (e.g., " + h.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!h.isArray()) {
                        return new C13061n.C13073l(value2, this.f32138a.mo30594o(type, annotationArr), encoded);
                    } else {
                        return new C13061n.C13073l(value2, this.f32138a.mo30594o(m56434a(h.getComponentType()), annotationArr), encoded).mo30535b();
                    }
                } else if (annotation instanceof C13043v) {
                    mo30571j(i, type);
                    boolean encoded2 = ((C13043v) annotation).encoded();
                    Class<?> h2 = C12984b0.m56290h(type);
                    this.f32148k = true;
                    if (cls2.isAssignableFrom(h2)) {
                        if (type instanceof ParameterizedType) {
                            return new C13061n.C13075n(this.f32138a.mo30594o(C12984b0.m56289g(0, (ParameterizedType) type), annotationArr), encoded2).mo30536c();
                        }
                        throw C12984b0.m56297o(this.f32139b, i, h2.getSimpleName() + " must include generic type (e.g., " + h2.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!h2.isArray()) {
                        return new C13061n.C13075n(this.f32138a.mo30594o(type, annotationArr), encoded2);
                    } else {
                        return new C13061n.C13075n(this.f32138a.mo30594o(m56434a(h2.getComponentType()), annotationArr), encoded2).mo30535b();
                    }
                } else {
                    Class<Map> cls3 = Map.class;
                    if (annotation instanceof C13042u) {
                        mo30571j(i, type);
                        Class<?> h3 = C12984b0.m56290h(type);
                        this.f32149l = true;
                        if (cls3.isAssignableFrom(h3)) {
                            Type i2 = C12984b0.m56291i(type, h3, cls3);
                            if (i2 instanceof ParameterizedType) {
                                ParameterizedType parameterizedType = (ParameterizedType) i2;
                                Type g = C12984b0.m56289g(0, parameterizedType);
                                if (cls == g) {
                                    return new C13061n.C13074m(this.f32139b, i, this.f32138a.mo30594o(C12984b0.m56289g(1, parameterizedType), annotationArr), ((C13042u) annotation).encoded());
                                }
                                throw C12984b0.m56297o(this.f32139b, i, "@QueryMap keys must be of type String: " + g, new Object[0]);
                            }
                            throw C12984b0.m56297o(this.f32139b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                        throw C12984b0.m56297o(this.f32139b, i, "@QueryMap parameter type must be Map.", new Object[0]);
                    } else if (annotation instanceof C13030i) {
                        mo30571j(i, type);
                        String value3 = ((C13030i) annotation).value();
                        Class<?> h4 = C12984b0.m56290h(type);
                        if (cls2.isAssignableFrom(h4)) {
                            if (type instanceof ParameterizedType) {
                                return new C13061n.C13067f(value3, this.f32138a.mo30594o(C12984b0.m56289g(0, (ParameterizedType) type), annotationArr)).mo30536c();
                            }
                            throw C12984b0.m56297o(this.f32139b, i, h4.getSimpleName() + " must include generic type (e.g., " + h4.getSimpleName() + "<String>)", new Object[0]);
                        } else if (!h4.isArray()) {
                            return new C13061n.C13067f(value3, this.f32138a.mo30594o(type, annotationArr));
                        } else {
                            return new C13061n.C13067f(value3, this.f32138a.mo30594o(m56434a(h4.getComponentType()), annotationArr)).mo30535b();
                        }
                    } else if (annotation instanceof C13031j) {
                        if (type == Headers.class) {
                            return new C13061n.C13069h(this.f32139b, i);
                        }
                        mo30571j(i, type);
                        Class<?> h5 = C12984b0.m56290h(type);
                        if (cls3.isAssignableFrom(h5)) {
                            Type i3 = C12984b0.m56291i(type, h5, cls3);
                            if (i3 instanceof ParameterizedType) {
                                ParameterizedType parameterizedType2 = (ParameterizedType) i3;
                                Type g2 = C12984b0.m56289g(0, parameterizedType2);
                                if (cls == g2) {
                                    return new C13061n.C13068g(this.f32139b, i, this.f32138a.mo30594o(C12984b0.m56289g(1, parameterizedType2), annotationArr));
                                }
                                throw C12984b0.m56297o(this.f32139b, i, "@HeaderMap keys must be of type String: " + g2, new Object[0]);
                            }
                            throw C12984b0.m56297o(this.f32139b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                        throw C12984b0.m56297o(this.f32139b, i, "@HeaderMap parameter type must be Map.", new Object[0]);
                    } else if (annotation instanceof C13024c) {
                        mo30571j(i, type);
                        if (this.f32153p) {
                            C13024c cVar = (C13024c) annotation;
                            String value4 = cVar.value();
                            boolean encoded3 = cVar.encoded();
                            this.f32143f = true;
                            Class<?> h6 = C12984b0.m56290h(type);
                            if (cls2.isAssignableFrom(h6)) {
                                if (type instanceof ParameterizedType) {
                                    return new C13061n.C13065d(value4, this.f32138a.mo30594o(C12984b0.m56289g(0, (ParameterizedType) type), annotationArr), encoded3).mo30536c();
                                }
                                throw C12984b0.m56297o(this.f32139b, i, h6.getSimpleName() + " must include generic type (e.g., " + h6.getSimpleName() + "<String>)", new Object[0]);
                            } else if (!h6.isArray()) {
                                return new C13061n.C13065d(value4, this.f32138a.mo30594o(type, annotationArr), encoded3);
                            } else {
                                return new C13061n.C13065d(value4, this.f32138a.mo30594o(m56434a(h6.getComponentType()), annotationArr), encoded3).mo30535b();
                            }
                        } else {
                            throw C12984b0.m56297o(this.f32139b, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                        }
                    } else if (annotation instanceof C13025d) {
                        mo30571j(i, type);
                        if (this.f32153p) {
                            Class<?> h7 = C12984b0.m56290h(type);
                            if (cls3.isAssignableFrom(h7)) {
                                Type i4 = C12984b0.m56291i(type, h7, cls3);
                                if (i4 instanceof ParameterizedType) {
                                    ParameterizedType parameterizedType3 = (ParameterizedType) i4;
                                    Type g3 = C12984b0.m56289g(0, parameterizedType3);
                                    if (cls == g3) {
                                        C13015f o = this.f32138a.mo30594o(C12984b0.m56289g(1, parameterizedType3), annotationArr);
                                        this.f32143f = true;
                                        return new C13061n.C13066e(this.f32139b, i, o, ((C13025d) annotation).encoded());
                                    }
                                    throw C12984b0.m56297o(this.f32139b, i, "@FieldMap keys must be of type String: " + g3, new Object[0]);
                                }
                                throw C12984b0.m56297o(this.f32139b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                            }
                            throw C12984b0.m56297o(this.f32139b, i, "@FieldMap parameter type must be Map.", new Object[0]);
                        }
                        throw C12984b0.m56297o(this.f32139b, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                    } else {
                        Class<MultipartBody.Part> cls4 = MultipartBody.Part.class;
                        if (annotation instanceof C13038q) {
                            mo30571j(i, type);
                            if (this.f32154q) {
                                C13038q qVar = (C13038q) annotation;
                                this.f32144g = true;
                                String value5 = qVar.value();
                                Class<?> h8 = C12984b0.m56290h(type);
                                if (!value5.isEmpty()) {
                                    Headers of = Headers.m50347of("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
                                    if (cls2.isAssignableFrom(h8)) {
                                        if (type instanceof ParameterizedType) {
                                            Type g4 = C12984b0.m56289g(0, (ParameterizedType) type);
                                            if (!cls4.isAssignableFrom(C12984b0.m56290h(g4))) {
                                                return new C13061n.C13070i(this.f32139b, i, of, this.f32138a.mo30592m(g4, annotationArr, this.f32140c)).mo30536c();
                                            }
                                            throw C12984b0.m56297o(this.f32139b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                        }
                                        throw C12984b0.m56297o(this.f32139b, i, h8.getSimpleName() + " must include generic type (e.g., " + h8.getSimpleName() + "<String>)", new Object[0]);
                                    } else if (h8.isArray()) {
                                        Class<?> a = m56434a(h8.getComponentType());
                                        if (!cls4.isAssignableFrom(a)) {
                                            return new C13061n.C13070i(this.f32139b, i, of, this.f32138a.mo30592m(a, annotationArr, this.f32140c)).mo30535b();
                                        }
                                        throw C12984b0.m56297o(this.f32139b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                    } else if (!cls4.isAssignableFrom(h8)) {
                                        return new C13061n.C13070i(this.f32139b, i, of, this.f32138a.mo30592m(type, annotationArr, this.f32140c));
                                    } else {
                                        throw C12984b0.m56297o(this.f32139b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                    }
                                } else if (cls2.isAssignableFrom(h8)) {
                                    if (!(type instanceof ParameterizedType)) {
                                        throw C12984b0.m56297o(this.f32139b, i, h8.getSimpleName() + " must include generic type (e.g., " + h8.getSimpleName() + "<String>)", new Object[0]);
                                    } else if (cls4.isAssignableFrom(C12984b0.m56290h(C12984b0.m56289g(0, (ParameterizedType) type)))) {
                                        return C13061n.C13076o.f32100a.mo30536c();
                                    } else {
                                        throw C12984b0.m56297o(this.f32139b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                    }
                                } else if (h8.isArray()) {
                                    if (cls4.isAssignableFrom(h8.getComponentType())) {
                                        return C13061n.C13076o.f32100a.mo30535b();
                                    }
                                    throw C12984b0.m56297o(this.f32139b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                } else if (cls4.isAssignableFrom(h8)) {
                                    return C13061n.C13076o.f32100a;
                                } else {
                                    throw C12984b0.m56297o(this.f32139b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                }
                            } else {
                                throw C12984b0.m56297o(this.f32139b, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                            }
                        } else if (annotation instanceof C13039r) {
                            mo30571j(i, type);
                            if (this.f32154q) {
                                this.f32144g = true;
                                Class<?> h9 = C12984b0.m56290h(type);
                                if (cls3.isAssignableFrom(h9)) {
                                    Type i5 = C12984b0.m56291i(type, h9, cls3);
                                    if (i5 instanceof ParameterizedType) {
                                        ParameterizedType parameterizedType4 = (ParameterizedType) i5;
                                        Type g5 = C12984b0.m56289g(0, parameterizedType4);
                                        if (cls == g5) {
                                            Type g6 = C12984b0.m56289g(1, parameterizedType4);
                                            if (!cls4.isAssignableFrom(C12984b0.m56290h(g6))) {
                                                return new C13061n.C13071j(this.f32139b, i, this.f32138a.mo30592m(g6, annotationArr, this.f32140c), ((C13039r) annotation).encoding());
                                            }
                                            throw C12984b0.m56297o(this.f32139b, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                        }
                                        throw C12984b0.m56297o(this.f32139b, i, "@PartMap keys must be of type String: " + g5, new Object[0]);
                                    }
                                    throw C12984b0.m56297o(this.f32139b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                }
                                throw C12984b0.m56297o(this.f32139b, i, "@PartMap parameter type must be Map.", new Object[0]);
                            }
                            throw C12984b0.m56297o(this.f32139b, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                        } else if (annotation instanceof C13022a) {
                            mo30571j(i, type);
                            if (this.f32153p || this.f32154q) {
                                throw C12984b0.m56297o(this.f32139b, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                            } else if (!this.f32145h) {
                                try {
                                    C13015f m = this.f32138a.mo30592m(type, annotationArr, this.f32140c);
                                    this.f32145h = true;
                                    return new C13061n.C13064c(this.f32139b, i, m);
                                } catch (RuntimeException e) {
                                    throw C12984b0.m56298p(this.f32139b, e, i, "Unable to create @Body converter for %s", type);
                                }
                            } else {
                                throw C12984b0.m56297o(this.f32139b, i, "Multiple @Body method annotations found.", new Object[0]);
                            }
                        } else if (!(annotation instanceof C13045x)) {
                            return null;
                        } else {
                            mo30571j(i, type);
                            Class<?> h10 = C12984b0.m56290h(type);
                            int i6 = i - 1;
                            while (i6 >= 0) {
                                C13061n<?> nVar = this.f32159v[i6];
                                if (!(nVar instanceof C13061n.C13078q) || !((C13061n.C13078q) nVar).f32103a.equals(h10)) {
                                    i6--;
                                } else {
                                    throw C12984b0.m56297o(this.f32139b, i, "@Tag type " + h10.getName() + " is duplicate of parameter #" + (i6 + 1) + " and would always overwrite its value.", new Object[0]);
                                }
                            }
                            return new C13061n.C13078q(h10);
                        }
                    }
                }
            }
        }

        /* renamed from: i */
        public final void mo30570i(int i, String str) {
            if (!f32137z.matcher(str).matches()) {
                throw C12984b0.m56297o(this.f32139b, i, "@Path parameter name must match %s. Found: %s", f32136y.pattern(), str);
            } else if (!this.f32158u.contains(str)) {
                throw C12984b0.m56297o(this.f32139b, i, "URL \"%s\" does not contain \"{%s}\".", this.f32155r, str);
            }
        }

        /* renamed from: j */
        public final void mo30571j(int i, Type type) {
            if (C12984b0.m56292j(type)) {
                throw C12984b0.m56297o(this.f32139b, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public C13089v(C13090a aVar) {
        this.f32124a = aVar.f32139b;
        this.f32125b = aVar.f32138a.f32166c;
        this.f32126c = aVar.f32151n;
        this.f32127d = aVar.f32155r;
        this.f32128e = aVar.f32156s;
        this.f32129f = aVar.f32157t;
        this.f32130g = aVar.f32152o;
        this.f32131h = aVar.f32153p;
        this.f32132i = aVar.f32154q;
        this.f32133j = aVar.f32159v;
        this.f32134k = aVar.f32160w;
    }

    /* renamed from: b */
    public static C13089v m56432b(C13092x xVar, Method method) {
        return new C13090a(xVar, method).mo30564b();
    }

    /* renamed from: a */
    public Request mo30563a(Object[] objArr) throws IOException {
        C13061n<?>[] nVarArr = this.f32133j;
        int length = objArr.length;
        if (length == nVarArr.length) {
            C13087u uVar = new C13087u(this.f32126c, this.f32125b, this.f32127d, this.f32128e, this.f32129f, this.f32130g, this.f32131h, this.f32132i);
            if (this.f32134k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                nVarArr[i].mo30534a(uVar, objArr[i]);
            }
            return uVar.mo30560k().tag(C13053k.class, new C13053k(this.f32124a, arrayList)).build();
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + nVarArr.length + ")");
    }
}
