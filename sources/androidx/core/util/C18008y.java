package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Range;
import androidx.annotation.C0376v0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11459g;
import org.jetbrains.annotations.C12579k;

@SuppressLint({"ClassVerificationFailure"})
/* renamed from: androidx.core.util.y */
public final class C18008y {

    /* renamed from: androidx.core.util.y$a */
    public static final class C18009a implements C11459g<T> {

        /* renamed from: a */
        public final /* synthetic */ Range<T> f46521a;

        public C18009a(Range<T> range) {
            this.f46521a = range;
        }

        /* renamed from: e */
        public boolean mo23006e(@C12579k T t) {
            return C11459g.C11460a.m44245a(this, t);
        }

        public T getStart() {
            return this.f46521a.getLower();
        }

        public boolean isEmpty() {
            return C11459g.C11460a.m44246b(this);
        }

        /* renamed from: q */
        public T mo23013q() {
            return this.f46521a.getUpper();
        }
    }

    @C0376v0(21)
    @C12579k
    /* renamed from: a */
    public static final <T extends Comparable<? super T>> Range<T> m81795a(@C12579k Range<T> range, @C12579k Range<T> range2) {
        Intrinsics.checkNotNullParameter(range, "<this>");
        Intrinsics.checkNotNullParameter(range2, "other");
        Range<T> intersect = range.intersect(range2);
        Intrinsics.checkNotNullExpressionValue(intersect, "intersect(other)");
        return intersect;
    }

    @C0376v0(21)
    @C12579k
    /* renamed from: b */
    public static final <T extends Comparable<? super T>> Range<T> m81796b(@C12579k Range<T> range, @C12579k Range<T> range2) {
        Intrinsics.checkNotNullParameter(range, "<this>");
        Intrinsics.checkNotNullParameter(range2, "other");
        Range<T> extend = range.extend(range2);
        Intrinsics.checkNotNullExpressionValue(extend, "extend(other)");
        return extend;
    }

    @C0376v0(21)
    @C12579k
    /* renamed from: c */
    public static final <T extends Comparable<? super T>> Range<T> m81797c(@C12579k Range<T> range, @C12579k T t) {
        Intrinsics.checkNotNullParameter(range, "<this>");
        Intrinsics.checkNotNullParameter(t, "value");
        Range<T> extend = range.extend(t);
        Intrinsics.checkNotNullExpressionValue(extend, "extend(value)");
        return extend;
    }

    @C0376v0(21)
    @C12579k
    /* renamed from: d */
    public static final <T extends Comparable<? super T>> Range<T> m81798d(@C12579k T t, @C12579k T t2) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(t2, "that");
        return new Range<>(t, t2);
    }

    @C0376v0(21)
    @C12579k
    /* renamed from: e */
    public static final <T extends Comparable<? super T>> C11459g<T> m81799e(@C12579k Range<T> range) {
        Intrinsics.checkNotNullParameter(range, "<this>");
        return new C18009a(range);
    }

    @C0376v0(21)
    @C12579k
    /* renamed from: f */
    public static final <T extends Comparable<? super T>> Range<T> m81800f(@C12579k C11459g<T> gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return new Range<>(gVar.getStart(), gVar.mo23013q());
    }
}
