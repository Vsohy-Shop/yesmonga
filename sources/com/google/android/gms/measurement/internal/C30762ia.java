package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.ia */
public final class C30762ia implements C30894ta {

    /* renamed from: a */
    public final /* synthetic */ C30822na f73615a;

    public C30762ia(C30822na naVar) {
        this.f73615a = naVar;
    }

    /* renamed from: a */
    public final void mo86905a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            C30822na naVar = this.f73615a;
            if (naVar.f73806l != null) {
                naVar.f73806l.mo86903d().mo87489r().mo87464b("AppId not known when logging event", "_err");
                return;
            }
            return;
        }
        this.f73615a.mo86904f().mo86950z(new C30736ga(this, str, "_err", bundle));
    }
}
