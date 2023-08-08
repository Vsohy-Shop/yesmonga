package com.urbanairship.channel;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36040b;
import com.urbanairship.C36059m;
import com.urbanairship.C36062p;
import com.urbanairship.C36071u;
import com.urbanairship.C36075v;
import com.urbanairship.UAirship;
import com.urbanairship.app.C36030b;
import com.urbanairship.app.C36039i;
import com.urbanairship.channel.C9029l;
import com.urbanairship.config.C9061a;
import com.urbanairship.http.C9116c;
import com.urbanairship.http.RequestException;
import com.urbanairship.job.C9302e;
import com.urbanairship.job.C9304f;
import com.urbanairship.job.JobResult;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.locale.C9342b;
import com.urbanairship.util.C9642c0;
import com.urbanairship.util.C9652h;
import com.urbanairship.util.C9656j;
import com.urbanairship.util.C9669o0;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.urbanairship.channel.d */
public class C9008d extends C36040b {

    /* renamed from: A */
    public static final long f24206A = 600000;

    /* renamed from: B */
    public static final String f24207B = "com.urbanairship.push.CHANNEL_ID";

    /* renamed from: C */
    public static final String f24208C = "com.urbanairship.push.TAGS";

    /* renamed from: D */
    public static final String f24209D = "com.urbanairship.push.LAST_REGISTRATION_TIME";

    /* renamed from: E */
    public static final String f24210E = "com.urbanairship.push.LAST_REGISTRATION_PAYLOAD";

    /* renamed from: F */
    public static final String f24211F = "com.urbanairship.push.ATTRIBUTE_DATA_STORE";

    /* renamed from: G */
    public static final String f24212G = "com.urbanairship.push.PENDING_TAG_GROUP_MUTATIONS";

    /* renamed from: H */
    public static final String f24213H = "com.urbanairship.push.PENDING_SUBSCRIPTION_MUTATIONS";
    @C0359n0

    /* renamed from: w */
    public static final String f24214w = "com.urbanairship.CHANNEL_CREATED";

    /* renamed from: x */
    public static final String f24215x = "ACTION_UPDATE_CHANNEL";

    /* renamed from: y */
    public static final String f24216y = "EXTRA_FORCE_FULL_UPDATE";

    /* renamed from: z */
    public static final long f24217z = 86400000;

    /* renamed from: f */
    public final String f24218f;

    /* renamed from: g */
    public final C9027k f24219g;

    /* renamed from: h */
    public final C9302e f24220h;

    /* renamed from: i */
    public final C9342b f24221i;

    /* renamed from: j */
    public final C9656j f24222j;

    /* renamed from: k */
    public final C36075v f24223k;

    /* renamed from: l */
    public final List<C9016e> f24224l;

    /* renamed from: m */
    public final List<C9015g> f24225m;

    /* renamed from: n */
    public final Object f24226n;

    /* renamed from: o */
    public final C9059y f24227o;

    /* renamed from: p */
    public final C9026j f24228p;

    /* renamed from: q */
    public final C9052u f24229q;
    @C0359n0

    /* renamed from: r */
    public final C9652h<Set<String>> f24230r;

    /* renamed from: s */
    public final C9061a f24231s;

    /* renamed from: t */
    public final C36030b f24232t;

    /* renamed from: u */
    public boolean f24233u;

    /* renamed from: v */
    public boolean f24234v;

    /* renamed from: com.urbanairship.channel.d$a */
    public class C9009a extends C36039i {
        public C9009a() {
        }

        /* renamed from: a */
        public void mo17410a(long j) {
            C9008d.this.mo17784Q();
        }
    }

    /* renamed from: com.urbanairship.channel.d$b */
    public class C9010b implements C9016e {

        /* renamed from: a */
        public final /* synthetic */ C36062p f24236a;

        public C9010b(C36062p pVar) {
            this.f24236a = pVar;
        }

        /* renamed from: a */
        public void mo17818a(@C0359n0 String str) {
            this.f24236a.mo107828g(str);
            C9008d.this.mo17807q0(this);
        }

