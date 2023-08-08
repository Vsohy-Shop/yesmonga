package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import com.google.android.gms.tagmanager.C31013m;

/* renamed from: com.google.android.gms.internal.gtm.x7 */
public final class C41686x7 extends C31013m {

    /* renamed from: n */
    public final /* synthetic */ C41375k8 f105237n;

    public C41686x7(C41375k8 k8Var) {
        this.f105237n = k8Var;
    }

    /* renamed from: E */
    public final void mo87702E(String str, String str2, Bundle bundle, long j) {
        String str3 = str;
        if (!str.endsWith("+gtm")) {
            StringBuilder sb = new StringBuilder(str.length() + 4);
            sb.append(str);
            sb.append("+gtm");
            this.f105237n.f104753e.execute(new C41662w7(this, str2, bundle, sb.toString(), j, str));
            return;
        }
    }
}
