package com.contentsquare.android.sdk;

import android.os.Looper;
import java.util.ArrayList;

/* renamed from: com.contentsquare.android.sdk.mf */
public final class C14535mf implements C14844x0, C14262d0, C14516m2, C14282dg {

    /* renamed from: m */
    public static final ThreadLocal<C14535mf> f35960m = new ThreadLocal<>();

    /* renamed from: a */
    public Object f35961a;

    /* renamed from: b */
    public final ArrayList<C14501lb> f35962b = new ArrayList<>();

    /* renamed from: c */
    public int f35963c;

    /* renamed from: d */
    public final ArrayList<Object> f35964d = new ArrayList<>();

    /* renamed from: e */
    public C14603p0 f35965e;

    /* renamed from: f */
    public C14441j4 f35966f;

    /* renamed from: g */
    public boolean f35967g;

    /* renamed from: h */
    public C14585o7 f35968h = C14270d8.m61368a();

    /* renamed from: i */
    public int f35969i;

    /* renamed from: j */
    public int f35970j;

    /* renamed from: k */
    public C14248c7 f35971k = C14241c4.f35180b;

    /* renamed from: l */
    public int f35972l;

    /* renamed from: h */
    public static <TVal> C14511m<TVal, TVal> m62637h(TVal tval) {
        C14169a3.m60808a(Looper.myLooper());
        ThreadLocal<C14535mf> threadLocal = f35960m;
        C14535mf mfVar = threadLocal.get();
        if (mfVar == null) {
            mfVar = new C14535mf();
        } else {
            threadLocal.set((Object) null);
        }
        return mfVar.mo35940r(tval);
    }

    /* renamed from: l */
    public static void m62638l(C14535mf mfVar) {
        f35960m.set(mfVar);
    }

    /* renamed from: a */
    public C14841we mo34981a() {
        C14841we v = mo35944v();
        m62638l(this);
        return v;
    }

    /* renamed from: i */
    public C14535mf mo35932i(C14603p0 p0Var, C14441j4 j4Var) {
        mo35933j(3);
        this.f35965e = (C14603p0) C14169a3.m60808a(p0Var);
        this.f35966f = (C14441j4) C14169a3.m60808a(j4Var);
        this.f35972l = 4;
        return this;
    }

    /* renamed from: j */
    public final void mo35933j(int i) {
        C14169a3.m60810c(this.f35972l == i, "Unexpected compiler state");
    }

    /* renamed from: k */
    public final void mo35934k(int i, int i2) {
        int i3 = this.f35972l;
        C14169a3.m60810c(i3 == i || i3 == i2, "Unexpected compiler state");
    }

    /* renamed from: m */
    public final void mo35935m(boolean z) {
        C14736t4.m63500t(z, this.f35964d);
        this.f35972l = 6;
    }

    /* renamed from: n */
    public C14535mf mo35936n(int i) {
        mo35933j(2);
        this.f35963c = Math.max(0, i);
        this.f35972l = 3;
        return this;
    }

    /* renamed from: o */
    public C14535mf mo35931g(C14441j4 j4Var) {
        return mo35932i(C14458k1.m62280a(), j4Var);
    }

    /* renamed from: p */
    public C14535mf mo34899c(C14295e5 e5Var) {
        mo35942t(e5Var);
        this.f35972l = 4;
        return this;
    }

    /* renamed from: q */
    public C14535mf mo34898b(C14295e5 e5Var, C14585o7 o7Var) {
        mo35933j(3);
        C14736t4.m63498q(e5Var, o7Var, this.f35964d);
        return this;
    }

    /* renamed from: r */
    public final C14535mf mo35940r(Object obj) {
        mo35933j(0);
        this.f35972l = 1;
        this.f35961a = obj;
        return this;
    }

    /* renamed from: s */
    public C14535mf mo35882f(C14501lb... lbVarArr) {
        mo35934k(1, 2);
        for (C14501lb a : lbVarArr) {
            this.f35962b.add((C14501lb) C14169a3.m60808a(a));
        }
        this.f35972l = 2;
        return this;
    }

    /* renamed from: t */
    public C14535mf mo35942t(C14295e5 e5Var) {
        mo35933j(3);
        C14736t4.m63499r(e5Var, this.f35964d);
        return this;
    }

    /* renamed from: u */
    public final void mo35943u(C14603p0 p0Var) {
        mo35934k(4, 5);
        C14603p0 p0Var2 = this.f35965e;
        if (p0Var2 != null) {
            C14736t4.m63496o(p0Var2, (C14441j4) C14169a3.m60808a(this.f35966f), p0Var, this.f35964d);
        } else {
            C14736t4.m63497p(p0Var, this.f35964d);
        }
        this.f35965e = null;
        this.f35966f = null;
        if (this.f35972l == 5) {
            mo35935m(false);
        } else {
            this.f35972l = 3;
        }
    }

    /* renamed from: v */
    public final C14841we mo35944v() {
        mo35933j(6);
        C14841we l = C14736t4.m63495l(this.f35961a, this.f35962b, this.f35963c, this.f35964d, this.f35968h, this.f35970j, this.f35969i, this.f35971k);
        this.f35972l = 0;
        this.f35961a = null;
        this.f35962b.clear();
        this.f35963c = 0;
        this.f35964d.clear();
        this.f35967g = false;
        this.f35968h = C14270d8.m61368a();
        this.f35969i = 0;
        this.f35970j = 0;
        this.f35971k = C14241c4.f35180b;
        return l;
    }

    /* renamed from: w */
    public C14535mf mo35930d(C14603p0 p0Var) {
        mo34900e(p0Var);
        mo35935m(false);
        return this;
    }

    /* renamed from: x */
    public C14535mf mo35929c() {
        return mo35936n(0);
    }

    /* renamed from: y */
    public C14535mf mo34900e(C14603p0 p0Var) {
        mo35933j(3);
        C14736t4.m63502x(p0Var, this.f35964d);
        return this;
    }

    /* renamed from: z */
    public C14535mf mo35888b() {
        mo35943u((C14603p0) null);
        return this;
    }
}
