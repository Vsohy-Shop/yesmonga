package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C40576k;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.zzbq;

/* renamed from: com.google.android.gms.internal.location.l */
public final class C41782l extends C41749a implements C41785m {
    public C41782l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    /* renamed from: I5 */
    public final LocationAvailability mo136195I5(String str) throws RemoteException {
        Parcel m0 = mo136180m0();
        m0.writeString(str);
        Parcel H0 = mo136177H0(34, m0);
        LocationAvailability locationAvailability = (LocationAvailability) C41794q0.m169120b(H0, LocationAvailability.CREATOR);
        H0.recycle();
        return locationAvailability;
    }

    /* renamed from: P2 */
    public final void mo136196P2(zzl zzl) throws RemoteException {
        Parcel m0 = mo136180m0();
        C41794q0.m169121c(m0, zzl);
        mo136178O0(75, m0);
    }

    /* renamed from: Q6 */
    public final void mo136197Q6(zzbq zzbq, C41779k kVar) throws RemoteException {
        Parcel m0 = mo136180m0();
        C41794q0.m169121c(m0, zzbq);
        C41794q0.m169122d(m0, kVar);
        mo136178O0(74, m0);
    }

    /* renamed from: S6 */
    public final void mo136198S6(long j, boolean z, PendingIntent pendingIntent) throws RemoteException {
        Parcel m0 = mo136180m0();
        m0.writeLong(j);
        C41794q0.m169119a(m0, true);
        C41794q0.m169121c(m0, pendingIntent);
        mo136178O0(5, m0);
    }

    /* renamed from: X3 */
    public final void mo136199X3(C41773i iVar) throws RemoteException {
        Parcel m0 = mo136180m0();
        C41794q0.m169122d(m0, iVar);
        mo136178O0(67, m0);
    }

    /* renamed from: b1 */
    public final void mo136200b1(LocationSettingsRequest locationSettingsRequest, C41789o oVar, String str) throws RemoteException {
        Parcel m0 = mo136180m0();
        C41794q0.m169121c(m0, locationSettingsRequest);
        C41794q0.m169122d(m0, oVar);
        m0.writeString((String) null);
        mo136178O0(63, m0);
    }

    /* renamed from: d6 */
    public final void mo136201d6(PendingIntent pendingIntent) throws RemoteException {
        Parcel m0 = mo136180m0();
        C41794q0.m169121c(m0, pendingIntent);
        mo136178O0(6, m0);
    }

    /* renamed from: d8 */
    public final void mo136202d8(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, C41779k kVar) throws RemoteException {
        Parcel m0 = mo136180m0();
        C41794q0.m169121c(m0, geofencingRequest);
        C41794q0.m169121c(m0, pendingIntent);
        C41794q0.m169122d(m0, kVar);
        mo136178O0(57, m0);
    }

    /* renamed from: f4 */
    public final void mo136203f4(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, C40576k kVar) throws RemoteException {
        Parcel m0 = mo136180m0();
        C41794q0.m169121c(m0, activityTransitionRequest);
        C41794q0.m169121c(m0, pendingIntent);
        C41794q0.m169122d(m0, kVar);
        mo136178O0(72, m0);
    }

    /* renamed from: k3 */
    public final void mo136204k3(Location location) throws RemoteException {
        Parcel m0 = mo136180m0();
        C41794q0.m169121c(m0, location);
        mo136178O0(13, m0);
    }

    /* renamed from: l1 */
    public final void mo136205l1(PendingIntent pendingIntent, C40576k kVar) throws RemoteException {
        Parcel m0 = mo136180m0();
        C41794q0.m169121c(m0, pendingIntent);
        C41794q0.m169122d(m0, kVar);
        mo136178O0(73, m0);
    }

    /* renamed from: n */
    public final void mo136206n(boolean z) throws RemoteException {
        Parcel m0 = mo136180m0();
        C41794q0.m169119a(m0, z);
        mo136178O0(12, m0);
    }

    /* renamed from: p1 */
    public final void mo136207p1(zzbc zzbc) throws RemoteException {
        Parcel m0 = mo136180m0();
        C41794q0.m169121c(m0, zzbc);
        mo136178O0(59, m0);
    }

    /* renamed from: q3 */
    public final void mo136208q3(String[] strArr, C41779k kVar, String str) throws RemoteException {
        Parcel m0 = mo136180m0();
        m0.writeStringArray(strArr);
        C41794q0.m169122d(m0, kVar);
        m0.writeString(str);
        mo136178O0(3, m0);
    }

    /* renamed from: r */
    public final Location mo136209r() throws RemoteException {
        Parcel H0 = mo136177H0(7, mo136180m0());
        Location location = (Location) C41794q0.m169120b(H0, Location.CREATOR);
        H0.recycle();
        return location;
    }

    /* renamed from: v8 */
    public final void mo136210v8(PendingIntent pendingIntent, C41779k kVar, String str) throws RemoteException {
        Parcel m0 = mo136180m0();
        C41794q0.m169121c(m0, pendingIntent);
        C41794q0.m169122d(m0, kVar);
        m0.writeString(str);
        mo136178O0(2, m0);
    }

    /* renamed from: w2 */
    public final void mo136211w2(PendingIntent pendingIntent, C40576k kVar) throws RemoteException {
        Parcel m0 = mo136180m0();
        C41794q0.m169121c(m0, pendingIntent);
        C41794q0.m169122d(m0, kVar);
        mo136178O0(69, m0);
    }

    /* renamed from: w8 */
    public final void mo136212w8(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, C40576k kVar) throws RemoteException {
        Parcel m0 = mo136180m0();
        C41794q0.m169121c(m0, pendingIntent);
        C41794q0.m169121c(m0, sleepSegmentRequest);
        C41794q0.m169122d(m0, kVar);
        mo136178O0(79, m0);
    }

    /* renamed from: x2 */
    public final Location mo136213x2(String str) throws RemoteException {
        Parcel m0 = mo136180m0();
        m0.writeString(str);
        Parcel H0 = mo136177H0(80, m0);
        Location location = (Location) C41794q0.m169120b(H0, Location.CREATOR);
        H0.recycle();
        return location;
    }
}
