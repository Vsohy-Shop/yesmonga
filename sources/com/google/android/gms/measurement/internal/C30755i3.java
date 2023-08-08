package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C42083n0;
import com.google.android.gms.internal.measurement.C42117p0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.i3 */
public final class C30755i3 extends C42083n0 implements C30779k3 {
    public C30755i3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: H5 */
    public final byte[] mo87152H5(zzaw zzaw, String str) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170704d(m0, zzaw);
        m0.writeString(str);
        Parcel H0 = mo137165H0(9, m0);
        byte[] createByteArray = H0.createByteArray();
        H0.recycle();
        return createByteArray;
    }

    /* renamed from: K3 */
    public final void mo87153K3(zzq zzq) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170704d(m0, zzq);
        mo137166O0(20, m0);
    }

    /* renamed from: M2 */
    public final void mo87154M2(zzaw zzaw, zzq zzq) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170704d(m0, zzaw);
        C42117p0.m170704d(m0, zzq);
        mo137166O0(1, m0);
    }

    /* renamed from: M5 */
    public final String mo87155M5(zzq zzq) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170704d(m0, zzq);
        Parcel H0 = mo137165H0(11, m0);
        String readString = H0.readString();
        H0.recycle();
        return readString;
    }

    /* renamed from: S3 */
    public final List mo87156S3(String str, String str2, boolean z, zzq zzq) throws RemoteException {
        Parcel m0 = mo137168m0();
        m0.writeString(str);
        m0.writeString(str2);
        int i = C42117p0.f106330b;
        m0.writeInt(z ? 1 : 0);
        C42117p0.m170704d(m0, zzq);
        Parcel H0 = mo137165H0(14, m0);
        ArrayList<zzli> createTypedArrayList = H0.createTypedArrayList(zzli.CREATOR);
        H0.recycle();
        return createTypedArrayList;
    }

    /* renamed from: T2 */
    public final void mo87157T2(zzq zzq) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170704d(m0, zzq);
        mo137166O0(4, m0);
    }

    /* renamed from: Z7 */
    public final void mo87158Z7(zzac zzac, zzq zzq) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170704d(m0, zzac);
        C42117p0.m170704d(m0, zzq);
        mo137166O0(12, m0);
    }

    /* renamed from: a7 */
    public final List mo87159a7(String str, String str2, zzq zzq) throws RemoteException {
        Parcel m0 = mo137168m0();
        m0.writeString(str);
        m0.writeString(str2);
        C42117p0.m170704d(m0, zzq);
        Parcel H0 = mo137165H0(16, m0);
        ArrayList<zzac> createTypedArrayList = H0.createTypedArrayList(zzac.CREATOR);
        H0.recycle();
        return createTypedArrayList;
    }

    /* renamed from: c4 */
    public final void mo87160c4(zzli zzli, zzq zzq) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170704d(m0, zzli);
        C42117p0.m170704d(m0, zzq);
        mo137166O0(2, m0);
    }

    /* renamed from: e3 */
    public final void mo87161e3(long j, String str, String str2, String str3) throws RemoteException {
        Parcel m0 = mo137168m0();
        m0.writeLong(j);
        m0.writeString(str);
        m0.writeString(str2);
        m0.writeString(str3);
        mo137166O0(10, m0);
    }

    /* renamed from: f5 */
    public final void mo87162f5(zzq zzq) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170704d(m0, zzq);
        mo137166O0(6, m0);
    }

    /* renamed from: h4 */
    public final void mo87163h4(zzq zzq) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170704d(m0, zzq);
        mo137166O0(18, m0);
    }

    /* renamed from: o5 */
    public final void mo87164o5(Bundle bundle, zzq zzq) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170704d(m0, bundle);
        C42117p0.m170704d(m0, zzq);
        mo137166O0(19, m0);
    }

    /* renamed from: o7 */
    public final void mo87165o7(zzaw zzaw, String str, String str2) throws RemoteException {
        throw null;
    }

    /* renamed from: t5 */
    public final List mo87166t5(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel m0 = mo137168m0();
        m0.writeString((String) null);
        m0.writeString(str2);
        m0.writeString(str3);
        int i = C42117p0.f106330b;
        m0.writeInt(z ? 1 : 0);
        Parcel H0 = mo137165H0(15, m0);
        ArrayList<zzli> createTypedArrayList = H0.createTypedArrayList(zzli.CREATOR);
        H0.recycle();
        return createTypedArrayList;
    }

    /* renamed from: u1 */
    public final void mo87167u1(zzac zzac) throws RemoteException {
        throw null;
    }

    /* renamed from: v0 */
    public final List mo87168v0(String str, String str2, String str3) throws RemoteException {
        Parcel m0 = mo137168m0();
        m0.writeString((String) null);
        m0.writeString(str2);
        m0.writeString(str3);
        Parcel H0 = mo137165H0(17, m0);
        ArrayList<zzac> createTypedArrayList = H0.createTypedArrayList(zzac.CREATOR);
        H0.recycle();
        return createTypedArrayList;
    }

    /* renamed from: z1 */
    public final List mo87169z1(zzq zzq, boolean z) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170704d(m0, zzq);
        m0.writeInt(z ? 1 : 0);
        Parcel H0 = mo137165H0(7, m0);
        ArrayList<zzli> createTypedArrayList = H0.createTypedArrayList(zzli.CREATOR);
        H0.recycle();
        return createTypedArrayList;
    }
}
