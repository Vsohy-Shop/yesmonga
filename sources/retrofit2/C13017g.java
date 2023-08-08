package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.Request;
import okio.C12516r0;
import retrofit2.C12988c;

/* renamed from: retrofit2.g */
public final class C13017g extends C12988c.C12989a {
    @Nullable

    /* renamed from: a */
    public final Executor f32018a;

    /* renamed from: retrofit2.g$a */
    public class C13018a implements C12988c<Object, C12983b<?>> {

        /* renamed from: a */
        public final /* synthetic */ Type f32019a;

        /* renamed from: b */
        public final /* synthetic */ Executor f32020b;

        public C13018a(Type type, Executor executor) {
            this.f32019a = type;
            this.f32020b = executor;
        }

        /* renamed from: a */
        public Type mo30476a() {
            return this.f32019a;
        }

        /* renamed from: c */
        public C12983b<Object> mo30477b(C12983b<Object> bVar) {
            Executor executor = this.f32020b;
            return executor == null ? bVar : new C13019b(executor, bVar);
        }
    }

    /* renamed from: retrofit2.g$b */
    public static final class C13019b<T> implements C12983b<T> {

        /* renamed from: a */
        public final Executor f32022a;

        /* renamed from: b */
        public final C12983b<T> f32023b;

        /* renamed from: retrofit2.g$b$a */
        public class C13020a implements C13008d<T> {

            /* renamed from: a */
            public final /* synthetic */ C13008d f32024a;

            public C13020a(C13008d dVar) {
                this.f32024a = dVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: e */
            public /* synthetic */ void m56352e(C13008d dVar, Throwable th) {
                dVar.mo30434a(C13019b.this, th);
            }

            /* access modifiers changed from: private */
            /* renamed from: f */
            public /* synthetic */ void m56353f(C13008d dVar, C13091w wVar) {
                if (C13019b.this.f32023b.isCanceled()) {
                    dVar.mo30434a(C13019b.this, new IOException("Canceled"));
                } else {
                    dVar.mo30435b(C13019b.this, wVar);
                }
            }

            /* renamed from: a */
            public void mo30434a(C12983b<T> bVar, Throwable th) {
                C13019b.this.f32022a.execute(new C13047i(this, this.f32024a, th));
            }

            /* renamed from: b */
            public void mo30435b(C12983b<T> bVar, C13091w<T> wVar) {
                C13019b.this.f32022a.execute(new C13021h(this, this.f32024a, wVar));
            }
        }

        public C13019b(Executor executor, C12983b<T> bVar) {
            this.f32022a = executor;
            this.f32023b = bVar;
        }

        public void cancel() {
            this.f32023b.cancel();
        }

        public C13091w<T> execute() throws IOException {
            return this.f32023b.execute();
        }

        public boolean isCanceled() {
            return this.f32023b.isCanceled();
        }

        public boolean isExecuted() {
            return this.f32023b.isExecuted();
        }

        /* renamed from: k1 */
        public void mo30458k1(C13008d<T> dVar) {
            Objects.requireNonNull(dVar, "callback == null");
            this.f32023b.mo30458k1(new C13020a(dVar));
        }

        public Request request() {
            return this.f32023b.request();
        }

        public C12516r0 timeout() {
            return this.f32023b.timeout();
        }

        public C12983b<T> clone() {
            return new C13019b(this.f32022a, this.f32023b.clone());
        }
    }

    public C13017g(@Nullable Executor executor) {
        this.f32018a = executor;
    }

    @Nullable
    /* renamed from: a */
    public C12988c<?, ?> mo30478a(Type type, Annotation[] annotationArr, C13092x xVar) {
        Executor executor = null;
        if (C12988c.C12989a.m56306c(type) != C12983b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type g = C12984b0.m56289g(0, (ParameterizedType) type);
            if (!C12984b0.m56294l(annotationArr, C13096z.class)) {
                executor = this.f32018a;
            }
            return new C13018a(g, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
