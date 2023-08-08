package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.google.android.play.core.internal.s1 */
public final class C32088s1 extends C32064k1 implements C32094u1 {
    public C32088s1(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    /* renamed from: B4 */
    public final void mo92815B4(String str, Bundle bundle, C32100w1 w1Var) throws RemoteException {
        Parcel m0 = mo92783m0();
        m0.writeString(str);
        C32070m1.m129881b(m0, bundle);
        C32070m1.m129882c(m0, w1Var);
        mo92781H0(5, m0);
    }

    /* renamed from: D2 */
    public final void mo92816D2(String str, Bundle bundle, C32100w1 w1Var) throws RemoteException {
        Parcel m0 = mo92783m0();
        m0.writeString(str);
        C32070m1.m129881b(m0, bundle);
        C32070m1.m129882c(m0, w1Var);
        mo92781H0(10, m0);
    }

    /* renamed from: E2 */
    public final void mo92817E2(String str, Bundle bundle, Bundle bundle2, C32100w1 w1Var) throws RemoteException {
        Parcel m0 = mo92783m0();
        m0.writeString(str);
        C32070m1.m129881b(m0, bundle);
        C32070m1.m129881b(m0, bundle2);
        C32070m1.m129882c(m0, w1Var);
        mo92781H0(11, m0);
    }

    /* renamed from: G7 */
    public final void mo92818G7(String str, Bundle bundle, Bundle bundle2, C32100w1 w1Var) throws RemoteException {
        Parcel m0 = mo92783m0();
        m0.writeString(str);
        C32070m1.m129881b(m0, bundle);
        C32070m1.m129881b(m0, bundle2);
        C32070m1.m129882c(m0, w1Var);
        mo92781H0(13, m0);
    }

    /* renamed from: I4 */
    public final void mo92819I4(String str, List<Bundle> list, Bundle bundle, C32100w1 w1Var) throws RemoteException {
        Parcel m0 = mo92783m0();
        m0.writeString(str);
        m0.writeTypedList(list);
        C32070m1.m129881b(m0, bundle);
        C32070m1.m129882c(m0, w1Var);
        mo92781H0(12, m0);
    }

    /* renamed from: K1 */
    public final void mo92820K1(String str, Bundle bundle, Bundle bundle2, C32100w1 w1Var) throws RemoteException {
        Parcel m0 = mo92783m0();
        m0.writeString(str);
        C32070m1.m129881b(m0, bundle);
        C32070m1.m129881b(m0, bundle2);
        C32070m1.m129882c(m0, w1Var);
        mo92781H0(9, m0);
    }

    /* renamed from: K4 */
    public final void mo92821K4(String str, Bundle bundle, Bundle bundle2, C32100w1 w1Var) throws RemoteException {
        Parcel m0 = mo92783m0();
        m0.writeString(str);
        C32070m1.m129881b(m0, bundle);
        C32070m1.m129881b(m0, bundle2);
        C32070m1.m129882c(m0, w1Var);
        mo92781H0(6, m0);
    }

    /* renamed from: e1 */
    public final void mo92822e1(String str, Bundle bundle, Bundle bundle2, C32100w1 w1Var) throws RemoteException {
        Parcel m0 = mo92783m0();
        m0.writeString(str);
        C32070m1.m129881b(m0, bundle);
        C32070m1.m129881b(m0, bundle2);
        C32070m1.m129882c(m0, w1Var);
        mo92781H0(7, m0);
    }

    /* renamed from: i5 */
    public final void mo92823i5(String str, List<Bundle> list, Bundle bundle, C32100w1 w1Var) throws RemoteException {
        Parcel m0 = mo92783m0();
        m0.writeString(str);
        m0.writeTypedList(list);
        C32070m1.m129881b(m0, bundle);
        C32070m1.m129882c(m0, w1Var);
        mo92781H0(14, m0);
    }

    /* renamed from: z8 */
    public final void mo92824z8(String str, List<Bundle> list, Bundle bundle, C32100w1 w1Var) throws RemoteException {
        Parcel m0 = mo92783m0();
        m0.writeString(str);
        m0.writeTypedList(list);
        C32070m1.m129881b(m0, bundle);
        C32070m1.m129882c(m0, w1Var);
        mo92781H0(2, m0);
    }
}
