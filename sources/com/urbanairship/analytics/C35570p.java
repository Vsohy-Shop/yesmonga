package com.urbanairship.analytics;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.json.C9323b;

/* renamed from: com.urbanairship.analytics.p */
public class C35570p extends C35554i {
    @C0359n0

    /* renamed from: O0 */
    public static final String f87925O0 = "screen_tracking";

    /* renamed from: P0 */
    public static final int f87926P0 = 255;
    @C0359n0

    /* renamed from: Q0 */
    public static final String f87927Q0 = "screen";
    @C0359n0

    /* renamed from: R0 */
    public static final String f87928R0 = "previous_screen";
    @C0359n0

    /* renamed from: S0 */
    public static final String f87929S0 = "entered_time";
    @C0359n0

    /* renamed from: T0 */
    public static final String f87930T0 = "exited_time";
    @C0359n0

    /* renamed from: U0 */
    public static final String f87931U0 = "duration";

    /* renamed from: K0 */
    public final String f87932K0;

    /* renamed from: L0 */
    public final long f87933L0;

    /* renamed from: M0 */
    public final long f87934M0;

    /* renamed from: N0 */
    public final String f87935N0;

    public C35570p(@C0359n0 String str, @C0363p0 String str2, long j, long j2) {
        this.f87932K0 = str;
        this.f87933L0 = j;
        this.f87934M0 = j2;
        this.f87935N0 = str2;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public final C9323b mo18411e() {
        return C9323b.m35017y().mo18823g("screen", this.f87932K0).mo18823g(f87929S0, C35554i.m146722m(this.f87933L0)).mo18823g(f87930T0, C35554i.m146722m(this.f87934M0)).mo18823g("duration", C35554i.m146722m(this.f87934M0 - this.f87933L0)).mo18823g(f87928R0, this.f87935N0).mo18817a();
    }

    @C0359n0
    /* renamed from: j */
    public String mo18412j() {
        return f87925O0;
    }

    /* renamed from: l */
    public boolean mo106481l() {
        if (this.f87932K0.length() > 255 || this.f87932K0.length() <= 0) {
            C36059m.m148409e("Screen identifier string must be between 1 and 255 characters long.", new Object[0]);
            return false;
        } else if (this.f87933L0 <= this.f87934M0) {
            return true;
        } else {
            C36059m.m148409e("Screen tracking duration must be positive or zero.", new Object[0]);
            return false;
        }
    }
}
