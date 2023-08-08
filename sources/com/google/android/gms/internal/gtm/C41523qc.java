package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.gtm.qc */
public final class C41523qc extends C41159b9 {

    /* renamed from: a */
    public final int f104899a;

    /* renamed from: b */
    public final C41277g7 f104900b;

    public C41523qc(int i, C41277g7 g7Var) {
        this.f104899a = i;
        this.f104900b = g7Var;
    }

    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z = true;
        C40843u.m166191a(true);
        if (hgVarArr.length != 1) {
            z = false;
        }
        C40843u.m166191a(z);
        C40843u.m166191a(hgVarArr[0] instanceof C41599tg);
        try {
            C41711y8 a = C41549re.m168297a(new JSONArray(hgVarArr[0].mo135863k()).getJSONArray(0));
            a.mo136102d(this.f104900b);
            C41310hg<?> a2 = a.mo135005a(g7Var, new C41310hg[0]);
            if (this.f104899a == 0) {
                return C41431mg.f104800h;
            }
            return a2;
        } catch (JSONException e) {
            C41493p6.m168150b("Unable to convert Custom Pixie to instruction", e);
            return C41431mg.f104800h;
        }
    }
}
