package com.urbanairship.analytics;

import android.app.NotificationChannelGroup;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.app.C17180n4;
import com.urbanairship.UAirship;
import com.urbanairship.json.C9323b;
import com.urbanairship.push.PushMessage;
import com.urbanairship.push.notifications.C9515j;
import com.urbanairship.util.C9669o0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.analytics.n */
public class C35568n extends C35554i {
    @C0359n0

    /* renamed from: M0 */
    public static final String f87886M0 = "push_arrived";

    /* renamed from: N0 */
    public static final String f87887N0 = "MISSING_SEND_ID";

    /* renamed from: O0 */
    public static final String f87888O0 = "notification_channel";

    /* renamed from: P0 */
    public static final String f87889P0 = "identifier";

    /* renamed from: Q0 */
    public static final String f87890Q0 = "importance";

    /* renamed from: R0 */
    public static final String f87891R0 = "group";

    /* renamed from: S0 */
    public static final String f87892S0 = "blocked";

    /* renamed from: K0 */
    public final PushMessage f87893K0;

    /* renamed from: L0 */
    public final C9515j f87894L0;

    public C35568n(@C0359n0 PushMessage pushMessage) {
        this(pushMessage, (C9515j) null);
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public final C9323b mo18411e() {
        String str;
        C9323b.C9325b y = C9323b.m35017y();
        if (!C9669o0.m36224e(this.f87893K0.mo19191x())) {
            str = this.f87893K0.mo19191x();
        } else {
            str = f87887N0;
        }
        C9323b.C9325b g = y.mo18823g(C35554i.f87774y, str).mo18823g("metadata", this.f87893K0.mo19181o()).mo18823g(C35554i.f87771v, mo106518d()).mo18823g(C35554i.f87772w, mo106517c()).mo18823g("carrier", mo106516b());
        if (this.f87894L0 != null) {
            mo106553n(g);
        }
        return g.mo18817a();
    }

    @C0359n0
    /* renamed from: j */
    public final String mo18412j() {
        return f87886M0;
    }

    /* renamed from: n */
    public final void mo106553n(C9323b.C9325b bVar) {
        C9323b bVar2;
        boolean z;
        String o = mo106554o(this.f87894L0.mo19334i());
        String g = this.f87894L0.mo19331g();
        if (Build.VERSION.SDK_INT < 28 || g == null) {
            bVar2 = null;
        } else {
            NotificationChannelGroup w = C17180n4.m79433p(UAirship.m146200l()).mo51621w(g);
            if (w == null || !w.isBlocked()) {
                z = false;
            } else {
                z = true;
            }
            bVar2 = C9323b.m35017y().mo18822f("group", C9323b.m35017y().mo18826j(f87892S0, String.valueOf(z)).mo18817a()).mo18817a();
        }
        bVar.mo18822f(f87888O0, C9323b.m35017y().mo18823g("identifier", this.f87894L0.mo19332h()).mo18823g("importance", o).mo18826j("group", bVar2).mo18817a());
    }

    /* renamed from: o */
    public final String mo106554o(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "MAX" : "HIGH" : "DEFAULT" : "LOW" : "MIN" : "NONE";
    }

    public C35568n(@C0359n0 PushMessage pushMessage, @C0363p0 C9515j jVar) {
        this.f87893K0 = pushMessage;
        this.f87894L0 = jVar;
    }
}
