package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.uc */
public final class C41619uc implements C41735z8 {

    /* renamed from: a */
    public final C41299h5 f105064a;

    public C41619uc(Context context) {
        this.f105064a = C41299h5.m167615b(context);
    }

    /* renamed from: a */
    public final C41310hg<?> mo135005a(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        boolean z2 = false;
        if (hgVarArr != null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        if (hgVarArr.length == 0) {
            z2 = true;
        }
        C40843u.m166191a(z2);
        return new C41334ig(Boolean.valueOf(!this.f105064a.mo135426f()));
    }
}