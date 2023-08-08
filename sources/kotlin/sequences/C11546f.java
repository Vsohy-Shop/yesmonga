package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.sequences.f */
public final class C11546f<T> implements C11559m<T> {
    @C12579k

    /* renamed from: a */
    public final C11559m<T> f28703a;
    @C12579k

    /* renamed from: b */
    public final C11300l<T, Boolean> f28704b;

    /* renamed from: kotlin.sequences.f$a */
    public static final class C11547a implements Iterator<T>, C11345a {
        @C12579k

        /* renamed from: a */
        public final Iterator<T> f28705a;

        /* renamed from: b */
        public int f28706b = -1;
        @C12580l

        /* renamed from: c */
        public T f28707c;

        /* renamed from: d */
        public final /* synthetic */ C11546f<T> f28708d;

        public C11547a(C11546f<T> fVar) {
            this.f28708d = fVar;
            this.f28705a = fVar.f28703a.iterator();
        }

        /* renamed from: b */
        public final void mo23203b() {
            while (this.f28705a.hasNext()) {
                T next = this.f28705a.next();
                if (!((Boolean) this.f28708d.f28704b.invoke(next)).booleanValue()) {
                    this.f28707c = next;
                    this.f28706b = 1;
                    return;
                }
            }
            this.f28706b = 0;
        }

        /* renamed from: c */
        public final int mo23204c() {
            return this.f28706b;
        }

        @C12579k
        /* renamed from: d */
        public final Iterator<T> mo23205d() {
            return this.f28705a;
        }

        @C12580l
        /* renamed from: e */
        public final T mo23206e() {
            return this.f28707c;
        }

        /* renamed from: f */
        public final void mo23207f(int i) {
            this.f28706b = i;
        }

        /* renamed from: h */
        public final void mo23208h(@C12580l T t) {
            this.f28707c = t;
        }

        public boolean hasNext() {
            if (this.f28706b == -1) {
                mo23203b();
            }
            if (this.f28706b == 1 || this.f28705a.hasNext()) {
                return true;
            }
            return false;
        }

        public T next() {
            if (this.f28706b == -1) {
                mo23203b();
            }
            if (this.f28706b != 1) {
                return this.f28705a.next();
            }
            T t = this.f28707c;
            this.f28707c = null;
            this.f28706b = 0;
            return t;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C11546f(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "sequence");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        this.f28703a = mVar;
        this.f28704b = lVar;
    }

    @C12579k
    public Iterator<T> iterator() {
        return new C11547a(this);
    }
}
