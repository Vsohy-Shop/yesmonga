package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.C41092a;
import com.google.android.gms.internal.common.C41108j;

/* renamed from: com.google.android.gms.common.internal.f1 */
public final class C40759f1 extends C41092a implements C40795o {
    public C40759f1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* renamed from: V2 */
    public final void mo134402V2(int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel T6 = mo134905T6();
        T6.writeInt(i);
        T6.writeStrongBinder(iBinder);
        C41108j.m166985d(T6, bundle);
        mo134903H0(1, T6);
    }

    /* renamed from: m6 */
    public final void mo134403m6(int i, Bundle bundle) throws RemoteException {
        throw null;
    }

    /* renamed from: n7 */
    public final void mo134404n7(int i, IBinder iBinder, zzj zzj) throws RemoteException {
        throw null;
    }
}
