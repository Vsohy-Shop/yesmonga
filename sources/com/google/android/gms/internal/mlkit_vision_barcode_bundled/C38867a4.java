package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.a4 */
public final class C38867a4<T> implements C39014p4<T> {

    /* renamed from: a */
    public final C39076w3 f98802a;

    /* renamed from: b */
    public final C38918f5<?, ?> f98803b;

    /* renamed from: c */
    public final boolean f98804c;

    /* renamed from: d */
    public final C38865a2<?> f98805d;

    public C38867a4(C38918f5<?, ?> f5Var, C38865a2<?> a2Var, C39076w3 w3Var) {
        this.f98803b = f5Var;
        this.f98804c = a2Var.mo122782f(w3Var);
        this.f98805d = a2Var;
        this.f98802a = w3Var;
    }

    /* renamed from: j */
    public static <T> C38867a4<T> m160379j(C38918f5<?, ?> f5Var, C38865a2<?> a2Var, C39076w3 w3Var) {
        return new C38867a4<>(f5Var, a2Var, w3Var);
    }

    /* renamed from: a */
    public final int mo122787a(T t) {
        int hashCode = this.f98803b.mo122886c(t).hashCode();
        if (this.f98804c) {
            return (hashCode * 53) + this.f98805d.mo122778b(t).f98835a.hashCode();
        }
        return hashCode;
    }

    /* renamed from: b */
    public final int mo122788b(T t) {
        C38918f5<?, ?> f5Var = this.f98803b;
        int b = f5Var.mo122885b(f5Var.mo122886c(t));
        if (this.f98804c) {
            return b + this.f98805d.mo122778b(t).mo122859b();
        }
        return b;
    }

    /* renamed from: c */
    public final void mo122789c(T t) {
        this.f98803b.mo122890g(t);
        this.f98805d.mo122781e(t);
    }

    /* renamed from: d */
    public final void mo122790d(T t, T t2) {
        C39032r4.m160785f(this.f98803b, t, t2);
        if (this.f98804c) {
            C39032r4.m160784e(this.f98805d, t, t2);
        }
    }

    /* renamed from: e */
    public final void mo122791e(T t, byte[] bArr, int i, int i2, C38884c1 c1Var) throws IOException {
        C39003o2 o2Var = (C39003o2) t;
        C38938h5 h5Var = o2Var.zzc;
        if (h5Var == C38938h5.m160536c()) {
            h5Var = C38938h5.m160538e();
            o2Var.zzc = h5Var;
        }
        C38905e2<C38975l2> B = ((C38965k2) t).mo122948B();
        Object obj = null;
        while (i < i2) {
            int j = C38894d1.m160438j(bArr, i, c1Var);
            int i3 = c1Var.f98809a;
            if (i3 == 11) {
                int i4 = 0;
                zzdc zzdc = null;
                while (j < i2) {
                    j = C38894d1.m160438j(bArr, j, c1Var);
                    int i5 = c1Var.f98809a;
                    int i6 = i5 & 7;
                    int i7 = i5 >>> 3;
                    if (i7 != 2) {
                        if (i7 == 3) {
                            if (obj != null) {
                                C38985m2 m2Var = (C38985m2) obj;
                                j = C38894d1.m160432d(C38917f4.m160495a().mo122883b(m2Var.f98896c.getClass()), bArr, j, i2, c1Var);
                                B.mo122868i(m2Var.f98897d, c1Var.f98811c);
                            } else if (i6 == 2) {
                                j = C38894d1.m160429a(bArr, j, c1Var);
                                zzdc = (zzdc) c1Var.f98811c;
                            }
                        }
                    } else if (i6 == 0) {
                        j = C38894d1.m160438j(bArr, j, c1Var);
                        i4 = c1Var.f98809a;
                        obj = this.f98805d.mo122780d(c1Var.f98812d, this.f98802a, i4);
                    }
                    if (i5 == 12) {
                        break;
                    }
                    j = C38894d1.m160442n(i5, bArr, j, i2, c1Var);
                }
                if (zzdc != null) {
                    h5Var.mo122925h((i4 << 3) | 2, zzdc);
                }
                i = j;
            } else if ((i3 & 7) == 2) {
                Object d = this.f98805d.mo122780d(c1Var.f98812d, this.f98802a, i3 >>> 3);
                if (d != null) {
                    C38985m2 m2Var2 = (C38985m2) d;
                    i = C38894d1.m160432d(C38917f4.m160495a().mo122883b(m2Var2.f98896c.getClass()), bArr, j, i2, c1Var);
                    B.mo122868i(m2Var2.f98897d, c1Var.f98811c);
                } else {
                    i = C38894d1.m160437i(i3, bArr, j, i2, h5Var, c1Var);
                }
                obj = d;
            } else {
                i = C38894d1.m160442n(i3, bArr, j, i2, c1Var);
            }
        }
        if (i != i2) {
            throw zzep.m161104e();
        }
    }

    /* renamed from: f */
    public final T mo122792f() {
        return this.f98802a.mo122982A().mo122919r();
    }

    /* renamed from: g */
    public final boolean mo122793g(T t, T t2) {
        if (!this.f98803b.mo122886c(t).equals(this.f98803b.mo122886c(t2))) {
            return false;
        }
        if (this.f98804c) {
            return this.f98805d.mo122778b(t).equals(this.f98805d.mo122778b(t2));
        }
        return true;
    }

    /* renamed from: h */
    public final void mo122794h(T t, C39065v1 v1Var) throws IOException {
        Iterator<Map.Entry<?, Object>> f = this.f98805d.mo122778b(t).mo122864f();
        while (f.hasNext()) {
            Map.Entry next = f.next();
            C38895d2 d2Var = (C38895d2) next.getKey();
            if (d2Var.mo122834f() == zzhq.MESSAGE) {
                d2Var.mo122835h();
                d2Var.mo122836o();
                if (next instanceof C39102z2) {
                    v1Var.mo123072I(d2Var.zza(), ((C39102z2) next).mo123133a().mo122808b());
                } else {
                    v1Var.mo123072I(d2Var.zza(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        C38918f5<?, ?> f5Var = this.f98803b;
        f5Var.mo122892i(f5Var.mo122886c(t), v1Var);
    }

    /* renamed from: i */
    public final boolean mo122795i(T t) {
        return this.f98805d.mo122778b(t).mo122870k();
    }
}
