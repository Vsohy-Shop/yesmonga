package com.urbanairship.contacts;

import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0386z0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36040b;
import com.urbanairship.C36059m;
import com.urbanairship.C36062p;
import com.urbanairship.C36071u;
import com.urbanairship.C36075v;
import com.urbanairship.UAirship;
import com.urbanairship.app.C36030b;
import com.urbanairship.app.C36035g;
import com.urbanairship.app.C36039i;
import com.urbanairship.channel.C9004a0;
import com.urbanairship.channel.C9008d;
import com.urbanairship.channel.C9016e;
import com.urbanairship.channel.C9022g;
import com.urbanairship.channel.C9024h;
import com.urbanairship.channel.C9025i;
import com.urbanairship.channel.C9029l;
import com.urbanairship.channel.C9051t;
import com.urbanairship.channel.C9058x;
import com.urbanairship.channel.C9060z;
import com.urbanairship.config.C9061a;
import com.urbanairship.contacts.C9091q;
import com.urbanairship.http.C9116c;
import com.urbanairship.http.RequestException;
import com.urbanairship.job.C9302e;
import com.urbanairship.job.C9304f;
import com.urbanairship.job.JobResult;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9652h;
import com.urbanairship.util.C9656j;
import com.urbanairship.util.C9669o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.urbanairship.contacts.e */
public class C9074e extends C36040b {

    /* renamed from: A */
    public static final String f24498A = "Contact.update";

    /* renamed from: B */
    public static final long f24499B = 600000;

    /* renamed from: C */
    public static final long f24500C = 600000;

    /* renamed from: D */
    public static final String f24501D = "com.urbanairship.contacts.OPERATIONS";

    /* renamed from: E */
    public static final String f24502E = "com.urbanairship.contacts.LAST_RESOLVED_DATE_KEY";

    /* renamed from: F */
    public static final String f24503F = "com.urbanairship.contacts.ANON_CONTACT_DATA_KEY";

    /* renamed from: G */
    public static final String f24504G = "com.urbanairship.contacts.LAST_CONTACT_IDENTITY_KEY";

    /* renamed from: H */
    public static final long f24505H = 86400000;
    @C0344h1
    @C0359n0

    /* renamed from: v */
    public static final String f24506v = "com.urbanairship.nameduser.NAMED_USER_ID_KEY";
    @C0344h1
    @C0359n0

    /* renamed from: w */
    public static final String f24507w = "com.urbanairship.nameduser.ATTRIBUTE_MUTATION_STORE_KEY";
    @C0344h1
    @C0359n0

    /* renamed from: x */
    public static final String f24508x = "com.urbanairship.nameduser.PENDING_TAG_GROUP_MUTATIONS_KEY";
    @C0344h1
    @C0359n0

    /* renamed from: y */
    public static final String f24509y = "ACTION_UPDATE_CONTACT";

    /* renamed from: z */
    public static final String f24510z = "Contact.identity";

    /* renamed from: f */
    public final C36071u f24511f;

    /* renamed from: g */
    public final C9302e f24512g;

    /* renamed from: h */
    public final C9008d f24513h;

    /* renamed from: i */
    public final C36075v f24514i;

    /* renamed from: j */
    public final C36030b f24515j;

    /* renamed from: k */
    public final Executor f24516k;

    /* renamed from: l */
    public final C9656j f24517l;

    /* renamed from: m */
    public final C9652h<Map<String, Set<Scope>>> f24518m;

    /* renamed from: n */
    public final List<C9652h<C9102u>> f24519n;

    /* renamed from: o */
    public final Object f24520o;

    /* renamed from: p */
    public final ContactApiClient f24521p;

    /* renamed from: q */
    public boolean f24522q;

    /* renamed from: r */
    public C9088n f24523r;

    /* renamed from: s */
    public List<C9024h> f24524s;

    /* renamed from: t */
    public List<C9058x> f24525t;

    /* renamed from: u */
    public List<C9087m> f24526u;

    /* renamed from: com.urbanairship.contacts.e$a */
    public class C9075a extends C36039i {
        public C9075a() {
        }

        /* renamed from: a */
        public void mo17410a(long j) {
            if (C9074e.this.f24517l.mo19623a() >= C9074e.this.mo18036c0() + 86400000) {
                C9074e.this.mo18010E0();
            }
        }
    }

    /* renamed from: com.urbanairship.contacts.e$b */
    public class C9076b implements C9016e {
        public C9076b() {
        }

        /* renamed from: a */
        public void mo17818a(@C0359n0 String str) {
            if (C9074e.this.f24514i.mo107874h(64)) {
                C9074e.this.mo18010E0();
            }
        }

        /* renamed from: b */
        public void mo17819b(@C0359n0 String str) {
        }
    }

    /* renamed from: com.urbanairship.contacts.e$c */
    public class C9077c extends C9060z {
        public C9077c() {
        }

        /* renamed from: e */
        public void mo17822e(@C0359n0 List<C9004a0> list) {
            super.mo17822e(list);
            if (!C9074e.this.f24514i.mo107874h(64, 32)) {
                C36059m.m148421q("Contact - Ignoring tag edits while contacts and/or tags and attributes are disabled.", new Object[0]);
            } else if (!list.isEmpty()) {
                C9074e.this.mo18020M(C9091q.m33926k());
                C9074e.this.mo18020M(C9091q.m33930o(list));
                C9074e.this.mo18027T();
            }
        }
    }

    /* renamed from: com.urbanairship.contacts.e$d */
    public class C9078d extends C9022g {
        public C9078d(C9656j jVar) {
            super(jVar);
        }

        /* renamed from: c */
        public void mo17823c(@C0359n0 List<C9025i> list) {
            if (!C9074e.this.f24514i.mo107874h(64, 32)) {
                C36059m.m148421q("Contact - Ignoring tag edits while contacts and/or tags and attributes are disabled.", new Object[0]);
            } else if (!list.isEmpty()) {
                C9074e.this.mo18020M(C9091q.m33926k());
                C9074e.this.mo18020M(C9091q.m33928m(list));
                C9074e.this.mo18027T();
            }
        }
    }

