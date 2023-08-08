package com.urbanairship.analytics;

import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.json.C9323b;
import com.urbanairship.push.C9460d;
import com.urbanairship.push.C9461e;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.analytics.l */
public class C35558l extends C35554i {

    /* renamed from: Q0 */
    public static final String f87783Q0 = "send_id";

    /* renamed from: R0 */
    public static final String f87784R0 = "button_group";

    /* renamed from: S0 */
    public static final String f87785S0 = "button_id";

    /* renamed from: T0 */
    public static final String f87786T0 = "button_description";

    /* renamed from: U0 */
    public static final String f87787U0 = "foreground";

    /* renamed from: V0 */
    public static final String f87788V0 = "interactive_notification_action";

    /* renamed from: W0 */
    public static final String f87789W0 = "user_input";

    /* renamed from: K0 */
    public final String f87790K0;

    /* renamed from: L0 */
    public final String f87791L0;

    /* renamed from: M0 */
    public final String f87792M0;

    /* renamed from: N0 */
    public final String f87793N0;

    /* renamed from: O0 */
    public final boolean f87794O0;

    /* renamed from: P0 */
    public final Bundle f87795P0;

    public C35558l(@C0359n0 C9461e eVar, @C0359n0 C9460d dVar) {
        this.f87790K0 = eVar.mo19239b().mo19191x();
        this.f87791L0 = eVar.mo19239b().mo19180n();
        this.f87792M0 = dVar.mo19234b();
        this.f87793N0 = dVar.mo19235c();
        this.f87794O0 = dVar.mo19237e();
        this.f87795P0 = dVar.mo19236d();
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public final C9323b mo18411e() {
        C9323b.C9325b h = C9323b.m35017y().mo18823g(f87783Q0, this.f87790K0).mo18823g("button_group", this.f87791L0).mo18823g("button_id", this.f87792M0).mo18823g("button_description", this.f87793N0).mo18824h("foreground", this.f87794O0);
        Bundle bundle = this.f87795P0;
        if (bundle != null && !bundle.isEmpty()) {
            C9323b.C9325b y = C9323b.m35017y();
            for (String next : this.f87795P0.keySet()) {
                y.mo18823g(next, this.f87795P0.getString(next));
            }
            h.mo18822f(f87789W0, y.mo18817a());
        }
        return h.mo18817a();
    }

    @C0359n0
    /* renamed from: j */
    public final String mo18412j() {
        return f87788V0;
    }
}