        /* renamed from: b */
        public void mo17819b(@C0359n0 String str) {
            this.f24236a.mo107828g(str);
            C9008d.this.mo17807q0(this);
        }
    }

    /* renamed from: com.urbanairship.channel.d$c */
    public class C9011c extends C9053v {
        public C9011c() {
        }

        /* renamed from: e */
        public void mo17820e(boolean z, @C0359n0 Set<String> set, @C0359n0 Set<String> set2) {
            Set set3;
            synchronized (C9008d.this.f24226n) {
                if (!C9008d.this.f24223k.mo107874h(32)) {
                    C36059m.m148421q("AirshipChannel - Unable to apply tag group edits when opted out of tags and attributes.", new Object[0]);
                    return;
                }
                if (z) {
                    set3 = new HashSet();
                } else {
                    set3 = C9008d.this.mo17801h0();
                }
                set3.addAll(set);
                set3.removeAll(set2);
                C9008d.this.mo17812v0(set3);
            }
        }
    }

    /* renamed from: com.urbanairship.channel.d$d */
    public class C9012d extends C9060z {
        public C9012d() {
        }

        /* renamed from: c */
        public boolean mo17821c(@C0359n0 String str) {
            if (!C9008d.this.f24233u || !"device".equals(str)) {
                return true;
            }
            C36059m.m148409e("Unable to add tags to `%s` tag group when `channelTagRegistrationEnabled` is true.", "device");
            return false;
        }

        /* renamed from: e */
        public void mo17822e(@C0359n0 List<C9004a0> list) {
            if (!C9008d.this.f24223k.mo107874h(32)) {
                C36059m.m148421q("AirshipChannel - Unable to apply tag edits when opted out of tags and attributes.", new Object[0]);
            } else if (!list.isEmpty()) {
                C9008d.this.f24227o.mo17945a(list);
                C9008d.this.mo17784Q();
            }
        }
    }

    /* renamed from: com.urbanairship.channel.d$e */
    public class C9013e extends C9022g {
        public C9013e(C9656j jVar) {
            super(jVar);
        }

        /* renamed from: c */
        public void mo17823c(@C0359n0 List<C9025i> list) {
            if (!C9008d.this.f24223k.mo107874h(32)) {
                C36059m.m148421q("AirshipChannel - Unable to apply attribute edits when opted out of tags and attributes.", new Object[0]);
            } else if (!list.isEmpty()) {
                C9008d.this.f24228p.mo17842b(list);
                C9008d.this.mo17784Q();
            }
        }
    }

    /* renamed from: com.urbanairship.channel.d$f */
    public class C9014f extends C9049r {
        public C9014f(C9656j jVar) {
            super(jVar);
        }

