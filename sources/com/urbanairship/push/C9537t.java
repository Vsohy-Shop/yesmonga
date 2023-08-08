package com.urbanairship.push;

import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0351j1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C17992m;
import com.urbanairship.C36040b;
import com.urbanairship.C36044d;
import com.urbanairship.C36059m;
import com.urbanairship.C36064q;
import com.urbanairship.C36071u;
import com.urbanairship.C36075v;
import com.urbanairship.C36078w;
import com.urbanairship.C36080x;
import com.urbanairship.UAirship;
import com.urbanairship.analytics.C35518b;
import com.urbanairship.app.C36030b;
import com.urbanairship.app.C36035g;
import com.urbanairship.app.C36039i;
import com.urbanairship.base.C9002b;
import com.urbanairship.channel.C9008d;
import com.urbanairship.channel.C9029l;
import com.urbanairship.config.C9061a;
import com.urbanairship.job.C9302e;
import com.urbanairship.job.C9304f;
import com.urbanairship.job.JobResult;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.permission.C9426c;
import com.urbanairship.permission.C9439p;
import com.urbanairship.permission.Permission;
import com.urbanairship.permission.PermissionStatus;
import com.urbanairship.push.C9456b;
import com.urbanairship.push.PushProvider;
import com.urbanairship.push.notifications.C9499b;
import com.urbanairship.push.notifications.C9507f;
import com.urbanairship.push.notifications.C9516k;
import com.urbanairship.push.notifications.C9524n;
import com.urbanairship.util.C9669o0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* renamed from: com.urbanairship.push.t */
public class C9537t extends C36040b {
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: F */
    public static final String f26066F = "com.urbanairship.push.ACTION_NOTIFICATION_RESPONSE";
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: G */
    public static final String f26067G = "com.urbanairship.push.ACTION_NOTIFICATION_DISMISSED";
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: H */
    public static final String f26068H = "com.urbanairship.push.NOTIFICATION_ID";
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: I */
    public static final String f26069I = "com.urbanairship.push.NOTIFICATION_TAG";
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: J */
    public static final String f26070J = "com.urbanairship.push.EXTRA_PUSH_MESSAGE_BUNDLE";
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: K */
    public static final String f26071K = "com.urbanairship.push.EXTRA_NOTIFICATION_BUTTON_ID";
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: L */
    public static final String f26072L = "com.urbanairship.push.EXTRA_NOTIFICATION_BUTTON_FOREGROUND";
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: M */
    public static final String f26073M = "com.urbanairship.push.EXTRA_NOTIFICATION_CONTENT_INTENT";
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: N */
    public static final String f26074N = "com.urbanairship.push.EXTRA_NOTIFICATION_DELETE_INTENT";
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: O */
    public static final String f26075O = "com.urbanairship.push.EXTRA_NOTIFICATION_ACTION_BUTTON_DESCRIPTION";
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: P */
    public static final String f26076P = "com.urbanairship.push.EXTRA_NOTIFICATION_BUTTON_ACTIONS_PAYLOAD";

    /* renamed from: Q */
    public static final String f26077Q = "com.urbanairship.push.LAST_CANONICAL_IDS";

    /* renamed from: R */
    public static final int f26078R = 10;

    /* renamed from: S */
    public static final String f26079S = "ACTION_DISPLAY_NOTIFICATION";

    /* renamed from: T */
    public static final String f26080T = "ACTION_UPDATE_PUSH_REGISTRATION";

    /* renamed from: U */
    public static final ExecutorService f26081U = C36044d.m148370b();

    /* renamed from: V */
    public static final String f26082V = "com.urbanairship.push";

    /* renamed from: W */
    public static final String f26083W = "com.urbanairship.push.USER_NOTIFICATIONS_ENABLED";

    /* renamed from: X */
    public static final String f26084X = "com.urbanairship.push.PUSH_DELIVERY_TYPE";

