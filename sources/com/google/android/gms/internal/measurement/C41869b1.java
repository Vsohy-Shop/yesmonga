package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.b1 */
public final class C41869b1 {

    /* renamed from: a */
    public final C41890c4 f106016a;

    /* renamed from: b */
    public C41909d5 f106017b;

    /* renamed from: c */
    public final C41885c f106018c = new C41885c();

    /* renamed from: d */
    public final C42064lg f106019d = new C42064lg();

    public C41869b1() {
        C41890c4 c4Var = new C41890c4();
        this.f106016a = c4Var;
        this.f106017b = c4Var.f106046b.mo136672a();
        c4Var.f106048d.mo137494a("internal.registerCallback", new C41849a(this));
        c4Var.f106048d.mo137494a("internal.eventLogger", new C41868b0(this));
    }

    /* renamed from: a */
    public final C41885c mo136598a() {
        return this.f106018c;
    }

    /* renamed from: b */
    public final /* synthetic */ C42011j mo136599b() throws Exception {
        return new C41992hg(this.f106019d);
    }

    /* renamed from: c */
    public final void mo136600c(C42258x5 x5Var) throws zzd {
        C42011j jVar;
        try {
            this.f106017b = this.f106016a.f106046b.mo136672a();
            if (!(this.f106016a.mo136648a(this.f106017b, (C41892c6[]) x5Var.mo137452D().toArray(new C41892c6[0])) instanceof C41975h)) {
                for (C42224v5 v5Var : x5Var.mo137451B().mo137305E()) {
                    List D = v5Var.mo137372D();
                    String C = v5Var.mo137371C();
                    Iterator it = D.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C42133q a = this.f106016a.mo136648a(this.f106017b, (C41892c6) it.next());
                            if (a instanceof C42082n) {
                                C41909d5 d5Var = this.f106017b;
                                if (!d5Var.mo136679h(C)) {
                                    jVar = null;
                                } else {
                                    C42133q d = d5Var.mo136675d(C);
                                    if (d instanceof C42011j) {
                                        jVar = (C42011j) d;
                                    } else {
                                        throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(C)));
                                    }
                                }
                                if (jVar != null) {
                                    jVar.mo136725a(this.f106017b, Collections.singletonList(a));
                                } else {
                                    throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(C)));
                                }
                            } else {
                                throw new IllegalArgumentException("Invalid rule definition");
                            }
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    /* renamed from: d */
    public final void mo136601d(String str, Callable callable) {
        this.f106016a.f106048d.mo137494a(str, callable);
    }

    /* renamed from: e */
    public final boolean mo136602e(C41867b bVar) throws zzd {
        try {
            this.f106018c.mo136644d(bVar);
            this.f106016a.f106047c.mo136678g("runtime.counter", new C41993i(Double.valueOf(0.0d)));
            this.f106019d.mo137128b(this.f106017b.mo136672a(), this.f106018c);
            if (mo136604g() || mo136603f()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    /* renamed from: f */
    public final boolean mo136603f() {
        return !this.f106018c.mo136642c().isEmpty();
    }

    /* renamed from: g */
    public final boolean mo136604g() {
        C41885c cVar = this.f106018c;
        return !cVar.mo136641b().equals(cVar.mo136640a());
    }
}
