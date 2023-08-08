package com.urbanairship.push;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.app.C17075f2;
import androidx.core.app.C17180n4;
import com.urbanairship.Autopilot;
import com.urbanairship.C36059m;
import com.urbanairship.C36064q;
import com.urbanairship.UAirship;
import com.urbanairship.actions.ActionValue;
import com.urbanairship.actions.C35489b;
import com.urbanairship.actions.C35497g;
import com.urbanairship.analytics.C35568n;
import com.urbanairship.app.C36030b;
import com.urbanairship.app.C36035g;
import com.urbanairship.job.C9302e;
import com.urbanairship.job.C9304f;
import com.urbanairship.json.C9323b;
import com.urbanairship.modules.accengage.AccengageNotificationHandler;
import com.urbanairship.push.notifications.C9510g;
import com.urbanairship.push.notifications.C9515j;
import com.urbanairship.push.notifications.C9523m;
import com.urbanairship.push.notifications.C9524n;
import com.urbanairship.push.notifications.C9525o;
import com.urbanairship.util.C9647e0;
import com.urbanairship.util.C9654i;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.urbanairship.push.b */
public class C9456b implements Runnable {

    /* renamed from: w */
    public static final long f25862w = 5000;

    /* renamed from: x */
    public static final long f25863x = 10000;

    /* renamed from: a */
    public final Context f25864a;

    /* renamed from: b */
    public final PushMessage f25865b;

    /* renamed from: c */
    public final String f25866c;

    /* renamed from: d */
    public final C17180n4 f25867d;

    /* renamed from: e */
    public final boolean f25868e;

    /* renamed from: f */
    public final boolean f25869f;

    /* renamed from: g */
    public final C9302e f25870g;

    /* renamed from: v */
    public final C36030b f25871v;

    /* renamed from: com.urbanairship.push.b$b */
    public static class C9458b {

        /* renamed from: a */
        public final Context f25872a;

        /* renamed from: b */
        public PushMessage f25873b;

        /* renamed from: c */
        public String f25874c;

        /* renamed from: d */
        public boolean f25875d;

        /* renamed from: e */
        public boolean f25876e;

        /* renamed from: f */
        public C17180n4 f25877f;

        /* renamed from: g */
        public C9302e f25878g;

        /* renamed from: h */
        public C36030b f25879h;

        public C9458b(@C0359n0 Context context) {
            this.f25872a = context.getApplicationContext();
        }

        @C0359n0
        /* renamed from: i */
        public C9456b mo19226i() {
            C9654i.m36166b(this.f25874c, "Provider class missing");
            C9654i.m36166b(this.f25873b, "Push Message missing");
            return new C9456b(this);
        }

        @C0359n0
        /* renamed from: j */
        public C9458b mo19227j(@C0359n0 C36030b bVar) {
            this.f25879h = bVar;
            return this;
        }

        @C0359n0
        /* renamed from: k */
        public C9458b mo19228k(@C0359n0 C9302e eVar) {
            this.f25878g = eVar;
            return this;
        }

        @C0359n0
        /* renamed from: l */
        public C9458b mo19229l(boolean z) {
            this.f25875d = z;
            return this;
        }

        @C0359n0
        /* renamed from: m */
        public C9458b mo19230m(@C0359n0 PushMessage pushMessage) {
            this.f25873b = pushMessage;
            return this;
        }

        @C0359n0
        /* renamed from: n */
        public C9458b mo19231n(@C0359n0 C17180n4 n4Var) {
            this.f25877f = n4Var;
            return this;
        }

        @C0359n0
        /* renamed from: o */
        public C9458b mo19232o(boolean z) {
            this.f25876e = z;
            return this;
        }

        @C0359n0
        /* renamed from: p */
        public C9458b mo19233p(@C0359n0 String str) {
            this.f25874c = str;
            return this;
        }
    }

    /* renamed from: a */
    public final void mo19215a(@C0359n0 UAirship uAirship, @C0359n0 Notification notification) {
        if (!uAirship.mo106203E().mo19432q0() || uAirship.mo106203E().mo19424i0()) {
            notification.vibrate = null;
            notification.defaults &= -3;
        }
        if (!uAirship.mo106203E().mo19430o0() || uAirship.mo106203E().mo19424i0()) {
            notification.sound = null;
            notification.defaults &= -2;
        }
    }

    /* renamed from: b */
    public final boolean mo19216b(UAirship uAirship, String str) {
        PushProvider e0 = uAirship.mo106203E().mo19420e0();
        if (e0 == null || !e0.getClass().toString().equals(str)) {
            C36059m.m148409e("Received message callback from unexpected provider %s. Ignoring.", str);
            return false;
        } else if (!e0.isAvailable(this.f25864a)) {
            C36059m.m148409e("Received message callback when provider is unavailable. Ignoring.", new Object[0]);
            return false;
        } else if (uAirship.mo106203E().mo19426k0() && uAirship.mo106203E().mo19427l0()) {
            return true;
        } else {
            C36059m.m148409e("Received message when push is disabled. Ignoring.", new Object[0]);
            return false;
        }
    }

