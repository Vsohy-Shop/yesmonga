package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.C10942h0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.sequences.k */
public final class C11555k<T> implements C11559m<C10942h0<? extends T>> {
    @C12579k

    /* renamed from: a */
    public final C11559m<T> f28728a;

    /* renamed from: kotlin.sequences.k$a */
    public static final class C11556a implements Iterator<C10942h0<? extends T>>, C11345a {
        @C12579k

        /* renamed from: a */
        public final Iterator<T> f28729a;

        /* renamed from: b */
        public int f28730b;

        public C11556a(C11555k<T> kVar) {
            this.f28729a = kVar.f28728a.iterator();
        }

        /* renamed from: b */
        public final int mo23238b() {
            return this.f28730b;
        }

        @C12579k
        /* renamed from: c */
        public final Iterator<T> mo23239c() {
            return this.f28729a;
        }

        @C12579k
        /* renamed from: d */
        public C10942h0<T> next() {
            int i = this.f28730b;
            this.f28730b = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            return new C10942h0<>(i, this.f28729a.next());
        }

        /* renamed from: e */
        public final void mo23241e(int i) {
            this.f28730b = i;
        }

        public boolean hasNext() {
            return this.f28729a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C11555k(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "sequence");
        this.f28728a = mVar;
    }

    @C12579k
    public Iterator<C10942h0<T>> iterator() {
        return new C11556a(this);
    }
}
