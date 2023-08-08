package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.C30638a;
import com.google.android.gms.measurement.internal.C30706e6;

/* renamed from: com.google.firebase.analytics.connector.internal.d */
public final class C32549d implements C30638a.C30641c {

    /* renamed from: a */
    public final /* synthetic */ C32550e f79012a;

    public C32549d(C32550e eVar) {
        this.f79012a = eVar;
    }

    /* renamed from: a */
    public final void mo86739a(String str, String str2, Bundle bundle, long j) {
        if (this.f79012a.f79013a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            int i = C32548c.f79011g;
            String a = C30706e6.m123694a(str2);
            if (a != null) {
                str2 = a;
            }
            bundle2.putString("events", str2);
            this.f79012a.f79014b.mo94656a(2, bundle2);
        }
    }
}
