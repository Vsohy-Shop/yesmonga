package com.urbanairship.analytics.location;

import android.location.Location;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.carrefour.fid.android.airship.util.C13758b;
import com.urbanairship.analytics.C35554i;
import com.urbanairship.json.C9323b;
import com.urbanairship.util.C9669o0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;

/* renamed from: com.urbanairship.analytics.location.b */
public class C35560b extends C35554i {

    /* renamed from: S0 */
    public static final int f87800S0 = 0;

    /* renamed from: T0 */
    public static final int f87801T0 = 1;
    @C0359n0

    /* renamed from: U0 */
    public static final String f87802U0 = "location";
    @C0359n0

    /* renamed from: V0 */
    public static final String f87803V0 = "lat";
    @C0359n0

    /* renamed from: W0 */
    public static final String f87804W0 = "long";
    @C0359n0

    /* renamed from: X0 */
    public static final String f87805X0 = "requested_accuracy";
    @C0359n0

    /* renamed from: Y0 */
    public static final String f87806Y0 = "update_type";
    @C0359n0

    /* renamed from: Z0 */
    public static final String f87807Z0 = "provider";
    @C0359n0

    /* renamed from: a1 */
    public static final String f87808a1 = "h_accuracy";
    @C0359n0

    /* renamed from: b1 */
    public static final String f87809b1 = "v_accuracy";
    @C0359n0

    /* renamed from: c1 */
    public static final String f87810c1 = "foreground";
    @C0359n0

    /* renamed from: d1 */
    public static final String f87811d1 = "update_dist";

    /* renamed from: K0 */
    public final String f87812K0;

    /* renamed from: L0 */
    public final String f87813L0;

    /* renamed from: M0 */
    public final String f87814M0;

    /* renamed from: N0 */
    public final String f87815N0;

    /* renamed from: O0 */
    public final String f87816O0;

    /* renamed from: P0 */
    public final String f87817P0;

    /* renamed from: Q0 */
    public final String f87818Q0;

    /* renamed from: R0 */
    public final int f87819R0;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.analytics.location.b$a */
    public @interface C35561a {
    }

    public C35560b(@C0359n0 Location location, int i, int i2, int i3, boolean z) {
        String str;
        String str2;
        String str3;
        Locale locale = Locale.US;
        this.f87813L0 = String.format(locale, "%.6f", new Object[]{Double.valueOf(location.getLatitude())});
        this.f87814M0 = String.format(locale, "%.6f", new Object[]{Double.valueOf(location.getLongitude())});
        if (C9669o0.m36224e(location.getProvider())) {
            str = "UNKNOWN";
        } else {
            str = location.getProvider();
        }
        this.f87812K0 = str;
        this.f87815N0 = String.valueOf(location.getAccuracy());
        String str4 = "NONE";
        if (i2 >= 0) {
            str2 = String.valueOf(i2);
        } else {
            str2 = str4;
        }
        this.f87816O0 = str2;
        this.f87817P0 = i3 >= 0 ? String.valueOf(i3) : str4;
        if (z) {
            str3 = C13758b.f33436b;
        } else {
            str3 = C13758b.f33438c;
        }
        this.f87818Q0 = str3;
        this.f87819R0 = i;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public final C9323b mo18411e() {
        String str;
        C9323b.C9325b g = C9323b.m35017y().mo18823g(f87803V0, this.f87813L0).mo18823g(f87804W0, this.f87814M0).mo18823g(f87805X0, this.f87816O0);
        if (this.f87819R0 == 0) {
            str = "CONTINUOUS";
        } else {
            str = "SINGLE";
        }
        return g.mo18823g(f87806Y0, str).mo18823g(f87807Z0, this.f87812K0).mo18823g(f87808a1, this.f87815N0).mo18823g(f87809b1, "NONE").mo18823g("foreground", this.f87818Q0).mo18823g(f87811d1, this.f87817P0).mo18817a();
    }

    /* renamed from: g */
    public int mo106520g() {
        return 0;
    }

    @C0359n0
    /* renamed from: j */
    public String mo18412j() {
        return "location";
    }
}