    /* renamed from: Y */
    public static final String f26085Y = "com.urbanairship.application.device.PUSH_PROVIDER";

    /* renamed from: Z */
    public static final String f26086Z = "com.urbanairship.push.SOUND_ENABLED";

    /* renamed from: a0 */
    public static final String f26087a0 = "com.urbanairship.push.VIBRATE_ENABLED";

    /* renamed from: b0 */
    public static final String f26088b0 = "com.urbanairship.push.LAST_RECEIVED_METADATA";

    /* renamed from: c0 */
    public static final String f26089c0 = "com.urbanairship.push.QUIET_TIME_ENABLED";

    /* renamed from: d0 */
    public static final String f26090d0 = "com.urbanairship.push.QUIET_TIME_INTERVAL";

    /* renamed from: e0 */
    public static final String f26091e0 = "com.urbanairship.push.REGISTRATION_TOKEN_KEY";

    /* renamed from: f0 */
    public static final String f26092f0 = "com.urbanairship.push.REQUEST_PERMISSION_KEY";

    /* renamed from: A */
    public PushProvider f26093A;

    /* renamed from: B */
    public Boolean f26094B;

    /* renamed from: C */
    public volatile boolean f26095C;

    /* renamed from: D */
    public volatile boolean f26096D;

    /* renamed from: E */
    public volatile C36064q<PushMessage> f26097E;

    /* renamed from: f */
    public final String f26098f;

    /* renamed from: g */
    public final Context f26099g;

    /* renamed from: h */
    public final C35518b f26100h;

    /* renamed from: i */
    public final C9061a f26101i;

    /* renamed from: j */
    public final C9002b<C36078w> f26102j;

    /* renamed from: k */
    public final C9439p f26103k;

    /* renamed from: l */
    public C9524n f26104l;

    /* renamed from: m */
    public final Map<String, C9507f> f26105m;

    /* renamed from: n */
    public final C36071u f26106n;

    /* renamed from: o */
    public final C36030b f26107o;

    /* renamed from: p */
    public final C9302e f26108p;

    /* renamed from: q */
    public final C9516k f26109q;

    /* renamed from: r */
    public final C36075v f26110r;

    /* renamed from: s */
    public final AirshipNotificationManager f26111s;

    /* renamed from: t */
    public C9487g f26112t;

    /* renamed from: u */
    public final List<C9544v> f26113u;

    /* renamed from: v */
    public final List<C9493j> f26114v;

    /* renamed from: w */
    public final List<C9493j> f26115w;

    /* renamed from: x */
    public final List<C9459c> f26116x;

    /* renamed from: y */
    public final Object f26117y;

    /* renamed from: z */
    public final C9008d f26118z;

    /* renamed from: com.urbanairship.push.t$a */
    public class C9538a extends C36039i {
        public C9538a() {
        }

        /* renamed from: a */
        public void mo17410a(long j) {
            C9537t.this.mo19407R();
        }
    }

    public C9537t(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C9061a aVar, @C0359n0 C36075v vVar, @C0359n0 C9002b<C36078w> bVar, @C0359n0 C9008d dVar, @C0359n0 C35518b bVar2, @C0359n0 C9439p pVar) {
        this(context, uVar, aVar, vVar, bVar, dVar, bVar2, pVar, C9302e.m34896n(context), AirshipNotificationManager.m35476c(context), C36035g.m148341t(context));
    }

