package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.sequences.h */
public final class C11549h<T> implements C11559m<T> {
    @C12579k

    /* renamed from: a */
    public final C11559m<T> f28710a;

    /* renamed from: b */
    public final boolean f28711b;
    @C12579k

    /* renamed from: c */
    public final C11300l<T, Boolean> f28712c;

    /* renamed from: kotlin.sequences.h$a */
    public static final class C11550a implements Iterator<T>, C11345a {
        @C12579k

        /* renamed from: a */
        public final Iterator<T> f28713a;

        /* renamed from: b */
        public int f28714b = -1;
        @C12580l

        /* renamed from: c */
        public T f28715c;

        /* renamed from: d */
        public final /* synthetic */ C11549h<T> f28716d;

        public C11550a(C11549h<T> hVar) {
            this.f28716d = hVar;
            this.f28713a = hVar.f28710a.iterator();
        }

        /* renamed from: b */
        public final void mo23214b() {
            while (this.f28713a.hasNext()) {
                T next = this.f28713a.next();
                if (((Boolean) this.f28716d.f28712c.invoke(next)).booleanValue() == this.f28716d.f28711b) {
                    this.f28715c = next;
                    this.f28714b = 1;
                    return;
                }
            }
            this.f28714b = 0;
        }

        @C12579k
        /* renamed from: c */
        public final Iterator<T> mo23215c() {
            return this.f28713a;
        }

        @C12580l
        /* renamed from: d */
        public final T mo23216d() {
            return this.f28715c;
        }

        /* renamed from: e */
        public final int mo23217e() {
            return this.f28714b;
        }

        /* renamed from: f */
        public final void mo23218f(@C12580l T t) {
            this.f28715c = t;
        }

        /* renamed from: h */
        public final void mo23219h(int i) {
            this.f28714b = i;
        }

        public boolean hasNext() {
            if (this.f28714b == -1) {
                mo23214b();
            }
            if (this.f28714b == 1) {
                return true;
            }
            return false;
        }

        public T next() {
            if (this.f28714b == -1) {
                mo23214b();
            }
            if (this.f28714b != 0) {
                T t = this.f28715c;
                this.f28715c = null;
                this.f28714b = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C11549h(@C12579k C11559m<? extends T> mVar, boolean z, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "sequence");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        this.f28710a = mVar;
        this.f28711b = z;
        this.f28712c = lVar;
    }

    @C12579k
    public Iterator<T> iterator() {
        return new C11550a(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11549h(C11559m mVar, boolean z, C11300l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, (i & 2) != 0 ? true : z, lVar);
    }
}
