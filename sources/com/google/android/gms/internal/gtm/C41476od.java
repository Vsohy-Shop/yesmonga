package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.od */
public final class C41476od implements C41735z8 {

    /* renamed from: a */
    public final Context f104838a;

    public C41476od(Context context) {
        this.f104838a = (Context) C40843u.m166202l(context);
    }

    /* renamed from: a */
    public final C41310hg<?> mo135005a(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        C41431mg mgVar;
        if (hgVarArr != null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        String str = null;
        if (hgVarArr.length > 0 && (mgVar = hgVarArr[0]) != C41431mg.f104800h) {
            str = C41135a9.m167070d(C41623ug.m168491c(g7Var, mgVar));
        }
        String b = C41469o6.m168102b(this.f104838a, str);
        if (b != null) {
            return new C41599tg(b);
        }
        return C41431mg.f104800h;
    }
}
