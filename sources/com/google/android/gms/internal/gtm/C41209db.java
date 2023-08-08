package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.db */
public final class C41209db extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        C40843u.m166191a(true);
        int length = hgVarArr.length;
        if (length == 2) {
            z = true;
        } else if (length == 3) {
            z = true;
            length = 3;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        C40843u.m166191a(hgVarArr[1] instanceof C41503pg);
        if (length == 3) {
            C40843u.m166191a(hgVarArr[2] instanceof C41503pg);
        }
        List arrayList = new ArrayList();
        if (C41135a9.m167073g(hgVarArr[0])) {
            arrayList = hgVarArr[1].mo135719k();
        } else if (length > 2) {
            arrayList = hgVarArr[2].mo135719k();
        }
        C41431mg f = C41623ug.m168494f(g7Var, arrayList);
        if (C41623ug.m168497i(f)) {
            return f;
        }
        return C41431mg.f104800h;
    }
}
