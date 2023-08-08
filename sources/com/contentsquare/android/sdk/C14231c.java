package com.contentsquare.android.sdk;

import java.util.Arrays;
import kotlin.jvm.internal.C11354n;
import org.joda.time.DateTimeFieldType;

/* renamed from: com.contentsquare.android.sdk.c */
public abstract class C14231c {

    /* renamed from: f */
    public static volatile int f35149f = 100;

    /* renamed from: a */
    public int f35150a;

    /* renamed from: b */
    public int f35151b;

    /* renamed from: c */
    public int f35152c;

    /* renamed from: d */
    public C14690s f35153d;

    /* renamed from: e */
    public boolean f35154e;

    /* renamed from: com.contentsquare.android.sdk.c$b */
    public static final class C14233b extends C14231c {

        /* renamed from: g */
        public final byte[] f35155g;

        /* renamed from: h */
        public final boolean f35156h;

        /* renamed from: i */
        public int f35157i;

        /* renamed from: j */
        public int f35158j;

        /* renamed from: k */
        public int f35159k;

        /* renamed from: l */
        public int f35160l;

        /* renamed from: m */
        public int f35161m;

        /* renamed from: n */
        public boolean f35162n;

        /* renamed from: o */
        public int f35163o;

        public C14233b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f35163o = Integer.MAX_VALUE;
            this.f35155g = bArr;
            this.f35157i = i2 + i;
            this.f35159k = i;
            this.f35160l = i;
            this.f35156h = z;
        }

        /* renamed from: A */
        public int mo34724A() {
            if (mo34729h()) {
                this.f35161m = 0;
                return 0;
            }
            int N = mo34758N();
            this.f35161m = N;
            if (C14710sf.m63424a(N) != 0) {
                return this.f35161m;
            }
            throw C14394h5.m62026d();
        }

        /* renamed from: B */
        public int mo34725B() {
            return mo34758N();
        }

        /* renamed from: C */
        public long mo34726C() {
            return mo34759O();
        }

