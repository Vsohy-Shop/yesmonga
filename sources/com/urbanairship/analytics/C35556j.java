package com.urbanairship.analytics;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.json.C9323b;

/* renamed from: com.urbanairship.analytics.j */
public class C35556j extends C35554i {

    /* renamed from: L0 */
    public static final String f87778L0 = "install_attribution";

    /* renamed from: M0 */
    public static final String f87779M0 = "google_play_referrer";

    /* renamed from: K0 */
    public final String f87780K0;

    public C35556j(@C0359n0 String str) {
        this.f87780K0 = str;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public C9323b mo18411e() {
        return C9323b.m35017y().mo18823g(f87779M0, this.f87780K0).mo18817a();
    }

    @C0359n0
    /* renamed from: j */
    public String mo18412j() {
        return f87778L0;
    }
}
