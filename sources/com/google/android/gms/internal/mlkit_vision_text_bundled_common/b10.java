package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public final class b10<T> implements j10<T> {

    /* renamed from: a */
    public final x00 f71158a;

    /* renamed from: b */
    public final C29355j<?, ?> f71159b;

    /* renamed from: c */
    public final boolean f71160c;

    /* renamed from: d */
    public final C29945yy<?> f71161d;

    public b10(C29355j<?, ?> jVar, C29945yy<?> yyVar, x00 x00) {
        this.f71159b = jVar;
        this.f71160c = yyVar.mo84923g(x00);
        this.f71161d = yyVar;
        this.f71158a = x00;
    }

    /* renamed from: i */
    public static <T> b10<T> m120178i(C29355j<?, ?> jVar, C29945yy<?> yyVar, x00 x00) {
        return new b10<>(jVar, yyVar, x00);
    }

    /* renamed from: a */
    public final int mo84483a(T t) {
        C29355j<?, ?> jVar = this.f71159b;
        int b = jVar.mo84679b(jVar.mo84680c(t));
        if (this.f71160c) {
            return b + this.f71161d.mo84918b(t).mo84562d();
        }
        return b;
    }

    /* renamed from: b */
    public final void mo84484b(T t, T t2) {
        l10.m120685f(this.f71159b, t, t2);
        if (this.f71160c) {
            l10.m120684e(this.f71161d, t, t2);
        }
    }

    /* renamed from: c */
    public final void mo84485c(T t, C29947z zVar) throws IOException {
        Iterator<Map.Entry<?, Object>> h = this.f71161d.mo84918b(t).mo84566h();
        while (h.hasNext()) {
            Map.Entry next = h.next();
            C29096bz bzVar = (C29096bz) next.getKey();
            if (bzVar.mo84543x() != zbaaz.MESSAGE || bzVar.mo84539S0() || bzVar.mo84538M0()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof C29983zz) {
                zVar.mo84869r(bzVar.mo84541i(), ((C29983zz) next).mo85025a().mo84550b());
            } else {
                zVar.mo84869r(bzVar.mo84541i(), next.getValue());
            }
        }
        C29355j<?, ?> jVar = this.f71159b;
        jVar.mo84688k(jVar.mo84680c(t), zVar);
    }

    /* renamed from: d */
    public final boolean mo84486d(T t) {
        return this.f71161d.mo84918b(t).mo84572n();
    }

    /* renamed from: e */
    public final void mo84487e(T t) {
        this.f71159b.mo84685h(t);
        this.f71161d.mo84921e(t);
    }

    /* renamed from: f */
    public final boolean mo84488f(T t, T t2) {
        if (!this.f71159b.mo84680c(t).equals(this.f71159b.mo84680c(t2))) {
            return false;
        }
        if (this.f71160c) {
            return this.f71161d.mo84918b(t).equals(this.f71161d.mo84918b(t2));
        }
        return true;
    }

    /* renamed from: g */
    public final void mo84489g(T t, byte[] bArr, int i, int i2, C29944yx yxVar) throws IOException {
        C29502mz mzVar = (C29502mz) t;
        C29392k kVar = mzVar.zbc;
        if (kVar == C29392k.m120586c()) {
            kVar = C29392k.m120588e();
            mzVar.zbc = kVar;
        }
        ((C29354iz) t).mo84677v();
        Object obj = null;
        while (i < i2) {
            int j = C29981zx.m121555j(bArr, i, yxVar);
            int i3 = yxVar.f71561a;
            if (i3 == 11) {
                int i4 = 0;
                zbwp zbwp = null;
                while (j < i2) {
                    j = C29981zx.m121555j(bArr, j, yxVar);
                    int i5 = yxVar.f71561a;
                    int i6 = i5 & 7;
                    int i7 = i5 >>> 3;
                    if (i7 != 2) {
                        if (i7 == 3) {
                            if (obj != null) {
                                int i8 = g10.f71257d;
                                throw null;
                            } else if (i6 == 2) {
                                j = C29981zx.m121546a(bArr, j, yxVar);
                                zbwp = (zbwp) yxVar.f71563c;
                            }
                        }
                    } else if (i6 == 0) {
                        j = C29981zx.m121555j(bArr, j, yxVar);
                        i4 = yxVar.f71561a;
                        obj = this.f71161d.mo84920d(yxVar.f71564d, this.f71158a, i4);
                    }
                    if (i5 == 12) {
                        break;
                    }
                    j = C29981zx.m121559n(i5, bArr, j, i2, yxVar);
                }
                if (zbwp != null) {
                    kVar.mo84698h((i4 << 3) | 2, zbwp);
                }
                i = j;
            } else if ((i3 & 7) == 2) {
                obj = this.f71161d.mo84920d(yxVar.f71564d, this.f71158a, i3 >>> 3);
                if (obj == null) {
                    i = C29981zx.m121554i(i3, bArr, j, i2, kVar, yxVar);
                } else {
                    int i9 = g10.f71257d;
                    throw null;
                }
            } else {
                i = C29981zx.m121559n(i3, bArr, j, i2, yxVar);
            }
        }
        if (i != i2) {
            throw zbye.m121513e();
        }
    }

    /* renamed from: h */
    public final int mo84490h(T t) {
        int hashCode = this.f71159b.mo84680c(t).hashCode();
        if (this.f71160c) {
            return (hashCode * 53) + this.f71161d.mo84918b(t).f71192a.hashCode();
        }
        return hashCode;
    }

    /* renamed from: x */
    public final T mo84503x() {
        return this.f71158a.mo84730e().mo84647e0();
    }
}
