package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.sequences.j */
public final class C11553j<T> implements C11559m<T> {
    @C12579k

    /* renamed from: a */
    public final C11289a<T> f28723a;
    @C12579k

    /* renamed from: b */
    public final C11300l<T, T> f28724b;

    /* renamed from: kotlin.sequences.j$a */
    public static final class C11554a implements Iterator<T>, C11345a {
        @C12580l

        /* renamed from: a */
        public T f28725a;

        /* renamed from: b */
        public int f28726b = -2;

        /* renamed from: c */
        public final /* synthetic */ C11553j<T> f28727c;

        public C11554a(C11553j<T> jVar) {
            this.f28727c = jVar;
        }

        /* renamed from: b */
        public final void mo23230b() {
            T t;
            int i;
            if (this.f28726b == -2) {
                t = this.f28727c.f28723a.invoke();
            } else {
                C11300l d = this.f28727c.f28724b;
                T t2 = this.f28725a;
                Intrinsics.checkNotNull(t2);
                t = d.invoke(t2);
            }
            this.f28725a = t;
            if (t == null) {
                i = 0;
            } else {
                i = 1;
            }
            this.f28726b = i;
        }

        @C12580l
        /* renamed from: c */
        public final T mo23231c() {
            return this.f28725a;
        }

        /* renamed from: d */
        public final int mo23232d() {
            return this.f28726b;
        }

        /* renamed from: e */
        public final void mo23233e(@C12580l T t) {
            this.f28725a = t;
        }

        /* renamed from: f */
        public final void mo23234f(int i) {
            this.f28726b = i;
        }

        public boolean hasNext() {
            if (this.f28726b < 0) {
                mo23230b();
            }
            if (this.f28726b == 1) {
                return true;
            }
            return false;
        }

        @C12579k
        public T next() {
            if (this.f28726b < 0) {
                mo23230b();
            }
            if (this.f28726b != 0) {
                T t = this.f28725a;
                Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f28726b = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C11553j(@C12579k C11289a<? extends T> aVar, @C12579k C11300l<? super T, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(aVar, "getInitialValue");
        Intrinsics.checkNotNullParameter(lVar, "getNextValue");
        this.f28723a = aVar;
        this.f28724b = lVar;
    }

    @C12579k
    public Iterator<T> iterator() {
        return new C11554a(this);
    }
}
