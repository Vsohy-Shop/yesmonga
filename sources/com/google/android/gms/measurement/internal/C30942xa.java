package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C42031k1;

/* renamed from: com.google.android.gms.measurement.internal.xa */
public final class C30942xa implements C30745h6 {

    /* renamed from: a */
    public final C42031k1 f74098a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f74099b;

    public C30942xa(AppMeasurementDynamiteService appMeasurementDynamiteService, C42031k1 k1Var) {
        this.f74099b = appMeasurementDynamiteService;
        this.f74098a = k1Var;
    }

    /* renamed from: a */
    public final void mo86738a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f74098a.mo137013E(str, str2, bundle, j);
        } catch (RemoteException e) {
            C30731g5 g5Var = this.f74099b.f73210n;
            if (g5Var != null) {
                g5Var.mo86903d().mo87494w().mo87464b("Event interceptor threw exception", e);
            }
        }
    }
}