        /* renamed from: D */
        public final void mo34748D() {
            int i = this.f35157i + this.f35158j;
            this.f35157i = i;
            int i2 = i - this.f35160l;
            int i3 = this.f35163o;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f35158j = i4;
                this.f35157i = i - i4;
                return;
            }
            this.f35158j = 0;
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: E */
        public void mo34749E() {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo34724A()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo34735n(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14231c.C14233b.mo34749E():void");
        }

        /* renamed from: F */
        public final void mo34750F() {
            if (this.f35157i - this.f35159k >= 10) {
                mo34751G();
            } else {
                mo34752H();
            }
        }

        /* renamed from: G */
        public final void mo34751G() {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.f35155g;
                int i2 = this.f35159k;
                this.f35159k = i2 + 1;
                if (bArr[i2] < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw C14394h5.m62029g();
        }

        /* renamed from: H */
        public final void mo34752H() {
            int i = 0;
            while (i < 10) {
                if (mo34755K() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw C14394h5.m62029g();
        }

        /* renamed from: I */
        public byte[] mo34753I(int i) {
            if (i > 0) {
                int i2 = this.f35157i;
                int i3 = this.f35159k;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.f35159k = i4;
                    return Arrays.copyOfRange(this.f35155g, i3, i4);
                }
            }
            if (i > 0) {
                throw C14394h5.m62033k();
            } else if (i == 0) {
                return C14566o3.f36059d;
            } else {
                throw C14394h5.m62030h();
            }
        }

        /* renamed from: J */
        public void mo34754J(int i) {
            if (i >= 0) {
                int i2 = this.f35157i;
                int i3 = this.f35159k;
                if (i <= i2 - i3) {
                    this.f35159k = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw C14394h5.m62030h();
            }
            throw C14394h5.m62033k();
        }

        /* renamed from: K */
        public byte mo34755K() {
            int i = this.f35159k;
            if (i != this.f35157i) {
                byte[] bArr = this.f35155g;
                this.f35159k = i + 1;
                return bArr[i];
            }
            throw C14394h5.m62033k();
        }

        /* renamed from: L */
        public int mo34756L() {
            int i = this.f35159k;
            if (this.f35157i - i >= 4) {
                byte[] bArr = this.f35155g;
                this.f35159k = i + 4;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << DateTimeFieldType.f30603E0);
            }
            throw C14394h5.m62033k();
        }

        /* renamed from: M */
        public long mo34757M() {
            int i = this.f35159k;
            if (this.f35157i - i >= 8) {
                byte[] bArr = this.f35155g;
                this.f35159k = i + 8;
                return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
            }
            throw C14394h5.m62033k();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: N */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo34758N() {
            /*
                r5 = this;
                int r0 = r5.f35159k
                int r1 = r5.f35157i
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f35155g
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f35159k = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo34760P()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f35159k = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14231c.C14233b.mo34758N():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: O */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo34759O() {
            /*
                r11 = this;
                int r0 = r11.f35159k
                int r1 = r11.f35157i
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f35155g
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f35159k = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo34760P()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f35159k = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14231c.C14233b.mo34759O():long");
        }

        /* renamed from: P */
        public long mo34760P() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte K = mo34755K();
                j |= ((long) (K & Byte.MAX_VALUE)) << i;
                if ((K & C11354n.f28471b) == 0) {
                    return j;
                }
            }
            throw C14394h5.m62029g();
        }

        /* renamed from: a */
        public int mo34727a() {
            return this.f35159k - this.f35160l;
        }

        /* renamed from: f */
        public void mo34728f(int i) {
            if (this.f35161m != i) {
                throw C14394h5.m62025c();
            }
        }

        /* renamed from: h */
        public boolean mo34729h() {
            return this.f35159k == this.f35157i;
        }

        /* renamed from: i */
        public void mo34730i(int i) {
            this.f35163o = i;
            mo34748D();
        }

        /* renamed from: j */
        public boolean mo34731j() {
            return mo34759O() != 0;
        }

        /* renamed from: k */
        public int mo34732k(int i) {
            if (i >= 0) {
                int a = i + mo34727a();
                if (a >= 0) {
                    int i2 = this.f35163o;
                    if (a <= i2) {
                        this.f35163o = a;
                        mo34748D();
                        return i2;
                    }
                    throw C14394h5.m62033k();
                }
                throw C14394h5.m62031i();
            }
            throw C14394h5.m62030h();
        }

        /* renamed from: l */
        public C14719t0 mo34733l() {
            int N = mo34758N();
            if (N > 0) {
                int i = this.f35157i;
                int i2 = this.f35159k;
                if (N <= i - i2) {
                    C14719t0 q = (!this.f35156h || !this.f35162n) ? C14719t0.m63436q(this.f35155g, i2, N) : C14719t0.m63430X(this.f35155g, i2, N);
                    this.f35159k += N;
                    return q;
                }
            }
            return N == 0 ? C14719t0.f36442b : C14719t0.m63429W(mo34753I(N));
        }

        /* renamed from: m */
        public double mo34734m() {
            return Double.longBitsToDouble(mo34757M());
        }

        /* renamed from: n */
        public boolean mo34735n(int i) {
            int c = C14710sf.m63426c(i);
            if (c == 0) {
                mo34750F();
                return true;
            } else if (c == 1) {
                mo34754J(8);
                return true;
            } else if (c == 2) {
                mo34754J(mo34758N());
                return true;
            } else if (c == 3) {
                mo34749E();
                mo34728f(C14710sf.m63425b(C14710sf.m63424a(i), 4));
                return true;
            } else if (c == 4) {
                return false;
            } else {
                if (c == 5) {
                    mo34754J(4);
                    return true;
                }
                throw C14394h5.m62028f();
            }
        }

        /* renamed from: o */
        public int mo34736o() {
            return mo34758N();
        }

        /* renamed from: p */
        public int mo34737p() {
            return mo34756L();
        }

        /* renamed from: q */
        public long mo34738q() {
            return mo34757M();
        }

        /* renamed from: r */
        public float mo34739r() {
            return Float.intBitsToFloat(mo34756L());
        }

        /* renamed from: s */
        public int mo34740s() {
            return mo34758N();
        }

        /* renamed from: t */
        public long mo34741t() {
            return mo34759O();
        }

        /* renamed from: u */
        public int mo34742u() {
            return mo34756L();
        }

        /* renamed from: v */
        public long mo34743v() {
            return mo34757M();
        }

        /* renamed from: w */
        public int mo34744w() {
            return C14231c.m61081g(mo34758N());
        }

        /* renamed from: x */
        public long mo34745x() {
            return C14231c.m61077b(mo34759O());
        }

        /* renamed from: y */
        public String mo34746y() {
            int N = mo34758N();
            if (N > 0) {
                int i = this.f35157i;
                int i2 = this.f35159k;
                if (N <= i - i2) {
                    String str = new String(this.f35155g, i2, N, C14566o3.f36057b);
                    this.f35159k += N;
                    return str;
                }
            }
            if (N == 0) {
                return "";
            }
            if (N < 0) {
                throw C14394h5.m62030h();
            }
            throw C14394h5.m62033k();
        }

        /* renamed from: z */
        public String mo34747z() {
            int N = mo34758N();
            if (N > 0) {
                int i = this.f35157i;
                int i2 = this.f35159k;
                if (N <= i - i2) {
                    String l = C14553ne.m62725l(this.f35155g, i2, N);
                    this.f35159k += N;
                    return l;
                }
            }
            if (N == 0) {
                return "";
            }
            if (N <= 0) {
                throw C14394h5.m62030h();
            }
            throw C14394h5.m62033k();
        }
    }

    public C14231c() {
        this.f35151b = f35149f;
        this.f35152c = Integer.MAX_VALUE;
        this.f35154e = false;
    }

    /* renamed from: b */
    public static long m61077b(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: c */
    public static C14231c m61078c(byte[] bArr) {
        return m61079d(bArr, 0, bArr.length);
    }

    /* renamed from: d */
    public static C14231c m61079d(byte[] bArr, int i, int i2) {
        return m61080e(bArr, i, i2, false);
    }

    /* renamed from: e */
    public static C14231c m61080e(byte[] bArr, int i, int i2, boolean z) {
        C14233b bVar = new C14233b(bArr, i, i2, z);
        try {
            bVar.mo34732k(i2);
            return bVar;
        } catch (C14394h5 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: g */
    public static int m61081g(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: A */
    public abstract int mo34724A();

    /* renamed from: B */
    public abstract int mo34725B();

    /* renamed from: C */
    public abstract long mo34726C();

    /* renamed from: a */
    public abstract int mo34727a();

    /* renamed from: f */
    public abstract void mo34728f(int i);

    /* renamed from: h */
    public abstract boolean mo34729h();

    /* renamed from: i */
    public abstract void mo34730i(int i);

    /* renamed from: j */
    public abstract boolean mo34731j();

    /* renamed from: k */
    public abstract int mo34732k(int i);

    /* renamed from: l */
    public abstract C14719t0 mo34733l();

    /* renamed from: m */
    public abstract double mo34734m();

    /* renamed from: n */
    public abstract boolean mo34735n(int i);

    /* renamed from: o */
    public abstract int mo34736o();

    /* renamed from: p */
    public abstract int mo34737p();

    /* renamed from: q */
    public abstract long mo34738q();

    /* renamed from: r */
    public abstract float mo34739r();

    /* renamed from: s */
    public abstract int mo34740s();

    /* renamed from: t */
    public abstract long mo34741t();

    /* renamed from: u */
    public abstract int mo34742u();

    /* renamed from: v */
    public abstract long mo34743v();

    /* renamed from: w */
    public abstract int mo34744w();

    /* renamed from: x */
    public abstract long mo34745x();

    /* renamed from: y */
    public abstract String mo34746y();

    /* renamed from: z */
    public abstract String mo34747z();
}
