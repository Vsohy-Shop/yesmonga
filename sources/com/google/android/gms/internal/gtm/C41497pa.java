package com.google.android.gms.internal.gtm;

import androidx.constraintlayout.core.motion.utils.C16717v;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.pa */
public final class C41497pa extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        String str;
        C40843u.m166191a(true);
        if (hgVarArr.length == 1) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        C40843u.m166191a(!(hgVarArr[0] instanceof C41551rg));
        C40843u.m166191a(true ^ C41623ug.m168497i(hgVarArr[0]));
        C41431mg mgVar = hgVarArr[0];
        if (mgVar == C41431mg.f104800h) {
            str = "undefined";
        } else if (mgVar instanceof C41334ig) {
            str = C16717v.C16719b.f42183f;
        } else if (mgVar instanceof C41358jg) {
            str = "number";
        } else if (mgVar instanceof C41599tg) {
            str = C16717v.C16719b.f42182e;
        } else if (mgVar instanceof C41383kg) {
            str = "function";
        } else {
            str = "object";
        }
        return new C41599tg(str);
    }
}
