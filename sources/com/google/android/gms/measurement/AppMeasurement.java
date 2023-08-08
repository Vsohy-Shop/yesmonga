package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0386z0;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.measurement.api.C30638a;
import com.google.android.gms.measurement.internal.C30680c6;
import com.google.android.gms.measurement.internal.C30731g5;
import com.google.android.gms.measurement.internal.C30745h6;
import com.google.android.gms.measurement.internal.C30758i6;
import com.google.android.gms.measurement.internal.C30831o7;
import com.google.android.gms.measurement.internal.C30891t7;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@C40858y
@C40473a
@Deprecated
public class AppMeasurement {
    @C40473a
    @C40858y
    @C0359n0

    /* renamed from: b */
    public static final String f73183b = "crash";
    @C40473a
    @C40858y
    @C0359n0

    /* renamed from: c */
    public static final String f73184c = "fcm";
    @C40473a
    @C40858y
    @C0359n0

    /* renamed from: d */
    public static final String f73185d = "fiam";

    /* renamed from: e */
    public static volatile AppMeasurement f73186e;

    /* renamed from: a */
    public final C30646e f73187a;

    @C40858y
    @C40473a
    public static class ConditionalUserProperty {
        @C40473a
        @C40858y
        @Keep
        public boolean mActive;
        @C40858y
        @Keep
        @C40473a
        @C0359n0
        public String mAppId;
        @C40473a
        @C40858y
        @Keep
        public long mCreationTimestamp;
        @C0359n0
        @Keep
        public String mExpiredEventName;
        @C0359n0
        @Keep
        public Bundle mExpiredEventParams;
        @C40858y
        @Keep
        @C40473a
        @C0359n0
        public String mName;
        @C40858y
        @Keep
        @C40473a
        @C0359n0
        public String mOrigin;
        @C40473a
        @C40858y
        @Keep
        public long mTimeToLive;
        @C0359n0
        @Keep
        public String mTimedOutEventName;
        @C0359n0
        @Keep
        public Bundle mTimedOutEventParams;
        @C40858y
        @Keep
        @C40473a
        @C0359n0
        public String mTriggerEventName;
        @C40473a
        @C40858y
        @Keep
        public long mTriggerTimeout;
        @C0359n0
        @Keep
        public String mTriggeredEventName;
        @C0359n0
        @Keep
        public Bundle mTriggeredEventParams;
        @C40473a
        @C40858y
        @Keep
        public long mTriggeredTimestamp;
        @C40858y
        @Keep
        @C40473a
        @C0359n0
        public Object mValue;

        @C40473a
        public ConditionalUserProperty() {
        }

        @C40974d0
        public ConditionalUserProperty(@C0359n0 Bundle bundle) {
            C40843u.m166202l(bundle);
            Class<String> cls = String.class;
            this.mAppId = (String) C30680c6.m123533a(bundle, "app_id", cls, (Object) null);
            this.mOrigin = (String) C30680c6.m123533a(bundle, "origin", cls, (Object) null);
            this.mName = (String) C30680c6.m123533a(bundle, "name", cls, (Object) null);
            this.mValue = C30680c6.m123533a(bundle, "value", Object.class, (Object) null);
            this.mTriggerEventName = (String) C30680c6.m123533a(bundle, C30638a.C30639a.f73195d, cls, (Object) null);
            Class<Long> cls2 = Long.class;
            this.mTriggerTimeout = ((Long) C30680c6.m123533a(bundle, C30638a.C30639a.f73196e, cls2, 0L)).longValue();
            this.mTimedOutEventName = (String) C30680c6.m123533a(bundle, C30638a.C30639a.f73197f, cls, (Object) null);
            Class<Bundle> cls3 = Bundle.class;
            this.mTimedOutEventParams = (Bundle) C30680c6.m123533a(bundle, C30638a.C30639a.f73198g, cls3, (Object) null);
            this.mTriggeredEventName = (String) C30680c6.m123533a(bundle, C30638a.C30639a.f73199h, cls, (Object) null);
            this.mTriggeredEventParams = (Bundle) C30680c6.m123533a(bundle, C30638a.C30639a.f73200i, cls3, (Object) null);
            this.mTimeToLive = ((Long) C30680c6.m123533a(bundle, C30638a.C30639a.f73201j, cls2, 0L)).longValue();
            this.mExpiredEventName = (String) C30680c6.m123533a(bundle, C30638a.C30639a.f73202k, cls, (Object) null);
            this.mExpiredEventParams = (Bundle) C30680c6.m123533a(bundle, C30638a.C30639a.f73203l, cls3, (Object) null);
            this.mActive = ((Boolean) C30680c6.m123533a(bundle, C30638a.C30639a.f73205n, Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) C30680c6.m123533a(bundle, C30638a.C30639a.f73204m, cls2, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) C30680c6.m123533a(bundle, C30638a.C30639a.f73206o, cls2, 0L)).longValue();
        }

