package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.internal.C40756f;
import com.google.android.gms.common.internal.C40769i;

/* renamed from: com.google.android.gms.common.internal.service.i */
public final class C40830i extends C40769i<C40834m> {
    public C40830i(Context context, Looper looper, C40756f fVar, C40507i.C40509b bVar, C40507i.C40510c cVar) {
        super(context, looper, 39, fVar, bVar, cVar);
    }

    /* renamed from: A */
    public final /* synthetic */ IInterface mo87436A(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        if (queryLocalInterface instanceof C40834m) {
            return (C40834m) queryLocalInterface;
        }
        return new C40834m(iBinder);
    }

    /* renamed from: N */
    public final String mo87437N() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    /* renamed from: O */
    public final String mo87438O() {
        return "com.google.android.gms.common.service.START";
    }
}
