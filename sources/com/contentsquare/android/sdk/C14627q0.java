package com.contentsquare.android.sdk;

/* renamed from: com.contentsquare.android.sdk.q0 */
public class C14627q0 {

    /* renamed from: a */
    public final C14643q7 f36218a;

    /* renamed from: b */
    public final C14453jf f36219b;

    /* renamed from: c */
    public final C14695s3 f36220c = new C14695s3();

    public C14627q0(C14643q7 q7Var, C14453jf jfVar) {
        this.f36218a = q7Var;
        this.f36219b = jfVar;
    }

    /* renamed from: a */
    public final int mo36182a() {
        return this.f36220c.mo36375a();
    }

    /* renamed from: b */
    public final int mo36183b(double d) {
        return (int) (d * 100.0d);
    }

    /* renamed from: c */
    public final void mo36184c(C14643q7 q7Var, int i) {
        if (q7Var.mo35994a("last_segment", -1) != i) {
            int a = mo36182a();
            q7Var.mo36000h("last_segment", i);
            q7Var.mo36003k("trackable", a < i);
        }
    }

    /* renamed from: d */
    public boolean mo36185d(double d) {
        int b = mo36183b(d);
        mo36184c(this.f36218a, b);
        boolean f = this.f36218a.mo35999f("trackable", true);
        this.f36219b.mo35674c("segment=%d, inAudience = %b", Integer.valueOf(b), Boolean.valueOf(f));
        return f;
    }
}
