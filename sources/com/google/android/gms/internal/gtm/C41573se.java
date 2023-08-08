package com.google.android.gms.internal.gtm;

import androidx.annotation.C0363p0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40979g;

/* renamed from: com.google.android.gms.internal.gtm.se */
public abstract class C41573se {

    /* renamed from: a */
    public final int f104954a;

    /* renamed from: b */
    public final C41165bf f104955b;

    /* renamed from: c */
    public final C41693xe f104956c;

    /* renamed from: d */
    public final C40979g f104957d;
    @C0363p0

    /* renamed from: e */
    public final C41636v5 f104958e;

    @C40974d0
    public C41573se(int i, C41165bf bfVar, C41693xe xeVar, @C0363p0 C41636v5 v5Var, C40979g gVar) {
        this.f104955b = (C41165bf) C40843u.m166202l(bfVar);
        C40843u.m166202l(bfVar.mo135064a());
        this.f104954a = i;
        this.f104956c = (C41693xe) C40843u.m166202l(xeVar);
        this.f104957d = (C40979g) C40843u.m166202l(gVar);
        this.f104958e = v5Var;
    }

    /* renamed from: a */
    public abstract void mo135825a(C41213df dfVar);

    /* renamed from: b */
    public final void mo135826b(int i, int i2) {
        String str;
        C41636v5 v5Var = this.f104958e;
        if (v5Var != null && i2 == 0 && i == 3) {
            v5Var.mo135968d();
        }
        String b = this.f104955b.mo135064a().mo135774b();
        if (i == 0) {
            str = "Resource not available";
        } else if (i == 1) {
            str = "IOError";
        } else if (i != 2) {
            str = "Unknown reason";
        } else {
            str = "Server error";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 61 + str.length());
        sb.append("Failed to fetch the container resource for the container \"");
        sb.append(b);
        sb.append("\": ");
        sb.append(str);
        C41493p6.m168152d(sb.toString());
        mo135825a(new C41213df(Status.f103186w, i2, (C41189cf) null, (C41142ag) null));
    }

    /* renamed from: c */
    public final void mo135827c(byte[] bArr) {
        C41213df dfVar;
        C41213df dfVar2;
        Status status;
        try {
            dfVar = this.f104956c.mo136035a(bArr);
        } catch (zzpf unused) {
            C41493p6.m168151c("Resource data is corrupted");
            dfVar = null;
        }
        C41636v5 v5Var = this.f104958e;
        if (v5Var != null && this.f104954a == 0) {
            v5Var.mo135969e();
        }
        if (dfVar == null || dfVar.getStatus() != (status = Status.f103184g)) {
            dfVar2 = new C41213df(Status.f103186w, this.f104954a, (C41189cf) null, (C41142ag) null);
        } else {
            dfVar2 = new C41213df(status, this.f104954a, new C41189cf(this.f104955b.mo135064a(), bArr, dfVar.mo135227b().mo135176c(), this.f104957d.mo134768a()), dfVar.mo135228c());
        }
        mo135825a(dfVar2);
    }
}
