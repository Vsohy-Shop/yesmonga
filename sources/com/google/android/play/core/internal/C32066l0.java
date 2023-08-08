package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.google.android.play.core.internal.l0 */
public final class C32066l0 extends C32064k1 implements C32072n0 {
    public C32066l0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }

    /* renamed from: C4 */
    public final void mo92787C4(String str, List<Bundle> list, Bundle bundle, C32078p0 p0Var) throws RemoteException {
        Parcel m0 = mo92783m0();
        m0.writeString(str);
        m0.writeTypedList(list);
        C32070m1.m129881b(m0, bundle);
        C32070m1.m129882c(m0, p0Var);
        mo92781H0(8, m0);
    }

    /* renamed from: J3 */
    public final void mo92788J3(String str, List<Bundle> list, Bundle bundle, C32078p0 p0Var) throws RemoteException {
        Parcel m0 = mo92783m0();
        m0.writeString(str);
        m0.writeTypedList(list);
        C32070m1.m129881b(m0, bundle);
        C32070m1.m129882c(m0, p0Var);
        mo92781H0(14, m0);
    }

    /* renamed from: O2 */
    public final void mo92789O2(String str, List<Bundle> list, Bundle bundle, C32078p0 p0Var) throws RemoteException {
        Parcel m0 = mo92783m0();
        m0.writeString(str);
        m0.writeTypedList(list);
        C32070m1.m129881b(m0, bundle);
        C32070m1.m129882c(m0, p0Var);
        mo92781H0(2, m0);
    }

    /* renamed from: O3 */
    public final void mo92790O3(String str, C32078p0 p0Var) throws RemoteException {
        Parcel m0 = mo92783m0();
        m0.writeString(str);
        C32070m1.m129882c(m0, p0Var);
        mo92781H0(6, m0);
    }

    /* renamed from: V4 */
    public final void mo92791V4(String str, List<Bundle> list, Bundle bundle, C32078p0 p0Var) throws RemoteException {
        Parcel m0 = mo92783m0();
        m0.writeString(str);
        m0.writeTypedList(list);
        C32070m1.m129881b(m0, bundle);
        C32070m1.m129882c(m0, p0Var);
        mo92781H0(7, m0);
    }

    /* renamed from: a4 */
    public final void mo92792a4(String str, List<Bundle> list, Bundle bundle, C32078p0 p0Var) throws RemoteException {
        Parcel m0 = mo92783m0();
        m0.writeString(str);
        m0.writeTypedList(list);
        C32070m1.m129881b(m0, bundle);
        C32070m1.m129882c(m0, p0Var);
        mo92781H0(13, m0);
    }

    /* renamed from: j8 */
    public final void mo92793j8(String str, int i, C32078p0 p0Var) throws RemoteException {
        Parcel m0 = mo92783m0();
        m0.writeString(str);
        m0.writeInt(i);
        C32070m1.m129882c(m0, p0Var);
        mo92781H0(5, m0);
    }

    /* renamed from: y4 */
    public final void mo92794y4(String str, int i, Bundle bundle, C32078p0 p0Var) throws RemoteException {
        Parcel m0 = mo92783m0();
        m0.writeString(str);
        m0.writeInt(i);
        C32070m1.m129881b(m0, bundle);
        C32070m1.m129882c(m0, p0Var);
        mo92781H0(4, m0);
    }
}
