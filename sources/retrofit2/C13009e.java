package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.C12988c;

@IgnoreJRERequirement
/* renamed from: retrofit2.e */
public final class C13009e extends C12988c.C12989a {

    /* renamed from: a */
    public static final C12988c.C12989a f32010a = new C13009e();

    @IgnoreJRERequirement
    /* renamed from: retrofit2.e$a */
    public static final class C13010a<R> implements C12988c<R, CompletableFuture<R>> {

        /* renamed from: a */
        public final Type f32011a;

        @IgnoreJRERequirement
        /* renamed from: retrofit2.e$a$a */
        public class C13011a implements C13008d<R> {

            /* renamed from: a */
            public final CompletableFuture<R> f32012a;

            public C13011a(CompletableFuture<R> completableFuture) {
                this.f32012a = completableFuture;
            }

            /* renamed from: a */
            public void mo30434a(C12983b<R> bVar, Throwable th) {
                this.f32012a.completeExceptionally(th);
            }

            /* renamed from: b */
            public void mo30435b(C12983b<R> bVar, C13091w<R> wVar) {
                if (wVar.mo30576g()) {
                    this.f32012a.complete(wVar.mo30572a());
                } else {
                    this.f32012a.completeExceptionally(new HttpException(wVar));
                }
            }
        }

        public C13010a(Type type) {
            this.f32011a = type;
        }

        /* renamed from: a */
        public Type mo30476a() {
            return this.f32011a;
        }

        /* renamed from: c */
        public CompletableFuture<R> mo30477b(C12983b<R> bVar) {
            C13012b bVar2 = new C13012b(bVar);
            bVar.mo30458k1(new C13011a(bVar2));
            return bVar2;
        }
    }

    @IgnoreJRERequirement
    /* renamed from: retrofit2.e$b */
    public static final class C13012b<T> extends CompletableFuture<T> {

        /* renamed from: a */
        public final C12983b<?> f32014a;

        public C13012b(C12983b<?> bVar) {
            this.f32014a = bVar;
        }

        public boolean cancel(boolean z) {
            if (z) {
                this.f32014a.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    /* renamed from: retrofit2.e$c */
    public static final class C13013c<R> implements C12988c<R, CompletableFuture<C13091w<R>>> {

        /* renamed from: a */
        public final Type f32015a;

        @IgnoreJRERequirement
        /* renamed from: retrofit2.e$c$a */
        public class C13014a implements C13008d<R> {

            /* renamed from: a */
            public final CompletableFuture<C13091w<R>> f32016a;

            public C13014a(CompletableFuture<C13091w<R>> completableFuture) {
                this.f32016a = completableFuture;
            }

            /* renamed from: a */
            public void mo30434a(C12983b<R> bVar, Throwable th) {
                this.f32016a.completeExceptionally(th);
            }

            /* renamed from: b */
            public void mo30435b(C12983b<R> bVar, C13091w<R> wVar) {
                this.f32016a.complete(wVar);
            }
        }

        public C13013c(Type type) {
            this.f32015a = type;
        }

        /* renamed from: a */
        public Type mo30476a() {
            return this.f32015a;
        }

        /* renamed from: c */
        public CompletableFuture<C13091w<R>> mo30477b(C12983b<R> bVar) {
            C13012b bVar2 = new C13012b(bVar);
            bVar.mo30458k1(new C13014a(bVar2));
            return bVar2;
        }
    }

    @Nullable
    /* renamed from: a */
    public C12988c<?, ?> mo30478a(Type type, Annotation[] annotationArr, C13092x xVar) {
        if (C12988c.C12989a.m56306c(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type b = C12988c.C12989a.m56305b(0, (ParameterizedType) type);
            if (C12988c.C12989a.m56306c(b) != C13091w.class) {
                return new C13010a(b);
            }
            if (b instanceof ParameterizedType) {
                return new C13013c(C12988c.C12989a.m56305b(0, (ParameterizedType) b));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
