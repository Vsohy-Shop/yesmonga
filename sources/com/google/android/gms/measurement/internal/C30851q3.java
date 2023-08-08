package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.C40864j;
import com.google.android.gms.common.internal.C40747e;

/* renamed from: com.google.android.gms.measurement.internal.q3 */
public final class C30851q3 extends C40747e {
    public C30851q3(Context context, Looper looper, C40747e.C40748a aVar, C40747e.C40749b bVar) {
        super(context, looper, 93, aVar, bVar, (String) null);
    }

    /* renamed from: A */
    public final /* synthetic */ IInterface mo87436A(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof C30779k3) {
            return (C30779k3) queryLocalInterface;
        }
        return new C30755i3(iBinder);
    }

    @C0359n0
    /* renamed from: N */
    public final String mo87437N() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @C0359n0
    /* renamed from: O */
    public final String mo87438O() {
        return "com.google.android.gms.measurement.START";
    }

    /* renamed from: t */
    public final int mo87439t() {
        return C40864j.f103985a;
    }
}
