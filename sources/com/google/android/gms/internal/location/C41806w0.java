package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.internal.C40756f;
import com.google.android.gms.common.internal.C40769i;
import com.google.android.gms.location.C30345h2;

/* renamed from: com.google.android.gms.internal.location.w0 */
public class C41806w0 extends C40769i<C41785m> {

    /* renamed from: Q */
    public final String f105929Q;

    /* renamed from: R */
    public final C41762e0<C41785m> f105930R = new C41804v0(this);

    public C41806w0(Context context, Looper looper, C40507i.C40509b bVar, C40507i.C40510c cVar, String str, C40756f fVar) {
        super(context, looper, 23, fVar, bVar, cVar);
        this.f105929Q = str;
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ IInterface mo87436A(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof C41785m) {
            return (C41785m) queryLocalInterface;
        }
        return new C41782l(iBinder);
    }

    /* renamed from: D */
    public final Feature[] mo134332D() {
        return C30345h2.f72805f;
    }

    /* renamed from: I */
    public final Bundle mo87659I() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f105929Q);
        return bundle;
    }

    /* renamed from: N */
    public final String mo87437N() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    /* renamed from: O */
    public final String mo87438O() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* renamed from: t */
    public final int mo87439t() {
        return 11717000;
    }
}
