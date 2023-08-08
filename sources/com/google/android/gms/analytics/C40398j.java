package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.internal.gtm.C41198d0;
import com.google.android.gms.internal.gtm.C41294h0;
import com.google.android.gms.internal.gtm.C41607u0;
import java.util.ListIterator;

@C40974d0
/* renamed from: com.google.android.gms.analytics.j */
public class C40398j extends C40408t<C40398j> {

    /* renamed from: d */
    public final C41607u0 f102964d;

    /* renamed from: e */
    public boolean f102965e;

    @C40974d0
    public C40398j(C41607u0 u0Var) {
        super(u0Var.mo135894d(), u0Var.mo135907r());
        this.f102964d = u0Var;
    }

    /* renamed from: a */
    public final void mo133416a(C40405q qVar) {
        C41198d0 d0Var = (C41198d0) qVar.mo133431b(C41198d0.class);
        if (TextUtils.isEmpty(d0Var.mo135193f())) {
            d0Var.mo135198k(this.f102964d.mo135898i().mo135656Z());
        }
        if (this.f102965e && TextUtils.isEmpty(d0Var.mo135192e())) {
            C41294h0 e = this.f102964d.mo135895e();
            d0Var.mo135197j(e.mo135421X());
            d0Var.mo135196i(e.mo135422Z());
        }
    }

    /* renamed from: d */
    public final C40405q mo133417d() {
        C40405q qVar = new C40405q(this.f102986b);
        qVar.mo133436g(this.f102964d.mo135897h().mo135356X());
        qVar.mo133436g(this.f102964d.mo135900k().mo136014X());
        mo133446c(qVar);
        return qVar;
    }

    @C40974d0
    /* renamed from: e */
    public final C41607u0 mo133418e() {
        return this.f102964d;
    }

    /* renamed from: f */
    public final void mo133419f(String str) {
        C40843u.m166198h(str);
        Uri T = C40399k.m164468T(str);
        ListIterator<C40376c0> listIterator = this.f102986b.mo133435f().listIterator();
        while (listIterator.hasNext()) {
            if (T.equals(listIterator.next().zzb())) {
                listIterator.remove();
            }
        }
        this.f102986b.mo133435f().add(new C40399k(this.f102964d, str));
    }

    /* renamed from: g */
    public final void mo133420g(boolean z) {
        this.f102965e = z;
    }
}