        @C40473a
        public ConditionalUserProperty(@C0359n0 ConditionalUserProperty conditionalUserProperty) {
            C40843u.m166202l(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            Object obj = conditionalUserProperty.mValue;
            if (obj != null) {
                Object a = C30891t7.m124171a(obj);
                this.mValue = a;
                if (a == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            Bundle bundle = conditionalUserProperty.mTimedOutEventParams;
            if (bundle != null) {
                this.mTimedOutEventParams = new Bundle(bundle);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            Bundle bundle2 = conditionalUserProperty.mTriggeredEventParams;
            if (bundle2 != null) {
                this.mTriggeredEventParams = new Bundle(bundle2);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            Bundle bundle3 = conditionalUserProperty.mExpiredEventParams;
            if (bundle3 != null) {
                this.mExpiredEventParams = new Bundle(bundle3);
            }
        }
    }

    @C40858y
    @C40473a
    /* renamed from: com.google.android.gms.measurement.AppMeasurement$a */
    public interface C30635a extends C30745h6 {
        @C0348i1
        @C40473a
        @C40858y
        /* renamed from: a */
        void mo86738a(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Bundle bundle, long j);
    }

    @C40858y
    @C40473a
    /* renamed from: com.google.android.gms.measurement.AppMeasurement$b */
    public interface C30636b extends C30758i6 {
        @C0348i1
        @C40473a
        @C40858y
        /* renamed from: a */
        void mo86739a(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Bundle bundle, long j);
    }

    public AppMeasurement(C30731g5 g5Var) {
        this.f73187a = new C30643b(g5Var);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @androidx.annotation.C0380x0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @com.google.android.gms.common.internal.C40858y
    @androidx.annotation.Keep
    @com.google.android.gms.common.annotation.C40473a
    @androidx.annotation.C0359n0
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.measurement.AppMeasurement getInstance(@androidx.annotation.C0359n0 android.content.Context r14) {
        /*
            com.google.android.gms.measurement.AppMeasurement r0 = f73186e
            if (r0 != 0) goto L_0x0059
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = f73186e     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x0054
            r1 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r2 = com.google.firebase.analytics.FirebaseAnalytics.class
            java.lang.String r3 = "getScionFrontendApiImplementation"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{  }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r7 = 0
            r5[r7] = r6     // Catch:{  }
            java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
            r8 = 1
            r5[r8] = r6     // Catch:{  }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r5)     // Catch:{  }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{  }
            r3[r7] = r14     // Catch:{  }
            r3[r8] = r1     // Catch:{  }
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch:{  }
            com.google.android.gms.measurement.internal.o7 r2 = (com.google.android.gms.measurement.internal.C30831o7) r2     // Catch:{  }
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            if (r2 == 0) goto L_0x0039
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0056 }
            r14.<init>((com.google.android.gms.measurement.internal.C30831o7) r2)     // Catch:{ all -> 0x0056 }
            f73186e = r14     // Catch:{ all -> 0x0056 }
            goto L_0x0054
        L_0x0039:
            com.google.android.gms.internal.measurement.zzcl r13 = new com.google.android.gms.internal.measurement.zzcl     // Catch:{ all -> 0x0056 }
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0056 }
            com.google.android.gms.measurement.internal.g5 r14 = com.google.android.gms.measurement.internal.C30731g5.m123740H(r14, r13, r1)     // Catch:{ all -> 0x0056 }
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0056 }
            r1.<init>((com.google.android.gms.measurement.internal.C30731g5) r14)     // Catch:{ all -> 0x0056 }
            f73186e = r1     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            goto L_0x0059
        L_0x0056:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            throw r14
        L_0x0059:
            com.google.android.gms.measurement.AppMeasurement r14 = f73186e
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.getInstance(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    @C40473a
    @C0359n0
    /* renamed from: a */
    public Boolean mo86715a() {
        return this.f73187a.mo86807o();
    }

    @C40473a
    @C0359n0
    /* renamed from: b */
    public Double mo86716b() {
        return this.f73187a.mo86809q();
    }

    @Keep
    public void beginAdUnitExposure(@C0359n0 @C0386z0(min = 1) String str) {
        this.f73187a.mo86796d(str);
    }

    @C40473a
    @C0359n0
    /* renamed from: c */
    public Integer mo86718c() {
        return this.f73187a.mo86810r();
    }

    @C40473a
    @C40858y
    @Keep
    public void clearConditionalUserProperty(@C0359n0 @C0386z0(max = 24, min = 1) String str, @C0359n0 String str2, @C0359n0 Bundle bundle) {
        this.f73187a.mo86806n(str, str2, bundle);
    }

    @C40473a
    @C0359n0
    /* renamed from: d */
    public Long mo86720d() {
        return this.f73187a.mo86811s();
    }

    @C40473a
    @C0359n0
    /* renamed from: e */
    public String mo86721e() {
        return this.f73187a.mo86813u();
    }

    @Keep
    public void endAdUnitExposure(@C0359n0 @C0386z0(min = 1) String str) {
        this.f73187a.mo86799g(str);
    }

    @C0348i1
    @C40858y
    @C40473a
    @C0359n0
    /* renamed from: f */
    public Map<String, Object> mo86723f(boolean z) {
        return this.f73187a.mo86815w(z);
    }

    @C40473a
    @C40858y
    /* renamed from: g */
    public void mo86724g(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Bundle bundle, long j) {
        this.f73187a.mo86794b(str, str2, bundle, j);
    }

    @Keep
    public long generateEventId() {
        return this.f73187a.zzb();
    }

    @C0359n0
    @Keep
    public String getAppInstanceId() {
        return this.f73187a.mo86802j();
    }

    @C0348i1
    @C40858y
    @Keep
    @C40473a
    @C0359n0
    public List<ConditionalUserProperty> getConditionalUserProperties(@C0359n0 String str, @C0359n0 @C0386z0(max = 23, min = 1) String str2) {
        int i;
        List<Bundle> h = this.f73187a.mo86800h(str, str2);
        if (h == null) {
            i = 0;
        } else {
            i = h.size();
        }
        ArrayList arrayList = new ArrayList(i);
        for (Bundle conditionalUserProperty : h) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    @C0359n0
    @Keep
    public String getCurrentScreenClass() {
        return this.f73187a.mo86803k();
    }

    @C0359n0
    @Keep
    public String getCurrentScreenName() {
        return this.f73187a.mo86808p();
    }

    @C0359n0
    @Keep
    public String getGmpAppId() {
        return this.f73187a.mo86812t();
    }

    @C0348i1
    @C40858y
    @Keep
    @C40473a
    public int getMaxUserProperties(@C0359n0 @C0386z0(min = 1) String str) {
        return this.f73187a.mo86793a(str);
    }

    @C0348i1
    @Keep
    @C0359n0
    @C40974d0
    public Map<String, Object> getUserProperties(@C0359n0 String str, @C0359n0 @C0386z0(max = 24, min = 1) String str2, boolean z) {
        return this.f73187a.mo86801i(str, str2, z);
    }

    @C40473a
    @C40858y
    /* renamed from: h */
    public void mo86733h(@C0359n0 C30636b bVar) {
        this.f73187a.mo86798f(bVar);
    }

    @C0348i1
    @C40473a
    @C40858y
    /* renamed from: i */
    public void mo86734i(@C0359n0 C30635a aVar) {
        this.f73187a.mo86797e(aVar);
    }

    @C40473a
    @C40858y
    /* renamed from: j */
    public void mo86735j(@C0359n0 C30636b bVar) {
        this.f73187a.mo86805m(bVar);
    }

    @C40858y
    @Keep
    public void logEventInternal(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Bundle bundle) {
        this.f73187a.mo86795c(str, str2, bundle);
    }

    @C40473a
    @C40858y
    @Keep
    public void setConditionalUserProperty(@C0359n0 ConditionalUserProperty conditionalUserProperty) {
        C40843u.m166202l(conditionalUserProperty);
        C30646e eVar = this.f73187a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            C30680c6.m123534b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString(C30638a.C30639a.f73195d, str4);
        }
        bundle.putLong(C30638a.C30639a.f73196e, conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString(C30638a.C30639a.f73197f, str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle(C30638a.C30639a.f73198g, bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString(C30638a.C30639a.f73199h, str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle(C30638a.C30639a.f73200i, bundle3);
        }
        bundle.putLong(C30638a.C30639a.f73201j, conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString(C30638a.C30639a.f73202k, str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle(C30638a.C30639a.f73203l, bundle4);
        }
        bundle.putLong(C30638a.C30639a.f73204m, conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean(C30638a.C30639a.f73205n, conditionalUserProperty.mActive);
        bundle.putLong(C30638a.C30639a.f73206o, conditionalUserProperty.mTriggeredTimestamp);
        eVar.mo86804l(bundle);
    }

    public AppMeasurement(C30831o7 o7Var) {
        this.f73187a = new C30644c(o7Var);
    }
}
