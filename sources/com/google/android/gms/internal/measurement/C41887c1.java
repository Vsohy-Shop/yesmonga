package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.c1 */
public final class C41887c1 extends C42083n0 implements C41923e1 {
    public C41887c1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel m0 = mo137168m0();
        m0.writeString(str);
        m0.writeLong(j);
        mo137166O0(23, m0);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel m0 = mo137168m0();
        m0.writeString(str);
        m0.writeString(str2);
        C42117p0.m170704d(m0, bundle);
        mo137166O0(9, m0);
    }

    public final void clearMeasurementEnabled(long j) throws RemoteException {
        Parcel m0 = mo137168m0();
        m0.writeLong(j);
        mo137166O0(43, m0);
    }

    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel m0 = mo137168m0();
        m0.writeString(str);
        m0.writeLong(j);
        mo137166O0(24, m0);
    }

    public final void generateEventId(C41977h1 h1Var) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170705e(m0, h1Var);
        mo137166O0(22, m0);
    }

    public final void getAppInstanceId(C41977h1 h1Var) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170705e(m0, h1Var);
        mo137166O0(20, m0);
    }

    public final void getCachedAppInstanceId(C41977h1 h1Var) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170705e(m0, h1Var);
        mo137166O0(19, m0);
    }

    public final void getConditionalUserProperties(String str, String str2, C41977h1 h1Var) throws RemoteException {
        Parcel m0 = mo137168m0();
        m0.writeString(str);
        m0.writeString(str2);
        C42117p0.m170705e(m0, h1Var);
        mo137166O0(10, m0);
    }

    public final void getCurrentScreenClass(C41977h1 h1Var) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170705e(m0, h1Var);
        mo137166O0(17, m0);
    }

    public final void getCurrentScreenName(C41977h1 h1Var) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170705e(m0, h1Var);
        mo137166O0(16, m0);
    }

    public final void getGmpAppId(C41977h1 h1Var) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170705e(m0, h1Var);
        mo137166O0(21, m0);
    }

    public final void getMaxUserProperties(String str, C41977h1 h1Var) throws RemoteException {
        Parcel m0 = mo137168m0();
        m0.writeString(str);
        C42117p0.m170705e(m0, h1Var);
        mo137166O0(6, m0);
    }

    public final void getSessionId(C41977h1 h1Var) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170705e(m0, h1Var);
        mo137166O0(46, m0);
    }

    public final void getTestFlag(C41977h1 h1Var, int i) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170705e(m0, h1Var);
        m0.writeInt(i);
        mo137166O0(38, m0);
    }

    public final void getUserProperties(String str, String str2, boolean z, C41977h1 h1Var) throws RemoteException {
        Parcel m0 = mo137168m0();
        m0.writeString(str);
        m0.writeString(str2);
        int i = C42117p0.f106330b;
        m0.writeInt(z ? 1 : 0);
        C42117p0.m170705e(m0, h1Var);
        mo137166O0(5, m0);
    }

    public final void initForTests(Map map) throws RemoteException {
        throw null;
    }

    public final void initialize(C41016d dVar, zzcl zzcl, long j) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170705e(m0, dVar);
        C42117p0.m170704d(m0, zzcl);
        m0.writeLong(j);
        mo137166O0(1, m0);
    }

    public final void isDataCollectionEnabled(C41977h1 h1Var) throws RemoteException {
        throw null;
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel m0 = mo137168m0();
        m0.writeString(str);
        m0.writeString(str2);
        C42117p0.m170704d(m0, bundle);
        m0.writeInt(z ? 1 : 0);
        m0.writeInt(z2 ? 1 : 0);
        m0.writeLong(j);
        mo137166O0(2, m0);
    }

    public final void logEventAndBundle(String str, String str2, Bundle bundle, C41977h1 h1Var, long j) throws RemoteException {
        throw null;
    }

    public final void logHealthData(int i, String str, C41016d dVar, C41016d dVar2, C41016d dVar3) throws RemoteException {
        Parcel m0 = mo137168m0();
        m0.writeInt(5);
        m0.writeString(str);
        C42117p0.m170705e(m0, dVar);
        C42117p0.m170705e(m0, dVar2);
        C42117p0.m170705e(m0, dVar3);
        mo137166O0(33, m0);
    }

    public final void onActivityCreated(C41016d dVar, Bundle bundle, long j) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170705e(m0, dVar);
        C42117p0.m170704d(m0, bundle);
        m0.writeLong(j);
        mo137166O0(27, m0);
    }

    public final void onActivityDestroyed(C41016d dVar, long j) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170705e(m0, dVar);
        m0.writeLong(j);
        mo137166O0(28, m0);
    }

    public final void onActivityPaused(C41016d dVar, long j) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170705e(m0, dVar);
        m0.writeLong(j);
        mo137166O0(29, m0);
    }

    public final void onActivityResumed(C41016d dVar, long j) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170705e(m0, dVar);
        m0.writeLong(j);
        mo137166O0(30, m0);
    }

    public final void onActivitySaveInstanceState(C41016d dVar, C41977h1 h1Var, long j) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170705e(m0, dVar);
        C42117p0.m170705e(m0, h1Var);
        m0.writeLong(j);
        mo137166O0(31, m0);
    }

    public final void onActivityStarted(C41016d dVar, long j) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170705e(m0, dVar);
        m0.writeLong(j);
        mo137166O0(25, m0);
    }

    public final void onActivityStopped(C41016d dVar, long j) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170705e(m0, dVar);
        m0.writeLong(j);
        mo137166O0(26, m0);
    }

    public final void performAction(Bundle bundle, C41977h1 h1Var, long j) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170704d(m0, bundle);
        C42117p0.m170705e(m0, h1Var);
        m0.writeLong(j);
        mo137166O0(32, m0);
    }

    public final void registerOnMeasurementEventListener(C42031k1 k1Var) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170705e(m0, k1Var);
        mo137166O0(35, m0);
    }

    public final void resetAnalyticsData(long j) throws RemoteException {
        Parcel m0 = mo137168m0();
        m0.writeLong(j);
        mo137166O0(12, m0);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170704d(m0, bundle);
        m0.writeLong(j);
        mo137166O0(8, m0);
    }

    public final void setConsent(Bundle bundle, long j) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170704d(m0, bundle);
        m0.writeLong(j);
        mo137166O0(44, m0);
    }

    public final void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170704d(m0, bundle);
        m0.writeLong(j);
        mo137166O0(45, m0);
    }

    public final void setCurrentScreen(C41016d dVar, String str, String str2, long j) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170705e(m0, dVar);
        m0.writeString(str);
        m0.writeString(str2);
        m0.writeLong(j);
        mo137166O0(15, m0);
    }

    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel m0 = mo137168m0();
        int i = C42117p0.f106330b;
        m0.writeInt(z ? 1 : 0);
        mo137166O0(39, m0);
    }

    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170704d(m0, bundle);
        mo137166O0(42, m0);
    }

    public final void setEventInterceptor(C42031k1 k1Var) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170705e(m0, k1Var);
        mo137166O0(34, m0);
    }

    public final void setInstanceIdProvider(C42067m1 m1Var) throws RemoteException {
        throw null;
    }

    public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        Parcel m0 = mo137168m0();
        int i = C42117p0.f106330b;
        m0.writeInt(z ? 1 : 0);
        m0.writeLong(j);
        mo137166O0(11, m0);
    }

    public final void setMinimumSessionDuration(long j) throws RemoteException {
        throw null;
    }

    public final void setSessionTimeoutDuration(long j) throws RemoteException {
        Parcel m0 = mo137168m0();
        m0.writeLong(j);
        mo137166O0(14, m0);
    }

    public final void setUserId(String str, long j) throws RemoteException {
        Parcel m0 = mo137168m0();
        m0.writeString(str);
        m0.writeLong(j);
        mo137166O0(7, m0);
    }

    public final void setUserProperty(String str, String str2, C41016d dVar, boolean z, long j) throws RemoteException {
        Parcel m0 = mo137168m0();
        m0.writeString(str);
        m0.writeString(str2);
        C42117p0.m170705e(m0, dVar);
        m0.writeInt(z ? 1 : 0);
        m0.writeLong(j);
        mo137166O0(4, m0);
    }

    public final void unregisterOnMeasurementEventListener(C42031k1 k1Var) throws RemoteException {
        Parcel m0 = mo137168m0();
        C42117p0.m170705e(m0, k1Var);
        mo137166O0(36, m0);
    }
}
