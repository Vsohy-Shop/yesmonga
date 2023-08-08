package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14782uf;
import java.util.Arrays;

/* renamed from: com.contentsquare.android.sdk.b1 */
public final class C14197b1 {

    /* renamed from: f */
    public static final C14197b1 f35083f = new C14197b1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f35084a;

    /* renamed from: b */
    public int[] f35085b;

    /* renamed from: c */
    public Object[] f35086c;

    /* renamed from: d */
    public int f35087d;

    /* renamed from: e */
    public boolean f35088e;

    public C14197b1() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public static int m60920a(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* renamed from: b */
    public static int m60921b(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    /* renamed from: c */
    public static C14197b1 m60922c(C14197b1 b1Var, C14197b1 b1Var2) {
        int i = b1Var.f35084a + b1Var2.f35084a;
        int[] copyOf = Arrays.copyOf(b1Var.f35085b, i);
        System.arraycopy(b1Var2.f35085b, 0, copyOf, b1Var.f35084a, b1Var2.f35084a);
        Object[] copyOf2 = Arrays.copyOf(b1Var.f35086c, i);
        System.arraycopy(b1Var2.f35086c, 0, copyOf2, b1Var.f35084a, b1Var2.f35084a);
        return new C14197b1(i, copyOf, copyOf2, true);
    }

    /* renamed from: f */
    public static void m60923f(int i, Object obj, C14782uf ufVar) {
        int a = C14710sf.m63424a(i);
        int c = C14710sf.m63426c(i);
        if (c == 0) {
            ufVar.mo35429M(a, ((Long) obj).longValue());
        } else if (c == 1) {
            ufVar.mo35438e(a, ((Long) obj).longValue());
        } else if (c == 2) {
            ufVar.mo35453t(a, (C14719t0) obj);
        } else if (c != 3) {
            if (c == 5) {
                ufVar.mo35437d(a, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(C14394h5.m62028f());
        } else if (ufVar.mo35434a() == C14782uf.C14783a.ASCENDING) {
            ufVar.mo35435b(a);
            ((C14197b1) obj).mo34625l(ufVar);
            ufVar.mo35421E(a);
        } else {
            ufVar.mo35421E(a);
            ((C14197b1) obj).mo34625l(ufVar);
            ufVar.mo35435b(a);
        }
    }

    /* renamed from: i */
    public static boolean m60924i(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m60925j(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public static C14197b1 m60926m() {
        return f35083f;
    }

    /* renamed from: q */
    public static C14197b1 m60927q() {
        return new C14197b1();
    }

    /* renamed from: d */
    public void mo34618d() {
        if (!this.f35088e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: e */
    public void mo34619e(int i, Object obj) {
        mo34618d();
        mo34624k();
        int[] iArr = this.f35085b;
        int i2 = this.f35084a;
        iArr[i2] = i;
        this.f35086c[i2] = obj;
        this.f35084a = i2 + 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C14197b1)) {
            return false;
        }
        C14197b1 b1Var = (C14197b1) obj;
        int i = this.f35084a;
        return i == b1Var.f35084a && m60924i(this.f35085b, b1Var.f35085b, i) && m60925j(this.f35086c, b1Var.f35086c, this.f35084a);
    }

    /* renamed from: g */
    public void mo34621g(C14782uf ufVar) {
        if (ufVar.mo35434a() == C14782uf.C14783a.DESCENDING) {
            for (int i = this.f35084a - 1; i >= 0; i--) {
                ufVar.mo35452s(C14710sf.m63424a(this.f35085b[i]), this.f35086c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f35084a; i2++) {
            ufVar.mo35452s(C14710sf.m63424a(this.f35085b[i2]), this.f35086c[i2]);
        }
    }

    /* renamed from: h */
    public final void mo34622h(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f35084a; i2++) {
            C14481kb.m62423d(sb, i, String.valueOf(C14710sf.m63424a(this.f35085b[i2])), this.f35086c[i2]);
        }
    }

    public int hashCode() {
        int i = this.f35084a;
        return ((((i + 527) * 31) + m60920a(this.f35085b, i)) * 31) + m60921b(this.f35086c, this.f35084a);
    }

    /* renamed from: k */
    public final void mo34624k() {
        int i = this.f35084a;
        int[] iArr = this.f35085b;
        if (i == iArr.length) {
            int i2 = i + (i < 4 ? 8 : i >> 1);
            this.f35085b = Arrays.copyOf(iArr, i2);
            this.f35086c = Arrays.copyOf(this.f35086c, i2);
        }
    }

    /* renamed from: l */
    public void mo34625l(C14782uf ufVar) {
        if (this.f35084a != 0) {
            if (ufVar.mo35434a() == C14782uf.C14783a.ASCENDING) {
                for (int i = 0; i < this.f35084a; i++) {
                    m60923f(this.f35085b[i], this.f35086c[i], ufVar);
                }
                return;
            }
            for (int i2 = this.f35084a - 1; i2 >= 0; i2--) {
                m60923f(this.f35085b[i2], this.f35086c[i2], ufVar);
            }
        }
    }

    /* renamed from: n */
    public int mo34626n() {
        int i;
        int i2 = this.f35087d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f35084a; i4++) {
            int i5 = this.f35085b[i4];
            int a = C14710sf.m63424a(i5);
            int c = C14710sf.m63426c(i5);
            if (c == 0) {
                i = C14235c1.m61184l0(a, ((Long) this.f35086c[i4]).longValue());
            } else if (c == 1) {
                i = C14235c1.m61177h(a, ((Long) this.f35086c[i4]).longValue());
            } else if (c == 2) {
                i = C14235c1.m61183l(a, (C14719t0) this.f35086c[i4]);
            } else if (c == 3) {
                i = (C14235c1.m61195r0(a) * 2) + ((C14197b1) this.f35086c[i4]).mo34626n();
            } else if (c == 5) {
                i = C14235c1.m61152A(a, ((Integer) this.f35086c[i4]).intValue());
            } else {
                throw new IllegalStateException(C14394h5.m62028f());
            }
            i3 += i;
        }
        this.f35087d = i3;
        return i3;
    }

    /* renamed from: o */
    public int mo34627o() {
        int i = this.f35087d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f35084a; i3++) {
            i2 += C14235c1.m61157F(C14710sf.m63424a(this.f35085b[i3]), (C14719t0) this.f35086c[i3]);
        }
        this.f35087d = i2;
        return i2;
    }

    /* renamed from: p */
    public void mo34628p() {
        this.f35088e = false;
    }

    public C14197b1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f35087d = -1;
        this.f35084a = i;
        this.f35085b = iArr;
        this.f35086c = objArr;
        this.f35088e = z;
    }
}
