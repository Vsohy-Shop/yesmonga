package androidx.collection;

import java.util.Iterator;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.collections.C10953k0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.collection.n */
public final class C1888n {

    /* renamed from: androidx.collection.n$a */
    public static final class C1889a extends C10953k0 {

        /* renamed from: a */
        public int f5172a;

        /* renamed from: b */
        public final /* synthetic */ C1887m f5173b;

        public C1889a(C1887m<T> mVar) {
            this.f5173b = mVar;
        }

        /* renamed from: c */
        public int mo6374c() {
            C1887m mVar = this.f5173b;
            int i = this.f5172a;
            this.f5172a = i + 1;
            return mVar.mo6368s(i);
        }

        /* renamed from: d */
        public final int mo6375d() {
            return this.f5172a;
        }

        /* renamed from: e */
        public final void mo6376e(int i) {
            this.f5172a = i;
        }

        public boolean hasNext() {
            return this.f5172a < this.f5173b.mo6353G();
        }
    }

    /* renamed from: androidx.collection.n$b */
    public static final class C1890b implements Iterator<T>, C11345a {

        /* renamed from: a */
        public int f5174a;

        /* renamed from: b */
        public final /* synthetic */ C1887m f5175b;

        public C1890b(C1887m<T> mVar) {
            this.f5175b = mVar;
        }

        /* renamed from: b */
        public final int mo6378b() {
            return this.f5174a;
        }

        /* renamed from: c */
        public final void mo6379c(int i) {
            this.f5174a = i;
        }

        public boolean hasNext() {
            return this.f5174a < this.f5175b.mo6353G();
        }

        public T next() {
            C1887m mVar = this.f5175b;
            int i = this.f5174a;
            this.f5174a = i + 1;
            return mVar.mo6354H(i);
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: a */
    public static final <T> boolean m7615a(@C12579k C1887m<T> mVar, int i) {
        return mVar.mo6359f(i);
    }

    /* renamed from: b */
    public static final <T> void m7616b(@C12579k C1887m<T> mVar, @C12579k C11304p<? super Integer, ? super T, C11079d2> pVar) {
        int G = mVar.mo6353G();
        for (int i = 0; i < G; i++) {
            pVar.invoke(Integer.valueOf(mVar.mo6368s(i)), mVar.mo6354H(i));
        }
    }

    /* renamed from: c */
    public static final <T> T m7617c(@C12579k C1887m<T> mVar, int i, T t) {
        return mVar.mo6364l(i, t);
    }

    /* renamed from: d */
    public static final <T> T m7618d(@C12579k C1887m<T> mVar, int i, @C12579k C11289a<? extends T> aVar) {
        T k = mVar.mo6363k(i);
        return k != null ? k : aVar.invoke();
    }

    /* renamed from: e */
    public static final <T> int m7619e(@C12579k C1887m<T> mVar) {
        return mVar.mo6353G();
    }

    /* renamed from: f */
    public static final <T> boolean m7620f(@C12579k C1887m<T> mVar) {
        return !mVar.mo6367o();
    }

    @C12579k
    /* renamed from: g */
    public static final <T> C10953k0 m7621g(@C12579k C1887m<T> mVar) {
        return new C1889a(mVar);
    }

    @C12579k
    /* renamed from: h */
    public static final <T> C1887m<T> m7622h(@C12579k C1887m<T> mVar, @C12579k C1887m<T> mVar2) {
        C1887m<T> mVar3 = new C1887m<>(mVar.mo6353G() + mVar2.mo6353G());
        mVar3.mo6371u(mVar);
        mVar3.mo6371u(mVar2);
        return mVar3;
    }

    @C11395k(message = "Replaced with member function. Remove extension import!")
    /* renamed from: i */
    public static final <T> boolean m7623i(@C12579k C1887m<T> mVar, int i, T t) {
        return mVar.mo6347A(i, t);
    }

    /* renamed from: j */
    public static final <T> void m7624j(@C12579k C1887m<T> mVar, int i, T t) {
        mVar.mo6369t(i, t);
    }

    @C12579k
    /* renamed from: k */
    public static final <T> Iterator<T> m7625k(@C12579k C1887m<T> mVar) {
        return new C1890b(mVar);
    }
}
