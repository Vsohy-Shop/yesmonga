package com.urbanairship.remotedata;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.content.p026pm.C17372c;
import com.urbanairship.C36040b;
import com.urbanairship.C36059m;
import com.urbanairship.C36062p;
import com.urbanairship.C36071u;
import com.urbanairship.C36075v;
import com.urbanairship.UAirship;
import com.urbanairship.app.C36030b;
import com.urbanairship.app.C36031c;
import com.urbanairship.app.C36039i;
import com.urbanairship.config.C9061a;
import com.urbanairship.http.C9116c;
import com.urbanairship.http.RequestException;
import com.urbanairship.job.C9302e;
import com.urbanairship.job.C9304f;
import com.urbanairship.job.JobResult;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.locale.C9341a;
import com.urbanairship.locale.C9342b;
import com.urbanairship.push.C9493j;
import com.urbanairship.push.C9537t;
import com.urbanairship.push.PushMessage;
import com.urbanairship.reactive.C9551d;
import com.urbanairship.reactive.C9588g;
import com.urbanairship.reactive.C9593i;
import com.urbanairship.remotedata.C9622l;
import com.urbanairship.util.C9641c;
import com.urbanairship.util.C9642c0;
import com.urbanairship.util.C9656j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.remotedata.j */
public class C9619j extends C36040b {

    /* renamed from: A */
    public static final String f26313A = "ua_remotedata.db";

    /* renamed from: B */
    public static final String f26314B = "com.urbanairship.remotedata.LAST_MODIFIED";

    /* renamed from: C */
    public static final String f26315C = "com.urbanairship.remotedata.FOREGROUND_REFRESH_INTERVAL";

    /* renamed from: D */
    public static final String f26316D = "com.urbanairship.remotedata.LAST_REFRESH_TIME";

    /* renamed from: E */
    public static final String f26317E = "com.urbanairship.remotedata.LAST_REFRESH_METADATA";

    /* renamed from: F */
    public static final String f26318F = "com.urbanairship.remotedata.LAST_REFRESH_APP_VERSION";

    /* renamed from: G */
    public static final String f26319G = "com.urbanairship.remotedata.RANDOM_VALUE";

    /* renamed from: H */
    public static final String f26320H = "url";

    /* renamed from: I */
    public static final String f26321I = "last_modified";

    /* renamed from: J */
    public static final long f26322J = 10000;

    /* renamed from: K */
    public static final int f26323K = 9999;
    @C0344h1

    /* renamed from: L */
    public static final String f26324L = "ACTION_REFRESH";

    /* renamed from: f */
    public final C9302e f26325f;

    /* renamed from: g */
    public final C36071u f26326g;

    /* renamed from: h */
    public Handler f26327h;

    /* renamed from: i */
    public final C36030b f26328i;

    /* renamed from: j */
    public final C9342b f26329j;

    /* renamed from: k */
    public final C9537t f26330k;

    /* renamed from: l */
    public final C9656j f26331l;

    /* renamed from: m */
    public final C9622l f26332m;

    /* renamed from: n */
    public final C36075v f26333n;

    /* renamed from: o */
    public final C9642c0 f26334o;

    /* renamed from: p */
    public boolean f26335p;

    /* renamed from: q */
    public final Object f26336q;
    @C0359n0

    /* renamed from: r */
    public final List<C36062p<Boolean>> f26337r;

    /* renamed from: s */
    public volatile boolean f26338s;
    @C0344h1

    /* renamed from: t */
    public final C9593i<Set<C9625m>> f26339t;
    @C0344h1

    /* renamed from: u */
    public final HandlerThread f26340u;
    @C0344h1

    /* renamed from: v */
    public final C9628n f26341v;

    /* renamed from: w */
    public final C36031c f26342w;

    /* renamed from: x */
    public final C9341a f26343x;

    /* renamed from: y */
    public final C9493j f26344y;

    /* renamed from: z */
    public final C36075v.C36077b f26345z;

    /* renamed from: com.urbanairship.remotedata.j$a */
    public class C9620a extends C36039i {
        public C9620a() {
        }

