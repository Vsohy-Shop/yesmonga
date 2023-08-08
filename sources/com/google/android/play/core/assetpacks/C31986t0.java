package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C32040c1;
import com.google.android.play.core.internal.C32062k;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.play.core.assetpacks.t0 */
public final class C31986t0 {

    /* renamed from: j */
    public static final C32062k f78106j = new C32062k("ExtractorLooper");

    /* renamed from: a */
    public final C31942j1 f78107a;

    /* renamed from: b */
    public final C31982s0 f78108b;

    /* renamed from: c */
    public final C31964n2 f78109c;

    /* renamed from: d */
    public final C32003x1 f78110d;

    /* renamed from: e */
    public final C31908c2 f78111e;

    /* renamed from: f */
    public final C31928g2 f78112f;

    /* renamed from: g */
    public final C32040c1<C31914d3> f78113g;

    /* renamed from: h */
    public final C31955m1 f78114h;

    /* renamed from: i */
    public final AtomicBoolean f78115i = new AtomicBoolean(false);

    public C31986t0(C31942j1 j1Var, C32040c1<C31914d3> c1Var, C31982s0 s0Var, C31964n2 n2Var, C32003x1 x1Var, C31908c2 c2Var, C31928g2 g2Var, C31955m1 m1Var) {
        this.f78107a = j1Var;
        this.f78113g = c1Var;
        this.f78108b = s0Var;
        this.f78109c = n2Var;
        this.f78110d = x1Var;
        this.f78111e = c2Var;
        this.f78112f = g2Var;
        this.f78114h = m1Var;
    }

    /* renamed from: a */
    public final void mo92684a() {
        C31951l1 l1Var;
        C32062k kVar = f78106j;
        kVar.mo92775a("Run extractor loop", new Object[0]);
        if (this.f78115i.compareAndSet(false, true)) {
            while (true) {
                try {
                    l1Var = this.f78114h.mo92629a();
                } catch (C31904bk e) {
                    f78106j.mo92776b("Error while getting next extraction task: %s", e.getMessage());
                    if (e.f77808a >= 0) {
                        this.f78113g.mo92734a().mo92541b(e.f77808a);
                        mo92685b(e.f77808a, e);
                    }
                    l1Var = null;
                }
                if (l1Var != null) {
                    try {
                        if (l1Var instanceof C31978r0) {
                            this.f78108b.mo92668a((C31978r0) l1Var);
                        } else if (l1Var instanceof C31956m2) {
                            this.f78109c.mo92634a((C31956m2) l1Var);
                        } else if (l1Var instanceof C31999w1) {
                            this.f78110d.mo92706a((C31999w1) l1Var);
                        } else if (l1Var instanceof C32011z1) {
                            this.f78111e.mo92534a((C32011z1) l1Var);
                        } else if (l1Var instanceof C31923f2) {
                            this.f78112f.mo92565a((C31923f2) l1Var);
                        } else {
                            f78106j.mo92776b("Unknown task type: %s", l1Var.getClass().getName());
                        }
                    } catch (Exception e2) {
                        f78106j.mo92776b("Error during extraction task: %s", e2.getMessage());
                        this.f78113g.mo92734a().mo92541b(l1Var.f77955a);
                        mo92685b(l1Var.f77955a, e2);
                    }
                } else {
                    this.f78115i.set(false);
                    return;
                }
            }
        } else {
            kVar.mo92779e("runLoop already looping; return", new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo92685b(int i, Exception exc) {
        try {
            this.f78107a.mo92614p(i);
            this.f78107a.mo92605g(i);
        } catch (C31904bk unused) {
            f78106j.mo92776b("Error during error handling: %s", exc.getMessage());
        }
    }
}