    @C0363p0
    /* renamed from: c */
    public final C9515j mo19217c(@C0359n0 UAirship uAirship, @C0359n0 Notification notification, @C0359n0 C9510g gVar) {
        String str;
        if (Build.VERSION.SDK_INT >= 26) {
            str = C17075f2.m78937i(notification);
        } else {
            str = gVar.mo19314b();
        }
        if (str != null) {
            return uAirship.mo106203E().mo19417b0().mo19357k(str);
        }
        return null;
    }

    @C0363p0
    /* renamed from: d */
    public final C9524n mo19218d(UAirship uAirship) {
        AccengageNotificationHandler d;
        if (this.f25865b.mo19160G()) {
            return uAirship.mo106203E().mo19419d0();
        }
        if (!this.f25865b.mo19159F() || (d = uAirship.mo106217d()) == null) {
            return null;
        }
        return d.getNotificationProvider();
    }

    /* renamed from: e */
    public final boolean mo19219e(@C0359n0 Notification notification, @C0359n0 C9510g gVar) {
        String d = gVar.mo19316d();
        int c = gVar.mo19315c();
        Intent putExtra = new Intent(this.f25864a, NotificationProxyActivity.class).setAction(C9537t.f26066F).addCategory(UUID.randomUUID().toString()).putExtra(C9537t.f26070J, gVar.mo19313a().mo19188v()).addFlags(268435456).putExtra(C9537t.f26068H, gVar.mo19315c()).putExtra(C9537t.f26069I, gVar.mo19316d());
        PendingIntent pendingIntent = notification.contentIntent;
        if (pendingIntent != null) {
            putExtra.putExtra(C9537t.f26073M, pendingIntent);
        }
        Intent putExtra2 = new Intent(this.f25864a, NotificationProxyReceiver.class).setAction(C9537t.f26067G).addCategory(UUID.randomUUID().toString()).putExtra(C9537t.f26070J, gVar.mo19313a().mo19188v()).putExtra(C9537t.f26068H, gVar.mo19315c()).putExtra(C9537t.f26069I, gVar.mo19316d());
        PendingIntent pendingIntent2 = notification.deleteIntent;
        if (pendingIntent2 != null) {
            putExtra2.putExtra(C9537t.f26074N, pendingIntent2);
        }
        notification.contentIntent = C9647e0.m36143b(this.f25864a, 0, putExtra, 0);
        notification.deleteIntent = C9647e0.m36144c(this.f25864a, 0, putExtra2, 0);
        C36059m.m148413i("Posting notification: %s id: %s tag: %s", notification, Integer.valueOf(c), d);
        try {
            this.f25867d.mo51599D(d, c, notification);
            return true;
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to post notification.", new Object[0]);
            return false;
        }
    }

    /* renamed from: f */
    public final void mo19220f(UAirship uAirship) {
        C9525o oVar;
        if (!uAirship.mo106203E().mo19425j0()) {
            C36059m.m148413i("User notifications opted out. Unable to display notification for message: %s", this.f25865b);
            mo19221g(uAirship, this.f25865b, false);
            return;
        }
        if (this.f25871v.mo18483d()) {
            if (!this.f25865b.mo19162I()) {
                C36059m.m148413i("Push message flagged as not able to be displayed in the foreground: %s", this.f25865b);
                mo19221g(uAirship, this.f25865b, false);
                return;
            }
            C36064q<PushMessage> X = uAirship.mo106203E().mo19413X();
            if (X != null && !X.apply(this.f25865b)) {
                C36059m.m148413i("Foreground notification display predicate prevented the display of message: %s", this.f25865b);
                mo19221g(uAirship, this.f25865b, false);
                return;
            }
        }
        C9524n d = mo19218d(uAirship);
        if (d == null) {
            C36059m.m148409e("NotificationProvider is null. Unable to display notification for message: %s", this.f25865b);
            mo19221g(uAirship, this.f25865b, false);
            return;
        }
        try {
            C9510g c = d.mo19266c(this.f25864a, this.f25865b);
            if (this.f25868e || !c.mo19317e()) {
                try {
                    oVar = d.mo19265b(this.f25864a, c);
                } catch (Exception e) {
                    C36059m.m148411g(e, "Cancelling notification display to create and display notification.", new Object[0]);
                    oVar = C9525o.m35730a();
                }
                C36059m.m148406b("Received result status %s for push message: %s", Integer.valueOf(oVar.mo19371c()), this.f25865b);
                int c2 = oVar.mo19371c();
                if (c2 == 0) {
                    Notification b = oVar.mo19370b();
                    C9654i.m36166b(b, "Invalid notification result. Missing notification.");
                    C9515j c3 = mo19217c(uAirship, b, c);
                    if (Build.VERSION.SDK_INT < 26) {
                        if (c3 != null) {
                            C9523m.m35724a(b, c3);
                        } else {
                            mo19215a(uAirship, b);
                        }
                    } else if (c3 == null) {
                        C36059m.m148409e("Missing required notification channel. Notification will most likely not display.", new Object[0]);
                    }
                    d.mo19264a(this.f25864a, b, c);
                    boolean e2 = mo19219e(b, c);
                    mo19221g(uAirship, this.f25865b, e2);
                    if (e2) {
                        uAirship.mo106203E().mo19433v0(this.f25865b, c.mo19315c(), c.mo19316d());
                    }
                } else if (c2 == 1) {
                    C36059m.m148406b("Scheduling notification to be retried for a later time: %s", this.f25865b);
                    mo19223i(this.f25865b);
                } else if (c2 == 2) {
                    mo19221g(uAirship, this.f25865b, false);
                }
            } else {
                C36059m.m148406b("Push requires a long running task. Scheduled for a later time: %s", this.f25865b);
                mo19223i(this.f25865b);
            }
        } catch (Exception e3) {
            C36059m.m148411g(e3, "Failed to generate notification arguments for message. Skipping.", new Object[0]);
            mo19221g(uAirship, this.f25865b, false);
        }
    }

