package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.C30638a;
import com.google.firebase.crashlytics.C32648f;

/* renamed from: com.google.firebase.analytics.connector.internal.f */
public final class C32551f implements C30638a.C30641c {

    /* renamed from: a */
    public final /* synthetic */ C32552g f79017a;

    public C32551f(C32552g gVar) {
        this.f79017a = gVar;
    }

    /* renamed from: a */
    public final void mo86739a(String str, String str2, Bundle bundle, long j) {
        if (str != null && C32548c.m131556c(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle(C32648f.f79206e, bundle);
            this.f79017a.f79018a.mo94656a(3, bundle2);
        }
    }
}
