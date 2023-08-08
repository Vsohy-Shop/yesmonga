package com.onetrust.otpublishers.headless.p052UI.UIProperty;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.Internal.Helper.C34964a;

/* renamed from: com.onetrust.otpublishers.headless.UI.UIProperty.x */
public class C35124x {

    /* renamed from: a */
    public C35103c f85788a;

    /* renamed from: b */
    public C35114n f85789b;

    /* renamed from: c */
    public C35099a f85790c = new C35099a();

    /* renamed from: d */
    public C35108h f85791d = new C35108h();

    /* renamed from: e */
    public C35101b f85792e;

    /* renamed from: f */
    public C35104d f85793f;

    public C35124x(@C0359n0 Context context) {
        this.f85788a = new C35103c(context);
        this.f85789b = new C35114n(context);
        this.f85792e = new C35101b(context);
        this.f85793f = new C35104d(context);
    }

    @C0359n0
    /* renamed from: a */
    public C35115o mo105010a() {
        return this.f85791d.mo104740f(this.f85793f.mo104698a(), this.f85792e.mo104655b());
    }

    @C0359n0
    /* renamed from: b */
    public C35117q mo105011b(@C0359n0 C35116p pVar) {
        C35117q j = this.f85791d.mo104743j(this.f85788a.mo104697z(), this.f85789b.mo104797K());
        if (j != null) {
            return this.f85791d.mo104742i(j, pVar);
        }
        C35117q g = this.f85791d.mo104741g(pVar);
        g.mo104850h(false);
        return g;
    }

    @C0359n0
    /* renamed from: c */
    public C35120t mo105012c(int i) {
        return this.f85791d.mo104745l(this.f85788a.mo104673C(), this.f85789b.mo104802b(i));
    }

    @C0359n0
    /* renamed from: d */
    public C35123w mo105013d(C34964a aVar) {
        return this.f85790c.mo104629a(aVar);
    }

    @C0363p0
    /* renamed from: e */
    public C35118r mo105014e() {
        return this.f85788a.mo104671A();
    }

    @C0359n0
    /* renamed from: f */
    public C35122v mo105015f(int i) {
        return this.f85791d.mo104746m(this.f85788a.mo104675E(), this.f85789b.mo104807q(i));
    }

    @C0363p0
    /* renamed from: g */
    public C35119s mo105016g() {
        return this.f85791d.mo104744k(this.f85788a.mo104672B(), this.f85789b.mo104799O());
    }

    @C0363p0
    /* renamed from: h */
    public C35126z mo105017h(int i) {
        return this.f85791d.mo104748o(this.f85788a.mo104677G(), this.f85789b.mo104811w(i));
    }

    @C0359n0
    /* renamed from: i */
    public C35125y mo105018i() {
        return this.f85791d.mo104747n(this.f85788a.mo104676F(), this.f85789b.mo104801R());
    }

    public C35124x(@C0359n0 Context context, int i) {
        this.f85788a = new C35103c(context);
        this.f85789b = new C35114n(context, i);
    }
}
