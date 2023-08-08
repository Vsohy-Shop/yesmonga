package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.collection.C1866a;
import com.carrefour.fid.android.shared.constant.C28515a1;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.internal.measurement.C41905d1;
import com.google.android.gms.internal.measurement.C41977h1;
import com.google.android.gms.internal.measurement.C42031k1;
import com.google.android.gms.internal.measurement.C42067m1;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.firebase.C33262n;
import com.google.firebase.crashlytics.C32648f;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@DynamiteApi
public class AppMeasurementDynamiteService extends C41905d1 {
    @C40974d0

    /* renamed from: n */
    public C30731g5 f73210n = null;
    @C0323b0("listenerMap")

    /* renamed from: o */
    public final Map f73211o = new C1866a();

    /* renamed from: H0 */
    public final void mo86817H0(C41977h1 h1Var, String str) {
        zzb();
        this.f73210n.mo87110N().mo87511K(h1Var, str);
    }

    public void beginAdUnitExposure(@C0359n0 String str, long j) throws RemoteException {
        zzb();
        this.f73210n.mo87129y().mo87616l(str, j);
    }

    public void clearConditionalUserProperty(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Bundle bundle) throws RemoteException {
        zzb();
        this.f73210n.mo87105I().mo87328o(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j) throws RemoteException {
        zzb();
        this.f73210n.mo87105I().mo87307I((Boolean) null);
    }

    public void endAdUnitExposure(@C0359n0 String str, long j) throws RemoteException {
        zzb();
        this.f73210n.mo87129y().mo87617m(str, j);
    }

    public void generateEventId(C41977h1 h1Var) throws RemoteException {
        zzb();
        long t0 = this.f73210n.mo87110N().mo87541t0();
        zzb();
        this.f73210n.mo87110N().mo87510J(h1Var, t0);
    }

    public void getAppInstanceId(C41977h1 h1Var) throws RemoteException {
        zzb();
        this.f73210n.mo86904f().mo86950z(new C30707e7(this, h1Var));
    }

    public void getCachedAppInstanceId(C41977h1 h1Var) throws RemoteException {
        zzb();
        mo86817H0(h1Var, this.f73210n.mo87105I().mo87320V());
    }

    public void getConditionalUserProperties(String str, String str2, C41977h1 h1Var) throws RemoteException {
        zzb();
        this.f73210n.mo86904f().mo86950z(new C30918va(this, h1Var, str, str2));
    }

    public void getCurrentScreenClass(C41977h1 h1Var) throws RemoteException {
        zzb();
        mo86817H0(h1Var, this.f73210n.mo87105I().mo87321W());
    }

    public void getCurrentScreenName(C41977h1 h1Var) throws RemoteException {
        zzb();
        mo86817H0(h1Var, this.f73210n.mo87105I().mo87322X());
    }

    public void getGmpAppId(C41977h1 h1Var) throws RemoteException {
        String str;
        zzb();
        C30819n7 I = this.f73210n.mo87105I();
        if (I.f74136a.mo87111O() != null) {
            str = I.f74136a.mo87111O();
        } else {
            try {
                str = C30891t7.m124173c(I.f74136a.mo86902c(), C33262n.f80886i, I.f74136a.mo87114R());
            } catch (IllegalStateException e) {
                I.f74136a.mo86903d().mo87489r().mo87464b("getGoogleAppId failed with exception", e);
                str = null;
            }
        }
        mo86817H0(h1Var, str);
    }

    public void getMaxUserProperties(String str, C41977h1 h1Var) throws RemoteException {
        zzb();
        this.f73210n.mo87105I().mo87315Q(str);
        zzb();
        this.f73210n.mo87110N().mo87509I(h1Var, 25);
    }

    public void getSessionId(C41977h1 h1Var) throws RemoteException {
        zzb();
        C30819n7 I = this.f73210n.mo87105I();
        I.f74136a.mo86904f().mo86950z(new C30655a7(I, h1Var));
    }

    public void getTestFlag(C41977h1 h1Var, int i) throws RemoteException {
        zzb();
        if (i == 0) {
            this.f73210n.mo87110N().mo87511K(h1Var, this.f73210n.mo87105I().mo87323Y());
        } else if (i == 1) {
            this.f73210n.mo87110N().mo87510J(h1Var, this.f73210n.mo87105I().mo87319U().longValue());
        } else if (i == 2) {
            C30906ua N = this.f73210n.mo87110N();
            double doubleValue = this.f73210n.mo87105I().mo87317S().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble(C28515a1.f68703k, doubleValue);
            try {
                h1Var.mo136499s6(bundle);
            } catch (RemoteException e) {
                N.f74136a.mo86903d().mo87494w().mo87464b("Error returning double value to wrapper", e);
            }
        } else if (i == 3) {
            this.f73210n.mo87110N().mo87509I(h1Var, this.f73210n.mo87105I().mo87318T().intValue());
        } else if (i == 4) {
            this.f73210n.mo87110N().mo87505E(h1Var, this.f73210n.mo87105I().mo87316R().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, C41977h1 h1Var) throws RemoteException {
        zzb();
        this.f73210n.mo86904f().mo86950z(new C30735g9(this, h1Var, str, str2, z));
    }

    public void initForTests(@C0359n0 Map map) throws RemoteException {
        zzb();
    }

    public void initialize(C41016d dVar, zzcl zzcl, long j) throws RemoteException {
        C30731g5 g5Var = this.f73210n;
        if (g5Var == null) {
            this.f73210n = C30731g5.m123740H((Context) C40843u.m166202l((Context) C41019f.m166810O0(dVar)), zzcl, Long.valueOf(j));
        } else {
            g5Var.mo86903d().mo87494w().mo87463a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(C41977h1 h1Var) throws RemoteException {
        zzb();
        this.f73210n.mo86904f().mo86950z(new C30930wa(this, h1Var));
    }

    public void logEvent(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        zzb();
        this.f73210n.mo87105I().mo87332s(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, C41977h1 h1Var, long j) throws RemoteException {
        Bundle bundle2;
        zzb();
        C40843u.m166198h(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString(C32648f.f79204c, FirebaseMessaging.f80405r);
        this.f73210n.mo86904f().mo86950z(new C30721f8(this, h1Var, new zzaw(str2, new zzau(bundle), FirebaseMessaging.f80405r, j), str));
    }

    public void logHealthData(int i, @C0359n0 String str, @C0359n0 C41016d dVar, @C0359n0 C41016d dVar2, @C0359n0 C41016d dVar3) throws RemoteException {
        Object obj;
        Object obj2;
        zzb();
        Object obj3 = null;
        if (dVar == null) {
            obj = null;
        } else {
            obj = C41019f.m166810O0(dVar);
        }
        if (dVar2 == null) {
            obj2 = null;
        } else {
            obj2 = C41019f.m166810O0(dVar2);
        }
        if (dVar3 != null) {
            obj3 = C41019f.m166810O0(dVar3);
        }
        this.f73210n.mo86903d().mo87487G(i, true, false, str, obj, obj2, obj3);
    }

    public void onActivityCreated(@C0359n0 C41016d dVar, @C0359n0 Bundle bundle, long j) throws RemoteException {
        zzb();
        C30807m7 m7Var = this.f73210n.mo87105I().f73772c;
        if (m7Var != null) {
            this.f73210n.mo87105I().mo87329p();
            m7Var.onActivityCreated((Activity) C41019f.m166810O0(dVar), bundle);
        }
    }

    public void onActivityDestroyed(@C0359n0 C41016d dVar, long j) throws RemoteException {
        zzb();
        C30807m7 m7Var = this.f73210n.mo87105I().f73772c;
        if (m7Var != null) {
            this.f73210n.mo87105I().mo87329p();
            m7Var.onActivityDestroyed((Activity) C41019f.m166810O0(dVar));
        }
    }

    public void onActivityPaused(@C0359n0 C41016d dVar, long j) throws RemoteException {
        zzb();
        C30807m7 m7Var = this.f73210n.mo87105I().f73772c;
        if (m7Var != null) {
            this.f73210n.mo87105I().mo87329p();
            m7Var.onActivityPaused((Activity) C41019f.m166810O0(dVar));
        }
    }

    public void onActivityResumed(@C0359n0 C41016d dVar, long j) throws RemoteException {
        zzb();
        C30807m7 m7Var = this.f73210n.mo87105I().f73772c;
        if (m7Var != null) {
            this.f73210n.mo87105I().mo87329p();
            m7Var.onActivityResumed((Activity) C41019f.m166810O0(dVar));
        }
    }

    public void onActivitySaveInstanceState(C41016d dVar, C41977h1 h1Var, long j) throws RemoteException {
        zzb();
        C30807m7 m7Var = this.f73210n.mo87105I().f73772c;
        Bundle bundle = new Bundle();
        if (m7Var != null) {
            this.f73210n.mo87105I().mo87329p();
            m7Var.onActivitySaveInstanceState((Activity) C41019f.m166810O0(dVar), bundle);
        }
        try {
            h1Var.mo136499s6(bundle);
        } catch (RemoteException e) {
            this.f73210n.mo86903d().mo87494w().mo87464b("Error returning bundle value to wrapper", e);
        }
    }

    public void onActivityStarted(@C0359n0 C41016d dVar, long j) throws RemoteException {
        zzb();
        if (this.f73210n.mo87105I().f73772c != null) {
            this.f73210n.mo87105I().mo87329p();
            Activity activity = (Activity) C41019f.m166810O0(dVar);
        }
    }

    public void onActivityStopped(@C0359n0 C41016d dVar, long j) throws RemoteException {
        zzb();
        if (this.f73210n.mo87105I().f73772c != null) {
            this.f73210n.mo87105I().mo87329p();
            Activity activity = (Activity) C41019f.m166810O0(dVar);
        }
    }

    public void performAction(Bundle bundle, C41977h1 h1Var, long j) throws RemoteException {
        zzb();
        h1Var.mo136499s6((Bundle) null);
    }

    public void registerOnMeasurementEventListener(C42031k1 k1Var) throws RemoteException {
        C30758i6 i6Var;
        zzb();
        synchronized (this.f73211o) {
            i6Var = (C30758i6) this.f73211o.get(Integer.valueOf(k1Var.mo137014e()));
            if (i6Var == null) {
                i6Var = new C30954ya(this, k1Var);
                this.f73211o.put(Integer.valueOf(k1Var.mo137014e()), i6Var);
            }
        }
        this.f73210n.mo87105I().mo87337x(i6Var);
    }

    public void resetAnalyticsData(long j) throws RemoteException {
        zzb();
        this.f73210n.mo87105I().mo87338y(j);
    }

    public void setConditionalUserProperty(@C0359n0 Bundle bundle, long j) throws RemoteException {
        zzb();
        if (bundle == null) {
            this.f73210n.mo86903d().mo87489r().mo87463a("Conditional user property must not be null");
        } else {
            this.f73210n.mo87105I().mo87303E(bundle, j);
        }
    }

    public void setConsent(@C0359n0 Bundle bundle, long j) throws RemoteException {
        zzb();
        C30819n7 I = this.f73210n.mo87105I();
        I.f74136a.mo86904f().mo86942A(new C30794l6(I, bundle, j));
    }

    public void setConsentThirdParty(@C0359n0 Bundle bundle, long j) throws RemoteException {
        zzb();
        this.f73210n.mo87105I().mo87304F(bundle, -20, j);
    }

    public void setCurrentScreen(@C0359n0 C41016d dVar, @C0359n0 String str, @C0359n0 String str2, long j) throws RemoteException {
        zzb();
        this.f73210n.mo87107K().mo86915D((Activity) C41019f.m166810O0(dVar), str, str2);
    }

    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zzb();
        C30819n7 I = this.f73210n.mo87105I();
        I.mo86890i();
        I.f74136a.mo86904f().mo86950z(new C30783k7(I, z));
    }

    public void setDefaultEventParameters(@C0359n0 Bundle bundle) {
        Bundle bundle2;
        zzb();
        C30819n7 I = this.f73210n.mo87105I();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        I.f74136a.mo86904f().mo86950z(new C30806m6(I, bundle2));
    }

    public void setEventInterceptor(C42031k1 k1Var) throws RemoteException {
        zzb();
        C30942xa xaVar = new C30942xa(this, k1Var);
        if (this.f73210n.mo86904f().mo86943C()) {
            this.f73210n.mo87105I().mo87306H(xaVar);
        } else {
            this.f73210n.mo86904f().mo86950z(new C30749ha(this, xaVar));
        }
    }

    public void setInstanceIdProvider(C42067m1 m1Var) throws RemoteException {
        zzb();
    }

    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        zzb();
        this.f73210n.mo87105I().mo87307I(Boolean.valueOf(z));
    }

    public void setMinimumSessionDuration(long j) throws RemoteException {
        zzb();
    }

    public void setSessionTimeoutDuration(long j) throws RemoteException {
        zzb();
        C30819n7 I = this.f73210n.mo87105I();
        I.f74136a.mo86904f().mo86950z(new C30854q6(I, j));
    }

    public void setUserId(@C0359n0 String str, long j) throws RemoteException {
        zzb();
        C30819n7 I = this.f73210n.mo87105I();
        if (str == null || !TextUtils.isEmpty(str)) {
            I.f74136a.mo86904f().mo86950z(new C30818n6(I, str));
            I.mo87310L((String) null, "_id", str, true, j);
            return;
        }
        I.f74136a.mo86903d().mo87494w().mo87463a("User ID must be non-empty or null");
    }

    public void setUserProperty(@C0359n0 String str, @C0359n0 String str2, @C0359n0 C41016d dVar, boolean z, long j) throws RemoteException {
        zzb();
        this.f73210n.mo87105I().mo87310L(str, str2, C41019f.m166810O0(dVar), z, j);
    }

    public void unregisterOnMeasurementEventListener(C42031k1 k1Var) throws RemoteException {
        C30758i6 i6Var;
        zzb();
        synchronized (this.f73211o) {
            i6Var = (C30758i6) this.f73211o.remove(Integer.valueOf(k1Var.mo137014e()));
        }
        if (i6Var == null) {
            i6Var = new C30954ya(this, k1Var);
        }
        this.f73210n.mo87105I().mo87312N(i6Var);
    }

    @EnsuresNonNull({"scion"})
    public final void zzb() {
        if (this.f73210n == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }
}
