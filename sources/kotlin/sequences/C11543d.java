package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/DropSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
/* renamed from: kotlin.sequences.d */
public final class C11543d<T> implements C11559m<T>, C11545e<T> {
    @C12579k

    /* renamed from: a */
    public final C11559m<T> f28699a;

    /* renamed from: b */
    public final int f28700b;

    /* renamed from: kotlin.sequences.d$a */
    public static final class C11544a implements Iterator<T>, C11345a {
        @C12579k

        /* renamed from: a */
        public final Iterator<T> f28701a;

        /* renamed from: b */
        public int f28702b;

        public C11544a(C11543d<T> dVar) {
            this.f28701a = dVar.f28699a.iterator();
            this.f28702b = dVar.f28700b;
        }

        /* renamed from: b */
        public final void mo23196b() {
            while (this.f28702b > 0 && this.f28701a.hasNext()) {
                this.f28701a.next();
                this.f28702b--;
            }
        }

        @C12579k
        /* renamed from: c */
        public final Iterator<T> mo23197c() {
            return this.f28701a;
        }

        /* renamed from: d */
        public final int mo23198d() {
            return this.f28702b;
        }

        /* renamed from: e */
        public final void mo23199e(int i) {
            this.f28702b = i;
        }

        public boolean hasNext() {
            mo23196b();
            return this.f28701a.hasNext();
        }

        public T next() {
            mo23196b();
            return this.f28701a.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C11543d(@C12579k C11559m<? extends T> mVar, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(mVar, "sequence");
        this.f28699a = mVar;
        this.f28700b = i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
    }

    @C12579k
    /* renamed from: a */
    public C11559m<T> mo23194a(int i) {
        int i2 = this.f28700b + i;
        return i2 < 0 ? new C11543d(this, i) : new C11543d(this.f28699a, i2);
    }

    @C12579k
    /* renamed from: b */
    public C11559m<T> mo23195b(int i) {
        int i2 = this.f28700b;
        int i3 = i2 + i;
        return i3 < 0 ? new C11568t(this, i) : new C11566s(this.f28699a, i2, i3);
    }

    @C12579k
    public Iterator<T> iterator() {
        return new C11544a(this);
    }
}