        /* renamed from: a */
        public void mo17410a(long j) {
            boolean unused = C9619j.this.f26338s = false;
            if (C9619j.this.mo19559m0()) {
                C9619j.this.mo19543O();
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9619j(@androidx.annotation.C0359n0 android.content.Context r13, @androidx.annotation.C0359n0 com.urbanairship.C36071u r14, @androidx.annotation.C0359n0 com.urbanairship.config.C9061a r15, @androidx.annotation.C0359n0 com.urbanairship.C36075v r16, @androidx.annotation.C0359n0 com.urbanairship.push.C9537t r17, @androidx.annotation.C0359n0 com.urbanairship.locale.C9342b r18, @androidx.annotation.C0359n0 com.urbanairship.base.C9002b<com.urbanairship.C36078w> r19) {
        /*
            r12 = this;
            com.urbanairship.app.g r5 = com.urbanairship.app.C36035g.m148341t(r13)
            com.urbanairship.job.e r6 = com.urbanairship.job.C9302e.m34896n(r13)
            com.urbanairship.util.j r9 = com.urbanairship.util.C9656j.f26468a
            com.urbanairship.remotedata.l r10 = new com.urbanairship.remotedata.l
            r3 = r15
            r0 = r19
            r10.<init>(r15, r0)
            com.urbanairship.util.c0 r11 = com.urbanairship.util.C9642c0.m36130c()
            r0 = r12
            r1 = r13
            r2 = r14
            r4 = r16
            r7 = r18
            r8 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.remotedata.C9619j.<init>(android.content.Context, com.urbanairship.u, com.urbanairship.config.a, com.urbanairship.v, com.urbanairship.push.t, com.urbanairship.locale.b, com.urbanairship.base.b):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ C9551d m36012U(Collection collection) {
        return C9551d.m35860o(this.f26341v.mo19579v(collection)).mo19468v(C9588g.m35926a(this.f26327h.getLooper()));
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ void m36013V(Locale locale) {
        if (mo19559m0()) {
            mo19544P(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ void m36014W(PushMessage pushMessage, boolean z) {
        if (pushMessage.mo19165L()) {
            mo19543O();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m36015X() {
        if (mo19559m0()) {
            mo19543O();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m36016Y(Set set) {
        this.f26339t.mo17490c(set);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ Set m36017Z(Map map, Uri uri, C9322a aVar) {
        String str;
        List list = (List) map.get("Last-Modified");
        if (list == null || list.isEmpty()) {
            str = null;
        } else {
            str = (String) list.get(0);
        }
        return C9625m.m36056h(aVar, mo19542N(uri, str));
    }

    /* renamed from: a0 */
    public static /* synthetic */ Map m36018a0(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C9625m mVar = (C9625m) it.next();
            Collection collection = (Collection) hashMap.get(mVar.mo19567e());
            if (collection == null) {
                collection = new HashSet();
                hashMap.put(mVar.mo19567e(), collection);
            }
            collection.add(mVar);
        }
        return hashMap;
    }

    /* renamed from: b0 */
    public static /* synthetic */ Collection m36019b0(Collection collection, Map map) {
        HashSet hashSet = new HashSet();
        Iterator it = new HashSet(collection).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Collection collection2 = (Collection) map.get(str);
            if (collection2 != null) {
                hashSet.addAll(collection2);
            } else {
                hashSet.add(C9625m.m36053a(str));
            }
        }
        return hashSet;
    }

    /* renamed from: A */
    public void mo17591A() {
        this.f26330k.mo19384A0(this.f26344y);
        this.f26328i.mo18481b(this.f26342w);
        this.f26329j.mo18870f(this.f26343x);
        this.f26333n.mo107876j(this.f26345z);
        this.f26341v.mo19630b();
        this.f26340u.quit();
    }

    /* renamed from: M */
    public final C9551d<Set<C9625m>> mo19541M(Collection<String> collection) {
        return C9551d.m35856h(new C9615f(this, collection));
    }

    @C0359n0
    /* renamed from: N */
    public final C9323b mo19542N(@C0363p0 Uri uri, @C0363p0 String str) {
        String str2;
        C9323b.C9325b y = C9323b.m35017y();
        if (uri == null) {
            str2 = null;
        } else {
            str2 = uri.toString();
        }
        return y.mo18826j("url", str2).mo18826j(f26321I, str).mo18817a();
    }

    /* renamed from: O */
    public final void mo19543O() {
        mo19544P(2);
    }

    /* renamed from: P */
    public final void mo19544P(int i) {
        C9304f j = C9304f.m34907i().mo18725k(f26324L).mo18732r(true).mo18726l(C9619j.class).mo18728n(i).mo18724j();
        synchronized (this.f26336q) {
            if (i == 0) {
                this.f26335p = true;
            }
            this.f26325f.mo18704c(j);
        }
    }

    /* renamed from: Q */
    public long mo19545Q() {
        return this.f26326g.mo107846i(f26315C, 10000);
    }

    /* renamed from: R */
    public int mo19546R() {
        int g = this.f26326g.mo107844g(f26319G, -1);
        if (g != -1) {
            return g;
        }
        int nextInt = new Random().nextInt(10000);
        this.f26326g.mo107852q(f26319G, nextInt);
        return nextInt;
    }

    /* renamed from: S */
    public final boolean mo19547S() {
        return mo19548T(this.f26326g.mo107845h(f26317E).mo18749A());
    }

    /* renamed from: T */
    public boolean mo19548T(@C0359n0 C9323b bVar) {
        return bVar.equals(mo19542N(this.f26332m.mo19562e(this.f26329j.mo18866b(), mo19546R()), this.f26326g.mo107848k(f26314B, (String) null)));
    }

    /* renamed from: c0 */
    public final void mo19549c0(@C0359n0 Set<C9625m> set) {
        this.f26327h.post(new C9611b(this, set));
    }

    @C0359n0
    /* renamed from: d0 */
    public final JobResult mo19550d0() {
        synchronized (this.f26336q) {
            this.f26335p = true;
        }
        String str = null;
        if (mo19547S()) {
            str = this.f26326g.mo107848k(f26314B, (String) null);
        }
        try {
            C9116c<C9622l.C9624b> b = this.f26332m.mo19560b(str, this.f26329j.mo18866b(), mo19546R(), new C9610a(this));
            C36059m.m148406b("Received remote data response: %s", b);
            if (b.mo18147i() == 304) {
                mo19551e0(true);
                return JobResult.SUCCESS;
            } else if (b.mo18150l()) {
                String d = b.mo18142d("Last-Modified");
                C9323b N = mo19542N(b.mo18144f().f26362a, d);
                Set<C9625m> set = b.mo18144f().f26363b;
                if (mo19557k0(set)) {
                    this.f26326g.mo107854s(f26317E, N);
                    this.f26326g.mo107856u(f26314B, d);
                    mo19549c0(set);
                    mo19551e0(true);
                    return JobResult.SUCCESS;
                }
                mo19551e0(false);
                return JobResult.RETRY;
            } else {
                mo19551e0(false);
                if (b.mo18149k()) {
                    return JobResult.RETRY;
                }
                return JobResult.SUCCESS;
            }
        } catch (RequestException e) {
            C36059m.m148411g(e, "RemoteDataJobHandler - Failed to refresh data", new Object[0]);
            mo19551e0(false);
            return JobResult.SUCCESS;
        }
    }

    /* renamed from: e0 */
    public final void mo19551e0(boolean z) {
        if (z) {
            this.f26338s = true;
            PackageInfo y = UAirship.m146201y();
            if (y != null) {
                this.f26326g.mo107853r(f26318F, C17372c.m79910c(y));
            }
            this.f26326g.mo107853r(f26316D, this.f26331l.mo19623a());
        }
        synchronized (this.f26336q) {
            if (z) {
                this.f26335p = false;
            }
            for (C36062p<Boolean> g : this.f26337r) {
                g.mo107828g(Boolean.valueOf(z));
            }
            this.f26337r.clear();
        }
    }

    @C0359n0
    /* renamed from: f0 */
    public C9551d<C9625m> mo19552f0(@C0359n0 String str) {
        return mo19553g0(Collections.singleton(str)).mo19464m(new C9618i());
    }

    @C0359n0
    /* renamed from: g0 */
    public C9551d<Collection<C9625m>> mo19553g0(@C0359n0 Collection<String> collection) {
        return C9551d.m35854e(mo19541M(collection), this.f26339t).mo19465p(new C9616g()).mo19465p(new C9617h(collection)).mo19462i();
    }

    @C0359n0
    /* renamed from: h0 */
    public C9551d<Collection<C9625m>> mo19554h0(@C0359n0 String... strArr) {
        return mo19553g0(Arrays.asList(strArr));
    }

    /* renamed from: i0 */
    public C36062p<Boolean> mo19555i0() {
        return mo19556j0(false);
    }

    /* renamed from: j0 */
    public C36062p<Boolean> mo19556j0(boolean z) {
        C36062p<Boolean> pVar = new C36062p<>();
        synchronized (this.f26336q) {
            if (!z) {
                if (!mo19559m0()) {
                    pVar.mo107828g(Boolean.TRUE);
                }
            }
            if (this.f26334o.mo19605b(mo107785o())) {
                this.f26337r.add(pVar);
                if (!this.f26335p) {
                    mo19544P(0);
                }
            } else {
                pVar.mo107828g(Boolean.FALSE);
            }
        }
        return pVar;
    }

    /* renamed from: k0 */
    public final boolean mo19557k0(@C0359n0 Set<C9625m> set) {
        return this.f26341v.mo19576s() && this.f26341v.mo19580w(set);
    }

    /* renamed from: l0 */
    public void mo19558l0(long j) {
        this.f26326g.mo107853r(f26315C, j);
    }

    /* renamed from: m0 */
    public final boolean mo19559m0() {
        if (!this.f26333n.mo107873g() || !this.f26328i.mo18483d()) {
            return false;
        }
        if (!mo19547S()) {
            return true;
        }
        long i = this.f26326g.mo107846i(f26318F, 0);
        PackageInfo y = UAirship.m146201y();
        if (y != null && C17372c.m79910c(y) != i) {
            return true;
        }
        if (!this.f26338s) {
            if (mo19545Q() <= this.f26331l.mo19623a() - this.f26326g.mo107846i(f26316D, -1)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    public void mo17625r() {
        super.mo17625r();
        this.f26340u.start();
        this.f26327h = new Handler(this.f26340u.getLooper());
        this.f26328i.mo18485f(this.f26342w);
        this.f26330k.mo19396L(this.f26344y);
        this.f26329j.mo18865a(this.f26343x);
        this.f26333n.mo107868a(this.f26345z);
        if (mo19559m0()) {
            mo19543O();
        }
    }

    @C0348i1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: x */
    public JobResult mo17814x(@C0359n0 UAirship uAirship, @C0359n0 C9304f fVar) {
        if (!this.f26333n.mo107873g()) {
            return JobResult.SUCCESS;
        }
        if (f26324L.equals(fVar.mo18712a())) {
            return mo19550d0();
        }
        return JobResult.SUCCESS;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: y */
    public void mo17816y() {
        mo19544P(0);
    }

    @C0344h1
    public C9619j(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C9061a aVar, @C0359n0 C36075v vVar, @C0359n0 C36030b bVar, @C0359n0 C9302e eVar, @C0359n0 C9342b bVar2, @C0359n0 C9537t tVar, @C0359n0 C9656j jVar, @C0359n0 C9622l lVar, @C0359n0 C9642c0 c0Var) {
        super(context, uVar);
        this.f26335p = false;
        this.f26336q = new Object();
        this.f26337r = new ArrayList();
        this.f26338s = false;
        this.f26342w = new C9620a();
        this.f26343x = new C9612c(this);
        this.f26344y = new C9613d(this);
        this.f26345z = new C9614e(this);
        this.f26325f = eVar;
        this.f26341v = new C9628n(context, aVar.mo17958a().f87128a, f26313A);
        this.f26326g = uVar;
        this.f26333n = vVar;
        this.f26340u = new C9641c("remote data store");
        this.f26339t = C9593i.m35933y();
        this.f26328i = bVar;
        this.f26329j = bVar2;
        this.f26330k = tVar;
        this.f26331l = jVar;
        this.f26332m = lVar;
        this.f26334o = c0Var;
    }
}
