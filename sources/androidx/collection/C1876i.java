package androidx.collection;

import java.util.Iterator;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.collections.C10955l0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.collection.i */
public final class C1876i {

    /* renamed from: androidx.collection.i$a */
    public static final class C1877a extends C10955l0 {

        /* renamed from: a */
        public int f5128a;

        /* renamed from: b */
        public final /* synthetic */ C1875h f5129b;

        public C1877a(C1875h<T> hVar) {
            this.f5129b = hVar;
        }

        /* renamed from: c */
        public long mo6234c() {
            C1875h hVar = this.f5129b;
            int i = this.f5128a;
            this.f5128a = i + 1;
            return hVar.mo6228s(i);
        }

        /* renamed from: d */
        public final int mo6235d() {
            return this.f5128a;
        }

        /* renamed from: e */
        public final void mo6236e(int i) {
            this.f5128a = i;
        }

        public boolean hasNext() {
            return this.f5128a < this.f5129b.mo6213F();
        }
    }

    /* renamed from: androidx.collection.i$b */
    public static final class C1878b implements Iterator<T>, C11345a {

        /* renamed from: a */
        public int f5130a;

        /* renamed from: b */
        public final /* synthetic */ C1875h f5131b;

        public C1878b(C1875h<T> hVar) {
            this.f5131b = hVar;
        }

        /* renamed from: b */
        public final int mo6238b() {
            return this.f5130a;
        }

        /* renamed from: c */
        public final void mo6239c(int i) {
            this.f5130a = i;
        }

        public boolean hasNext() {
            return this.f5130a < this.f5131b.mo6213F();
        }

        public T next() {
            C1875h hVar = this.f5131b;
            int i = this.f5130a;
            this.f5130a = i + 1;
            return hVar.mo6214G(i);
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: a */
    public static final <T> boolean m7523a(@C12579k C1875h<T> hVar, long j) {
        return hVar.mo6219f(j);
    }

    /* renamed from: b */
    public static final <T> void m7524b(@C12579k C1875h<T> hVar, @C12579k C11304p<? super Long, ? super T, C11079d2> pVar) {
        int F = hVar.mo6213F();
        for (int i = 0; i < F; i++) {
            pVar.invoke(Long.valueOf(hVar.mo6228s(i)), hVar.mo6214G(i));
        }
    }

    /* renamed from: c */
    public static final <T> T m7525c(@C12579k C1875h<T> hVar, long j, T t) {
        return hVar.mo6224l(j, t);
    }

    /* renamed from: d */
    public static final <T> T m7526d(@C12579k C1875h<T> hVar, long j, @C12579k C11289a<? extends T> aVar) {
        T k = hVar.mo6223k(j);
        return k != null ? k : aVar.invoke();
    }

    /* renamed from: e */
    public static final <T> int m7527e(@C12579k C1875h<T> hVar) {
        return hVar.mo6213F();
    }

    /* renamed from: f */
    public static final <T> boolean m7528f(@C12579k C1875h<T> hVar) {
        return !hVar.mo6227o();
    }

    @C12579k
    /* renamed from: g */
    public static final <T> C10955l0 m7529g(@C12579k C1875h<T> hVar) {
        return new C1877a(hVar);
    }

    @C12579k
    /* renamed from: h */
    public static final <T> C1875h<T> m7530h(@C12579k C1875h<T> hVar, @C12579k C1875h<T> hVar2) {
        C1875h<T> hVar3 = new C1875h<>(hVar.mo6213F() + hVar2.mo6213F());
        hVar3.mo6231u(hVar);
        hVar3.mo6231u(hVar2);
        return hVar3;
    }

    @C11395k(message = "Replaced with member function. Remove extension import!")
    /* renamed from: i */
    public static final <T> boolean m7531i(@C12579k C1875h<T> hVar, long j, T t) {
        return hVar.mo6208A(j, t);
    }

    /* renamed from: j */
    public static final <T> void m7532j(@C12579k C1875h<T> hVar, long j, T t) {
        hVar.mo6229t(j, t);
    }

    @C12579k
    /* renamed from: k */
    public static final <T> Iterator<T> m7533k(@C12579k C1875h<T> hVar) {
        return new C1878b(hVar);
    }
}
