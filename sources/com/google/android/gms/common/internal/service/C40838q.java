package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C40546f;
import com.google.android.gms.common.api.internal.C40609q;
import com.google.android.gms.common.internal.C40738c0;
import com.google.android.gms.common.internal.C40756f;
import com.google.android.gms.common.internal.C40769i;
import com.google.android.gms.internal.base.C41069f;

/* renamed from: com.google.android.gms.common.internal.service.q */
public final class C40838q extends C40769i {

    /* renamed from: Q */
    public final C40738c0 f103945Q;

    public C40838q(Context context, Looper looper, C40756f fVar, C40738c0 c0Var, C40546f fVar2, C40609q qVar) {
        super(context, looper, 270, fVar, fVar2, qVar);
        this.f103945Q = c0Var;
    }

    @C0363p0
    /* renamed from: A */
    public final /* synthetic */ IInterface mo87436A(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof C40831j) {
            return (C40831j) queryLocalInterface;
        }
        return new C40831j(iBinder);
    }

    /* renamed from: D */
    public final Feature[] mo134332D() {
        return C41069f.f104352b;
    }

    /* renamed from: I */
    public final Bundle mo87659I() {
        return this.f103945Q.mo134310b();
    }

    @C0359n0
    /* renamed from: N */
    public final String mo87437N() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @C0359n0
    /* renamed from: O */
    public final String mo87438O() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    /* renamed from: R */
    public final boolean mo134343R() {
        return true;
    }

    /* renamed from: t */
    public final int mo87439t() {
        return 203400000;
    }
}
