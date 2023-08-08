package com.urbanairship.accengage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.C36040b;
import com.urbanairship.C36059m;
import com.urbanairship.C36071u;
import com.urbanairship.C36075v;
import com.urbanairship.UAirship;
import com.urbanairship.accengage.common.persistence.C35454a;
import com.urbanairship.accengage.notifications.C35475b;
import com.urbanairship.channel.C9008d;
import com.urbanairship.channel.C9029l;
import com.urbanairship.json.C9323b;
import com.urbanairship.push.C9459c;
import com.urbanairship.push.C9460d;
import com.urbanairship.push.C9461e;
import com.urbanairship.push.C9537t;
import com.urbanairship.push.notifications.C9524n;

/* renamed from: com.urbanairship.accengage.a */
public class C35448a extends C36040b {

    /* renamed from: l */
    public static final String f87305l = "com.urbanairship.accengage.migrated";
    @C0344h1

    /* renamed from: m */
    public static final String f87306m = "com.ad4screen.sdk.service.modules.push.PushNotification";
    @C0344h1

    /* renamed from: n */
    public static final String f87307n = "com.ad4screen.sdk.common.OptinArchive";
    @C0344h1

    /* renamed from: o */
    public static final String f87308o = "isEnabled";
    @C0344h1

    /* renamed from: p */
    public static final String f87309p = "optinData";
    @C0344h1

    /* renamed from: q */
    public static final String f87310q = "com.ad4screen.sdk.A4S";
    @C0344h1

    /* renamed from: r */
    public static final String f87311r = "com.ad4screen.sdk.A4S.doNotTrack";
    @C0344h1

    /* renamed from: s */
    public static final String f87312s = "com.ad4screen.sdk.common.DeviceInfo";
    @C0344h1

    /* renamed from: t */
    public static final String f87313t = "idfv";
    @C0344h1

    /* renamed from: u */
    public static final String f87314u = "optin_yes";
    @C0344h1

    /* renamed from: v */
    public static final String f87315v = "optin_no";

    /* renamed from: f */
    public final C36075v f87316f;

    /* renamed from: g */
    public final C9008d f87317g;

    /* renamed from: h */
    public final C9537t f87318h;

    /* renamed from: i */
    public final C35454a f87319i;

    /* renamed from: j */
    public C9524n f87320j;

    /* renamed from: k */
    public String f87321k;

    /* renamed from: com.urbanairship.accengage.a$a */
    public class C35449a implements C9008d.C9015g {
        public C35449a() {
        }

        @C0359n0
        /* renamed from: a */
        public C9029l.C9031b mo17825a(@C0359n0 C9029l.C9031b bVar) {
            bVar.mo17876x(C35448a.this.f87321k);
            return bVar;
        }
    }

    /* renamed from: com.urbanairship.accengage.a$b */
    public class C35450b implements C9459c {
        public C35450b() {
        }

        /* renamed from: a */
        public void mo18645a(@C0359n0 C9461e eVar, @C0363p0 C9460d dVar) {
            C35448a.this.mo106239G(eVar, dVar);
        }
    }

    public C35448a(@C0359n0 Context context, @C0359n0 AirshipConfigOptions airshipConfigOptions, @C0359n0 C36071u uVar, @C0359n0 C36075v vVar, @C0359n0 C9008d dVar, @C0359n0 C9537t tVar) {
        this(context, airshipConfigOptions, uVar, vVar, dVar, tVar, new C35454a());
    }

    @C0359n0
    /* renamed from: I */
    public static C35448a m146243I() {
        return (C35448a) UAirship.m146188Y().mo106211R(C35448a.class);
    }

    @C0363p0
    /* renamed from: D */
    public final C35453c mo106236D(@C0359n0 C35451b bVar, @C0359n0 C9460d dVar) {
        for (C35453c next : bVar.mo106247G()) {
            if (dVar.mo19234b().equals(next.mo106281g())) {
                return next;
            }
        }
        C36059m.m148409e("Unable to lookup Accengage button with ID: %s", dVar.mo19234b());
        return null;
    }

    @C0359n0
    /* renamed from: E */
    public C9524n mo106237E() {
        return this.f87320j;
    }

