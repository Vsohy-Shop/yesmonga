package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.AppMeasurement;

/* renamed from: com.google.android.gms.tagmanager.e */
public final class C31003e implements AppMeasurement.C30636b {

    /* renamed from: a */
    public final /* synthetic */ C31014n f74276a;

    public C31003e(C31004f fVar, C31014n nVar) {
        this.f74276a = nVar;
    }

    /* renamed from: a */
    public final void mo86739a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f74276a.mo87702E(str, str2, bundle, j);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }
}
