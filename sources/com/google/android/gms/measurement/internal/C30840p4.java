package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0353k0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.measurement.zzcl;
import com.urbanairship.analytics.C35557k;

/* renamed from: com.google.android.gms.measurement.internal.p4 */
public final class C30840p4 {

    /* renamed from: a */
    public final C30828o4 f73849a;

    public C30840p4(C30828o4 o4Var) {
        C40843u.m166202l(o4Var);
        this.f73849a = o4Var;
    }

    @C0353k0
    /* renamed from: a */
    public final void mo87413a(Context context, Intent intent) {
        C30731g5 H = C30731g5.m123740H(context, (zzcl) null, (Long) null);
        C30899u3 d = H.mo86903d();
        if (intent == null) {
            d.mo87494w().mo87463a("Receiver called with null intent");
            return;
        }
        H.mo86901b();
        String action = intent.getAction();
        d.mo87493v().mo87464b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            d.mo87493v().mo87463a("Starting wakeful intent.");
            this.f73849a.mo86750a(context, className);
        } else if (C35557k.f87782b.equals(action)) {
            d.mo87494w().mo87463a("Install Referrer Broadcasts are deprecated");
        }
    }
}
