package com.google.android.gms.internal.mlkit_common;

/* renamed from: com.google.android.gms.internal.mlkit_common.y2 */
public final class C42567y2 {

    /* renamed from: a */
    public final C42413k<C42434l9> f107463a = zzan.m171769w();

    /* renamed from: b */
    public Boolean f107464b;

    public C42567y2() {
    }

    /* renamed from: a */
    public final C42567y2 mo137837a() {
        boolean z;
        if (this.f107464b == null) {
            z = true;
        } else {
            z = false;
        }
        C42347e.m171462d(z, "A SourcePolicy can only set internal() or external() once.");
        this.f107464b = Boolean.FALSE;
        return this;
    }

    /* renamed from: b */
    public final C42567y2 mo137838b() {
        boolean z;
        if (this.f107464b == null) {
            z = true;
        } else {
            z = false;
        }
        C42347e.m171462d(z, "A SourcePolicy can only set internal() or external() once.");
        this.f107464b = Boolean.TRUE;
        return this;
    }

    /* renamed from: c */
    public final C42309a5 mo137839c() {
        Boolean bool = this.f107464b;
        if (bool != null) {
            return new C42309a5(bool.booleanValue(), false, this.f107463a.mo137723d(), (C42578z3) null);
        }
        throw new NullPointerException("Must call internal() or external() when building a SourcePolicy.");
    }

    public /* synthetic */ C42567y2(C42556x1 x1Var) {
    }
}
