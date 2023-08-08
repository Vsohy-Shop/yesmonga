package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.c4 */
public final class C41890c4 {

    /* renamed from: a */
    public final C42269y f106045a;

    /* renamed from: b */
    public final C41909d5 f106046b;

    /* renamed from: c */
    public final C41909d5 f106047c;

    /* renamed from: d */
    public final C42294z7 f106048d;

    public C41890c4() {
        C42269y yVar = new C42269y();
        this.f106045a = yVar;
        C41909d5 d5Var = new C41909d5((C41909d5) null, yVar);
        this.f106047c = d5Var;
        this.f106046b = d5Var.mo136672a();
        C42294z7 z7Var = new C42294z7();
        this.f106048d = z7Var;
        d5Var.mo136678g("require", new C42010ig(z7Var));
        z7Var.mo137494a("internal.platform", C41871b3.f106022a);
        d5Var.mo136678g("runtime.counter", new C41993i(Double.valueOf(0.0d)));
    }

    /* renamed from: a */
    public final C42133q mo136648a(C41909d5 d5Var, C41892c6... c6VarArr) {
        C42133q qVar = C42133q.f106351H;
        for (C41892c6 a : c6VarArr) {
            qVar = C41947f7.m169876a(a);
            C41928e6.m169805c(this.f106047c);
            if ((qVar instanceof C42150r) || (qVar instanceof C42116p)) {
                qVar = this.f106045a.mo137477a(d5Var, qVar);
            }
        }
        return qVar;
    }
}
