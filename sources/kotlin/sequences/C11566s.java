package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SubSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
/* renamed from: kotlin.sequences.s */
public final class C11566s<T> implements C11559m<T>, C11545e<T> {
    @C12579k

    /* renamed from: a */
    public final C11559m<T> f28748a;

    /* renamed from: b */
    public final int f28749b;

    /* renamed from: c */
    public final int f28750c;

    /* renamed from: kotlin.sequences.s$a */
    public static final class C11567a implements Iterator<T>, C11345a {
        @C12579k

        /* renamed from: a */
        public final Iterator<T> f28751a;

        /* renamed from: b */
        public int f28752b;

        /* renamed from: c */
        public final /* synthetic */ C11566s<T> f28753c;

        public C11567a(C11566s<T> sVar) {
            this.f28753c = sVar;
            this.f28751a = sVar.f28748a.iterator();
        }

        /* renamed from: b */
        public final void mo23262b() {
            while (this.f28752b < this.f28753c.f28749b && this.f28751a.hasNext()) {
                this.f28751a.next();
                this.f28752b++;
            }
        }

        @C12579k
        /* renamed from: c */
        public final Iterator<T> mo23263c() {
            return this.f28751a;
        }

        /* renamed from: d */
        public final int mo23264d() {
            return this.f28752b;
        }

        /* renamed from: e */
        public final void mo23265e(int i) {
            this.f28752b = i;
        }

        public boolean hasNext() {
            mo23262b();
            if (this.f28752b >= this.f28753c.f28750c || !this.f28751a.hasNext()) {
                return false;
            }
            return true;
        }

        public T next() {
            mo23262b();
            if (this.f28752b < this.f28753c.f28750c) {
                this.f28752b++;
                return this.f28751a.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C11566s(@C12579k C11559m<? extends T> mVar, int i, int i2) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(mVar, "sequence");
        this.f28748a = mVar;
        this.f28749b = i;
        this.f28750c = i2;
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (!(i2 < i ? false : z3)) {
                    throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i2 + " < " + i).toString());
                }
                return;
            }
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i2).toString());
        }
        throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i).toString());
    }

    @C12579k
    /* renamed from: a */
    public C11559m<T> mo23194a(int i) {
        return i >= mo23261f() ? SequencesKt__SequencesKt.m44590g() : new C11566s(this.f28748a, this.f28749b + i, this.f28750c);
    }

    @C12579k
    /* renamed from: b */
    public C11559m<T> mo23195b(int i) {
        if (i >= mo23261f()) {
            return this;
        }
        C11559m<T> mVar = this.f28748a;
        int i2 = this.f28749b;
        return new C11566s(mVar, i2, i + i2);
    }

    /* renamed from: f */
    public final int mo23261f() {
        return this.f28750c - this.f28749b;
    }

    @C12579k
    public Iterator<T> iterator() {
        return new C11567a(this);
    }
}
