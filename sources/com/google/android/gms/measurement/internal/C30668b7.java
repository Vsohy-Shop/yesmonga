package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.b7 */
public final class C30668b7 implements C30894ta {

    /* renamed from: a */
    public final /* synthetic */ C30819n7 f73246a;

    public C30668b7(C30819n7 n7Var) {
        this.f73246a = n7Var;
    }

    /* renamed from: a */
    public final void mo86905a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f73246a.mo87333t("auto", "_err", bundle, str);
        } else {
            this.f73246a.mo87331r("auto", "_err", bundle);
        }
    }
}