    /* renamed from: g */
    public final void mo19221g(@C0359n0 UAirship uAirship, @C0359n0 PushMessage pushMessage, boolean z) {
        uAirship.mo106221g().mo106423J(new C35568n(pushMessage));
        uAirship.mo106203E().mo19434w0(pushMessage, z);
    }

    /* renamed from: h */
    public final void mo19222h(UAirship uAirship) {
        C36059m.m148413i("Processing push: %s", this.f25865b);
        if (!uAirship.mo106203E().mo19427l0()) {
            C36059m.m148406b("Push disabled, ignoring message", new Object[0]);
        } else if (!uAirship.mo106203E().mo107787s()) {
            C36059m.m148406b("PushManager component is disabled, ignoring message.", new Object[0]);
        } else if (!uAirship.mo106203E().mo19431p0(this.f25865b.mo19172g())) {
            C36059m.m148406b("Received a duplicate push with canonical ID: %s", this.f25865b.mo19172g());
        } else if (this.f25865b.mo19161H()) {
            C36059m.m148406b("Received expired push message, ignoring.", new Object[0]);
        } else if (this.f25865b.mo19164K() || this.f25865b.mo19165L()) {
            C36059m.m148419o("Received internal push.", new Object[0]);
            uAirship.mo106221g().mo106423J(new C35568n(this.f25865b));
            uAirship.mo106203E().mo19434w0(this.f25865b, false);
        } else {
            mo19224j();
            uAirship.mo106203E().mo19388E0(this.f25865b.mo19181o());
            mo19220f(uAirship);
        }
    }

    /* renamed from: i */
    public final void mo19223i(@C0359n0 PushMessage pushMessage) {
        this.f25870g.mo18704c(C9304f.m34907i().mo18725k(C9537t.f26079S).mo18728n(1).mo18726l(C9537t.class).mo18729o(C9323b.m35017y().mo18826j(C9539u.f26121b, pushMessage).mo18823g(C9539u.f26120a, this.f25866c).mo18817a()).mo18724j());
    }

    /* renamed from: j */
    public final void mo19224j() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(C35489b.f87516e, this.f25865b);
        for (Map.Entry next : this.f25865b.mo19169e().entrySet()) {
            C35497g.m146465d((String) next.getKey()).mo106380m(bundle).mo106382o((ActionValue) next.getValue()).mo106381n(1).mo106375h();
        }
    }

    public void run() {
        long j;
        Autopilot.m146142e(this.f25864a);
        if (this.f25868e) {
            j = 10000;
        } else {
            j = 5000;
        }
        UAirship e0 = UAirship.m146195e0(j);
        if (e0 == null) {
            C36059m.m148409e("Unable to process push, Airship is not ready. Make sure takeOff is called by either using autopilot or by calling takeOff in the application's onCreate method.", new Object[0]);
        } else if (!this.f25865b.mo19158E() && !this.f25865b.mo19160G()) {
            C36059m.m148406b("Ignoring push: %s", this.f25865b);
        } else if (!mo19216b(e0, this.f25866c)) {
        } else {
            if (this.f25869f) {
                mo19220f(e0);
            } else {
                mo19222h(e0);
            }
        }
    }

    public C9456b(@C0359n0 C9458b bVar) {
        Context a = bVar.f25872a;
        this.f25864a = a;
        this.f25865b = bVar.f25873b;
        this.f25866c = bVar.f25874c;
        this.f25868e = bVar.f25875d;
        this.f25869f = bVar.f25876e;
        this.f25867d = bVar.f25877f == null ? C17180n4.m79433p(a) : bVar.f25877f;
        this.f25870g = bVar.f25878g == null ? C9302e.m34896n(a) : bVar.f25878g;
        this.f25871v = bVar.f25879h == null ? C36035g.m148341t(a) : bVar.f25879h;
    }
}
