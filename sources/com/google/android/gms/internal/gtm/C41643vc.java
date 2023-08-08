package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.vc */
public final class C41643vc extends C41159b9 {

    /* renamed from: a */
    public final Context f105158a;

    /* renamed from: b */
    public final C41181c7 f105159b;

    public C41643vc(Context context, C41181c7 c7Var) {
        this.f105158a = (Context) C40843u.m166202l(context);
        this.f105159b = c7Var;
    }

    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        C41431mg mgVar;
        C41431mg mgVar2;
        C40843u.m166191a(true);
        int length = hgVarArr.length;
        if (length == 0 || hgVarArr[0] == (mgVar = C41431mg.f104800h)) {
            return new C41599tg("");
        }
        Object obj = this.f105159b.zza().mo135000g().get("_ldl");
        if (obj == null) {
            return new C41599tg("");
        }
        C41310hg<?> b = C41623ug.m168490b(obj);
        if (!(b instanceof C41599tg)) {
            return new C41599tg("");
        }
        String k = ((C41599tg) b).mo135863k();
        if (!C41469o6.m168101a(k, "conv").equals(C41135a9.m167070d(hgVarArr[0]))) {
            return new C41599tg("");
        }
        String str = null;
        if (length > 1 && (mgVar2 = hgVarArr[1]) != mgVar) {
            str = C41135a9.m167070d(mgVar2);
        }
        String a = C41469o6.m168101a(k, str);
        if (a != null) {
            return new C41599tg(a);
        }
        return new C41599tg("");
    }
}
