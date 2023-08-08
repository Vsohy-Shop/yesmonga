package kotlin.random;

import java.io.Serializable;
import kotlin.C11076d0;
import kotlin.C11665v0;
import kotlin.internal.C11125m;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;

@C11665v0(version = "1.3")
@C11363r0({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/Random\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
public abstract class Random {
    @C12579k

    /* renamed from: a */
    public static final Default f28564a = new Default((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: b */
    public static final Random f28565b = C11125m.f28285a.mo22538b();

    @C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0012\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001&B\t\b\u0002¢\u0006\u0004\b$\u0010%J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000eH\u0016J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0014H\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016J \u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0016R\u0014\u0010\"\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, mo22516d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "bitCount", "b", "l", "until", "m", "from", "n", "", "o", "p", "q", "", "c", "", "h", "i", "j", "", "k", "", "array", "e", "size", "d", "fromIndex", "toIndex", "f", "defaultRandom", "Lkotlin/random/Random;", "<init>", "()V", "Serialized", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Default extends Random implements Serializable {

        @C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo22516d2 = {"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "serialVersionUID", "", "readResolve", "", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class Serialized implements Serializable {
            @C12579k

            /* renamed from: a */
            public static final Serialized f28566a = new Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.f28564a;
            }
        }

        public /* synthetic */ Default(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object writeReplace() {
            return Serialized.f28566a;
        }

        /* renamed from: b */
        public int mo22976b(int i) {
            return Random.f28565b.mo22976b(i);
        }

        /* renamed from: c */
        public boolean mo22977c() {
            return Random.f28565b.mo22977c();
        }

        @C12579k
        /* renamed from: d */
        public byte[] mo22978d(int i) {
            return Random.f28565b.mo22978d(i);
        }

        @C12579k
        /* renamed from: e */
        public byte[] mo22979e(@C12579k byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "array");
            return Random.f28565b.mo22979e(bArr);
        }

        @C12579k
        /* renamed from: f */
        public byte[] mo22980f(@C12579k byte[] bArr, int i, int i2) {
            Intrinsics.checkNotNullParameter(bArr, "array");
            return Random.f28565b.mo22980f(bArr, i, i2);
        }

        /* renamed from: h */
        public double mo22981h() {
            return Random.f28565b.mo22981h();
        }

        /* renamed from: i */
        public double mo22982i(double d) {
            return Random.f28565b.mo22982i(d);
        }

        /* renamed from: j */
        public double mo22983j(double d, double d2) {
            return Random.f28565b.mo22983j(d, d2);
        }

        /* renamed from: k */
        public float mo22984k() {
            return Random.f28565b.mo22984k();
        }

        /* renamed from: l */
        public int mo22985l() {
            return Random.f28565b.mo22985l();
        }

        /* renamed from: m */
        public int mo22986m(int i) {
            return Random.f28565b.mo22986m(i);
        }

        /* renamed from: n */
        public int mo22987n(int i, int i2) {
            return Random.f28565b.mo22987n(i, i2);
        }

        /* renamed from: o */
        public long mo22988o() {
            return Random.f28565b.mo22988o();
        }

        /* renamed from: p */
        public long mo22989p(long j) {
            return Random.f28565b.mo22989p(j);
        }

        /* renamed from: q */
        public long mo22990q(long j, long j2) {
            return Random.f28565b.mo22990q(j, j2);
        }

        private Default() {
        }
    }

    /* renamed from: g */
    public static /* synthetic */ byte[] m44071g(Random random, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return random.mo22980f(bArr, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
    }

    /* renamed from: b */
    public abstract int mo22976b(int i);

    /* renamed from: c */
    public boolean mo22977c() {
        return mo22976b(1) != 0;
    }

    @C12579k
    /* renamed from: d */
    public byte[] mo22978d(int i) {
        return mo22979e(new byte[i]);
    }

    @C12579k
    /* renamed from: e */
    public byte[] mo22979e(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "array");
        return mo22980f(bArr, 0, bArr.length);
    }

    @C12579k
    /* renamed from: f */
    public byte[] mo22980f(@C12579k byte[] bArr, int i, int i2) {
        boolean z;
        Intrinsics.checkNotNullParameter(bArr, "array");
        boolean z2 = true;
        if (!new C11466l(0, bArr.length).mo23056Q(i) || !new C11466l(0, bArr.length).mo23056Q(i2)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (i > i2) {
                z2 = false;
            }
            if (z2) {
                int i3 = (i2 - i) / 4;
                for (int i4 = 0; i4 < i3; i4++) {
                    int l = mo22985l();
                    bArr[i] = (byte) l;
                    bArr[i + 1] = (byte) (l >>> 8);
                    bArr[i + 2] = (byte) (l >>> 16);
                    bArr[i + 3] = (byte) (l >>> 24);
                    i += 4;
                }
                int i5 = i2 - i;
                int b = mo22976b(i5 * 8);
                for (int i6 = 0; i6 < i5; i6++) {
                    bArr[i + i6] = (byte) (b >>> (i6 * 8));
                }
                return bArr;
            }
            throw new IllegalArgumentException(("fromIndex (" + i + ") must be not greater than toIndex (" + i2 + ").").toString());
        }
        throw new IllegalArgumentException(("fromIndex (" + i + ") or toIndex (" + i2 + ") are out of range: 0.." + bArr.length + '.').toString());
    }

    /* renamed from: h */
    public double mo22981h() {
        return C11442c.m44118d(mo22976b(26), mo22976b(27));
    }

    /* renamed from: i */
    public double mo22982i(double d) {
        return mo22983j(0.0d, d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double mo22983j(double r7, double r9) {
        /*
            r6 = this;
            kotlin.random.C11443d.m44122d(r7, r9)
            double r0 = r9 - r7
            boolean r2 = java.lang.Double.isInfinite(r0)
            if (r2 == 0) goto L_0x003d
            boolean r2 = java.lang.Double.isInfinite(r7)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x001b
            boolean r2 = java.lang.Double.isNaN(r7)
            if (r2 != 0) goto L_0x001b
            r2 = r3
            goto L_0x001c
        L_0x001b:
            r2 = r4
        L_0x001c:
            if (r2 == 0) goto L_0x003d
            boolean r2 = java.lang.Double.isInfinite(r9)
            if (r2 != 0) goto L_0x002b
            boolean r2 = java.lang.Double.isNaN(r9)
            if (r2 != 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r3 = r4
        L_0x002c:
            if (r3 == 0) goto L_0x003d
            double r0 = r6.mo22981h()
            r2 = 2
            double r2 = (double) r2
            double r4 = r9 / r2
            double r2 = r7 / r2
            double r4 = r4 - r2
            double r0 = r0 * r4
            double r7 = r7 + r0
            double r7 = r7 + r0
            goto L_0x0043
        L_0x003d:
            double r2 = r6.mo22981h()
            double r2 = r2 * r0
            double r7 = r7 + r2
        L_0x0043:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x004d
            r7 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r7 = java.lang.Math.nextAfter(r9, r7)
        L_0x004d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.random.Random.mo22983j(double, double):double");
    }

    /* renamed from: k */
    public float mo22984k() {
        return ((float) mo22976b(24)) / 1.6777216E7f;
    }

    /* renamed from: l */
    public int mo22985l() {
        return mo22976b(32);
    }

    /* renamed from: m */
    public int mo22986m(int i) {
        return mo22987n(0, i);
    }

    /* renamed from: n */
    public int mo22987n(int i, int i2) {
        int i3;
        int l;
        int i4;
        int l2;
        boolean z;
        C11443d.m44123e(i, i2);
        int i5 = i2 - i;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                i3 = mo22976b(C11443d.m44125g(i5));
            } else {
                do {
                    l = mo22985l() >>> 1;
                    i4 = l % i5;
                } while ((l - i4) + (i5 - 1) < 0);
                i3 = i4;
            }
            return i + i3;
        }
        do {
            l2 = mo22985l();
            z = false;
            if (i <= l2 && l2 < i2) {
                z = true;
                continue;
            }
        } while (!z);
        return l2;
    }

    /* renamed from: o */
    public long mo22988o() {
        return (((long) mo22985l()) << 32) + ((long) mo22985l());
    }

    /* renamed from: p */
    public long mo22989p(long j) {
        return mo22990q(0, j);
    }

    /* renamed from: q */
    public long mo22990q(long j, long j2) {
        long o;
        boolean z;
        long j3;
        long o2;
        long j4;
        int l;
        C11443d.m44124f(j, j2);
        long j5 = j2 - j;
        if (j5 > 0) {
            if (((-j5) & j5) == j5) {
                int i = (int) j5;
                int i2 = (int) (j5 >>> 32);
                if (i != 0) {
                    l = mo22976b(C11443d.m44125g(i));
                } else if (i2 == 1) {
                    l = mo22985l();
                } else {
                    j3 = (((long) mo22976b(C11443d.m44125g(i2))) << 32) + (((long) mo22985l()) & 4294967295L);
                }
                j3 = ((long) l) & 4294967295L;
            } else {
                do {
                    o2 = mo22988o() >>> 1;
                    j4 = o2 % j5;
                } while ((o2 - j4) + (j5 - 1) < 0);
                j3 = j4;
            }
            return j + j3;
        }
        do {
            o = mo22988o();
            z = false;
            if (j <= o && o < j2) {
                z = true;
                continue;
            }
        } while (!z);
        return o;
    }
}