        /* renamed from: c */
        public void mo17824c(@C0359n0 List<C9051t> list) {
            if (!C9008d.this.f24223k.mo107874h(32)) {
                C36059m.m148421q("AirshipChannel - Unable to apply subscription list edits when opted out of tags and attributes.", new Object[0]);
            } else if (!list.isEmpty()) {
                C9008d.this.f24229q.mo17918a(list);
                C9008d.this.mo17784Q();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: com.urbanairship.channel.d$g */
    public interface C9015g {
        @C0348i1
        @C0359n0
        /* renamed from: a */
        C9029l.C9031b mo17825a(@C0359n0 C9029l.C9031b bVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9008d(@androidx.annotation.C0359n0 android.content.Context r15, @androidx.annotation.C0359n0 com.urbanairship.C36071u r16, @androidx.annotation.C0359n0 com.urbanairship.config.C9061a r17, @androidx.annotation.C0359n0 com.urbanairship.C36075v r18, @androidx.annotation.C0359n0 com.urbanairship.locale.C9342b r19) {
        /*
            r14 = this;
            r2 = r16
            com.urbanairship.job.e r6 = com.urbanairship.job.C9302e.m34896n(r15)
            com.urbanairship.util.j r7 = com.urbanairship.util.C9656j.f26468a
            com.urbanairship.channel.k r8 = new com.urbanairship.channel.k
            r3 = r17
            r8.<init>(r3)
            com.urbanairship.channel.j r9 = new com.urbanairship.channel.j
            com.urbanairship.channel.f r0 = com.urbanairship.channel.C9017f.m33577a(r17)
            com.urbanairship.channel.n r1 = new com.urbanairship.channel.n
            java.lang.String r4 = "com.urbanairship.push.ATTRIBUTE_DATA_STORE"
            r1.<init>(r2, r4)
            r9.<init>(r0, r1)
            com.urbanairship.channel.y r10 = new com.urbanairship.channel.y
            com.urbanairship.channel.w r0 = com.urbanairship.channel.C9054w.m33727a(r17)
            com.urbanairship.channel.p r1 = new com.urbanairship.channel.p
            java.lang.String r4 = "com.urbanairship.push.PENDING_TAG_GROUP_MUTATIONS"
            r1.<init>(r2, r4)
            r10.<init>(r0, r1)
            com.urbanairship.channel.u r11 = new com.urbanairship.channel.u
            com.urbanairship.channel.q r0 = com.urbanairship.channel.C9046q.m33682a(r17)
            com.urbanairship.channel.o r1 = new com.urbanairship.channel.o
            java.lang.String r4 = "com.urbanairship.push.PENDING_SUBSCRIPTION_MUTATIONS"
            r1.<init>(r2, r4)
            r11.<init>(r0, r1)
            com.urbanairship.util.h r12 = new com.urbanairship.util.h
            r12.<init>()
            com.urbanairship.app.g r13 = com.urbanairship.app.C36035g.m148341t(r15)
            r0 = r14
            r1 = r15
            r4 = r18
            r5 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.channel.C9008d.<init>(android.content.Context, com.urbanairship.u, com.urbanairship.config.a, com.urbanairship.v, com.urbanairship.locale.b):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public /* synthetic */ void m33520k0(boolean z, C36062p pVar) {
        Set<String> a = this.f24230r.mo19620a();
        if (a == null && (a = this.f24229q.mo17924g()) != null) {
            this.f24230r.mo19622c(new HashSet(a), 600000);
        }
        if (a != null) {
            this.f24229q.mo17920c(a);
            if (z) {
                for (C9051t a2 : mo17798e0()) {
                    a2.mo17911a(a);
                }
            }
        }
        pVar.mo107828g(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public /* synthetic */ void m33521l0() {
        if (!this.f24223k.mo107874h(32)) {
            synchronized (this.f24226n) {
                mo107786p().mo107859x(f24208C);
            }
            this.f24227o.mo17947c();
            this.f24228p.mo17843c();
            this.f24229q.mo17923f();
            this.f24229q.mo17922e();
            this.f24230r.mo19621b();
        }
        mo17817y0();
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public /* synthetic */ void m33522m0(Locale locale) {
        mo17784Q();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: L */
    public void mo17779L(@C0359n0 C9024h hVar) {
        this.f24228p.mo17841a(hVar);
    }

    /* renamed from: M */
    public void mo17780M(@C0359n0 C9016e eVar) {
        this.f24224l.add(eVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: N */
    public void mo17781N(@C0359n0 C9015g gVar) {
        this.f24225m.add(gVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: O */
    public void mo17782O(@C0359n0 C9050s sVar) {
        this.f24229q.mo17919b(sVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: P */
    public void mo17783P(@C0359n0 C9058x xVar) {
        this.f24227o.mo17946b(xVar);
    }

    /* renamed from: Q */
    public final void mo17784Q() {
        mo17785R(false, 2);
    }

    /* renamed from: R */
    public final void mo17785R(boolean z, int i) {
        if (mo17803j0() && this.f24219g.mo17849c()) {
            this.f24220h.mo18704c(C9304f.m34907i().mo18725k(f24215x).mo18729o(C9323b.m35017y().mo18824h(f24216y, z).mo18817a()).mo18732r(true).mo18726l(C9008d.class).mo18728n(i).mo18724j());
        }
    }

    @C0359n0
    /* renamed from: S */
    public C9022g mo17786S() {
        return new C9013e(this.f24222j);
    }

    @C0359n0
    /* renamed from: T */
    public C9049r mo17787T() {
        return new C9014f(this.f24222j);
    }

    @C0359n0
    /* renamed from: U */
    public C9060z mo17788U() {
        return new C9012d();
    }

    @C0359n0
    /* renamed from: V */
    public C9053v mo17789V() {
        return new C9011c();
    }

    /* renamed from: W */
    public void mo17790W() {
        if (mo17802i0()) {
            this.f24234v = false;
            mo17784Q();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: X */
    public C36062p<String> mo17791X() {
        C36062p<String> pVar = new C36062p<>();
        C9010b bVar = new C9010b(pVar);
        mo17780M(bVar);
        String Z = mo17793Z();
        if (Z != null) {
            pVar.mo107828g(Z);
            mo17807q0(bVar);
        }
        return pVar;
    }

    /* renamed from: Y */
    public boolean mo17792Y() {
        return this.f24233u;
    }

    @C0363p0
    /* renamed from: Z */
    public String mo17793Z() {
        return mo107786p().mo107848k(f24207B, (String) null);
    }

    @C0363p0
    /* renamed from: a0 */
    public final C9029l mo17794a0() {
        JsonValue h = mo107786p().mo107845h(f24210E);
        if (h.mo18780w()) {
            return null;
        }
        try {
            return C9029l.m33616b(h);
        } catch (JsonException e) {
            C36059m.m148411g(e, "AirshipChannel - Failed to parse payload from JSON.", new Object[0]);
            return null;
        }
    }

    /* renamed from: b0 */
    public final long mo17795b0() {
        long i = mo107786p().mo107846i(f24209D, 0);
        if (i <= System.currentTimeMillis()) {
            return i;
        }
        C36059m.m148419o("Resetting last registration time.", new Object[0]);
        mo107786p().mo107852q(f24209D, 0);
        return 0;
    }

    @C0348i1
    @C0359n0
    /* renamed from: c0 */
    public final C9029l mo17796c0() {
        Set<String> set;
        boolean Y = mo17792Y();
        C9029l.C9031b bVar = new C9029l.C9031b();
        if (Y) {
            set = mo17801h0();
        } else {
            set = null;
        }
        C9029l.C9031b H = bVar.mo17872O(Y, set).mo17865H(this.f24232t.mo18483d());
        int b = this.f24231s.mo17959b();
        if (b == 1) {
            H.mo17864G("amazon");
        } else if (b == 2) {
            H.mo17864G("android");
        } else {
            throw new IllegalStateException("Unable to get platform");
        }
        if (this.f24223k.mo107874h(16)) {
            if (UAirship.m146201y() != null) {
                H.mo17878z(UAirship.m146201y().versionName);
            }
            H.mo17859B(C9642c0.m36129a());
            H.mo17863F(Build.MODEL);
            H.mo17877y(Integer.valueOf(Build.VERSION.SDK_INT));
        }
        if (this.f24223k.mo107873g()) {
            H.mo17873P(TimeZone.getDefault().getID());
            Locale b2 = this.f24221i.mo18866b();
            if (!C9669o0.m36224e(b2.getCountry())) {
                H.mo17861D(b2.getCountry());
            }
            if (!C9669o0.m36224e(b2.getLanguage())) {
                H.mo17866I(b2.getLanguage());
            }
            H.mo17870M(UAirship.m146181I());
            for (C9015g a : this.f24225m) {
                H = a.mo17825a(H);
            }
        }
        return H.mo17875w();
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d0 */
    public List<C9025i> mo17797d0() {
        return this.f24228p.mo17844d();
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e0 */
    public List<C9051t> mo17798e0() {
        return this.f24229q.mo17925h();
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f0 */
    public List<C9004a0> mo17799f0() {
        return this.f24227o.mo17948d();
    }

    @C0359n0
    /* renamed from: g0 */
    public C36062p<Set<String>> mo17800g0(boolean z) {
        C36062p<Set<String>> pVar = new C36062p<>();
        if (!this.f24223k.mo107874h(32)) {
            pVar.mo107828g(Collections.emptySet());
        }
        this.f89037d.execute(new C9003a(this, z, pVar));
        return pVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        return r2;
     */
    @androidx.annotation.C0359n0
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set<java.lang.String> mo17801h0() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f24226n
            monitor-enter(r0)
            com.urbanairship.v r1 = r5.f24223k     // Catch:{ all -> 0x0063 }
            r2 = 1
            int[] r2 = new int[r2]     // Catch:{ all -> 0x0063 }
            r3 = 0
            r4 = 32
            r2[r3] = r4     // Catch:{ all -> 0x0063 }
            boolean r1 = r1.mo107874h(r2)     // Catch:{ all -> 0x0063 }
            if (r1 != 0) goto L_0x0019
            java.util.Set r1 = java.util.Collections.emptySet()     // Catch:{ all -> 0x0063 }
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            return r1
        L_0x0019:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0063 }
            r1.<init>()     // Catch:{ all -> 0x0063 }
            com.urbanairship.u r2 = r5.mo107786p()     // Catch:{ all -> 0x0063 }
            java.lang.String r3 = "com.urbanairship.push.TAGS"
            com.urbanairship.json.JsonValue r2 = r2.mo107845h(r3)     // Catch:{ all -> 0x0063 }
            boolean r3 = r2.mo18776t()     // Catch:{ all -> 0x0063 }
            if (r3 == 0) goto L_0x0050
            com.urbanairship.json.a r2 = r2.mo18784z()     // Catch:{ all -> 0x0063 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0063 }
        L_0x0036:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0063 }
            if (r3 == 0) goto L_0x0050
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0063 }
            com.urbanairship.json.JsonValue r3 = (com.urbanairship.json.JsonValue) r3     // Catch:{ all -> 0x0063 }
            boolean r4 = r3.mo18783y()     // Catch:{ all -> 0x0063 }
            if (r4 == 0) goto L_0x0036
            java.lang.String r3 = r3.mo18769l()     // Catch:{ all -> 0x0063 }
            r1.add(r3)     // Catch:{ all -> 0x0063 }
            goto L_0x0036
        L_0x0050:
            java.util.Set r2 = com.urbanairship.channel.C9006b0.m33508b(r1)     // Catch:{ all -> 0x0063 }
            int r1 = r1.size()     // Catch:{ all -> 0x0063 }
            int r3 = r2.size()     // Catch:{ all -> 0x0063 }
            if (r1 == r3) goto L_0x0061
            r5.mo17812v0(r2)     // Catch:{ all -> 0x0063 }
        L_0x0061:
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            return r2
        L_0x0063:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.channel.C9008d.mo17801h0():java.util.Set");
    }

    /* renamed from: i0 */
    public boolean mo17802i0() {
        return this.f24234v;
    }

    /* renamed from: j0 */
    public final boolean mo17803j0() {
        if (!mo107787s()) {
            return false;
        }
        if (mo17793Z() != null) {
            return true;
        }
        if (this.f24234v || !this.f24223k.mo107873g()) {
            return false;
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: n */
    public int mo17620n() {
        return 7;
    }

    @C0348i1
    @C0359n0
    /* renamed from: n0 */
    public final JobResult mo17804n0() {
        C9029l c0 = mo17796c0();
        try {
            C9116c<String> a = this.f24219g.mo17847a(c0);
            if (a.mo18150l()) {
                String f = a.mo18144f();
                C36059m.m148413i("Airship channel created: %s", f);
                mo107786p().mo107856u(f24207B, f);
                this.f24227o.mo17949e(f, false);
                this.f24228p.mo17845e(f, false);
                this.f24229q.mo17927j(f, false);
                mo17811u0(c0);
                for (C9016e a2 : this.f24224l) {
                    a2.mo17818a(f);
                }
                if (this.f24231s.mo17958a().f87150w) {
                    Intent addCategory = new Intent(f24214w).setPackage(UAirship.m146180A()).addCategory(UAirship.m146180A());
                    addCategory.putExtra("channel_id", f);
                    mo107785o().sendBroadcast(addCategory);
                }
                mo17785R(false, 0);
                return JobResult.SUCCESS;
            } else if (a.mo18149k() || a.mo18151m()) {
                C36059m.m148406b("Channel registration failed with status: %s, will retry", Integer.valueOf(a.mo18147i()));
                return JobResult.RETRY;
            } else {
                C36059m.m148406b("Channel registration failed with status: %s", Integer.valueOf(a.mo18147i()));
                return JobResult.SUCCESS;
            }
        } catch (RequestException e) {
            C36059m.m148407c(e, "Channel registration failed, will retry", new Object[0]);
            return JobResult.RETRY;
        }
    }

    @C0348i1
    @C0359n0
    /* renamed from: o0 */
    public final JobResult mo17805o0(boolean z) {
        JobResult jobResult;
        String Z = mo17793Z();
        if (Z == null) {
            jobResult = mo17804n0();
        } else {
            jobResult = mo17815x0(Z, z);
        }
        JobResult jobResult2 = JobResult.SUCCESS;
        if (jobResult != jobResult2) {
            return jobResult;
        }
        if (mo17793Z() != null) {
            if (this.f24223k.mo107874h(32)) {
                boolean f = this.f24228p.mo17846f();
                boolean f2 = this.f24227o.mo17950f();
                boolean k = this.f24229q.mo17928k();
                if (!f || !f2 || !k) {
                    return JobResult.RETRY;
                }
            }
        }
        return jobResult2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: p0 */
    public void mo17806p0(@C0359n0 List<C9051t> list) {
        this.f24229q.mo17921d(list);
    }

    /* renamed from: q0 */
    public void mo17807q0(@C0359n0 C9016e eVar) {
        this.f24224l.remove(eVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: r */
    public void mo17625r() {
        super.mo17625r();
        boolean z = false;
        this.f24227o.mo17949e(mo17793Z(), false);
        this.f24228p.mo17845e(mo17793Z(), false);
        this.f24229q.mo17927j(mo17793Z(), false);
        if (C36059m.m148412h() < 7 && !C9669o0.m36224e(mo17793Z())) {
            StringBuilder sb = new StringBuilder();
            sb.append(UAirship.m146198j());
            sb.append(" Channel ID");
            mo17793Z();
        }
        if (mo17793Z() == null && this.f24231s.mo17958a().f87146s) {
            z = true;
        }
        this.f24234v = z;
        this.f24223k.mo107868a(new C9005b(this));
        this.f24232t.mo18485f(new C9009a());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: r0 */
    public void mo17808r0(@C0359n0 C9015g gVar) {
        this.f24225m.remove(gVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: s0 */
    public void mo17809s0(@C0359n0 C9050s sVar) {
        this.f24229q.mo17926i(sVar);
    }

    /* renamed from: t0 */
    public void mo17810t0(boolean z) {
        this.f24233u = z;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: u */
    public void mo17628u(@C0359n0 UAirship uAirship) {
        super.mo17628u(uAirship);
        this.f24221i.mo18865a(new C9007c(this));
        mo17784Q();
    }

    /* renamed from: u0 */
    public final void mo17811u0(C9029l lVar) {
        mo107786p().mo107854s(f24210E, lVar);
        mo107786p().mo107853r(f24209D, System.currentTimeMillis());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: v */
    public void mo17629v(boolean z) {
        mo17784Q();
    }

    /* renamed from: v0 */
    public void mo17812v0(@C0359n0 Set<String> set) {
        synchronized (this.f24226n) {
            if (!this.f24223k.mo107874h(32)) {
                C36059m.m148421q("AirshipChannel - Unable to apply attribute edits when opted out of tags and attributes.", new Object[0]);
                return;
            }
            mo107786p().mo107855t(f24208C, JsonValue.m34975U(C9006b0.m33508b(set)));
            mo17784Q();
        }
    }

    /* renamed from: w0 */
    public final boolean mo17813w0(@C0359n0 C9029l lVar) {
        if (!lVar.mo17852a(mo17794a0(), false)) {
            C36059m.m148419o("Should update registration. Channel registration payload has changed.", new Object[0]);
            return true;
        } else if (!this.f24223k.mo107873g() || !this.f24232t.mo18483d() || System.currentTimeMillis() - mo17795b0() < 86400000) {
            return false;
        } else {
            C36059m.m148419o("Should update registration. Time since last registration time is greater than 24 hours.", new Object[0]);
            return true;
        }
    }

    @C0348i1
    @C0359n0
    /* renamed from: x */
    public JobResult mo17814x(@C0359n0 UAirship uAirship, @C0359n0 C9304f fVar) {
        if (!f24215x.equals(fVar.mo18712a())) {
            return JobResult.SUCCESS;
        }
        boolean z = false;
        if (!mo17803j0()) {
            C36059m.m148406b("Channel registration is currently disabled.", new Object[0]);
            return JobResult.SUCCESS;
        }
        JsonValue k = fVar.mo18715d().mo18812k(f24216y);
        if (k != null && k.mo18757c(false)) {
            z = true;
        }
        return mo17805o0(z);
    }

    @C0348i1
    @C0359n0
    /* renamed from: x0 */
    public final JobResult mo17815x0(@C0359n0 String str, boolean z) {
        C9029l lVar;
        C9029l c0 = mo17796c0();
        if (!mo17813w0(c0)) {
            C36059m.m148419o("Channel already up to date.", new Object[0]);
            return JobResult.SUCCESS;
        }
        C36059m.m148419o("Performing channel registration.", new Object[0]);
        if (z) {
            lVar = c0;
        } else {
            try {
                lVar = c0.mo17854d(mo17794a0());
            } catch (RequestException e) {
                C36059m.m148407c(e, "Channel registration failed, will retry", new Object[0]);
                return JobResult.RETRY;
            }
        }
        C9116c<Void> d = this.f24219g.mo17850d(str, lVar);
        if (d.mo18150l()) {
            C36059m.m148413i("Airship channel updated.", new Object[0]);
            mo17811u0(c0);
            for (C9016e b : this.f24224l) {
                b.mo17819b(str);
            }
            mo17785R(false, 0);
            return JobResult.SUCCESS;
        } else if (d.mo18149k() || d.mo18151m()) {
            C36059m.m148406b("Channel registration failed with status: %s, will retry", Integer.valueOf(d.mo18147i()));
            return JobResult.RETRY;
        } else if (d.mo18147i() == 409) {
            C36059m.m148406b("Channel registration failed with status: %s, will clear channel ID and create a new channel.", Integer.valueOf(d.mo18147i()));
            mo17811u0((C9029l) null);
            mo107786p().mo107859x(f24207B);
            return mo17804n0();
        } else {
            C36059m.m148406b("Channel registration failed with status: %s", Integer.valueOf(d.mo18147i()));
            return JobResult.SUCCESS;
        }
    }

    /* renamed from: y */
    public void mo17816y() {
        mo17785R(true, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: y0 */
    public void mo17817y0() {
        mo17784Q();
    }

    @C0344h1
    public C9008d(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C9061a aVar, @C0359n0 C36075v vVar, @C0359n0 C9342b bVar, @C0359n0 C9302e eVar, @C0359n0 C9656j jVar, @C0359n0 C9027k kVar, @C0359n0 C9026j jVar2, @C0359n0 C9059y yVar, @C0359n0 C9052u uVar2, @C0359n0 C9652h<Set<String>> hVar, @C0359n0 C36030b bVar2) {
        super(context, uVar);
        this.f24218f = "device";
        this.f24224l = new CopyOnWriteArrayList();
        this.f24225m = new CopyOnWriteArrayList();
        this.f24226n = new Object();
        this.f24233u = true;
        this.f24231s = aVar;
        this.f24221i = bVar;
        this.f24223k = vVar;
        this.f24220h = eVar;
        this.f24219g = kVar;
        this.f24228p = jVar2;
        this.f24227o = yVar;
        this.f24229q = uVar2;
        this.f24222j = jVar;
        this.f24230r = hVar;
        this.f24232t = bVar2;
    }
}
