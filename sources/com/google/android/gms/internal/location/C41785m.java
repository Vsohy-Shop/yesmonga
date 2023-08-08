package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.api.internal.C40576k;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.zzbq;

/* renamed from: com.google.android.gms.internal.location.m */
public interface C41785m extends IInterface {
    /* renamed from: I5 */
    LocationAvailability mo136195I5(String str) throws RemoteException;

    /* renamed from: P2 */
    void mo136196P2(zzl zzl) throws RemoteException;

    /* renamed from: Q6 */
    void mo136197Q6(zzbq zzbq, C41779k kVar) throws RemoteException;

    /* renamed from: S6 */
    void mo136198S6(long j, boolean z, PendingIntent pendingIntent) throws RemoteException;

    /* renamed from: X3 */
    void mo136199X3(C41773i iVar) throws RemoteException;

    /* renamed from: b1 */
    void mo136200b1(LocationSettingsRequest locationSettingsRequest, C41789o oVar, String str) throws RemoteException;

    /* renamed from: d6 */
    void mo136201d6(PendingIntent pendingIntent) throws RemoteException;

    /* renamed from: d8 */
    void mo136202d8(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, C41779k kVar) throws RemoteException;

    /* renamed from: f4 */
    void mo136203f4(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, C40576k kVar) throws RemoteException;

    /* renamed from: k3 */
    void mo136204k3(Location location) throws RemoteException;

    /* renamed from: l1 */
    void mo136205l1(PendingIntent pendingIntent, C40576k kVar) throws RemoteException;

    /* renamed from: n */
    void mo136206n(boolean z) throws RemoteException;

    /* renamed from: p1 */
    void mo136207p1(zzbc zzbc) throws RemoteException;

    /* renamed from: q3 */
    void mo136208q3(String[] strArr, C41779k kVar, String str) throws RemoteException;

    @Deprecated
    /* renamed from: r */
    Location mo136209r() throws RemoteException;

    /* renamed from: v8 */
    void mo136210v8(PendingIntent pendingIntent, C41779k kVar, String str) throws RemoteException;

    /* renamed from: w2 */
    void mo136211w2(PendingIntent pendingIntent, C40576k kVar) throws RemoteException;

    /* renamed from: w8 */
    void mo136212w8(PendingIntent pendingIntent, @C0363p0 SleepSegmentRequest sleepSegmentRequest, C40576k kVar) throws RemoteException;

    /* renamed from: x2 */
    Location mo136213x2(@C0363p0 String str) throws RemoteException;
}
