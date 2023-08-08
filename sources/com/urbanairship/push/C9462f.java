package com.urbanairship.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.C0344h1;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.core.app.C17180n4;
import com.urbanairship.C36044d;
import com.urbanairship.C36059m;
import com.urbanairship.C36062p;
import com.urbanairship.UAirship;
import com.urbanairship.actions.ActionValue;
import com.urbanairship.actions.C35489b;
import com.urbanairship.actions.C35490c;
import com.urbanairship.actions.C35495f;
import com.urbanairship.actions.C35497g;
import com.urbanairship.analytics.C35558l;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9669o0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: com.urbanairship.push.f */
public class C9462f {

    /* renamed from: a */
    public final Executor f25887a;

    /* renamed from: b */
    public final C9460d f25888b;

    /* renamed from: c */
    public final C9461e f25889c;

    /* renamed from: d */
    public final Intent f25890d;

    /* renamed from: e */
    public final Context f25891e;

    /* renamed from: f */
    public final UAirship f25892f;

    /* renamed from: com.urbanairship.push.f$a */
    public class C9463a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C36062p f25893a;

        public C9463a(C36062p pVar) {
            this.f25893a = pVar;
        }

        public void run() {
            this.f25893a.mo107828g(Boolean.TRUE);
        }
    }

    /* renamed from: com.urbanairship.push.f$b */
    public class C9464b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Map f25895a;

        /* renamed from: b */
        public final /* synthetic */ Bundle f25896b;

        /* renamed from: c */
        public final /* synthetic */ int f25897c;

        /* renamed from: d */
        public final /* synthetic */ Runnable f25898d;

        /* renamed from: com.urbanairship.push.f$b$a */
        public class C9465a implements C35490c {

            /* renamed from: a */
            public final /* synthetic */ CountDownLatch f25900a;

            public C9465a(CountDownLatch countDownLatch) {
                this.f25900a = countDownLatch;
            }

            /* renamed from: a */
            public void mo17300a(@C0359n0 C35489b bVar, @C0359n0 C35495f fVar) {
                this.f25900a.countDown();
            }
        }

        public C9464b(Map map, Bundle bundle, int i, Runnable runnable) {
            this.f25895a = map;
            this.f25896b = bundle;
            this.f25897c = i;
            this.f25898d = runnable;
        }

        public void run() {
            CountDownLatch countDownLatch = new CountDownLatch(this.f25895a.size());
            for (Map.Entry entry : this.f25895a.entrySet()) {
                C35497g.m146465d((String) entry.getKey()).mo106380m(this.f25896b).mo106381n(this.f25897c).mo106382o((ActionValue) entry.getValue()).mo106377j(new C9465a(countDownLatch));
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                C36059m.m148411g(e, "Failed to wait for actions", new Object[0]);
                Thread.currentThread().interrupt();
            }
            this.f25898d.run();
        }
    }

    public C9462f(@C0359n0 Context context, @C0359n0 Intent intent) {
        this(UAirship.m146188Y(), context, intent, C36044d.m148370b());
    }

    /* renamed from: a */
    public final void mo19243a() {
        PendingIntent pendingIntent;
        if (this.f25890d.getExtras() != null && (pendingIntent = (PendingIntent) this.f25890d.getExtras().get(C9537t.f26073M)) != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                C36059m.m148406b("Failed to send notification's contentIntent, already canceled.", new Object[0]);
            }
        } else if (this.f25892f.mo106220f().f87145r) {
            Intent launchIntentForPackage = this.f25891e.getPackageManager().getLaunchIntentForPackage(UAirship.m146180A());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setFlags(805306368);
                launchIntentForPackage.putExtra(C9537t.f26070J, this.f25889c.mo19239b().mo19188v());
                launchIntentForPackage.setPackage((String) null);
                C36059m.m148413i("Starting application's launch intent.", new Object[0]);
                this.f25891e.startActivity(launchIntentForPackage);
                return;
            }
            C36059m.m148413i("Unable to launch application. Launch intent is unavailable.", new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo19244b() {
        PendingIntent pendingIntent;
        C36059m.m148413i("Notification dismissed: %s", this.f25889c);
        if (!(this.f25890d.getExtras() == null || (pendingIntent = (PendingIntent) this.f25890d.getExtras().get(C9537t.f26074N)) == null)) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                C36059m.m148406b("Failed to send notification's deleteIntent, already canceled.", new Object[0]);
            }
        }
        C9487g c0 = this.f25892f.mo106203E().mo19418c0();
        if (c0 != null) {
            c0.mo19260e(this.f25889c);
        }
    }

    /* renamed from: c */
    public final void mo19245c(@C0359n0 Runnable runnable) {
        C36059m.m148413i("Notification response: %s, %s", this.f25889c, this.f25888b);
        C9460d dVar = this.f25888b;
        if (dVar == null || dVar.mo19237e()) {
            this.f25892f.mo106221g().mo106443d0(this.f25889c.mo19239b().mo19191x());
            this.f25892f.mo106221g().mo106442c0(this.f25889c.mo19239b().mo19181o());
        }
        C9487g c0 = this.f25892f.mo106203E().mo19418c0();
        C9460d dVar2 = this.f25888b;
        if (dVar2 != null) {
            this.f25892f.mo106221g().mo106423J(new C35558l(this.f25889c, dVar2));
            C17180n4.m79433p(this.f25891e).mo51603c(this.f25889c.mo19241d(), this.f25889c.mo19240c());
            if (this.f25888b.mo19237e()) {
                if (c0 == null || !c0.mo19257b(this.f25889c, this.f25888b)) {
                    mo19243a();
                }
            } else if (c0 != null) {
                c0.mo19256a(this.f25889c, this.f25888b);
            }
        } else if (c0 == null || !c0.mo19259d(this.f25889c)) {
            mo19243a();
        }
        for (C9459c a : this.f25892f.mo106203E().mo19414Y()) {
            a.mo18645a(this.f25889c, this.f25888b);
        }
        mo19249g(runnable);
    }

    @C0359n0
    /* renamed from: d */
    public final Map<String, ActionValue> mo19246d(@C0359n0 String str) {
        HashMap hashMap = new HashMap();
        try {
            C9323b j = JsonValue.m34960C(str).mo18767j();
            if (j != null) {
                Iterator<Map.Entry<String, JsonValue>> it = j.iterator();
                while (it.hasNext()) {
                    Map.Entry next = it.next();
                    hashMap.put((String) next.getKey(), new ActionValue((JsonValue) next.getValue()));
                }
            }
        } catch (JsonException e) {
            C36059m.m148411g(e, "Failed to parse actions for push.", new Object[0]);
        }
        return hashMap;
    }

    @C0353k0
    /* renamed from: e */
    public C36062p<Boolean> mo19247e() {
        C36062p<Boolean> pVar = new C36062p<>();
        if (this.f25890d.getAction() == null || this.f25889c == null) {
            C36059m.m148409e("NotificationIntentProcessor - invalid intent %s", this.f25890d);
            pVar.mo107828g(Boolean.FALSE);
            return pVar;
        }
        C36059m.m148419o("Processing intent: %s", this.f25890d.getAction());
        String action = this.f25890d.getAction();
        action.hashCode();
        if (action.equals(C9537t.f26067G)) {
            mo19244b();
            pVar.mo107828g(Boolean.TRUE);
        } else if (!action.equals(C9537t.f26066F)) {
            C36059m.m148409e("NotificationIntentProcessor - Invalid intent action: %s", this.f25890d.getAction());
            pVar.mo107828g(Boolean.FALSE);
        } else {
            mo19245c(new C9463a(pVar));
        }
        return pVar;
    }

    /* renamed from: f */
    public final void mo19248f(@C0359n0 Map<String, ActionValue> map, int i, @C0359n0 Bundle bundle, @C0359n0 Runnable runnable) {
        this.f25887a.execute(new C9464b(map, bundle, i, runnable));
    }

    /* renamed from: g */
    public final void mo19249g(@C0359n0 Runnable runnable) {
        int i;
        Map<String, ActionValue> map;
        Bundle bundle = new Bundle();
        bundle.putParcelable(C35489b.f87516e, this.f25889c.mo19239b());
        if (this.f25888b != null) {
            String stringExtra = this.f25890d.getStringExtra(C9537t.f26076P);
            if (!C9669o0.m36224e(stringExtra)) {
                map = mo19246d(stringExtra);
                if (this.f25888b.mo19236d() != null) {
                    bundle.putBundle(C35489b.f87517f, this.f25888b.mo19236d());
                }
                if (this.f25888b.mo19237e()) {
                    i = 4;
                } else {
                    i = 5;
                }
            } else {
                map = null;
                i = 0;
            }
        } else {
            map = this.f25889c.mo19239b().mo19169e();
            i = 2;
        }
        if (map == null || map.isEmpty()) {
            runnable.run();
        } else {
            mo19248f(map, i, bundle, runnable);
        }
    }

    @C0344h1
    public C9462f(@C0359n0 UAirship uAirship, @C0359n0 Context context, @C0359n0 Intent intent, @C0359n0 Executor executor) {
        this.f25892f = uAirship;
        this.f25887a = executor;
        this.f25890d = intent;
        this.f25891e = context;
        this.f25889c = C9461e.m35559a(intent);
        this.f25888b = C9460d.m35554a(intent);
    }
}
