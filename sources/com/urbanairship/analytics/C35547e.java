package com.urbanairship.analytics;

import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.UAirship;
import com.urbanairship.json.C9323b;

/* renamed from: com.urbanairship.analytics.e */
public class C35547e extends C35554i {

    /* renamed from: K0 */
    public static final String f87713K0 = "app_foreground";

    /* renamed from: L0 */
    public static final String f87714L0 = "notification_types";

    public C35547e(long j) {
        super(j);
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public final C9323b mo18411e() {
        String str;
        PackageInfo y = UAirship.m146201y();
        C9323b.C9325b g = C9323b.m35017y().mo18823g(C35554i.f87771v, mo106518d()).mo18823g(C35554i.f87772w, mo106517c()).mo18823g("carrier", mo106516b()).mo18821e(C35554i.f87763X, mo106522i()).mo18824h(C35554i.f87764Y, mo106523k()).mo18823g(C35554i.f87765Z, Build.VERSION.RELEASE).mo18823g(C35554i.f87757E0, UAirship.m146181I());
        if (y != null) {
            str = y.versionName;
        } else {
            str = null;
        }
        return g.mo18826j(C35554i.f87758F0, str).mo18823g(C35554i.f87774y, UAirship.m146188Y().mo106221g().mo106432S()).mo18823g("metadata", UAirship.m146188Y().mo106221g().mo106431R()).mo18823g(C35554i.f87759G0, UAirship.m146188Y().mo106203E().mo19415Z()).mo18817a();
    }

    @C0359n0
    /* renamed from: j */
    public final String mo18412j() {
        return f87713K0;
    }
}
