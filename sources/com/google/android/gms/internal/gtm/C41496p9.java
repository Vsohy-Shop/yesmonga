package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.gtm.p9 */
public final class C41496p9 extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        C40843u.m166202l(hgVarArr);
        boolean z = true;
        if (hgVarArr.length != 1) {
            z = false;
        }
        C40843u.m166191a(z);
        C40843u.m166191a(hgVarArr[0] instanceof C41503pg);
        Collections.reverse(hgVarArr[0].mo135719k());
        return hgVarArr[0];
    }
}
