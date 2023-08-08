package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.e1 */
public interface C41923e1 extends IInterface {
    void beginAdUnitExposure(String str, long j) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j) throws RemoteException;

    void endAdUnitExposure(String str, long j) throws RemoteException;

    void generateEventId(C41977h1 h1Var) throws RemoteException;

    void getAppInstanceId(C41977h1 h1Var) throws RemoteException;

    void getCachedAppInstanceId(C41977h1 h1Var) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, C41977h1 h1Var) throws RemoteException;

    void getCurrentScreenClass(C41977h1 h1Var) throws RemoteException;

    void getCurrentScreenName(C41977h1 h1Var) throws RemoteException;

    void getGmpAppId(C41977h1 h1Var) throws RemoteException;

    void getMaxUserProperties(String str, C41977h1 h1Var) throws RemoteException;

    void getSessionId(C41977h1 h1Var) throws RemoteException;

    void getTestFlag(C41977h1 h1Var, int i) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z, C41977h1 h1Var) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(C41016d dVar, zzcl zzcl, long j) throws RemoteException;

    void isDataCollectionEnabled(C41977h1 h1Var) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, C41977h1 h1Var, long j) throws RemoteException;

    void logHealthData(int i, String str, C41016d dVar, C41016d dVar2, C41016d dVar3) throws RemoteException;

    void onActivityCreated(C41016d dVar, Bundle bundle, long j) throws RemoteException;

    void onActivityDestroyed(C41016d dVar, long j) throws RemoteException;

    void onActivityPaused(C41016d dVar, long j) throws RemoteException;

    void onActivityResumed(C41016d dVar, long j) throws RemoteException;

    void onActivitySaveInstanceState(C41016d dVar, C41977h1 h1Var, long j) throws RemoteException;

    void onActivityStarted(C41016d dVar, long j) throws RemoteException;

    void onActivityStopped(C41016d dVar, long j) throws RemoteException;

    void performAction(Bundle bundle, C41977h1 h1Var, long j) throws RemoteException;

    void registerOnMeasurementEventListener(C42031k1 k1Var) throws RemoteException;

    void resetAnalyticsData(long j) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException;

    void setConsent(Bundle bundle, long j) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j) throws RemoteException;

    void setCurrentScreen(C41016d dVar, String str, String str2, long j) throws RemoteException;

    void setDataCollectionEnabled(boolean z) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(C42031k1 k1Var) throws RemoteException;

    void setInstanceIdProvider(C42067m1 m1Var) throws RemoteException;

    void setMeasurementEnabled(boolean z, long j) throws RemoteException;

    void setMinimumSessionDuration(long j) throws RemoteException;

    void setSessionTimeoutDuration(long j) throws RemoteException;

    void setUserId(String str, long j) throws RemoteException;

    void setUserProperty(String str, String str2, C41016d dVar, boolean z, long j) throws RemoteException;

    void unregisterOnMeasurementEventListener(C42031k1 k1Var) throws RemoteException;
}
