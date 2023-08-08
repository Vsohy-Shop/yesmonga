package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.C12975a;
import retrofit2.C12988c;
import retrofit2.C13015f;

/* renamed from: retrofit2.x */
public final class C13092x {

    /* renamed from: a */
    public final Map<Method, C13095y<?>> f32164a = new ConcurrentHashMap();

    /* renamed from: b */
    public final Call.Factory f32165b;

    /* renamed from: c */
    public final HttpUrl f32166c;

    /* renamed from: d */
    public final List<C13015f.C13016a> f32167d;

    /* renamed from: e */
    public final List<C12988c.C12989a> f32168e;
    @Nullable

    /* renamed from: f */
    public final Executor f32169f;

    /* renamed from: g */
    public final boolean f32170g;

    /* renamed from: retrofit2.x$a */
    public class C13093a implements InvocationHandler {

        /* renamed from: a */
        public final C13084t f32171a = C13084t.m56409g();

        /* renamed from: b */
        public final Object[] f32172b = new Object[0];

        /* renamed from: c */
        public final /* synthetic */ Class f32173c;

        public C13093a(Class cls) {
            this.f32173c = cls;
        }

        @Nullable
        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f32172b;
            }
            if (this.f32171a.mo30550i(method)) {
                return this.f32171a.mo30549h(method, this.f32173c, obj, objArr);
            }
            return C13092x.this.mo30587h(method).mo30522a(objArr);
        }
    }

    public C13092x(Call.Factory factory, HttpUrl httpUrl, List<C13015f.C13016a> list, List<C12988c.C12989a> list2, @Nullable Executor executor, boolean z) {
        this.f32165b = factory;
        this.f32166c = httpUrl;
        this.f32167d = list;
        this.f32168e = list2;
        this.f32169f = executor;
        this.f32170g = z;
    }

    /* renamed from: a */
    public HttpUrl mo30580a() {
        return this.f32166c;
    }

    /* renamed from: b */
    public C12988c<?, ?> mo30581b(Type type, Annotation[] annotationArr) {
        return mo30589j((C12988c.C12989a) null, type, annotationArr);
    }

    /* renamed from: c */
    public List<C12988c.C12989a> mo30582c() {
        return this.f32168e;
    }

    /* renamed from: d */
    public Call.Factory mo30583d() {
        return this.f32165b;
    }

    @Nullable
    /* renamed from: e */
    public Executor mo30584e() {
        return this.f32169f;
    }

    /* renamed from: f */
    public List<C13015f.C13016a> mo30585f() {
        return this.f32167d;
    }

    /* renamed from: g */
    public <T> T mo30586g(Class<T> cls) {
        mo30595p(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C13093a(cls));
    }

    /* renamed from: h */
    public C13095y<?> mo30587h(Method method) {
        C13095y<?> yVar;
        C13095y<?> yVar2 = this.f32164a.get(method);
        if (yVar2 != null) {
            return yVar2;
        }
        synchronized (this.f32164a) {
            yVar = this.f32164a.get(method);
            if (yVar == null) {
                yVar = C13095y.m56485b(this, method);
                this.f32164a.put(method, yVar);
            }
        }
        return yVar;
    }

    /* renamed from: i */
    public C13094b mo30588i() {
        return new C13094b(this);
    }

    /* renamed from: j */
    public C12988c<?, ?> mo30589j(@Nullable C12988c.C12989a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f32168e.indexOf(aVar) + 1;
        int size = this.f32168e.size();
        for (int i = indexOf; i < size; i++) {
            C12988c<?, ?> a = this.f32168e.get(i).mo30478a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f32168e.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f32168e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f32168e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: k */
    public <T> C13015f<T, RequestBody> mo30590k(@Nullable C13015f.C13016a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f32167d.indexOf(aVar) + 1;
        int size = this.f32167d.size();
        for (int i = indexOf; i < size; i++) {
            C13015f<?, RequestBody> c = this.f32167d.get(i).mo30440c(type, annotationArr, annotationArr2, this);
            if (c != null) {
                return c;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f32167d.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f32167d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f32167d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: l */
    public <T> C13015f<ResponseBody, T> mo30591l(@Nullable C13015f.C13016a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f32167d.indexOf(aVar) + 1;
        int size = this.f32167d.size();
        for (int i = indexOf; i < size; i++) {
            C13015f<ResponseBody, ?> d = this.f32167d.get(i).mo30441d(type, annotationArr, this);
            if (d != null) {
                return d;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f32167d.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f32167d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f32167d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: m */
    public <T> C13015f<T, RequestBody> mo30592m(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return mo30590k((C13015f.C13016a) null, type, annotationArr, annotationArr2);
    }

    /* renamed from: n */
    public <T> C13015f<ResponseBody, T> mo30593n(Type type, Annotation[] annotationArr) {
        return mo30591l((C13015f.C13016a) null, type, annotationArr);
    }

    /* renamed from: o */
    public <T> C13015f<T, String> mo30594o(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f32167d.size();
        for (int i = 0; i < size; i++) {
            C13015f<?, String> e = this.f32167d.get(i).mo30494e(type, annotationArr, this);
            if (e != null) {
                return e;
            }
        }
        return C12975a.C12979d.f31981a;
    }

    /* renamed from: p */
    public final void mo30595p(Class<?> cls) {
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<?> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f32170g) {
                C13084t g = C13084t.m56409g();
                for (Method method : cls.getDeclaredMethods()) {
                    if (!g.mo30550i(method) && !Modifier.isStatic(method.getModifiers())) {
                        mo30587h(method);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    /* renamed from: retrofit2.x$b */
    public static final class C13094b {

        /* renamed from: a */
        public final C13084t f32175a;
        @Nullable

        /* renamed from: b */
        public Call.Factory f32176b;
        @Nullable

        /* renamed from: c */
        public HttpUrl f32177c;

        /* renamed from: d */
        public final List<C13015f.C13016a> f32178d;

        /* renamed from: e */
        public final List<C12988c.C12989a> f32179e;
        @Nullable

        /* renamed from: f */
        public Executor f32180f;

        /* renamed from: g */
        public boolean f32181g;

        public C13094b(C13084t tVar) {
            this.f32178d = new ArrayList();
            this.f32179e = new ArrayList();
            this.f32175a = tVar;
        }

        /* renamed from: a */
        public C13094b mo30597a(C12988c.C12989a aVar) {
            List<C12988c.C12989a> list = this.f32179e;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: b */
        public C13094b mo30598b(C13015f.C13016a aVar) {
            List<C13015f.C13016a> list = this.f32178d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: c */
        public C13094b mo30599c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return mo30601e(HttpUrl.get(str));
        }

        /* renamed from: d */
        public C13094b mo30600d(URL url) {
            Objects.requireNonNull(url, "baseUrl == null");
            return mo30601e(HttpUrl.get(url.toString()));
        }

        /* renamed from: e */
        public C13094b mo30601e(HttpUrl httpUrl) {
            Objects.requireNonNull(httpUrl, "baseUrl == null");
            List<String> pathSegments = httpUrl.pathSegments();
            if ("".equals(pathSegments.get(pathSegments.size() - 1))) {
                this.f32177c = httpUrl;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }

        /* renamed from: f */
        public C13092x mo30602f() {
            if (this.f32177c != null) {
                Call.Factory factory = this.f32176b;
                if (factory == null) {
                    factory = new OkHttpClient();
                }
                Call.Factory factory2 = factory;
                Executor executor = this.f32180f;
                if (executor == null) {
                    executor = this.f32175a.mo30546c();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f32179e);
                arrayList.addAll(this.f32175a.mo30544a(executor2));
                ArrayList arrayList2 = new ArrayList(this.f32178d.size() + 1 + this.f32175a.mo30548e());
                arrayList2.add(new C12975a());
                arrayList2.addAll(this.f32178d);
                arrayList2.addAll(this.f32175a.mo30547d());
                return new C13092x(factory2, this.f32177c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f32181g);
            }
            throw new IllegalStateException("Base URL required.");
        }

        /* renamed from: g */
        public List<C12988c.C12989a> mo30603g() {
            return this.f32179e;
        }

        /* renamed from: h */
        public C13094b mo30604h(Call.Factory factory) {
            Objects.requireNonNull(factory, "factory == null");
            this.f32176b = factory;
            return this;
        }

        /* renamed from: i */
        public C13094b mo30605i(Executor executor) {
            Objects.requireNonNull(executor, "executor == null");
            this.f32180f = executor;
            return this;
        }

        /* renamed from: j */
        public C13094b mo30606j(OkHttpClient okHttpClient) {
            Objects.requireNonNull(okHttpClient, "client == null");
            return mo30604h(okHttpClient);
        }

        /* renamed from: k */
        public List<C13015f.C13016a> mo30607k() {
            return this.f32178d;
        }

        /* renamed from: l */
        public C13094b mo30608l(boolean z) {
            this.f32181g = z;
            return this;
        }

        public C13094b() {
            this(C13084t.m56409g());
        }

        public C13094b(C13092x xVar) {
            this.f32178d = new ArrayList();
            this.f32179e = new ArrayList();
            C13084t g = C13084t.m56409g();
            this.f32175a = g;
            this.f32176b = xVar.f32165b;
            this.f32177c = xVar.f32166c;
            int size = xVar.f32167d.size() - g.mo30548e();
            for (int i = 1; i < size; i++) {
                this.f32178d.add(xVar.f32167d.get(i));
            }
            int size2 = xVar.f32168e.size() - this.f32175a.mo30545b();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f32179e.add(xVar.f32168e.get(i2));
            }
            this.f32180f = xVar.f32169f;
            this.f32181g = xVar.f32170g;
        }
    }
}
