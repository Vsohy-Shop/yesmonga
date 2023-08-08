package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.sequences.l */
public final class C11557l<T1, T2, V> implements C11559m<V> {
    @C12579k

    /* renamed from: a */
    public final C11559m<T1> f28731a;
    @C12579k

    /* renamed from: b */
    public final C11559m<T2> f28732b;
    @C12579k

    /* renamed from: c */
    public final C11304p<T1, T2, V> f28733c;

    /* renamed from: kotlin.sequences.l$a */
    public static final class C11558a implements Iterator<V>, C11345a {
        @C12579k

        /* renamed from: a */
        public final Iterator<T1> f28734a;
        @C12579k

        /* renamed from: b */
        public final Iterator<T2> f28735b;

        /* renamed from: c */
        public final /* synthetic */ C11557l<T1, T2, V> f28736c;

        public C11558a(C11557l<T1, T2, V> lVar) {
            this.f28736c = lVar;
            this.f28734a = lVar.f28731a.iterator();
            this.f28735b = lVar.f28732b.iterator();
        }

        @C12579k
        /* renamed from: b */
        public final Iterator<T1> mo23245b() {
            return this.f28734a;
        }

        @C12579k
        /* renamed from: c */
        public final Iterator<T2> mo23246c() {
            return this.f28735b;
        }

        public boolean hasNext() {
            return this.f28734a.hasNext() && this.f28735b.hasNext();
        }

        public V next() {
            return this.f28736c.f28733c.invoke(this.f28734a.next(), this.f28735b.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C11557l(@C12579k C11559m<? extends T1> mVar, @C12579k C11559m<? extends T2> mVar2, @C12579k C11304p<? super T1, ? super T2, ? extends V> pVar) {
        Intrinsics.checkNotNullParameter(mVar, "sequence1");
        Intrinsics.checkNotNullParameter(mVar2, "sequence2");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        this.f28731a = mVar;
        this.f28732b = mVar2;
        this.f28733c = pVar;
    }

    @C12579k
    public Iterator<V> iterator() {
        return new C11558a(this);
    }
}
