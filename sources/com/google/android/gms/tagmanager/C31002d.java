package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.AppMeasurement;

/* renamed from: com.google.android.gms.tagmanager.d */
public final class C31002d implements AppMeasurement.C30635a {

    /* renamed from: a */
    public final /* synthetic */ C31017q f74275a;

    public C31002d(C31004f fVar, C31017q qVar) {
        this.f74275a = qVar;
    }

    /* renamed from: a */
    public final void mo86738a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f74275a.mo87703E(str, str2, bundle, j);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }
}
