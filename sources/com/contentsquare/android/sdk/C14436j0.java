package com.contentsquare.android.sdk;

/* renamed from: com.contentsquare.android.sdk.j0 */
public abstract class C14436j0<T, B> {
    /* renamed from: a */
    public abstract B mo35563a();

    /* renamed from: b */
    public abstract B mo35564b(Object obj);

    /* renamed from: c */
    public abstract T mo35565c(T t, T t2);

    /* renamed from: d */
    public abstract void mo35566d(B b, int i, int i2);

    /* renamed from: e */
    public abstract void mo35567e(B b, int i, long j);

    /* renamed from: f */
    public abstract void mo35568f(B b, int i, C14719t0 t0Var);

    /* renamed from: g */
    public abstract void mo35569g(B b, int i, T t);

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000d, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35570h(B r3, com.contentsquare.android.sdk.C14475k6 r4) {
        /*
            r2 = this;
        L_0x0000:
            int r0 = r4.mo34585g1()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x000f
            boolean r0 = r2.mo35577o(r3, r4)
            if (r0 != 0) goto L_0x0000
        L_0x000f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14436j0.mo35570h(java.lang.Object, com.contentsquare.android.sdk.k6):void");
    }

    /* renamed from: i */
    public abstract void mo35571i(T t, C14782uf ufVar);

    /* renamed from: j */
    public abstract boolean mo35572j(C14475k6 k6Var);

    /* renamed from: k */
    public abstract T mo35573k(Object obj);

    /* renamed from: l */
    public abstract void mo35574l(B b, int i, long j);

    /* renamed from: m */
    public abstract void mo35575m(T t, C14782uf ufVar);

    /* renamed from: n */
    public abstract void mo35576n(Object obj, B b);

    /* renamed from: o */
    public final boolean mo35577o(B b, C14475k6 k6Var) {
        int o = k6Var.mo34600o();
        int a = C14710sf.m63424a(o);
        int c = C14710sf.m63426c(o);
        if (c == 0) {
            mo35574l(b, a, k6Var.mo34588i());
            return true;
        } else if (c == 1) {
            mo35567e(b, a, k6Var.mo34596m());
            return true;
        } else if (c == 2) {
            mo35568f(b, a, k6Var.mo34602p());
            return true;
        } else if (c == 3) {
            Object a2 = mo35563a();
            int b2 = C14710sf.m63425b(a, 4);
            mo35570h(a2, k6Var);
            if (b2 == k6Var.mo34600o()) {
                mo35569g(b, a, mo35582t(a2));
                return true;
            }
            throw C14394h5.m62025c();
        } else if (c == 4) {
            return false;
        } else {
            if (c == 5) {
                mo35566d(b, a, k6Var.mo34598n());
                return true;
            }
            throw C14394h5.m62028f();
        }
    }

    /* renamed from: p */
    public abstract int mo35578p(T t);

    /* renamed from: q */
    public abstract void mo35579q(Object obj, T t);

    /* renamed from: r */
    public abstract int mo35580r(T t);

    /* renamed from: s */
    public abstract void mo35581s(Object obj);

    /* renamed from: t */
    public abstract T mo35582t(B b);
}
