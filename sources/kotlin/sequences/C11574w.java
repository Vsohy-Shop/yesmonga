package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.sequences.w */
public final class C11574w<T, R> implements C11559m<R> {
    @C12579k

    /* renamed from: a */
    public final C11559m<T> f28769a;
    @C12579k

    /* renamed from: b */
    public final C11300l<T, R> f28770b;

    /* renamed from: kotlin.sequences.w$a */
    public static final class C11575a implements Iterator<R>, C11345a {
        @C12579k

        /* renamed from: a */
        public final Iterator<T> f28771a;

        /* renamed from: b */
        public final /* synthetic */ C11574w<T, R> f28772b;

        public C11575a(C11574w<T, R> wVar) {
            this.f28772b = wVar;
            this.f28771a = wVar.f28769a.iterator();
        }

        @C12579k
        /* renamed from: b */
        public final Iterator<T> mo23291b() {
            return this.f28771a;
        }

        public boolean hasNext() {
            return this.f28771a.hasNext();
        }

        public R next() {
            return this.f28772b.f28770b.invoke(this.f28771a.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C11574w(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "sequence");
        Intrinsics.checkNotNullParameter(lVar, "transformer");
        this.f28769a = mVar;
        this.f28770b = lVar;
    }

    @C12579k
    /* renamed from: e */
    public final <E> C11559m<E> mo23290e(@C12579k C11300l<? super R, ? extends Iterator<? extends E>> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "iterator");
        return new C11551i(this.f28769a, this.f28770b, lVar);
    }

    @C12579k
    public Iterator<R> iterator() {
        return new C11575a(this);
    }
}
