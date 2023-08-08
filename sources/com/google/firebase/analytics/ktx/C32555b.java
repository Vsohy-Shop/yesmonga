package com.google.firebase.analytics.ktx;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.google.firebase.analytics.ktx.b */
public final class C32555b {
    @C12580l

    /* renamed from: a */
    public FirebaseAnalytics.ConsentStatus f79025a;
    @C12580l

    /* renamed from: b */
    public FirebaseAnalytics.ConsentStatus f79026b;

    @C12579k
    /* renamed from: a */
    public final Map<FirebaseAnalytics.ConsentType, FirebaseAnalytics.ConsentStatus> mo94663a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FirebaseAnalytics.ConsentStatus consentStatus = this.f79025a;
        if (consentStatus != null) {
            linkedHashMap.put(FirebaseAnalytics.ConsentType.AD_STORAGE, consentStatus);
        }
        FirebaseAnalytics.ConsentStatus consentStatus2 = this.f79026b;
        if (consentStatus2 != null) {
            linkedHashMap.put(FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE, consentStatus2);
        }
        return linkedHashMap;
    }

    @C12580l
    /* renamed from: b */
    public final FirebaseAnalytics.ConsentStatus mo94664b() {
        return this.f79025a;
    }

    @C12580l
    /* renamed from: c */
    public final FirebaseAnalytics.ConsentStatus mo94665c() {
        return this.f79026b;
    }

    /* renamed from: d */
    public final void mo94666d(@C12580l FirebaseAnalytics.ConsentStatus consentStatus) {
        this.f79025a = consentStatus;
    }

    /* renamed from: e */
    public final void mo94667e(@C12580l FirebaseAnalytics.ConsentStatus consentStatus) {
        this.f79026b = consentStatus;
    }
}
