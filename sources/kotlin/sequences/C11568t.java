package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/TakeSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
/* renamed from: kotlin.sequences.t */
public final class C11568t<T> implements C11559m<T>, C11545e<T> {
    @C12579k

    /* renamed from: a */
    public final C11559m<T> f28754a;

    /* renamed from: b */
    public final int f28755b;

    /* renamed from: kotlin.sequences.t$a */
    public static final class C11569a implements Iterator<T>, C11345a {

        /* renamed from: a */
        public int f28756a;
        @C12579k

        /* renamed from: b */
        public final Iterator<T> f28757b;

        public C11569a(C11568t<T> tVar) {
            this.f28756a = tVar.f28755b;
            this.f28757b = tVar.f28754a.iterator();
        }

        @C12579k
        /* renamed from: b */
        public final Iterator<T> mo23269b() {
            return this.f28757b;
        }

        /* renamed from: c */
        public final int mo23270c() {
            return this.f28756a;
        }

        /* renamed from: d */
        public final void mo23271d(int i) {
            this.f28756a = i;
        }

        public boolean hasNext() {
            return this.f28756a > 0 && this.f28757b.hasNext();
        }

        public T next() {
            int i = this.f28756a;
            if (i != 0) {
                this.f28756a = i - 1;
                return this.f28757b.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C11568t(@C12579k C11559m<? extends T> mVar, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(mVar, "sequence");
        this.f28754a = mVar;
        this.f28755b = i;
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
        int i2 = this.f28755b;
        return i >= i2 ? SequencesKt__SequencesKt.m44590g() : new C11566s(this.f28754a, i, i2);
    }

    @C12579k
    /* renamed from: b */
    public C11559m<T> mo23195b(int i) {
        return i >= this.f28755b ? this : new C11568t(this.f28754a, i);
    }

    @C12579k
    public Iterator<T> iterator() {
        return new C11569a(this);
    }
}
