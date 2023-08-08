package com.urbanairship.accengage.notifications;

import android.app.Notification;
import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.core.app.C17075f2;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.accengage.C35451b;
import com.urbanairship.app.C36035g;
import com.urbanairship.push.PushMessage;
import com.urbanairship.push.notifications.C9510g;
import com.urbanairship.push.notifications.C9523m;
import com.urbanairship.push.notifications.C9524n;
import com.urbanairship.push.notifications.C9525o;

/* renamed from: com.urbanairship.accengage.notifications.b */
public class C35475b implements C9524n {

    /* renamed from: b */
    public final AirshipConfigOptions f87419b;

    public C35475b(@C0359n0 AirshipConfigOptions airshipConfigOptions) {
        this.f87419b = airshipConfigOptions;
    }

    /* renamed from: a */
    public void mo19264a(@C0359n0 Context context, @C0359n0 Notification notification, @C0359n0 C9510g gVar) {
    }

    @C0359n0
    /* renamed from: b */
    public C9525o mo19265b(@C0359n0 Context context, @C0359n0 C9510g gVar) {
        C35451b a = C35451b.m146253a(gVar.mo19313a());
        if (a.mo106264o() || !C36035g.m148341t(context).mo18483d()) {
            C36059m.m148406b("Push message received from Accengage, displaying notification...", new Object[0]);
            return C9525o.m35731d(mo106299d(context, new C17075f2.C17092g(context, gVar.mo19314b()).mo51403o(new C35474a(context, this.f87419b, a, gVar)), a, gVar).mo51389h());
        }
        C36059m.m148406b("Received Accengage Push message but application was in foreground, skip it...", new Object[0]);
        return C9525o.m35730a();
    }

    @C0359n0
    /* renamed from: c */
    public C9510g mo19266c(@C0359n0 Context context, @C0359n0 PushMessage pushMessage) {
        C35451b a = C35451b.m146253a(pushMessage);
        return C9510g.m35656f(pushMessage).mo19319g(C9523m.m35725b(a.mo106261l(), C9524n.f26024a)).mo19320h(String.valueOf(a.mo106242B()), a.mo106242B()).mo19318f();
    }

    @C0359n0
    /* renamed from: d */
    public C17075f2.C17092g mo106299d(@C0359n0 Context context, @C0359n0 C17075f2.C17092g gVar, @C0359n0 C35451b bVar, @C0359n0 C9510g gVar2) {
        return gVar;
    }

    @Deprecated
    public C35475b() {
        this.f87419b = UAirship.m146188Y().mo106220f();
    }
}
