package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C42031k1;

/* renamed from: com.google.android.gms.measurement.internal.ya */
public final class C30954ya implements C30758i6 {

    /* renamed from: a */
    public final C42031k1 f74120a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f74121b;

    public C30954ya(AppMeasurementDynamiteService appMeasurementDynamiteService, C42031k1 k1Var) {
        this.f74121b = appMeasurementDynamiteService;
        this.f74120a = k1Var;
    }

    /* renamed from: a */
    public final void mo86739a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f74120a.mo137013E(str, str2, bundle, j);
        } catch (RemoteException e) {
            C30731g5 g5Var = this.f74121b.f73210n;
            if (g5Var != null) {
                g5Var.mo86903d().mo87494w().mo87464b("Event listener threw exception", e);
            }
        }
    }
}
