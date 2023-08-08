package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.sequences.u */
public final class C11570u<T> implements C11559m<T> {
    @C12579k

    /* renamed from: a */
    public final C11559m<T> f28758a;
    @C12579k

    /* renamed from: b */
    public final C11300l<T, Boolean> f28759b;

    /* renamed from: kotlin.sequences.u$a */
    public static final class C11571a implements Iterator<T>, C11345a {
        @C12579k

        /* renamed from: a */
        public final Iterator<T> f28760a;

        /* renamed from: b */
        public int f28761b = -1;
        @C12580l

        /* renamed from: c */
        public T f28762c;

        /* renamed from: d */
        public final /* synthetic */ C11570u<T> f28763d;

        public C11571a(C11570u<T> uVar) {
            this.f28763d = uVar;
            this.f28760a = uVar.f28758a.iterator();
        }

        /* renamed from: b */
        public final void mo23275b() {
            if (this.f28760a.hasNext()) {
                T next = this.f28760a.next();
                if (((Boolean) this.f28763d.f28759b.invoke(next)).booleanValue()) {
                    this.f28761b = 1;
                    this.f28762c = next;
                    return;
                }
            }
            this.f28761b = 0;
        }

        @C12579k
        /* renamed from: c */
        public final Iterator<T> mo23276c() {
            return this.f28760a;
        }

        @C12580l
        /* renamed from: d */
        public final T mo23277d() {
            return this.f28762c;
        }

        /* renamed from: e */
        public final int mo23278e() {
            return this.f28761b;
        }

        /* renamed from: f */
        public final void mo23279f(@C12580l T t) {
            this.f28762c = t;
        }

        /* renamed from: h */
        public final void mo23280h(int i) {
            this.f28761b = i;
        }

        public boolean hasNext() {
            if (this.f28761b == -1) {
                mo23275b();
            }
            if (this.f28761b == 1) {
                return true;
            }
            return false;
        }

        public T next() {
            if (this.f28761b == -1) {
                mo23275b();
            }
            if (this.f28761b != 0) {
                T t = this.f28762c;
                this.f28762c = null;
                this.f28761b = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C11570u(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "sequence");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        this.f28758a = mVar;
        this.f28759b = lVar;
    }

    @C12579k
    public Iterator<T> iterator() {
        return new C11571a(this);
    }
}
