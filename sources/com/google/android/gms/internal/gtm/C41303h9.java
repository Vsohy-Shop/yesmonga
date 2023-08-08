package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.h9 */
public final class C41303h9 extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        C41431mg mgVar;
        C41431mg mgVar2;
        C40843u.m166202l(hgVarArr);
        int length = hgVarArr.length;
        int i = 0;
        if (length <= 0 || length > 3) {
            z = false;
        } else {
            z = true;
        }
        C40843u.m166191a(z);
        C40843u.m166191a(hgVarArr[0] instanceof C41503pg);
        C41503pg pgVar = hgVarArr[0];
        if (length < 2) {
            mgVar = C41431mg.f104800h;
        } else {
            mgVar = hgVarArr[1];
        }
        if (length < 3) {
            mgVar2 = C41431mg.f104800h;
        } else {
            mgVar2 = hgVarArr[2];
        }
        List<C41310hg<?>> k = pgVar.mo135719k();
        int size = k.size();
        if (mgVar2 != C41431mg.f104800h) {
            int a = (int) C41135a9.m167067a(mgVar2);
            if (a < 0) {
                i = Math.max(size - Math.abs(a), 0);
            } else {
                i = a;
            }
        }
        while (true) {
            if (i < size) {
                if (pgVar.mo135722n(i) && C41135a9.m167074h(mgVar, k.get(i))) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        return new C41358jg(Double.valueOf((double) i));
    }
}
