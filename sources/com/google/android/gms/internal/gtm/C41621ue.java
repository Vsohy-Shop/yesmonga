package com.google.android.gms.internal.gtm;

import androidx.annotation.C0363p0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40985k;
import java.util.List;

@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.ue */
public final class C41621ue extends C41573se {

    /* renamed from: f */
    public final C41597te f105065f;

    /* renamed from: g */
    public final List<Integer> f105066g;

    /* renamed from: h */
    public final int f105067h;

    /* renamed from: i */
    public final /* synthetic */ C41669we f105068i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41621ue(C41669we weVar, int i, C41165bf bfVar, C41693xe xeVar, List<Integer> list, int i2, @C0363p0 C41597te teVar, C41636v5 v5Var) {
        super(i, bfVar, xeVar, v5Var, C40985k.m166636d());
        this.f105068i = weVar;
        this.f105065f = teVar;
        this.f105066g = list;
        this.f105067h = i2;
    }

    /* renamed from: a */
    public final void mo135825a(C41213df dfVar) {
        String str;
        String str2;
        String str3;
        if (dfVar.getStatus() == Status.f103184g) {
            String d = dfVar.mo135229d();
            if (d.length() != 0) {
                str3 = "Container resource successfully loaded from ".concat(d);
            } else {
                str3 = new String("Container resource successfully loaded from ");
            }
            C41493p6.m168152d(str3);
            if (dfVar.mo135226a() == 0) {
                C41189cf b = dfVar.mo135227b();
                if (!b.mo135175b().mo135779g()) {
                    this.f105068i.mo136026d(dfVar.getStatus(), b);
                    if (b.mo135177d() != null && b.mo135177d().length > 0) {
                        this.f105068i.f105208b.mo135497g(b.mo135175b().mo135776d(), b.mo135177d());
                    }
                }
            }
            this.f105065f.mo135681a(dfVar);
            return;
        }
        String d2 = dfVar.mo135229d();
        if (true != dfVar.getStatus().mo133655p0()) {
            str = "FAILURE";
        } else {
            str = "SUCCESS";
        }
        StringBuilder sb = new StringBuilder(d2.length() + 54 + str.length());
        sb.append("Cannot fetch a valid resource from ");
        sb.append(d2);
        sb.append(". Response status: ");
        sb.append(str);
        C41493p6.m168152d(sb.toString());
        if (dfVar.getStatus().mo133655p0()) {
            String d3 = dfVar.mo135229d();
            if (d3.length() != 0) {
                str2 = "Response source: ".concat(d3);
            } else {
                str2 = new String("Response source: ");
            }
            C41493p6.m168152d(str2);
            int length = dfVar.mo135227b().mo135177d().length;
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("Response size: ");
            sb2.append(length);
            C41493p6.m168152d(sb2.toString());
        }
        this.f105068i.mo136024b(this.f104955b, this.f105066g, this.f105067h + 1, this.f105065f, this.f104958e);
    }
}