    /* renamed from: com.urbanairship.contacts.e$e */
    public class C9079e extends C9101t {
        public C9079e(C9656j jVar) {
            super(jVar);
        }

        /* renamed from: c */
        public void mo18059c(@C0359n0 List<C9102u> list) {
            if (!C9074e.this.f24514i.mo107874h(64, 32)) {
                C36059m.m148421q("Contact - Ignoring subscription list edits while contacts and/or tags and attributes are disabled.", new Object[0]);
            } else if (!list.isEmpty()) {
                C9074e.this.mo18020M(C9091q.m33926k());
                C9074e.this.mo18020M(C9091q.m33929n(list));
                C9074e.this.mo18047p0(list);
                C9074e.this.mo18027T();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C9074e(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C9061a aVar, @C0359n0 C36075v vVar, @C0359n0 C9008d dVar) {
        this(context, uVar, C9302e.m34896n(context), vVar, dVar, new ContactApiClient(aVar), C36035g.m148341t(context), C9656j.f26468a, new C9652h(), new CopyOnWriteArrayList(), (Executor) null);
        C9061a aVar2 = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public /* synthetic */ void m33834m0(String str, boolean z, C36062p pVar) {
        Map<String, Set<Scope>> a = this.f24518m.mo19620a();
        if (a == null && (a = mo18032Y(str)) != null) {
            this.f24518m.mo19622c(a, 600000);
        }
        if (a != null) {
            mo18022O(a);
            if (z) {
                for (C9102u a2 : mo18040g0()) {
                    a2.mo18100a(a);
                }
            }
        }
        pVar.mo107828g(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public /* synthetic */ C9029l.C9031b m33835n0(C9029l.C9031b bVar) {
        C9090p b0 = mo18035b0();
        if (b0 != null) {
            bVar.mo17860C(b0.mo18067b());
        }
        return bVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: A0 */
    public void mo18006A0(@C0359n0 C9087m mVar) {
        this.f24526u.remove(mVar);
    }

    /* renamed from: B0 */
    public final void mo18007B0() {
        synchronized (this.f24520o) {
            List<C9091q> e0 = mo18038e0();
            if (!e0.isEmpty()) {
                e0.remove(0);
                mo18017K0(e0);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: C0 */
    public void mo18008C0(@C0359n0 C9058x xVar) {
        this.f24525t.remove(xVar);
    }

    /* renamed from: D0 */
    public void mo18009D0() {
        if (!this.f24514i.mo107874h(64)) {
            C36059m.m148406b("Contact - Contacts is disabled, ignoring contact reset.", new Object[0]);
            return;
        }
        mo18020M(C9091q.m33925j());
        mo18027T();
    }

    @C0344h1
    /* renamed from: E0 */
    public void mo18010E0() {
        if (!this.f24514i.mo107874h(64)) {
            C36059m.m148406b("Contact - Contacts is disabled, ignoring contact resolving.", new Object[0]);
            return;
        }
        this.f24522q = false;
        mo18020M(C9091q.m33926k());
        mo18027T();
    }

    /* renamed from: F0 */
    public final void mo18011F0(@C0363p0 C9089o oVar) {
        this.f24511f.mo107854s(f24503F, oVar);
    }

    /* renamed from: G0 */
    public void mo18012G0(C9088n nVar) {
        this.f24523r = nVar;
    }

    /* renamed from: H0 */
    public final void mo18013H0(C9090p pVar) {
        this.f24511f.mo107855t(f24504G, JsonValue.m34965K(pVar));
    }

    /* renamed from: I0 */
    public final void mo18014I0(long j) {
        this.f24511f.mo107853r(f24502E, j);
    }

    /* renamed from: J0 */
    public final boolean mo18015J0(@C0359n0 C9091q qVar, boolean z) {
        C9090p b0 = mo18035b0();
        String e = qVar.mo18072e();
        e.hashCode();
        char c = 65535;
        switch (e.hashCode()) {
            case -1785516855:
                if (e.equals(C9091q.f24549c)) {
                    c = 0;
                    break;
                }
                break;
            case -1651814390:
                if (e.equals(C9091q.f24555w)) {
                    c = 1;
                    break;
                }
                break;
            case -1416098080:
                if (e.equals(C9091q.f24553g)) {
                    c = 2;
                    break;
                }
                break;
            case -520687454:
                if (e.equals(C9091q.f24556x)) {
                    c = 3;
                    break;
                }
                break;
            case 77866287:
                if (e.equals(C9091q.f24552f)) {
                    c = 4;
                    break;
                }
                break;
            case 610829725:
                if (e.equals(C9091q.f24554v)) {
                    c = 5;
                    break;
                }
                break;
            case 646864652:
                if (e.equals(C9091q.f24550d)) {
                    c = 6;
                    break;
                }
                break;
            case 1815350732:
                if (e.equals(C9091q.f24551e)) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
                break;
            case 4:
                if (b0 != null && z) {
                    if (!b0.mo18069d() || mo18033Z() != null) {
                        return false;
                    }
                    return true;
                }
                break;
            case 6:
                if (b0 == null) {
                    return false;
                }
                C9091q.C9093b bVar = (C9091q.C9093b) qVar.mo18070b();
                if (!this.f24522q || !bVar.mo18076b().equals(b0.mo18068c())) {
                    return false;
                }
                return true;
            case 7:
                return this.f24522q;
            default:
                return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: K */
    public void mo18016K(@C0359n0 C9024h hVar) {
        this.f24524s.add(hVar);
    }

    /* renamed from: K0 */
    public final void mo18017K0(@C0359n0 List<C9091q> list) {
        synchronized (this.f24520o) {
            this.f24511f.mo107855t(f24501D, JsonValue.m34975U(list));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: L */
    public void mo18018L(@C0359n0 C9087m mVar) {
        this.f24526u.add(mVar);
    }

    /* renamed from: L0 */
    public final void mo18019L0(@C0363p0 C9091q.C9098g gVar, @C0363p0 C9070a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap3 = new HashMap();
        C9089o Z = mo18033Z();
        if (Z != null) {
            hashMap.putAll(Z.mo18062c());
            hashMap2.putAll(Z.mo18064e());
            arrayList.addAll(Z.mo18061b());
            hashMap3.putAll(Z.mo18063d());
        }
        if (gVar != null) {
            for (C9025i next : gVar.mo18084b()) {
                String str = next.f24268a;
                str.hashCode();
                if (str.equals("remove")) {
                    hashMap.remove(next.f24269b);
                } else if (str.equals("set")) {
                    hashMap.put(next.f24269b, next.f24270c);
                }
            }
            for (C9004a0 a : gVar.mo18086d()) {
                a.mo17774a(hashMap2);
            }
            for (C9102u a2 : gVar.mo18085c()) {
                a2.mo18100a(hashMap3);
            }
        }
        if (aVar != null) {
            arrayList.add(aVar);
        }
        mo18011F0(new C9089o(hashMap, hashMap2, arrayList, hashMap3));
    }

    /* renamed from: M */
    public final void mo18020M(@C0359n0 C9091q qVar) {
        synchronized (this.f24520o) {
            List<C9091q> e0 = mo18038e0();
            e0.add(qVar);
            mo18017K0(e0);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: N */
    public void mo18021N(@C0359n0 C9058x xVar) {
        this.f24525t.add(xVar);
    }

    /* renamed from: O */
    public final void mo18022O(Map<String, Set<Scope>> map) {
        for (C9652h next : this.f24519n) {
            C9102u uVar = (C9102u) next.mo19620a();
            if (uVar != null) {
                uVar.mo18100a(map);
            } else {
                this.f24519n.remove(next);
            }
        }
    }

    /* renamed from: P */
    public void mo18023P(@C0359n0 String str, @C0359n0 ChannelType channelType) {
        if (!this.f24514i.mo107874h(64)) {
            C36059m.m148421q("Contact - Ignoring associate channel request while contacts are disabled.", new Object[0]);
            return;
        }
        mo18020M(C9091q.m33926k());
        mo18020M(C9091q.m33919a(str, channelType));
        mo18027T();
    }

    /* renamed from: Q */
    public final void mo18024Q(List<C9102u> list) {
        for (C9102u c : list) {
            C9652h hVar = new C9652h();
            hVar.mo19622c(c, 600000);
            this.f24519n.add(hVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r5.f24514i.mo107874h(64) == false) goto L_0x001e;
     */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18025R() {
        /*
            r5 = this;
            com.urbanairship.v r0 = r5.f24514i
            r1 = 1
            int[] r2 = new int[r1]
            r3 = 32
            r4 = 0
            r2[r4] = r3
            boolean r0 = r0.mo107874h(r2)
            r2 = 64
            if (r0 == 0) goto L_0x001e
            com.urbanairship.v r0 = r5.f24514i
            int[] r3 = new int[r1]
            r3[r4] = r2
            boolean r0 = r0.mo107874h(r3)
            if (r0 != 0) goto L_0x0021
        L_0x001e:
            r5.mo18026S()
        L_0x0021:
            com.urbanairship.v r0 = r5.f24514i
            int[] r1 = new int[r1]
            r1[r4] = r2
            boolean r0 = r0.mo107874h(r1)
            if (r0 != 0) goto L_0x004a
            com.urbanairship.contacts.p r0 = r5.mo18035b0()
            if (r0 != 0) goto L_0x0034
            return
        L_0x0034:
            boolean r0 = r0.mo18069d()
            if (r0 == 0) goto L_0x0040
            com.urbanairship.contacts.o r0 = r5.mo18033Z()
            if (r0 == 0) goto L_0x004a
        L_0x0040:
            com.urbanairship.contacts.q r0 = com.urbanairship.contacts.C9091q.m33925j()
            r5.mo18020M(r0)
            r5.mo18027T()
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.contacts.C9074e.mo18025R():void");
    }

    /* renamed from: S */
    public final void mo18026S() {
        this.f24518m.mo19621b();
        this.f24519n.clear();
    }

    /* renamed from: T */
    public final void mo18027T() {
        mo18028U(2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006e, code lost:
        if (r0.equals(com.urbanairship.contacts.C9091q.f24550d) == false) goto L_0x005b;
     */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18028U(int r5) {
        /*
            r4 = this;
            com.urbanairship.channel.d r0 = r4.f24513h
            java.lang.String r0 = r0.mo17793Z()
            boolean r0 = com.urbanairship.util.C9669o0.m36224e(r0)
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            java.util.List r0 = r4.mo18038e0()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x0016:
            boolean r2 = r0.hasNext()
            r3 = 1
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r0.next()
            com.urbanairship.contacts.q r2 = (com.urbanairship.contacts.C9091q) r2
            boolean r3 = r4.mo18015J0(r2, r3)
            if (r3 != 0) goto L_0x0016
            r1 = r2
            goto L_0x0016
        L_0x002b:
            if (r1 != 0) goto L_0x002e
            return
        L_0x002e:
            com.urbanairship.job.f$b r0 = com.urbanairship.job.C9304f.m34907i()
            java.lang.String r2 = "ACTION_UPDATE_CONTACT"
            com.urbanairship.job.f$b r0 = r0.mo18725k(r2)
            com.urbanairship.job.f$b r0 = r0.mo18732r(r3)
            java.lang.Class<com.urbanairship.contacts.e> r2 = com.urbanairship.contacts.C9074e.class
            com.urbanairship.job.f$b r0 = r0.mo18726l(r2)
            com.urbanairship.job.f$b r5 = r0.mo18728n(r5)
            java.lang.String r0 = "Contact.update"
            com.urbanairship.job.f$b r5 = r5.mo18723i(r0)
            java.lang.String r0 = r1.mo18072e()
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case 77866287: goto L_0x0071;
                case 646864652: goto L_0x0068;
                case 1815350732: goto L_0x005d;
                default: goto L_0x005b;
            }
        L_0x005b:
            r3 = r2
            goto L_0x007b
        L_0x005d:
            java.lang.String r1 = "RESOLVE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0066
            goto L_0x005b
        L_0x0066:
            r3 = 2
            goto L_0x007b
        L_0x0068:
            java.lang.String r1 = "IDENTIFY"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x007b
            goto L_0x005b
        L_0x0071:
            java.lang.String r1 = "RESET"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x007a
            goto L_0x005b
        L_0x007a:
            r3 = 0
        L_0x007b:
            switch(r3) {
                case 0: goto L_0x007f;
                case 1: goto L_0x007f;
                case 2: goto L_0x007f;
                default: goto L_0x007e;
            }
        L_0x007e:
            goto L_0x0084
        L_0x007f:
            java.lang.String r0 = "Contact.identity"
            r5.mo18723i(r0)
        L_0x0084:
            com.urbanairship.job.e r0 = r4.f24512g
            com.urbanairship.job.f r5 = r5.mo18724j()
            r0.mo18704c(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.contacts.C9074e.mo18028U(int):void");
    }

    /* renamed from: V */
    public C9022g mo18029V() {
        return new C9078d(this.f24517l);
    }

    /* renamed from: W */
    public C9101t mo18030W() {
        return new C9079e(this.f24517l);
    }

    /* renamed from: X */
    public C9060z mo18031X() {
        return new C9077c();
    }

    @C0363p0
    /* renamed from: Y */
    public final Map<String, Set<Scope>> mo18032Y(@C0359n0 String str) {
        try {
            C9116c<Map<String, Set<Scope>>> i = this.f24521p.mo17993i(str);
            if (i.mo18150l()) {
                return i.mo18144f();
            }
            C36059m.m148409e("Failed to fetch contact subscription lists! error: %d message: %s", Integer.valueOf(i.mo18147i()), i.mo18141c());
            return null;
        } catch (RequestException e) {
            C36059m.m148411g(e, "Failed to fetch contact subscription lists!", new Object[0]);
            return null;
        }
    }

    @C0363p0
    /* renamed from: Z */
    public final C9089o mo18033Z() {
        try {
            return C9089o.m33908a(this.f24511f.mo107845h(f24503F));
        } catch (JsonException e) {
            C36059m.m148409e("Invalid contact data", e);
            this.f24511f.mo107859x(f24503F);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    @androidx.annotation.C0363p0
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo18034a0() {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f24520o
            monitor-enter(r0)
            com.urbanairship.contacts.p r1 = r9.mo18035b0()     // Catch:{ all -> 0x0072 }
            r2 = 0
            if (r1 != 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            return r2
        L_0x000c:
            java.util.List r3 = r9.mo18038e0()     // Catch:{ all -> 0x0072 }
            int r4 = r3.size()     // Catch:{ all -> 0x0072 }
            r5 = 1
            int r4 = r4 - r5
        L_0x0016:
            if (r4 < 0) goto L_0x006c
            java.lang.Object r6 = r3.get(r4)     // Catch:{ all -> 0x0072 }
            com.urbanairship.contacts.q r6 = (com.urbanairship.contacts.C9091q) r6     // Catch:{ all -> 0x0072 }
            java.lang.String r6 = r6.mo18072e()     // Catch:{ all -> 0x0072 }
            int r7 = r6.hashCode()     // Catch:{ all -> 0x0072 }
            r8 = 77866287(0x4a4252f, float:3.8590362E-36)
            if (r7 == r8) goto L_0x003b
            r8 = 646864652(0x268e5f0c, float:9.878992E-16)
            if (r7 == r8) goto L_0x0031
            goto L_0x0045
        L_0x0031:
            java.lang.String r7 = "IDENTIFY"
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0072 }
            if (r6 == 0) goto L_0x0045
            r6 = 0
            goto L_0x0046
        L_0x003b:
            java.lang.String r7 = "RESET"
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0072 }
            if (r6 == 0) goto L_0x0045
            r6 = r5
            goto L_0x0046
        L_0x0045:
            r6 = -1
        L_0x0046:
            if (r6 == 0) goto L_0x004d
            if (r6 == r5) goto L_0x004b
            goto L_0x0069
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            return r2
        L_0x004d:
            java.lang.Object r6 = r3.get(r4)     // Catch:{ all -> 0x0072 }
            com.urbanairship.contacts.q r6 = (com.urbanairship.contacts.C9091q) r6     // Catch:{ all -> 0x0072 }
            com.urbanairship.contacts.q$c r6 = r6.mo18070b()     // Catch:{ all -> 0x0072 }
            com.urbanairship.contacts.q$b r6 = (com.urbanairship.contacts.C9091q.C9093b) r6     // Catch:{ all -> 0x0072 }
            java.lang.String r6 = r6.mo18076b()     // Catch:{ all -> 0x0072 }
            java.lang.String r7 = r1.mo18068c()     // Catch:{ all -> 0x0072 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0072 }
            if (r6 != 0) goto L_0x0069
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            return r2
        L_0x0069:
            int r4 = r4 + -1
            goto L_0x0016
        L_0x006c:
            java.lang.String r1 = r1.mo18067b()     // Catch:{ all -> 0x0072 }
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            return r1
        L_0x0072:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.contacts.C9074e.mo18034a0():java.lang.String");
    }

    @C0363p0
    @C0344h1
    /* renamed from: b0 */
    public C9090p mo18035b0() {
        JsonValue h = this.f24511f.mo107845h(f24504G);
        if (h.mo18780w()) {
            return null;
        }
        try {
            return C9090p.m33914a(h);
        } catch (JsonException unused) {
            C36059m.m148409e("Unable to parse contact identity", new Object[0]);
            return null;
        }
    }

    /* renamed from: c0 */
    public final long mo18036c0() {
        return this.f24511f.mo107846i(f24502E, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        return r1;
     */
    @androidx.annotation.C0363p0
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo18037d0() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f24520o
            monitor-enter(r0)
            java.util.List r1 = r5.mo18038e0()     // Catch:{ all -> 0x0044 }
            int r2 = r1.size()     // Catch:{ all -> 0x0044 }
            int r2 = r2 + -1
        L_0x000d:
            if (r2 < 0) goto L_0x0036
            java.lang.String r3 = "IDENTIFY"
            java.lang.Object r4 = r1.get(r2)     // Catch:{ all -> 0x0044 }
            com.urbanairship.contacts.q r4 = (com.urbanairship.contacts.C9091q) r4     // Catch:{ all -> 0x0044 }
            java.lang.String r4 = r4.mo18072e()     // Catch:{ all -> 0x0044 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0044 }
            if (r3 == 0) goto L_0x0033
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0044 }
            com.urbanairship.contacts.q r1 = (com.urbanairship.contacts.C9091q) r1     // Catch:{ all -> 0x0044 }
            com.urbanairship.contacts.q$c r1 = r1.mo18070b()     // Catch:{ all -> 0x0044 }
            com.urbanairship.contacts.q$b r1 = (com.urbanairship.contacts.C9091q.C9093b) r1     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = r1.mo18076b()     // Catch:{ all -> 0x0044 }
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            return r1
        L_0x0033:
            int r2 = r2 + -1
            goto L_0x000d
        L_0x0036:
            com.urbanairship.contacts.p r1 = r5.mo18035b0()     // Catch:{ all -> 0x0044 }
            if (r1 != 0) goto L_0x003e
            r1 = 0
            goto L_0x0042
        L_0x003e:
            java.lang.String r1 = r1.mo18068c()     // Catch:{ all -> 0x0044 }
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            return r1
        L_0x0044:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.contacts.C9074e.mo18037d0():java.lang.String");
    }

    @C0359n0
    /* renamed from: e0 */
    public final List<C9091q> mo18038e0() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f24520o) {
            Iterator<JsonValue> it = this.f24511f.mo107845h(f24501D).mo18784z().iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(C9091q.m33920c(it.next()));
                } catch (JsonException e) {
                    C36059m.m148409e("Failed to parse contact operation", e);
                }
            }
        }
        return arrayList;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f0 */
    public List<C9025i> mo18039f0() {
        List<C9025i> a;
        synchronized (this.f24520o) {
            ArrayList arrayList = new ArrayList();
            for (C9091q next : mo18038e0()) {
                if (next.mo18072e().equals(C9091q.f24549c)) {
                    arrayList.addAll(((C9091q.C9098g) next.mo18070b()).mo18084b());
                }
            }
            a = C9025i.m33597a(arrayList);
        }
        return a;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g0 */
    public List<C9102u> mo18040g0() {
        List<C9102u> b;
        synchronized (this.f24520o) {
            ArrayList arrayList = new ArrayList();
            for (C9091q next : mo18038e0()) {
                if (next.mo18072e().equals(C9091q.f24549c)) {
                    arrayList.addAll(((C9091q.C9098g) next.mo18070b()).mo18085c());
                }
            }
            b = C9102u.m33981b(arrayList);
        }
        return b;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: h0 */
    public List<C9004a0> mo18041h0() {
        List<C9004a0> b;
        synchronized (this.f24520o) {
            ArrayList arrayList = new ArrayList();
            for (C9091q next : mo18038e0()) {
                if (next.mo18072e().equals(C9091q.f24549c)) {
                    arrayList.addAll(((C9091q.C9098g) next.mo18070b()).mo18086d());
                }
            }
            b = C9004a0.m33497b(arrayList);
        }
        return b;
    }

    @C0359n0
    /* renamed from: i0 */
    public C36062p<Map<String, Set<Scope>>> mo18042i0() {
        return mo18044k0(true);
    }

    @C0359n0
    /* renamed from: j0 */
    public final C36062p<Map<String, Set<Scope>>> mo18043j0(@C0359n0 String str, boolean z) {
        C36062p<Map<String, Set<Scope>>> pVar = new C36062p<>();
        if (!this.f24514i.mo107874h(32)) {
            pVar.mo107828g(null);
            return pVar;
        }
        this.f24516k.execute(new C9073d(this, str, z, pVar));
        return pVar;
    }

    @C0359n0
    /* renamed from: k0 */
    public C36062p<Map<String, Set<Scope>>> mo18044k0(boolean z) {
        C36062p<Map<String, Set<Scope>>> pVar = new C36062p<>();
        if (this.f24514i.mo107874h(32)) {
            if (this.f24514i.mo107874h(64)) {
                String a0 = mo18034a0();
                if (a0 != null) {
                    return mo18043j0(a0, z);
                }
                pVar.mo107828g(null);
                return pVar;
            }
        }
        pVar.mo107828g(null);
        return pVar;
    }

    /* renamed from: l0 */
    public void mo18045l0(@C0359n0 @C0386z0(max = 128, min = 1) String str) {
        if (!this.f24514i.mo107874h(64)) {
            C36059m.m148406b("Contact - Contacts is disabled, ignoring contact identifying.", new Object[0]);
            return;
        }
        mo18020M(C9091q.m33921f(str));
        mo18027T();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: n */
    public int mo17620n() {
        return 9;
    }

    /* renamed from: o0 */
    public final void mo18046o0() {
        String k;
        if (this.f24514i.mo107874h(64) && (k = this.f24511f.mo107848k(f24506v, (String) null)) != null) {
            mo18045l0(k);
            if (this.f24514i.mo107874h(32)) {
                List<C9025i> a = C9025i.m33597a(C9025i.m33598b(this.f24511f.mo107845h(f24507w).mo18784z()));
                List<C9004a0> b = C9004a0.m33497b(C9004a0.m33498c(this.f24511f.mo107845h(f24508x).mo18784z()));
                if (!a.isEmpty() || !b.isEmpty()) {
                    mo18020M(C9091q.m33927l(b, a, (List<C9102u>) null));
                }
            }
        }
        this.f24511f.mo107859x(f24508x);
        this.f24511f.mo107859x(f24507w);
        this.f24511f.mo107859x(f24506v);
    }

    /* renamed from: p0 */
    public final void mo18047p0(@C0359n0 List<C9102u> list) {
        ArrayList arrayList = new ArrayList();
        for (C9102u next : list) {
            if (next.mo18104g() == Scope.APP) {
                arrayList.add(new C9051t(next.mo18101e(), next.mo18103f(), next.mo18105h()));
            }
        }
        if (!arrayList.isEmpty()) {
            this.f24513h.mo17806p0(arrayList);
        }
    }

    @C0359n0
    /* renamed from: q */
    public Executor mo18048q(@C0359n0 C9304f fVar) {
        return this.f24516k;
    }

    /* renamed from: q0 */
    public final void mo18049q0(@C0363p0 String str) {
        C9089o Z;
        C9088n nVar = this.f24523r;
        if (nVar != null && (Z = mo18033Z()) != null) {
            nVar.mo18060a(Z, str);
        }
    }

    /* renamed from: r */
    public void mo17625r() {
        super.mo17625r();
        mo18046o0();
        this.f24515j.mo18485f(new C9075a());
        this.f24513h.mo17780M(new C9076b());
        this.f24513h.mo17781N(new C9071b(this));
        this.f24514i.mo107868a(new C9072c(this));
        this.f24512g.mo18711m(f24510z, 1, 5, TimeUnit.SECONDS);
        this.f24512g.mo18711m(f24498A, 1, 500, TimeUnit.MILLISECONDS);
        mo18025R();
        mo18027T();
        mo18047p0(mo18040g0());
    }

    @C0348i1
    @C0359n0
    /* renamed from: r0 */
    public final JobResult mo18050r0() {
        String Z = this.f24513h.mo17793Z();
        if (C9669o0.m36224e(Z)) {
            C36059m.m148419o("The channel ID does not exist. Will retry when channel ID is available.", new Object[0]);
            return JobResult.SUCCESS;
        }
        C9091q t0 = mo18052t0();
        if (t0 == null) {
            return JobResult.SUCCESS;
        }
        try {
            C9116c<?> s0 = mo18051s0(t0, Z);
            C36059m.m148406b("Operation %s finished with response %s", t0, s0);
            if (!s0.mo18149k()) {
                if (!s0.mo18151m()) {
                    mo18007B0();
                    mo18028U(0);
                    return JobResult.SUCCESS;
                }
            }
            return JobResult.RETRY;
        } catch (RequestException e) {
            C36059m.m148406b("Failed to update operation: %s, will retry.", e.getMessage());
            return JobResult.RETRY;
        } catch (IllegalStateException e2) {
            C36059m.m148409e("Unable to process operation %s, skipping.", t0, e2);
            mo18007B0();
            mo18028U(0);
            return JobResult.SUCCESS;
        }
    }

    @C0348i1
    @C0359n0
    /* renamed from: s0 */
    public final C9116c<?> mo18051s0(C9091q qVar, String str) throws RequestException {
        C9090p b0 = mo18035b0();
        String e = qVar.mo18072e();
        e.hashCode();
        char c = 65535;
        switch (e.hashCode()) {
            case -1785516855:
                if (e.equals(C9091q.f24549c)) {
                    c = 0;
                    break;
                }
                break;
            case -1651814390:
                if (e.equals(C9091q.f24555w)) {
                    c = 1;
                    break;
                }
                break;
            case -1416098080:
                if (e.equals(C9091q.f24553g)) {
                    c = 2;
                    break;
                }
                break;
            case -520687454:
                if (e.equals(C9091q.f24556x)) {
                    c = 3;
                    break;
                }
                break;
            case 77866287:
                if (e.equals(C9091q.f24552f)) {
                    c = 4;
                    break;
                }
                break;
            case 610829725:
                if (e.equals(C9091q.f24554v)) {
                    c = 5;
                    break;
                }
                break;
            case 646864652:
                if (e.equals(C9091q.f24550d)) {
                    c = 6;
                    break;
                }
                break;
            case 1815350732:
                if (e.equals(C9091q.f24551e)) {
                    c = 7;
                    break;
                }
                break;
        }
        String str2 = null;
        switch (c) {
            case 0:
                if (b0 != null) {
                    C9091q.C9098g gVar = (C9091q.C9098g) qVar.mo18070b();
                    C9116c<Void> x = this.f24521p.mo18001x(b0.mo18067b(), gVar.mo18086d(), gVar.mo18084b(), gVar.mo18085c());
                    if (x.mo18150l()) {
                        if (b0.mo18069d()) {
                            mo18019L0(gVar, (C9070a) null);
                        }
                        if (!gVar.mo18084b().isEmpty()) {
                            for (C9024h a : this.f24524s) {
                                a.mo17696a(gVar.mo18084b());
                            }
                        }
                        if (!gVar.mo18086d().isEmpty()) {
                            for (C9058x a2 : this.f24525t) {
                                a2.mo17695a(gVar.mo18086d());
                            }
                        }
                        if (!gVar.mo18085c().isEmpty()) {
                            mo18024Q(gVar.mo18085c());
                        }
                    }
                    return x;
                }
                throw new IllegalStateException("Unable to process update without previous contact identity");
            case 1:
                if (b0 != null) {
                    C9091q.C9096e eVar = (C9091q.C9096e) qVar.mo18070b();
                    C9116c<C9070a> t = this.f24521p.mo17997t(b0.mo18067b(), eVar.mo18080b(), eVar.mo18081c());
                    mo18053u0(t);
                    return t;
                }
                throw new IllegalStateException("Unable to process update without previous contact identity");
            case 2:
                if (b0 != null) {
                    C9091q.C9095d dVar = (C9091q.C9095d) qVar.mo18070b();
                    C9116c<C9070a> s = this.f24521p.mo17996s(b0.mo18067b(), dVar.mo18078b(), dVar.mo18079c());
                    mo18053u0(s);
                    return s;
                }
                throw new IllegalStateException("Unable to process update without previous contact identity");
            case 3:
                if (b0 != null) {
                    C9091q.C9092a aVar = (C9091q.C9092a) qVar.mo18070b();
                    C9116c<C9070a> h = this.f24521p.mo17992h(b0.mo18067b(), aVar.mo18074b(), aVar.mo18075c());
                    mo18053u0(h);
                    return h;
                }
                throw new IllegalStateException("Unable to process update without previous contact identity");
            case 4:
                C9116c<C9090p> v = this.f24521p.mo17999v(str);
                mo18054v0(v, b0);
                return v;
            case 5:
                if (b0 != null) {
                    C9091q.C9097f fVar = (C9091q.C9097f) qVar.mo18070b();
                    C9116c<C9070a> u = this.f24521p.mo17998u(b0.mo18067b(), fVar.mo18082b(), fVar.mo18083c());
                    mo18053u0(u);
                    return u;
                }
                throw new IllegalStateException("Unable to process update without previous contact identity");
            case 6:
                C9091q.C9093b bVar = (C9091q.C9093b) qVar.mo18070b();
                if (b0 != null && b0.mo18069d()) {
                    str2 = b0.mo18067b();
                }
                C9116c<C9090p> j = this.f24521p.mo17994j(bVar.mo18076b(), str, str2);
                mo18054v0(j, b0);
                return j;
            case 7:
                C9116c<C9090p> w = this.f24521p.mo18000w(str);
                if (w.mo18150l()) {
                    mo18014I0(this.f24517l.mo19623a());
                }
                mo18054v0(w, b0);
                return w;
            default:
                throw new IllegalStateException("Unexpected operation type: " + qVar.mo18072e());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0086 A[LOOP:2: B:39:0x0086->B:63:0x0086, LOOP_START, PHI: r2 
      PHI: (r2v4 com.urbanairship.contacts.q) = (r2v2 com.urbanairship.contacts.q), (r2v5 com.urbanairship.contacts.q) binds: [B:23:0x0047, B:63:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    @androidx.annotation.C0363p0
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.urbanairship.contacts.C9091q mo18052t0() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f24520o
            monitor-enter(r0)
            java.util.List r1 = r8.mo18038e0()     // Catch:{ all -> 0x010b }
        L_0x0007:
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x010b }
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x001c
            java.lang.Object r2 = r1.remove(r4)     // Catch:{ all -> 0x010b }
            com.urbanairship.contacts.q r2 = (com.urbanairship.contacts.C9091q) r2     // Catch:{ all -> 0x010b }
            boolean r5 = r8.mo18015J0(r2, r3)     // Catch:{ all -> 0x010b }
            if (r5 != 0) goto L_0x0007
            goto L_0x001d
        L_0x001c:
            r2 = 0
        L_0x001d:
            if (r2 == 0) goto L_0x00f5
            java.lang.String r5 = r2.mo18072e()     // Catch:{ all -> 0x010b }
            int r6 = r5.hashCode()     // Catch:{ all -> 0x010b }
            r7 = -1785516855(0xffffffff95932cc9, float:-5.9443486E-26)
            if (r6 == r7) goto L_0x003c
            r7 = 646864652(0x268e5f0c, float:9.878992E-16)
            if (r6 == r7) goto L_0x0032
            goto L_0x0046
        L_0x0032:
            java.lang.String r6 = "IDENTIFY"
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x010b }
            if (r5 == 0) goto L_0x0046
            r5 = r3
            goto L_0x0047
        L_0x003c:
            java.lang.String r6 = "UPDATE"
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x010b }
            if (r5 == 0) goto L_0x0046
            r5 = r4
            goto L_0x0047
        L_0x0046:
            r5 = -1
        L_0x0047:
            if (r5 == 0) goto L_0x0086
            if (r5 == r3) goto L_0x004d
            goto L_0x00f5
        L_0x004d:
            com.urbanairship.contacts.p r3 = r8.mo18035b0()     // Catch:{ all -> 0x010b }
            boolean r5 = r8.f24522q     // Catch:{ all -> 0x010b }
            if (r5 == 0) goto L_0x00f5
            if (r3 == 0) goto L_0x005d
            boolean r3 = r3.mo18069d()     // Catch:{ all -> 0x010b }
            if (r3 != 0) goto L_0x00f5
        L_0x005d:
            boolean r3 = r1.isEmpty()     // Catch:{ all -> 0x010b }
            if (r3 != 0) goto L_0x00f5
            java.lang.Object r3 = r1.get(r4)     // Catch:{ all -> 0x010b }
            com.urbanairship.contacts.q r3 = (com.urbanairship.contacts.C9091q) r3     // Catch:{ all -> 0x010b }
            boolean r5 = r8.mo18015J0(r3, r4)     // Catch:{ all -> 0x010b }
            if (r5 == 0) goto L_0x0073
            r1.remove(r4)     // Catch:{ all -> 0x010b }
            goto L_0x005d
        L_0x0073:
            java.lang.String r3 = r3.mo18072e()     // Catch:{ all -> 0x010b }
            java.lang.String r5 = "IDENTIFY"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x010b }
            if (r3 == 0) goto L_0x00f5
            java.lang.Object r2 = r1.remove(r4)     // Catch:{ all -> 0x010b }
            com.urbanairship.contacts.q r2 = (com.urbanairship.contacts.C9091q) r2     // Catch:{ all -> 0x010b }
            goto L_0x005d
        L_0x0086:
            boolean r3 = r1.isEmpty()     // Catch:{ all -> 0x010b }
            if (r3 != 0) goto L_0x00f5
            java.lang.Object r3 = r1.get(r4)     // Catch:{ all -> 0x010b }
            com.urbanairship.contacts.q r3 = (com.urbanairship.contacts.C9091q) r3     // Catch:{ all -> 0x010b }
            boolean r5 = r8.mo18015J0(r3, r4)     // Catch:{ all -> 0x010b }
            if (r5 == 0) goto L_0x009c
            r1.remove(r4)     // Catch:{ all -> 0x010b }
            goto L_0x0086
        L_0x009c:
            java.lang.String r5 = r3.mo18072e()     // Catch:{ all -> 0x010b }
            java.lang.String r6 = "UPDATE"
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x010b }
            if (r5 == 0) goto L_0x00f5
            com.urbanairship.contacts.q$c r2 = r2.mo18070b()     // Catch:{ all -> 0x010b }
            com.urbanairship.contacts.q$g r2 = (com.urbanairship.contacts.C9091q.C9098g) r2     // Catch:{ all -> 0x010b }
            com.urbanairship.contacts.q$c r3 = r3.mo18070b()     // Catch:{ all -> 0x010b }
            com.urbanairship.contacts.q$g r3 = (com.urbanairship.contacts.C9091q.C9098g) r3     // Catch:{ all -> 0x010b }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x010b }
            r5.<init>()     // Catch:{ all -> 0x010b }
            java.util.List r6 = r2.mo18086d()     // Catch:{ all -> 0x010b }
            r5.addAll(r6)     // Catch:{ all -> 0x010b }
            java.util.List r6 = r3.mo18086d()     // Catch:{ all -> 0x010b }
            r5.addAll(r6)     // Catch:{ all -> 0x010b }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x010b }
            r6.<init>()     // Catch:{ all -> 0x010b }
            java.util.List r7 = r2.mo18084b()     // Catch:{ all -> 0x010b }
            r6.addAll(r7)     // Catch:{ all -> 0x010b }
            java.util.List r7 = r3.mo18084b()     // Catch:{ all -> 0x010b }
            r6.addAll(r7)     // Catch:{ all -> 0x010b }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x010b }
            r7.<init>()     // Catch:{ all -> 0x010b }
            java.util.List r2 = r2.mo18085c()     // Catch:{ all -> 0x010b }
            r7.addAll(r2)     // Catch:{ all -> 0x010b }
            java.util.List r2 = r3.mo18085c()     // Catch:{ all -> 0x010b }
            r7.addAll(r2)     // Catch:{ all -> 0x010b }
            r1.remove(r4)     // Catch:{ all -> 0x010b }
            com.urbanairship.contacts.q r2 = com.urbanairship.contacts.C9091q.m33927l(r5, r6, r7)     // Catch:{ all -> 0x010b }
            goto L_0x0086
        L_0x00f5:
            if (r2 == 0) goto L_0x0106
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x010b }
            r3.<init>()     // Catch:{ all -> 0x010b }
            r3.add(r2)     // Catch:{ all -> 0x010b }
            r3.addAll(r1)     // Catch:{ all -> 0x010b }
            r8.mo18017K0(r3)     // Catch:{ all -> 0x010b }
            goto L_0x0109
        L_0x0106:
            r8.mo18017K0(r1)     // Catch:{ all -> 0x010b }
        L_0x0109:
            monitor-exit(r0)     // Catch:{ all -> 0x010b }
            return r2
        L_0x010b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x010b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.contacts.C9074e.mo18052t0():com.urbanairship.contacts.q");
    }

    /* renamed from: u0 */
    public final void mo18053u0(@C0359n0 C9116c<C9070a> cVar) {
        if (cVar.mo18150l() && mo18035b0() != null && mo18035b0().mo18069d()) {
            mo18019L0((C9091q.C9098g) null, cVar.mo18144f());
        }
    }

    /* renamed from: v */
    public void mo17629v(boolean z) {
        super.mo17629v(z);
        if (z) {
            mo18027T();
        }
    }

    /* renamed from: v0 */
    public final void mo18054v0(@C0359n0 C9116c<C9090p> cVar, @C0363p0 C9090p pVar) {
        String str;
        C9090p f = cVar.mo18144f();
        if (cVar.mo18150l() && f != null) {
            if (pVar == null || !pVar.mo18067b().equals(f.mo18067b())) {
                if (pVar != null && pVar.mo18069d()) {
                    mo18049q0(f.mo18068c());
                }
                mo18026S();
                mo18013H0(f);
                mo18011F0((C9089o) null);
                this.f24513h.mo17817y0();
                for (C9087m a : this.f24526u) {
                    a.mo17697a();
                }
            } else {
                String b = f.mo18067b();
                boolean d = f.mo18069d();
                if (f.mo18068c() == null) {
                    str = pVar.mo18068c();
                } else {
                    str = f.mo18068c();
                }
                mo18013H0(new C9090p(b, d, str));
                if (!f.mo18069d()) {
                    mo18011F0((C9089o) null);
                }
            }
            this.f24522q = true;
        }
    }

    /* renamed from: w0 */
    public void mo18055w0(@C0359n0 String str, @C0359n0 C9099r rVar) {
        if (!this.f24514i.mo107874h(64)) {
            C36059m.m148421q("Contact - Ignoring Email registration while contacts are disabled.", new Object[0]);
            return;
        }
        mo18020M(C9091q.m33926k());
        mo18020M(C9091q.m33922g(str, rVar));
        mo18027T();
    }

    @C0348i1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: x */
    public JobResult mo17814x(@C0359n0 UAirship uAirship, @C0359n0 C9304f fVar) {
        if (f24509y.equals(fVar.mo18712a())) {
            return mo18050r0();
        }
        return JobResult.SUCCESS;
    }

    /* renamed from: x0 */
    public void mo18056x0(@C0359n0 String str, @C0359n0 C9100s sVar) {
        if (!this.f24514i.mo107874h(64)) {
            C36059m.m148421q("Contact - Ignoring Open channel registration while contacts are disabled.", new Object[0]);
            return;
        }
        mo18020M(C9091q.m33926k());
        mo18020M(C9091q.m33923h(str, sVar));
        mo18027T();
    }

    /* renamed from: y0 */
    public void mo18057y0(@C0359n0 String str, @C0359n0 C9103v vVar) {
        if (!this.f24514i.mo107874h(64)) {
            C36059m.m148421q("Contact - Ignoring Sms registration while contacts are disabled.", new Object[0]);
            return;
        }
        mo18020M(C9091q.m33926k());
        mo18020M(C9091q.m33924i(str, vVar));
        mo18027T();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: z0 */
    public void mo18058z0(@C0359n0 C9024h hVar) {
        this.f24524s.remove(hVar);
    }

    @C0344h1
    public C9074e(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C9302e eVar, @C0359n0 C36075v vVar, @C0359n0 C9008d dVar, @C0359n0 ContactApiClient contactApiClient, @C0359n0 C36030b bVar, @C0359n0 C9656j jVar, @C0359n0 C9652h<Map<String, Set<Scope>>> hVar, @C0359n0 List<C9652h<C9102u>> list, @C0363p0 Executor executor) {
        super(context, uVar);
        this.f24520o = new Object();
        this.f24522q = false;
        this.f24524s = new CopyOnWriteArrayList();
        this.f24525t = new CopyOnWriteArrayList();
        this.f24526u = new CopyOnWriteArrayList();
        this.f24511f = uVar;
        this.f24512g = eVar;
        this.f24514i = vVar;
        this.f24513h = dVar;
        this.f24521p = contactApiClient;
        this.f24515j = bVar;
        this.f24517l = jVar;
        this.f24518m = hVar;
        this.f24519n = list;
        this.f24516k = executor == null ? this.f89037d : executor;
    }
}
