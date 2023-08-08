package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.gtm.l6 */
public final class C41397l6 extends C41534r implements C41445n6 {
    public C41397l6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.internal.ITagManagerService");
    }

    /* renamed from: Q2 */
    public final void mo135612Q2(String str, Bundle bundle, String str2, long j, boolean z) throws RemoteException {
        Parcel m0 = mo135793m0();
        m0.writeString(str);
        C41582t.m168363d(m0, bundle);
        m0.writeString(str2);
        m0.writeLong(j);
        C41582t.m168362c(m0, z);
        mo135790O0(101, m0);
    }

    /* renamed from: X5 */
    public final void mo135613X5(String str, String str2, String str3, C41373k6 k6Var) throws RemoteException {
        Parcel m0 = mo135793m0();
        m0.writeString(str);
        m0.writeString(str2);
        m0.writeString((String) null);
        C41582t.m168364e(m0, k6Var);
        mo135790O0(2, m0);
    }

    /* renamed from: f */
    public final void mo135614f() throws RemoteException {
        mo135790O0(102, mo135793m0());
    }

    /* renamed from: k */
    public final void mo135615k() throws RemoteException {
        mo135790O0(3, mo135793m0());
    }

    /* renamed from: v0 */
    public final void mo135616v0(String str, String str2, String str3) throws RemoteException {
        throw null;
    }
}