    /* renamed from: F */
    public final void mo106238F() {
        if (!mo107786p().mo107843f(f87305l, false)) {
            C9323b a = this.f87319i.mo106284a(mo107785o(), f87306m);
            C9323b a2 = this.f87319i.mo106284a(mo107785o(), f87307n);
            SharedPreferences sharedPreferences = mo107785o().getSharedPreferences(f87310q, 0);
            if (!a2.isEmpty() || !a2.isEmpty() || sharedPreferences.contains(f87311r)) {
                boolean c = a.mo18801A("isEnabled").mo18757c(true);
                C36059m.m148406b("Migrating Accengage Push Opt-in status : " + c, new Object[0]);
                this.f87318h.mo19399M0(c);
                String l = a2.mo18801A(f87309p).mo18769l();
                if (l != null) {
                    C36059m.m148406b("Migrating Accengage Data Opt-In status : " + l, new Object[0]);
                    if (l.equals(f87314u)) {
                        this.f87316f.mo107870d(255);
                    } else if (l.equals(f87315v)) {
                        this.f87316f.mo107877k(0);
                    }
                }
                boolean z = sharedPreferences.getBoolean(f87311r, false);
                C36059m.m148406b("Migrating Accengage Tracking Disabled status : " + z, new Object[0]);
                if (z) {
                    this.f87316f.mo107869c(16);
                }
                mo107786p().mo107857v(f87305l, true);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a1  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo106239G(@androidx.annotation.C0359n0 com.urbanairship.push.C9461e r8, @androidx.annotation.C0363p0 com.urbanairship.push.C9460d r9) {
        /*
            r7 = this;
            com.urbanairship.push.PushMessage r0 = r8.mo19239b()
            boolean r0 = r0.mo19160G()
            if (r0 != 0) goto L_0x00d6
            com.urbanairship.push.PushMessage r0 = r8.mo19239b()
            boolean r0 = r0.mo19159F()
            if (r0 != 0) goto L_0x0016
            goto L_0x00d6
        L_0x0016:
            com.urbanairship.push.PushMessage r8 = r8.mo19239b()
            com.urbanairship.accengage.b r8 = com.urbanairship.accengage.C35451b.m146253a(r8)
            if (r9 == 0) goto L_0x0025
            com.urbanairship.accengage.c r9 = r7.mo106236D(r8, r9)
            goto L_0x0026
        L_0x0025:
            r9 = 0
        L_0x0026:
            if (r9 == 0) goto L_0x0031
            java.lang.String r0 = r9.mo106276b()
            java.lang.String r9 = r9.mo106277c()
            goto L_0x0039
        L_0x0031:
            java.lang.String r0 = r8.mo106253d()
            java.lang.String r9 = r8.mo106246F()
        L_0x0039:
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            r2 = 0
            if (r1 == 0) goto L_0x0048
            java.lang.String r8 = "Notification URL is empty."
            java.lang.Object[] r9 = new java.lang.Object[r2]
            com.urbanairship.C36059m.m148406b(r8, r9)
            return
        L_0x0048:
            java.lang.String r1 = "open_external_url_action"
            java.lang.String r3 = "landing_page_action"
            r4 = 2
            if (r0 == 0) goto L_0x00b1
            int r8 = r0.hashCode()
            r5 = -170614112(0xfffffffff5d4a2a0, float:-5.390944E32)
            r6 = 1
            if (r8 == r5) goto L_0x0078
            r5 = 150940456(0x8ff2b28, float:1.53574E-33)
            if (r8 == r5) goto L_0x006e
            r5 = 1223471129(0x48ecb019, float:484736.78)
            if (r8 == r5) goto L_0x0064
            goto L_0x0082
        L_0x0064:
            java.lang.String r8 = "webView"
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L_0x0082
            r8 = r4
            goto L_0x0083
        L_0x006e:
            java.lang.String r8 = "browser"
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L_0x0082
            r8 = r2
            goto L_0x0083
        L_0x0078:
            java.lang.String r8 = "urlExec"
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L_0x0082
            r8 = r6
            goto L_0x0083
        L_0x0082:
            r8 = -1
        L_0x0083:
            if (r8 == 0) goto L_0x00a1
            if (r8 == r6) goto L_0x0097
            com.urbanairship.actions.g r8 = com.urbanairship.actions.C35497g.m146465d(r3)
            com.urbanairship.actions.g r8 = r8.mo106383p(r9)
            com.urbanairship.actions.g r8 = r8.mo106381n(r4)
            r8.mo106375h()
            goto L_0x00d6
        L_0x0097:
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r8[r2] = r9
            java.lang.String r9 = "Accengage - URL tracking not supported %s"
            com.urbanairship.C36059m.m148413i(r9, r8)
            goto L_0x00d6
        L_0x00a1:
            com.urbanairship.actions.g r8 = com.urbanairship.actions.C35497g.m146465d(r1)
            com.urbanairship.actions.g r8 = r8.mo106383p(r9)
            com.urbanairship.actions.g r8 = r8.mo106381n(r4)
            r8.mo106375h()
            goto L_0x00d6
        L_0x00b1:
            boolean r8 = r8.mo106271v()
            if (r8 == 0) goto L_0x00c7
            com.urbanairship.actions.g r8 = com.urbanairship.actions.C35497g.m146465d(r1)
            com.urbanairship.actions.g r8 = r8.mo106383p(r9)
            com.urbanairship.actions.g r8 = r8.mo106381n(r4)
            r8.mo106375h()
            goto L_0x00d6
        L_0x00c7:
            com.urbanairship.actions.g r8 = com.urbanairship.actions.C35497g.m146465d(r3)
            com.urbanairship.actions.g r8 = r8.mo106383p(r9)
            com.urbanairship.actions.g r8 = r8.mo106381n(r4)
            r8.mo106375h()
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.accengage.C35448a.mo106239G(com.urbanairship.push.e, com.urbanairship.push.d):void");
    }

    /* renamed from: H */
    public void mo106240H(@C0359n0 C9524n nVar) {
        this.f87320j = nVar;
    }

    /* renamed from: r */
    public void mo17625r() {
        super.mo17625r();
        C36059m.m148406b("Accengage Init", new Object[0]);
        String l = this.f87319i.mo106284a(mo107785o(), f87312s).mo18801A(f87313t).mo18769l();
        this.f87321k = l;
        if (l != null) {
            this.f87317g.mo17781N(new C35449a());
        }
        this.f87318h.mo19394K(new C35450b());
        mo106238F();
    }

    @C0344h1
    public C35448a(@C0359n0 Context context, @C0359n0 AirshipConfigOptions airshipConfigOptions, @C0359n0 C36071u uVar, @C0359n0 C36075v vVar, @C0359n0 C9008d dVar, @C0359n0 C9537t tVar, @C0359n0 C35454a aVar) {
        super(context, uVar);
        this.f87316f = vVar;
        this.f87317g = dVar;
        this.f87318h = tVar;
        this.f87319i = aVar;
        this.f87320j = new C35475b(airshipConfigOptions);
    }
}
