package kotlin.random;

import com.urbanairship.automation.C8970v;
import kotlin.C11665v0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11471o;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/RandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
/* renamed from: kotlin.random.d */
public final class C11443d {
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: a */
    public static final Random m44119a(int i) {
        return new XorWowRandom(i, i >> 31);
    }

    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: b */
    public static final Random m44120b(long j) {
        return new XorWowRandom((int) j, (int) (j >> 32));
    }

    @C12579k
    /* renamed from: c */
    public static final String m44121c(@C12579k Object obj, @C12579k Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "from");
        Intrinsics.checkNotNullParameter(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    /* renamed from: d */
    public static final void m44122d(double d, double d2) {
        if (!(d2 > d)) {
            throw new IllegalArgumentException(m44121c(Double.valueOf(d), Double.valueOf(d2)).toString());
        }
    }

    /* renamed from: e */
    public static final void m44123e(int i, int i2) {
        if (!(i2 > i)) {
            throw new IllegalArgumentException(m44121c(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
    }

    /* renamed from: f */
    public static final void m44124f(long j, long j2) {
        if (!(j2 > j)) {
            throw new IllegalArgumentException(m44121c(Long.valueOf(j), Long.valueOf(j2)).toString());
        }
    }

    /* renamed from: g */
    public static final int m44125g(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    @C11665v0(version = "1.3")
    /* renamed from: h */
    public static final int m44126h(@C12579k Random random, @C12579k C11466l lVar) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C8970v.f24100k);
        if (lVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + lVar);
        } else if (lVar.mo23051w() < Integer.MAX_VALUE) {
            return random.mo22987n(lVar.mo23049r(), lVar.mo23051w() + 1);
        } else {
            if (lVar.mo23049r() > Integer.MIN_VALUE) {
                return random.mo22987n(lVar.mo23049r() - 1, lVar.mo23051w()) + 1;
            }
            return random.mo22985l();
        }
    }

    @C11665v0(version = "1.3")
    /* renamed from: i */
    public static final long m44127i(@C12579k Random random, @C12579k C11471o oVar) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(oVar, C8970v.f24100k);
        if (oVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + oVar);
        } else if (oVar.mo23068w() < Long.MAX_VALUE) {
            return random.mo22990q(oVar.mo23066r(), oVar.mo23068w() + 1);
        } else {
            if (oVar.mo23066r() > Long.MIN_VALUE) {
                return random.mo22990q(oVar.mo23066r() - 1, oVar.mo23068w()) + 1;
            }
            return random.mo22988o();
        }
    }

    /* renamed from: j */
    public static final int m44128j(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }
}
