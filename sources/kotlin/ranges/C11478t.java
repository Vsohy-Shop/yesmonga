package kotlin.ranges;

import kotlin.C11429q;
import kotlin.C11665v0;
import kotlin.internal.C11110f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.ranges.t */
public class C11478t {
    /* renamed from: a */
    public static final void m44301a(boolean z, @C12579k Number number) {
        Intrinsics.checkNotNullParameter(number, "step");
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
        }
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: b */
    public static final <T, R extends C11459g<T> & Iterable<? extends T>> boolean m44302b(R r, T t) {
        Intrinsics.checkNotNullParameter(r, "<this>");
        if (t == null || !r.mo23006e((Comparable) t)) {
            return false;
        }
        return true;
    }

    @C11110f
    @C11429q
    @C11665v0(version = "1.7")
    /* renamed from: c */
    public static final <T, R extends C11475r<T> & Iterable<? extends T>> boolean m44303c(R r, T t) {
        Intrinsics.checkNotNullParameter(r, "<this>");
        if (t == null || !r.mo23006e((Comparable) t)) {
            return false;
        }
        return true;
    }

    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: d */
    public static final C11457f<Double> m44304d(double d, double d2) {
        return new C11455d(d, d2);
    }

    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: e */
    public static final C11457f<Float> m44305e(float f, float f2) {
        return new C11456e(f, f2);
    }

    @C12579k
    /* renamed from: f */
    public static final <T extends Comparable<? super T>> C11459g<T> m44306f(@C12579k T t, @C12579k T t2) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(t2, "that");
        return new C11462i(t, t2);
    }

    @C11429q
    @C11665v0(version = "1.7")
    @C12579k
    /* renamed from: g */
    public static final C11475r<Double> m44307g(double d, double d2) {
        return new C11473p(d, d2);
    }

    @C11429q
    @C11665v0(version = "1.7")
    @C12579k
    /* renamed from: h */
    public static final C11475r<Float> m44308h(float f, float f2) {
        return new C11474q(f, f2);
    }

    @C11429q
    @C11665v0(version = "1.7")
    @C12579k
    /* renamed from: i */
    public static final <T extends Comparable<? super T>> C11475r<T> m44309i(@C12579k T t, @C12579k T t2) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(t2, "that");
        return new C11461h(t, t2);
    }
}
