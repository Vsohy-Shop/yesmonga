package kotlin.time;

import kotlin.jvm.internal.C11363r0;
import kotlin.time.C11636e;

@C11363r0({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,75:1\n74#1:76\n74#1:77\n74#1:78\n74#1:79\n74#1:80\n74#1:81\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n15#1:76\n18#1:77\n36#1:78\n45#1:79\n52#1:80\n56#1:81\n*E\n"})
/* renamed from: kotlin.time.l */
public final class C11647l {
    /* renamed from: a */
    public static final long m45663a(long j, long j2, long j3) {
        if (!C11636e.m45460T1(j2) || (j ^ j3) >= 0) {
            return j;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    /* renamed from: b */
    public static final boolean m45664b(long j) {
        return ((j - 1) | 1) == Long.MAX_VALUE;
    }

    /* renamed from: c */
    public static final long m45665c(long j, long j2) {
        boolean z;
        long n1 = C11636e.m45487n1(j2);
        boolean z2 = true;
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m45663a(j, j2, n1);
        }
        if ((1 | (n1 - 1)) != Long.MAX_VALUE) {
            z2 = false;
        }
        if (z2) {
            return m45666d(j, j2);
        }
        long j3 = j + n1;
        if (((j ^ j3) & (n1 ^ j3)) >= 0) {
            return j3;
        }
        if (j < 0) {
            return Long.MIN_VALUE;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: d */
    public static final long m45666d(long j, long j2) {
        boolean z;
        long e0 = C11636e.m45470e0(j2, 2);
        if (((C11636e.m45487n1(e0) - 1) | 1) == Long.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return (long) (((double) j) + C11636e.m45488n2(j2, DurationUnit.NANOSECONDS));
        }
        return m45665c(m45665c(j, e0), C11636e.m45467a2(j2, e0));
    }

    /* renamed from: e */
    public static final long m45667e(long j, long j2) {
        boolean z;
        if ((1 | (j2 - 1)) == Long.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C11636e.m45506w2(C11639g.m45640n0(j2, DurationUnit.DAYS));
        }
        return m45668f(j, j2);
    }

    /* renamed from: f */
    public static final long m45668f(long j, long j2) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) < 0) {
            long j4 = (long) 1000000;
            long j5 = (j % j4) - (j2 % j4);
            C11636e.C11637a aVar = C11636e.f28954b;
            return C11636e.m45469c2(C11639g.m45640n0((j / j4) - (j2 / j4), DurationUnit.MILLISECONDS), C11639g.m45640n0(j5, DurationUnit.NANOSECONDS));
        }
        C11636e.C11637a aVar2 = C11636e.f28954b;
        return C11639g.m45640n0(j3, DurationUnit.NANOSECONDS);
    }

    /* renamed from: g */
    public static final long m45669g(long j, long j2) {
        boolean z;
        boolean z2 = true;
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if ((1 | (j - 1)) != Long.MAX_VALUE) {
                z2 = false;
            }
            if (z2) {
                return C11639g.m45640n0(j, DurationUnit.DAYS);
            }
            return m45668f(j, j2);
        } else if (j == j2) {
            return C11636e.f28954b.mo23447W();
        } else {
            return C11636e.m45506w2(C11639g.m45640n0(j2, DurationUnit.DAYS));
        }
    }
}
