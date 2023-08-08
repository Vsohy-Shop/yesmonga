package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.tc */
public final class C41595tc implements C41735z8 {

    /* renamed from: a */
    public final C41299h5 f105014a;

    public C41595tc(Context context) {
        this.f105014a = C41299h5.m167615b(context);
    }

    /* renamed from: a */
    public final C41310hg<?> mo135005a(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        boolean z2 = true;
        if (hgVarArr != null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        if (hgVarArr.length != 0) {
            z2 = false;
        }
        C40843u.m166191a(z2);
        String c = this.f105014a.mo135425c();
        if (c == null) {
            return C41431mg.f104800h;
        }
        return new C41599tg(c);
    }
}
