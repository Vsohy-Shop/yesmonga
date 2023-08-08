package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.j9 */
public final class C41351j9 extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        C41431mg mgVar;
        C40843u.m166202l(hgVarArr);
        int length = hgVarArr.length;
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
        List<C41310hg<?>> k = pgVar.mo135719k();
        int size = k.size();
        int i = size - 1;
        if (length == 3) {
            int a = (int) C41135a9.m167067a(hgVarArr[2]);
            if (a < 0) {
                i = size - Math.abs(a);
            } else {
                i = Math.min(a, i);
            }
        }
        while (true) {
            if (i >= 0) {
                if (pgVar.mo135722n(i) && C41135a9.m167074h(mgVar, k.get(i))) {
                    break;
                }
                i--;
            } else {
                i = -1;
                break;
            }
        }
        return new C41358jg(Double.valueOf((double) i));
    }
}
