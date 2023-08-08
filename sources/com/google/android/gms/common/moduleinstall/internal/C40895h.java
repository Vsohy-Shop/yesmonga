package com.google.android.gms.common.moduleinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C40576k;
import com.google.android.gms.internal.base.C41064a;
import com.google.android.gms.internal.base.C41066c;

/* renamed from: com.google.android.gms.common.moduleinstall.internal.h */
public final class C40895h extends C41064a implements IInterface {
    public C40895h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    /* renamed from: E8 */
    public final void mo134598E8(C40894g gVar, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel m0 = mo134870m0();
        C41066c.m166939e(m0, gVar);
        C41066c.m166938d(m0, apiFeatureRequest);
        mo134867O0(1, m0);
    }

    /* renamed from: F8 */
    public final void mo134599F8(C40894g gVar, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel m0 = mo134870m0();
        C41066c.m166939e(m0, gVar);
        C41066c.m166938d(m0, apiFeatureRequest);
        mo134867O0(3, m0);
    }

    /* renamed from: G8 */
    public final void mo134600G8(C40894g gVar, ApiFeatureRequest apiFeatureRequest, C40897j jVar) throws RemoteException {
        Parcel m0 = mo134870m0();
        C41066c.m166939e(m0, gVar);
        C41066c.m166938d(m0, apiFeatureRequest);
        C41066c.m166939e(m0, jVar);
        mo134867O0(2, m0);
    }

    /* renamed from: H8 */
    public final void mo134601H8(C40576k kVar, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel m0 = mo134870m0();
        C41066c.m166939e(m0, kVar);
        C41066c.m166938d(m0, apiFeatureRequest);
        mo134867O0(4, m0);
    }

    /* renamed from: I8 */
    public final void mo134602I8(C40576k kVar, C40897j jVar) throws RemoteException {
        Parcel m0 = mo134870m0();
        C41066c.m166939e(m0, kVar);
        C41066c.m166939e(m0, jVar);
        mo134867O0(6, m0);
    }
}