    /* renamed from: r0 */
    public static /* synthetic */ void m35762r0(Runnable runnable, C9426c cVar) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public /* synthetic */ void m35763s0(Runnable runnable, PermissionStatus permissionStatus) {
        if (permissionStatus == PermissionStatus.GRANTED) {
            this.f26106n.mo107857v(f26092f0, false);
            if (runnable != null) {
                runnable.run();
            }
        } else if (mo19403O0()) {
            this.f26103k.mo19135D(Permission.DISPLAY_NOTIFICATIONS, new C9494k(runnable));
            this.f26106n.mo107857v(f26092f0, false);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public /* synthetic */ void m35764t0(Permission permission) {
        if (permission == Permission.DISPLAY_NOTIFICATIONS) {
            this.f26110r.mo107870d(4);
            this.f26106n.mo107857v(f26083W, true);
            this.f26118z.mo17817y0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public /* synthetic */ void m35765u0(Permission permission, PermissionStatus permissionStatus) {
        if (permission == Permission.DISPLAY_NOTIFICATIONS) {
            this.f26118z.mo17817y0();
        }
    }

    /* renamed from: A0 */
    public void mo19384A0(@C0359n0 C9493j jVar) {
        this.f26114v.remove(jVar);
        this.f26115w.remove(jVar);
    }

    /* renamed from: B0 */
    public void mo19385B0(@C0359n0 C9544v vVar) {
        this.f26113u.remove(vVar);
    }

    @C0363p0
    /* renamed from: C0 */
    public final PushProvider mo19386C0() {
        PushProvider f;
        String k = this.f26106n.mo107848k(f26085Y, (String) null);
        C36078w wVar = (C36078w) C17992m.m81743d(this.f26102j.get());
        if (!C9669o0.m36224e(k) && (f = wVar.mo107884f(this.f26101i.mo17959b(), k)) != null) {
            return f;
        }
        PushProvider e = wVar.mo107883e(this.f26101i.mo17959b());
        if (e != null) {
            this.f26106n.mo107856u(f26085Y, e.getClass().toString());
        }
        return e;
    }

    /* renamed from: D0 */
    public void mo19387D0(@C0363p0 C36064q<PushMessage> qVar) {
        this.f26097E = qVar;
    }

    /* renamed from: E0 */
    public void mo19388E0(String str) {
        this.f26106n.mo107856u(f26088b0, str);
    }

    /* renamed from: F0 */
    public void mo19389F0(@C0363p0 C9487g gVar) {
        this.f26112t = gVar;
    }

    /* renamed from: G0 */
    public void mo19390G0(@C0363p0 C9524n nVar) {
        this.f26104l = nVar;
    }

    @Deprecated
    /* renamed from: H0 */
    public void mo19391H0(boolean z) {
        if (z) {
            this.f26110r.mo107870d(4);
            return;
        }
        this.f26110r.mo107869c(4);
    }

    @Deprecated
    /* renamed from: I0 */
    public void mo19392I0(boolean z) {
        if (z) {
            this.f26110r.mo107870d(4);
            return;
        }
        this.f26110r.mo107869c(4);
    }

    @Deprecated
    /* renamed from: J0 */
    public void mo19393J0(boolean z) {
        this.f26106n.mo107857v(f26089c0, z);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: K */
    public void mo19394K(@C0359n0 C9459c cVar) {
        this.f26116x.add(cVar);
    }

    @Deprecated
    /* renamed from: K0 */
    public void mo19395K0(@C0359n0 Date date, @C0359n0 Date date2) {
        this.f26106n.mo107855t(f26090d0, C9545w.m35837d().mo19453h(date, date2).mo19450e().mo17264q());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: L */
    public void mo19396L(@C0359n0 C9493j jVar) {
        this.f26115w.add(jVar);
    }

    @Deprecated
    /* renamed from: L0 */
    public void mo19397L0(boolean z) {
        this.f26106n.mo107857v(f26086Z, z);
    }

    /* renamed from: M */
    public void mo19398M(@C0359n0 String str, @C0359n0 C9507f fVar) {
        if (str.startsWith("ua_")) {
            C36059m.m148409e("Unable to add any notification button groups that starts with the reserved Airship prefix %s", "ua_");
            return;
        }
        this.f26105m.put(str, fVar);
    }

    /* renamed from: M0 */
    public void mo19399M0(boolean z) {
        if (mo19423h0() != z) {
            this.f26106n.mo107857v(f26083W, z);
            if (z) {
                this.f26106n.mo107857v(f26092f0, true);
                C9008d dVar = this.f26118z;
                Objects.requireNonNull(dVar);
                mo19408S(new C9496m(dVar));
                return;
            }
            this.f26118z.mo17817y0();
        }
    }

    /* renamed from: N */
    public void mo19400N(@C0359n0 Context context, @C0351j1 int i) {
        for (Map.Entry next : C9447a.m35525a(context, i).entrySet()) {
            mo19398M((String) next.getKey(), (C9507f) next.getValue());
        }
    }

    @Deprecated
    /* renamed from: N0 */
    public void mo19401N0(boolean z) {
        this.f26106n.mo107857v(f26087a0, z);
    }

    /* renamed from: O */
    public void mo19402O(@C0359n0 C9493j jVar) {
        this.f26114v.add(jVar);
    }

    /* renamed from: O0 */
    public final boolean mo19403O0() {
        if (!this.f26110r.mo107874h(4) || !mo107787s() || !this.f26107o.mo18483d() || !this.f26096D || !mo19423h0() || !this.f26106n.mo107843f(f26092f0, true) || !this.f26101i.mo17958a().f87127F) {
            return false;
        }
        return true;
    }

    /* renamed from: P */
    public void mo19404P(@C0359n0 C9544v vVar) {
        this.f26113u.add(vVar);
    }

    /* renamed from: P0 */
    public final void mo19405P0() {
        if (this.f26110r.mo107874h(4) && mo107787s()) {
            Boolean bool = this.f26094B;
            if (bool == null || !bool.booleanValue()) {
                this.f26094B = Boolean.TRUE;
                if (this.f26093A == null) {
                    this.f26093A = mo19386C0();
                    String k = this.f26106n.mo107848k(f26084X, (String) null);
                    PushProvider pushProvider = this.f26093A;
                    if (pushProvider == null || !pushProvider.getDeliveryType().equals(k)) {
                        mo19409T();
                    }
                }
                if (this.f26095C) {
                    mo19411V();
                }
            }
        } else if (this.f26094B == null || this.f26095C) {
            this.f26094B = Boolean.FALSE;
            this.f26106n.mo107859x(f26084X);
            this.f26106n.mo107859x(f26091e0);
            this.f26095C = true;
        }
    }

    /* renamed from: Q */
    public boolean mo19406Q() {
        return mo19423h0() && this.f26111s.mo19148b();
    }

    /* renamed from: R */
    public final void mo19407R() {
        mo19408S((Runnable) null);
    }

    /* renamed from: S */
    public final void mo19408S(@C0363p0 Runnable runnable) {
        if (this.f26110r.mo107874h(4) && mo107787s()) {
            this.f26103k.mo19143m(Permission.DISPLAY_NOTIFICATIONS, new C9495l(this, runnable));
        }
    }

    /* renamed from: T */
    public final void mo19409T() {
        this.f26106n.mo107859x(f26091e0);
        this.f26106n.mo107859x(f26084X);
    }

    @C0359n0
    /* renamed from: U */
    public final Map<String, String> mo19410U() {
        if (mo107787s()) {
            if (this.f26110r.mo107874h(4)) {
                HashMap hashMap = new HashMap();
                hashMap.put("X-UA-Channel-Opted-In", Boolean.toString(mo19425j0()));
                hashMap.put("X-UA-Channel-Background-Enabled", Boolean.toString(mo19426k0()));
                return hashMap;
            }
        }
        return Collections.emptyMap();
    }

    /* renamed from: V */
    public final void mo19411V() {
        this.f26108p.mo18704c(C9304f.m34907i().mo18725k(f26080T).mo18726l(C9537t.class).mo18728n(0).mo18724j());
    }

    @C0359n0
    /* renamed from: W */
    public final C9029l.C9031b mo19412W(@C0359n0 C9029l.C9031b bVar) {
        if (!mo107787s()) {
            return bVar;
        }
        if (!this.f26110r.mo107874h(4)) {
            return bVar;
        }
        if (mo19421f0() == null) {
            mo19436y0(false);
        }
        String f0 = mo19421f0();
        bVar.mo17869L(f0);
        PushProvider e0 = mo19420e0();
        if (!(f0 == null || e0 == null || e0.getPlatform() != 2)) {
            bVar.mo17862E(e0.getDeliveryType());
        }
        return bVar.mo17868K(mo19425j0()).mo17858A(mo19426k0());
    }

    @C0363p0
    /* renamed from: X */
    public C36064q<PushMessage> mo19413X() {
        return this.f26097E;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: Y */
    public List<C9459c> mo19414Y() {
        return this.f26116x;
    }

    @C0363p0
    /* renamed from: Z */
    public String mo19415Z() {
        return this.f26106n.mo107848k(f26088b0, (String) null);
    }

    @C0363p0
    /* renamed from: a0 */
    public C9507f mo19416a0(@C0363p0 String str) {
        if (str == null) {
            return null;
        }
        return this.f26105m.get(str);
    }

    @C0359n0
    /* renamed from: b0 */
    public C9516k mo19417b0() {
        return this.f26109q;
    }

    @C0363p0
    /* renamed from: c0 */
    public C9487g mo19418c0() {
        return this.f26112t;
    }

    @C0363p0
    /* renamed from: d0 */
    public C9524n mo19419d0() {
        return this.f26104l;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e0 */
    public PushProvider mo19420e0() {
        return this.f26093A;
    }

    @C0363p0
    /* renamed from: f0 */
    public String mo19421f0() {
        return this.f26106n.mo107848k(f26091e0, (String) null);
    }

    @C0363p0
    @Deprecated
    /* renamed from: g0 */
    public Date[] mo19422g0() {
        try {
            return C9545w.m35836a(this.f26106n.mo107845h(f26090d0)).mo19445b();
        } catch (JsonException unused) {
            C36059m.m148409e("Failed to parse quiet time interval", new Object[0]);
            return null;
        }
    }

    /* renamed from: h0 */
    public boolean mo19423h0() {
        return this.f26106n.mo107843f(f26083W, false);
    }

    @Deprecated
    /* renamed from: i0 */
    public boolean mo19424i0() {
        if (!mo19429n0()) {
            return false;
        }
        try {
            return C9545w.m35836a(this.f26106n.mo107845h(f26090d0)).mo19446c(Calendar.getInstance());
        } catch (JsonException unused) {
            C36059m.m148409e("Failed to parse quiet time interval", new Object[0]);
            return false;
        }
    }

    /* renamed from: j0 */
    public boolean mo19425j0() {
        return mo19426k0() && mo19406Q();
    }

    /* renamed from: k0 */
    public boolean mo19426k0() {
        return this.f26110r.mo107874h(4) && !C9669o0.m36224e(mo19421f0());
    }

    @Deprecated
    /* renamed from: l0 */
    public boolean mo19427l0() {
        return this.f26110r.mo107874h(4);
    }

    @Deprecated
    /* renamed from: m0 */
    public boolean mo19428m0() {
        return this.f26110r.mo107874h(4);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: n */
    public int mo17620n() {
        return 0;
    }

    @Deprecated
    /* renamed from: n0 */
    public boolean mo19429n0() {
        return this.f26106n.mo107843f(f26089c0, false);
    }

    @Deprecated
    /* renamed from: o0 */
    public boolean mo19430o0() {
        return this.f26106n.mo107843f(f26086Z, true);
    }

    /* renamed from: p0 */
    public boolean mo19431p0(@C0363p0 String str) {
        List list;
        if (C9669o0.m36224e(str)) {
            return true;
        }
        synchronized (this.f26117y) {
            C9322a aVar = null;
            try {
                aVar = JsonValue.m34960C(this.f26106n.mo107848k(f26077Q, (String) null)).mo18764h();
            } catch (JsonException e) {
                C36059m.m148407c(e, "Unable to parse canonical Ids.", new Object[0]);
            }
            if (aVar == null) {
                list = new ArrayList();
            } else {
                list = aVar.mo18793i();
            }
            JsonValue N = JsonValue.m34968N(str);
            if (list.contains(N)) {
                return false;
            }
            list.add(N);
            if (list.size() > 10) {
                list = list.subList(list.size() - 10, list.size());
            }
            this.f26106n.mo107856u(f26077Q, JsonValue.m34975U(list).toString());
            return true;
        }
    }

    @Deprecated
    /* renamed from: q0 */
    public boolean mo19432q0() {
        return this.f26106n.mo107843f(f26087a0, true);
    }

    /* renamed from: r */
    public void mo17625r() {
        super.mo17625r();
        this.f26118z.mo17781N(new C9532o(this));
        this.f26100h.mo106425L(new C9533p(this));
        this.f26110r.mo107868a(new C9534q(this));
        this.f26103k.mo19140j(new C9535r(this));
        this.f26103k.mo19141k(new C9536s(this));
        String str = this.f26101i.mo17958a().f87122A;
        if (str == null) {
            str = C9524n.f26024a;
        }
        this.f26103k.mo19137F(Permission.DISPLAY_NOTIFICATIONS, new C9489i(str, this.f26106n, this.f26111s, this.f26109q, this.f26107o));
        mo19405P0();
    }

    /* renamed from: u */
    public void mo17628u(@C0359n0 UAirship uAirship) {
        super.mo17628u(uAirship);
        this.f26096D = true;
        this.f26110r.mo107868a(new C9497n(this));
        this.f26107o.mo18485f(new C9538a());
        mo19407R();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: v */
    public void mo17629v(boolean z) {
        mo19405P0();
        if (z) {
            mo19407R();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: v0 */
    public void mo19433v0(@C0359n0 PushMessage pushMessage, int i, @C0363p0 String str) {
        C9487g gVar;
        if (mo107787s()) {
            if (this.f26110r.mo107874h(4) && (gVar = this.f26112t) != null) {
                gVar.mo19258c(new C9461e(pushMessage, i, str));
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: w0 */
    public void mo19434w0(@C0359n0 PushMessage pushMessage, boolean z) {
        if (mo107787s()) {
            boolean z2 = true;
            if (this.f26110r.mo107874h(4)) {
                for (C9493j a : this.f26115w) {
                    a.mo18643a(pushMessage, z);
                }
                if (!pushMessage.mo19165L() && !pushMessage.mo19164K()) {
                    z2 = false;
                }
                if (!z2) {
                    for (C9493j a2 : this.f26114v) {
                        a2.mo18643a(pushMessage, z);
                    }
                }
            }
        }
    }

    @C0348i1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: x */
    public JobResult mo17814x(@C0359n0 UAirship uAirship, @C0359n0 C9304f fVar) {
        if (!this.f26110r.mo107874h(4)) {
            return JobResult.SUCCESS;
        }
        String a = fVar.mo18712a();
        a.hashCode();
        if (a.equals(f26080T)) {
            return mo19436y0(true);
        }
        if (!a.equals(f26079S)) {
            return JobResult.SUCCESS;
        }
        PushMessage d = PushMessage.m35485d(fVar.mo18715d().mo18801A(C9539u.f26121b));
        String l = fVar.mo18715d().mo18801A(C9539u.f26120a).mo18769l();
        if (l == null) {
            return JobResult.SUCCESS;
        }
        new C9456b.C9458b(mo107785o()).mo19229l(true).mo19232o(true).mo19230m(d).mo19233p(l).mo19226i().run();
        return JobResult.SUCCESS;
    }

    /* renamed from: x0 */
    public void mo19435x0(@C0363p0 Class<? extends PushProvider> cls, @C0363p0 String str) {
        PushProvider pushProvider;
        if (this.f26110r.mo107874h(4) && (pushProvider = this.f26093A) != null) {
            if (cls != null && pushProvider.getClass().equals(cls)) {
                String k = this.f26106n.mo107848k(f26091e0, (String) null);
                if (str != null && !C9669o0.m36223d(str, k)) {
                    mo19409T();
                }
            }
            mo19411V();
        }
    }

    @C0359n0
    /* renamed from: y0 */
    public JobResult mo19436y0(boolean z) {
        this.f26095C = false;
        String f0 = mo19421f0();
        PushProvider pushProvider = this.f26093A;
        if (pushProvider == null) {
            C36059m.m148413i("PushManager - Push registration failed. Missing push provider.", new Object[0]);
            return JobResult.SUCCESS;
        } else if (!pushProvider.isAvailable(this.f26099g)) {
            C36059m.m148421q("PushManager - Push registration failed. Push provider unavailable: %s", pushProvider);
            return JobResult.RETRY;
        } else {
            try {
                String registrationToken = pushProvider.getRegistrationToken(this.f26099g);
                if (registrationToken != null && !C9669o0.m36223d(registrationToken, f0)) {
                    C36059m.m148413i("PushManager - Push registration updated.", new Object[0]);
                    this.f26106n.mo107856u(f26084X, pushProvider.getDeliveryType());
                    this.f26106n.mo107856u(f26091e0, registrationToken);
                    for (C9544v a : this.f26113u) {
                        a.mo19444a(registrationToken);
                    }
                    if (z) {
                        this.f26118z.mo17817y0();
                    }
                }
                return JobResult.SUCCESS;
            } catch (PushProvider.RegistrationException e) {
                if (e.mo19203a()) {
                    C36059m.m148406b("Push registration failed with error: %s. Will retry.", e.getMessage());
                    C36059m.m148420p(e);
                    mo19409T();
                    return JobResult.RETRY;
                }
                C36059m.m148411g(e, "PushManager - Push registration failed.", new Object[0]);
                mo19409T();
                return JobResult.SUCCESS;
            }
        }
    }

    /* renamed from: z0 */
    public void mo19437z0(@C0359n0 String str) {
        if (str.startsWith("ua_")) {
            C36059m.m148409e("Unable to remove any reserved Airship actions groups that begin with %s", "ua_");
            return;
        }
        this.f26105m.remove(str);
    }

    @C0344h1
    public C9537t(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C9061a aVar, @C0359n0 C36075v vVar, @C0359n0 C9002b<C36078w> bVar, @C0359n0 C9008d dVar, @C0359n0 C35518b bVar2, @C0359n0 C9439p pVar, @C0359n0 C9302e eVar, @C0359n0 AirshipNotificationManager airshipNotificationManager, @C0359n0 C36030b bVar3) {
        super(context, uVar);
        this.f26098f = "ua_";
        HashMap hashMap = new HashMap();
        this.f26105m = hashMap;
        this.f26113u = new CopyOnWriteArrayList();
        this.f26114v = new CopyOnWriteArrayList();
        this.f26115w = new CopyOnWriteArrayList();
        this.f26116x = new CopyOnWriteArrayList();
        this.f26117y = new Object();
        this.f26095C = true;
        this.f26096D = false;
        this.f26097E = null;
        this.f26099g = context;
        this.f26106n = uVar;
        this.f26101i = aVar;
        this.f26110r = vVar;
        this.f26102j = bVar;
        this.f26118z = dVar;
        this.f26100h = bVar2;
        this.f26103k = pVar;
        this.f26108p = eVar;
        this.f26111s = airshipNotificationManager;
        this.f26107o = bVar3;
        this.f26104l = new C9499b(context, aVar.mo17958a());
        this.f26109q = new C9516k(context, aVar.mo17958a());
        hashMap.putAll(C9447a.m35525a(context, C36080x.C36097q.ua_notification_buttons));
        hashMap.putAll(C9447a.m35525a(context, C36080x.C36097q.ua_notification_button_overrides));
    }
}
