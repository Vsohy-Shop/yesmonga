package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14553ne;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* renamed from: com.contentsquare.android.sdk.c1 */
public abstract class C14235c1 extends C14307eb {

    /* renamed from: c */
    public static final Logger f35169c = Logger.getLogger(C14235c1.class.getName());

    /* renamed from: d */
    public static final boolean f35170d = C14634q4.m63017G();

    /* renamed from: a */
    public C14387h1 f35171a;

    /* renamed from: b */
    public boolean f35172b;

    /* renamed from: com.contentsquare.android.sdk.c1$b */
    public static class C14237b extends C14235c1 {

        /* renamed from: e */
        public final byte[] f35173e;

        /* renamed from: f */
        public final int f35174f;

        /* renamed from: g */
        public final int f35175g;

        /* renamed from: h */
        public int f35176h;

        public C14237b(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f35173e = bArr;
                    this.f35174f = i;
                    this.f35176h = i;
                    this.f35175g = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: A0 */
        public final void mo34770A0(int i, int i2) {
            mo34782L0(i, 0);
            mo34780K0(i2);
        }

        /* renamed from: F0 */
        public final void mo34775F0(int i, long j) {
            mo34782L0(i, 0);
            mo34779J0(j);
        }

        /* renamed from: H0 */
        public final void mo34777H0(int i) {
            try {
                byte[] bArr = this.f35173e;
                int i2 = this.f35176h;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (i & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f35176h = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C14238c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f35176h), Integer.valueOf(this.f35175g), 1}), e);
            }
        }

        /* renamed from: J0 */
        public final void mo34779J0(long j) {
            if (!C14235c1.f35170d || mo34800c0() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f35173e;
                    int i = this.f35176h;
                    this.f35176h = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f35173e;
                    int i2 = this.f35176h;
                    this.f35176h = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new C14238c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f35176h), Integer.valueOf(this.f35175g), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f35173e;
                    int i3 = this.f35176h;
                    this.f35176h = i3 + 1;
                    C14634q4.m63045o(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f35173e;
                int i4 = this.f35176h;
                this.f35176h = i4 + 1;
                C14634q4.m63045o(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: K0 */
        public final void mo34780K0(int i) {
            if (i >= 0) {
                mo34790P0(i);
            } else {
                mo34779J0((long) i);
            }
        }

        /* renamed from: L0 */
        public final void mo34782L0(int i, int i2) {
            mo34790P0(C14710sf.m63425b(i, i2));
        }

        /* renamed from: N0 */
        public final void mo34786N0(int i, int i2) {
            mo34782L0(i, 0);
            mo34790P0(i2);
        }

        /* renamed from: P0 */
        public final void mo34790P0(int i) {
            while ((i & -128) != 0) {
                byte[] bArr = this.f35173e;
                int i2 = this.f35176h;
                this.f35176h = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
            try {
                byte[] bArr2 = this.f35173e;
                int i3 = this.f35176h;
                this.f35176h = i3 + 1;
                bArr2[i3] = (byte) i;
            } catch (IndexOutOfBoundsException e) {
                throw new C14238c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f35176h), Integer.valueOf(this.f35175g), 1}), e);
            }
        }

        /* renamed from: Q */
        public final void mo34791Q(int i, String str) {
            mo34782L0(i, 2);
            mo34813R0(str);
        }

        /* renamed from: Q0 */
        public final void mo34812Q0(C14719t0 t0Var) {
            mo34790P0(t0Var.size());
            t0Var.mo36444y(this);
        }

        /* renamed from: R */
        public final void mo34792R(int i, boolean z) {
            mo34782L0(i, 0);
            mo34807w(z ? (byte) 1 : 0);
        }

        /* renamed from: R0 */
        public final void mo34813R0(String str) {
            int f;
            int i = this.f35176h;
            try {
                int v0 = C14235c1.m61200v0(str.length() * 3);
                int v02 = C14235c1.m61200v0(str.length());
                if (v02 == v0) {
                    int i2 = i + v02;
                    this.f35176h = i2;
                    f = C14553ne.m62719f(str, this.f35173e, i2, mo34800c0());
                    this.f35176h = i;
                    mo34790P0((f - i) - v02);
                } else {
                    mo34790P0(C14553ne.m62717d(str));
                    f = C14553ne.m62719f(str, this.f35173e, this.f35176h, mo34800c0());
                }
                this.f35176h = f;
            } catch (C14553ne.C14557d e) {
                this.f35176h = i;
                mo34809x(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C14238c(e2);
            }
        }

        /* renamed from: S0 */
        public final void mo34814S0(C14218ba baVar) {
            mo34790P0(baVar.mo34698c());
            baVar.mo34697b(this);
        }

        /* renamed from: T0 */
        public final void mo34815T0(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f35173e, this.f35176h, i2);
                this.f35176h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C14238c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f35176h), Integer.valueOf(this.f35175g), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: U0 */
        public final void mo34816U0(int i, C14218ba baVar) {
            mo34782L0(i, 2);
            mo34814S0(baVar);
        }

        /* renamed from: X */
        public final void mo34794X(int i, C14218ba baVar) {
            mo34782L0(1, 3);
            mo34786N0(2, i);
            mo34816U0(3, baVar);
            mo34782L0(1, 4);
        }

        /* renamed from: Z */
        public final void mo34796Z(int i, C14719t0 t0Var) {
            mo34782L0(i, 2);
            mo34812Q0(t0Var);
        }

        /* renamed from: a */
        public final void mo34797a(byte[] bArr, int i, int i2) {
            mo34815T0(bArr, i, i2);
        }

        /* renamed from: c0 */
        public final int mo34800c0() {
            return this.f35175g - this.f35176h;
        }

        /* renamed from: h0 */
        public final void mo34801h0(int i, C14218ba baVar, C14398h8 h8Var) {
            mo34782L0(i, 2);
            mo34790P0(((C14288e1) baVar).mo35013c(h8Var));
            h8Var.mo35219g(baVar, this.f35171a);
        }

        /* renamed from: i0 */
        public final void mo34802i0(int i, C14719t0 t0Var) {
            mo34782L0(1, 3);
            mo34786N0(2, i);
            mo34796Z(3, t0Var);
            mo34782L0(1, 4);
        }

        /* renamed from: q0 */
        public final void mo34803q0(int i, long j) {
            mo34782L0(i, 1);
            mo34806u0(j);
        }

        /* renamed from: u0 */
        public final void mo34806u0(long j) {
            try {
                byte[] bArr = this.f35173e;
                int i = this.f35176h;
                int i2 = i + 1;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i2 + 1;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f35176h = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C14238c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f35176h), Integer.valueOf(this.f35175g), 1}), e);
            }
        }

        /* renamed from: w */
        public final void mo34807w(byte b) {
            try {
                byte[] bArr = this.f35173e;
                int i = this.f35176h;
                this.f35176h = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C14238c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f35176h), Integer.valueOf(this.f35175g), 1}), e);
            }
        }

        /* renamed from: w0 */
        public final void mo34808w0(int i, int i2) {
            mo34782L0(i, 5);
            mo34777H0(i2);
        }
    }

    /* renamed from: com.contentsquare.android.sdk.c1$c */
    public static class C14238c extends IOException {
        public C14238c(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        public C14238c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    public C14235c1() {
    }

    /* renamed from: A */
    public static int m61152A(int i, int i2) {
        return m61195r0(i) + m61202z(i2);
    }

    /* renamed from: B */
    public static int m61153B(int i, long j) {
        return m61195r0(i) + m61158G(j);
    }

    /* renamed from: C */
    public static int m61154C(int i, C14218ba baVar) {
        return m61195r0(i) + m61159H(baVar);
    }

    /* renamed from: D */
    public static int m61155D(int i, C14218ba baVar, C14398h8 h8Var) {
        return m61195r0(i) + m61160I(baVar, h8Var);
    }

    /* renamed from: E */
    public static int m61156E(int i, C14704sa saVar) {
        return m61195r0(i) + m61194r(saVar);
    }

    /* renamed from: F */
    public static int m61157F(int i, C14719t0 t0Var) {
        return (m61195r0(1) * 2) + m61190o0(2, i) + m61183l(3, t0Var);
    }

    /* renamed from: G */
    public static int m61158G(long j) {
        return m61186m0(j);
    }

    /* renamed from: H */
    public static int m61159H(C14218ba baVar) {
        return m61170d0(baVar.mo34698c());
    }

    /* renamed from: I */
    public static int m61160I(C14218ba baVar, C14398h8 h8Var) {
        return m61170d0(((C14288e1) baVar).mo35013c(h8Var));
    }

    /* renamed from: J */
    public static C14235c1 m61161J(byte[] bArr) {
        return m61162K(bArr, 0, bArr.length);
    }

    /* renamed from: K */
    public static C14235c1 m61162K(byte[] bArr, int i, int i2) {
        return new C14237b(bArr, i, i2);
    }

    /* renamed from: T */
    public static int m61163T(int i) {
        if (i >= 0) {
            return m61200v0(i);
        }
        return 10;
    }

    /* renamed from: U */
    public static int m61164U(int i, int i2) {
        return m61195r0(i) + m61163T(i2);
    }

    /* renamed from: V */
    public static int m61165V(int i, long j) {
        return m61195r0(i) + m61166W(j);
    }

    /* renamed from: W */
    public static int m61166W(long j) {
        return 8;
    }

    /* renamed from: b */
    public static int m61167b(double d) {
        return 8;
    }

    /* renamed from: c */
    public static int m61168c(float f) {
        return 4;
    }

    /* renamed from: d */
    public static int m61169d(int i) {
        return m61163T(i);
    }

    /* renamed from: d0 */
    public static int m61170d0(int i) {
        return m61200v0(i) + i;
    }

    /* renamed from: e */
    public static int m61171e(int i, double d) {
        return m61195r0(i) + m61167b(d);
    }

    /* renamed from: e0 */
    public static int m61172e0(int i, int i2) {
        return m61195r0(i) + m61180j0(i2);
    }

    /* renamed from: f */
    public static int m61173f(int i, float f) {
        return m61195r0(i) + m61168c(f);
    }

    /* renamed from: f0 */
    public static int m61174f0(int i, long j) {
        return m61195r0(i) + m61176g0(j);
    }

    /* renamed from: g */
    public static int m61175g(int i, int i2) {
        return m61195r0(i) + m61169d(i2);
    }

    /* renamed from: g0 */
    public static int m61176g0(long j) {
        return m61186m0(m61192p0(j));
    }

    /* renamed from: h */
    public static int m61177h(int i, long j) {
        return m61195r0(i) + m61189o(j);
    }

    /* renamed from: i */
    public static int m61178i(int i, C14218ba baVar) {
        return (m61195r0(1) * 2) + m61190o0(2, i) + m61154C(3, baVar);
    }

    @Deprecated
    /* renamed from: j */
    public static int m61179j(int i, C14218ba baVar, C14398h8 h8Var) {
        return (m61195r0(i) * 2) + m61193q(baVar, h8Var);
    }

    /* renamed from: j0 */
    public static int m61180j0(int i) {
        return 4;
    }

    /* renamed from: k */
    public static int m61181k(int i, C14704sa saVar) {
        return (m61195r0(1) * 2) + m61190o0(2, i) + m61156E(3, saVar);
    }

    /* renamed from: k0 */
    public static int m61182k0(int i, int i2) {
        return m61195r0(i) + m61188n0(i2);
    }

    /* renamed from: l */
    public static int m61183l(int i, C14719t0 t0Var) {
        return m61195r0(i) + m61196s(t0Var);
    }

    /* renamed from: l0 */
    public static int m61184l0(int i, long j) {
        return m61195r0(i) + m61186m0(j);
    }

    /* renamed from: m */
    public static int m61185m(int i, String str) {
        return m61195r0(i) + m61197t(str);
    }

    /* renamed from: m0 */
    public static int m61186m0(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((CoroutineScheduler.f29765M0 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: n */
    public static int m61187n(int i, boolean z) {
        return m61195r0(i) + m61198u(z);
    }

    /* renamed from: n0 */
    public static int m61188n0(int i) {
        return m61200v0(m61203z0(i));
    }

    /* renamed from: o */
    public static int m61189o(long j) {
        return 8;
    }

    /* renamed from: o0 */
    public static int m61190o0(int i, int i2) {
        return m61195r0(i) + m61200v0(i2);
    }

    @Deprecated
    /* renamed from: p */
    public static int m61191p(C14218ba baVar) {
        return baVar.mo34698c();
    }

    /* renamed from: p0 */
    public static long m61192p0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    @Deprecated
    /* renamed from: q */
    public static int m61193q(C14218ba baVar, C14398h8 h8Var) {
        return ((C14288e1) baVar).mo35013c(h8Var);
    }

    /* renamed from: r */
    public static int m61194r(C14704sa saVar) {
        return m61170d0(saVar.mo36395a());
    }

    /* renamed from: r0 */
    public static int m61195r0(int i) {
        return m61200v0(C14710sf.m63425b(i, 0));
    }

    /* renamed from: s */
    public static int m61196s(C14719t0 t0Var) {
        return m61170d0(t0Var.size());
    }

    /* renamed from: t */
    public static int m61197t(String str) {
        int i;
        try {
            i = C14553ne.m62717d(str);
        } catch (C14553ne.C14557d unused) {
            i = str.getBytes(C14566o3.f36057b).length;
        }
        return m61170d0(i);
    }

    /* renamed from: u */
    public static int m61198u(boolean z) {
        return 1;
    }

    /* renamed from: v */
    public static int m61199v(byte[] bArr) {
        return m61170d0(bArr.length);
    }

    /* renamed from: v0 */
    public static int m61200v0(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: z */
    public static int m61202z(int i) {
        return 4;
    }

    /* renamed from: z0 */
    public static int m61203z0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: A0 */
    public abstract void mo34770A0(int i, int i2);

    /* renamed from: B0 */
    public final void mo34771B0(int i, long j) {
        mo34775F0(i, m61192p0(j));
    }

    /* renamed from: C0 */
    public final void mo34772C0(long j) {
        mo34806u0(j);
    }

    /* renamed from: D0 */
    public final void mo34773D0(int i) {
        mo34780K0(i);
    }

    /* renamed from: E0 */
    public final void mo34774E0(int i, int i2) {
        mo34808w0(i, i2);
    }

    /* renamed from: F0 */
    public abstract void mo34775F0(int i, long j);

    /* renamed from: G0 */
    public final void mo34776G0(long j) {
        mo34779J0(m61192p0(j));
    }

    /* renamed from: H0 */
    public abstract void mo34777H0(int i);

    /* renamed from: I0 */
    public final void mo34778I0(int i, int i2) {
        mo34786N0(i, m61203z0(i2));
    }

    /* renamed from: J0 */
    public abstract void mo34779J0(long j);

    /* renamed from: K0 */
    public abstract void mo34780K0(int i);

    /* renamed from: L */
    public final void mo34781L() {
        if (mo34800c0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: L0 */
    public abstract void mo34782L0(int i, int i2);

    /* renamed from: M */
    public final void mo34783M(double d) {
        mo34806u0(Double.doubleToRawLongBits(d));
    }

    /* renamed from: M0 */
    public final void mo34784M0(int i) {
        mo34777H0(i);
    }

    /* renamed from: N */
    public final void mo34785N(float f) {
        mo34777H0(Float.floatToRawIntBits(f));
    }

    /* renamed from: N0 */
    public abstract void mo34786N0(int i, int i2);

    /* renamed from: O */
    public final void mo34787O(int i, double d) {
        mo34803q0(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: O0 */
    public final void mo34788O0(int i) {
        mo34790P0(m61203z0(i));
    }

    /* renamed from: P */
    public final void mo34789P(int i, float f) {
        mo34808w0(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: P0 */
    public abstract void mo34790P0(int i);

    /* renamed from: Q */
    public abstract void mo34791Q(int i, String str);

    /* renamed from: R */
    public abstract void mo34792R(int i, boolean z);

    /* renamed from: S */
    public final void mo34793S(boolean z) {
        mo34807w(z ? (byte) 1 : 0);
    }

    /* renamed from: X */
    public abstract void mo34794X(int i, C14218ba baVar);

    @Deprecated
    /* renamed from: Y */
    public final void mo34795Y(int i, C14218ba baVar, C14398h8 h8Var) {
        mo34782L0(i, 3);
        mo34798a0(baVar, h8Var);
        mo34782L0(i, 4);
    }

    /* renamed from: Z */
    public abstract void mo34796Z(int i, C14719t0 t0Var);

    /* renamed from: a */
    public abstract void mo34797a(byte[] bArr, int i, int i2);

    @Deprecated
    /* renamed from: a0 */
    public final void mo34798a0(C14218ba baVar, C14398h8 h8Var) {
        h8Var.mo35219g(baVar, this.f35171a);
    }

    /* renamed from: b0 */
    public boolean mo34799b0() {
        return this.f35172b;
    }

    /* renamed from: c0 */
    public abstract int mo34800c0();

    /* renamed from: h0 */
    public abstract void mo34801h0(int i, C14218ba baVar, C14398h8 h8Var);

    /* renamed from: i0 */
    public abstract void mo34802i0(int i, C14719t0 t0Var);

    /* renamed from: q0 */
    public abstract void mo34803q0(int i, long j);

    /* renamed from: s0 */
    public final void mo34804s0(int i, int i2) {
        mo34770A0(i, i2);
    }

    /* renamed from: t0 */
    public final void mo34805t0(int i, long j) {
        mo34775F0(i, j);
    }

    /* renamed from: u0 */
    public abstract void mo34806u0(long j);

    /* renamed from: w */
    public abstract void mo34807w(byte b);

    /* renamed from: w0 */
    public abstract void mo34808w0(int i, int i2);

    /* renamed from: x */
    public final void mo34809x(String str, C14553ne.C14557d dVar) {
        f35169c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dVar);
        byte[] bytes = str.getBytes(C14566o3.f36057b);
        try {
            mo34790P0(bytes.length);
            mo34797a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C14238c(e);
        }
    }

    /* renamed from: x0 */
    public final void mo34810x0(int i, long j) {
        mo34803q0(i, j);
    }

    /* renamed from: y0 */
    public final void mo34811y0(long j) {
        mo34779J0(j);
    }
}
