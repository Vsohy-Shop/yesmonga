package com.urbanairship.analytics;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.google.firebase.installations.C33124s;
import com.urbanairship.C36040b;
import com.urbanairship.C36044d;
import com.urbanairship.C36059m;
import com.urbanairship.C36071u;
import com.urbanairship.C36075v;
import com.urbanairship.UAirship;
import com.urbanairship.analytics.C35549g;
import com.urbanairship.analytics.data.C35545f;
import com.urbanairship.analytics.location.C35563d;
import com.urbanairship.app.C36030b;
import com.urbanairship.app.C36031c;
import com.urbanairship.app.C36035g;
import com.urbanairship.channel.C9008d;
import com.urbanairship.channel.C9016e;
import com.urbanairship.config.C9061a;
import com.urbanairship.job.C9304f;
import com.urbanairship.job.JobResult;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.locale.C9342b;
import com.urbanairship.messagecenter.C9366d;
import com.urbanairship.permission.C9439p;
import com.urbanairship.permission.Permission;
import com.urbanairship.permission.PermissionStatus;
import com.urbanairship.util.C9669o0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.urbanairship.analytics.b */
public class C35518b extends C36040b {
    @C0359n0

    /* renamed from: A */
    public static final String f87597A = "flutter";
    @C0359n0

    /* renamed from: B */
    public static final String f87598B = "react-native";
    @C0359n0

    /* renamed from: C */
    public static final String f87599C = "unity";
    @C0359n0

    /* renamed from: D */
    public static final String f87600D = "xamarin";
    @C0359n0

    /* renamed from: E */
    public static final String f87601E = "titanum";

    /* renamed from: F */
    public static final long f87602F = 10;

    /* renamed from: G */
    public static final String f87603G = "com.urbanairship.analytics.ASSOCIATED_IDENTIFIERS";
    @C0359n0

    /* renamed from: z */
    public static final String f87604z = "cordova";

    /* renamed from: f */
    public final C36030b f87605f;

    /* renamed from: g */
    public final C35545f f87606g;

    /* renamed from: h */
    public final C36031c f87607h;

    /* renamed from: i */
    public final C9061a f87608i;

    /* renamed from: j */
    public final C9008d f87609j;

    /* renamed from: k */
    public final Executor f87610k;

    /* renamed from: l */
    public final C9342b f87611l;

    /* renamed from: m */
    public final C36075v f87612m;

    /* renamed from: n */
    public final C9439p f87613n;

    /* renamed from: o */
    public final List<C35528c> f87614o;

    /* renamed from: p */
    public final List<C35526h> f87615p;

    /* renamed from: q */
    public final List<C35525g> f87616q;

    /* renamed from: r */
    public final Object f87617r;

    /* renamed from: s */
    public String f87618s;

    /* renamed from: t */
    public String f87619t;

    /* renamed from: u */
    public String f87620u;

    /* renamed from: v */
    public String f87621v;

    /* renamed from: w */
    public String f87622w;

    /* renamed from: x */
    public long f87623x;
    @C0359n0

    /* renamed from: y */
    public final List<String> f87624y;

    /* renamed from: com.urbanairship.analytics.b$a */
    public class C35519a implements C36031c {
        public C35519a() {
        }

        /* renamed from: a */
        public void mo17410a(long j) {
            C35518b.this.mo106439Z(j);
        }

        /* renamed from: b */
        public void mo17411b(long j) {
            C35518b.this.mo106438Y(j);
        }
    }

    /* renamed from: com.urbanairship.analytics.b$b */
    public class C35520b implements C9016e {
        public C35520b() {
        }

        /* renamed from: a */
        public void mo17818a(@C0359n0 String str) {
            C35518b.this.mo106446g0();
        }

        /* renamed from: b */
        public void mo17819b(@C0359n0 String str) {
        }
    }

    /* renamed from: com.urbanairship.analytics.b$c */
    public class C35521c implements C36075v.C36077b {
        public C35521c() {
        }

        /* renamed from: a */
        public void mo17533a() {
            if (!C35518b.this.f87612m.mo107874h(16)) {
                C35518b.this.mo106427N();
                synchronized (C35518b.this.f87617r) {
                    C35518b.this.mo107786p().mo107859x(C35518b.f87603G);
                }
            }
        }
    }

    /* renamed from: com.urbanairship.analytics.b$d */
    public class C35522d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C35554i f87628a;

        public C35522d(C35554i iVar) {
            this.f87628a = iVar;
        }

        public void run() {
            C35518b.this.f87606g.mo106473a(this.f87628a, C35518b.this.f87618s);
        }
    }

    /* renamed from: com.urbanairship.analytics.b$e */
    public class C35523e implements Runnable {
        public C35523e() {
        }

        public void run() {
            C36059m.m148413i("Deleting all analytic events.", new Object[0]);
            C35518b.this.f87606g.mo106474b();
        }
    }

    /* renamed from: com.urbanairship.analytics.b$f */
    public class C35524f extends C35549g.C35550a {
        public C35524f() {
        }

        /* renamed from: d */
        public void mo106449d(boolean z, @C0359n0 Map<String, String> map, @C0359n0 List<String> list) {
            synchronized (C35518b.this.f87617r) {
                if (!C35518b.this.mo106437X()) {
                    C36059m.m148421q("Analytics - Unable to track associated identifiers when analytics is disabled.", new Object[0]);
                    return;
                }
                HashMap hashMap = new HashMap();
                C35549g Q = C35518b.this.mo106430Q();
                if (!z) {
                    hashMap.putAll(Q.mo106483c());
                }
                hashMap.putAll(map);
                for (String remove : list) {
                    hashMap.remove(remove);
                }
                C35549g gVar = new C35549g(hashMap);
                if (Q.mo106483c().equals(gVar.mo106483c())) {
                    C36059m.m148413i("Skipping analytics event addition for duplicate associated identifiers.", new Object[0]);
                    return;
                }
                C35518b.this.mo107786p().mo107854s(C35518b.f87603G, gVar);
                C35518b.this.mo106423J(new C35548f(gVar));
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: com.urbanairship.analytics.b$g */
    public interface C35525g {
        @C0359n0
        /* renamed from: a */
        Map<String, String> mo19383a();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: com.urbanairship.analytics.b$h */
    public interface C35526h {
        /* renamed from: a */
        void mo106450a(@C0359n0 C35554i iVar, @C0359n0 String str);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.analytics.b$i */
    public @interface C35527i {
    }

    public C35518b(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C9061a aVar, @C0359n0 C36075v vVar, @C0359n0 C9008d dVar, @C0359n0 C9342b bVar, @C0359n0 C9439p pVar) {
        this(context, uVar, aVar, vVar, dVar, C36035g.m148341t(context), bVar, C36044d.m148369a(), new C35545f(context, uVar, aVar), pVar);
    }

    /* renamed from: A */
    public void mo17591A() {
        this.f87605f.mo18481b(this.f87607h);
    }

    /* renamed from: I */
    public void mo106422I(@C0359n0 C35528c cVar) {
        this.f87614o.add(cVar);
    }

    /* renamed from: J */
    public void mo106423J(@C0359n0 C35554i iVar) {
        if (iVar == null || !iVar.mo106481l()) {
            C36059m.m148409e("Analytics - Invalid event: %s", iVar);
        } else if (!mo106437X()) {
            C36059m.m148406b("Disabled ignoring event: %s", iVar.mo18412j());
        } else {
            C36059m.m148419o("Adding event: %s", iVar.mo18412j());
            this.f87610k.execute(new C35522d(iVar));
            mo106426M(iVar);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: K */
    public void mo106424K(@C0359n0 C35526h hVar) {
        this.f87615p.add(hVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: L */
    public void mo106425L(@C0359n0 C35525g gVar) {
        this.f87616q.add(gVar);
    }

    /* renamed from: M */
    public final void mo106426M(@C0359n0 C35554i iVar) {
        for (C35526h a : this.f87615p) {
            a.mo106450a(iVar, mo106435V());
        }
        for (C35528c next : this.f87614o) {
            String j = iVar.mo18412j();
            j.hashCode();
            if (!j.equals(C35563d.f87829P0)) {
                if (j.equals(C35551h.f87725S0) && (iVar instanceof C35551h)) {
                    next.mo17481c((C35551h) iVar);
                }
            } else if (iVar instanceof C35563d) {
                next.mo17480b((C35563d) iVar);
            }
        }
    }

    /* renamed from: N */
    public final void mo106427N() {
        this.f87610k.execute(new C35523e());
    }

    @C0359n0
    /* renamed from: O */
    public C35549g.C35550a mo106428O() {
        return new C35524f();
    }

    @C0348i1
    /* renamed from: P */
    public final Map<String, String> mo106429P() {
        String str;
        HashMap hashMap = new HashMap();
        for (C35525g a : this.f87616q) {
            hashMap.putAll(a.mo19383a());
        }
        for (Permission next : this.f87613n.mo19144n()) {
            try {
                PermissionStatus permissionStatus = this.f87613n.mo19142l(next).get();
                if (permissionStatus != null) {
                    hashMap.put("X-UA-Permission-" + next.mo19115g(), permissionStatus.mo19117g());
                }
            } catch (Exception e) {
                C36059m.m148411g(e, "Failed to get status for permission %s", next);
            }
        }
        hashMap.put("X-UA-Package-Name", mo106433T());
        hashMap.put("X-UA-Package-Version", mo106434U());
        hashMap.put("X-UA-Android-Version-Code", String.valueOf(Build.VERSION.SDK_INT));
        if (this.f87608i.mo17959b() == 1) {
            str = "amazon";
        } else {
            str = "android";
        }
        hashMap.put("X-UA-Device-Family", str);
        hashMap.put("X-UA-Lib-Version", UAirship.m146181I());
        hashMap.put("X-UA-App-Key", this.f87608i.mo17958a().f87128a);
        hashMap.put("X-UA-In-Production", Boolean.toString(this.f87608i.mo17958a().f87123B));
        hashMap.put(C9366d.f25595h, this.f87609j.mo17793Z());
        hashMap.put("X-UA-Push-Address", this.f87609j.mo17793Z());
        if (!this.f87624y.isEmpty()) {
            hashMap.put("X-UA-Frameworks", C9669o0.m36225f(this.f87624y, ","));
        }
        hashMap.put("X-UA-Device-Model", Build.MODEL);
        hashMap.put("X-UA-Timezone", TimeZone.getDefault().getID());
        Locale b = this.f87611l.mo18866b();
        if (!C9669o0.m36224e(b.getLanguage())) {
            hashMap.put("X-UA-Locale-Language", b.getLanguage());
            if (!C9669o0.m36224e(b.getCountry())) {
                hashMap.put("X-UA-Locale-Country", b.getCountry());
            }
            if (!C9669o0.m36224e(b.getVariant())) {
                hashMap.put("X-UA-Locale-Variant", b.getVariant());
            }
        }
        return hashMap;
    }

    @C0359n0
    /* renamed from: Q */
    public C35549g mo106430Q() {
        synchronized (this.f87617r) {
            try {
                JsonValue h = mo107786p().mo107845h(f87603G);
                if (!h.mo18780w()) {
                    C35549g a = C35549g.m146673a(h);
                    return a;
                }
            } catch (JsonException e) {
                C36059m.m148411g(e, "Unable to parse associated identifiers.", new Object[0]);
                mo107786p().mo107859x(f87603G);
            } catch (Throwable th) {
                throw th;
            }
            C35549g gVar = new C35549g();
            return gVar;
        }
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: R */
    public String mo106431R() {
        return this.f87620u;
    }

    @C0363p0
    /* renamed from: S */
    public String mo106432S() {
        return this.f87619t;
    }

    @C0363p0
    /* renamed from: T */
    public final String mo106433T() {
        try {
            return mo107785o().getPackageManager().getPackageInfo(mo107785o().getPackageName(), 0).packageName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @C0363p0
    /* renamed from: U */
    public final String mo106434U() {
        try {
            return mo107785o().getPackageManager().getPackageInfo(mo107785o().getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @C0359n0
    /* renamed from: V */
    public String mo106435V() {
        return this.f87618s;
    }

    /* renamed from: W */
    public boolean mo106436W() {
        return this.f87605f.mo18483d();
    }

    /* renamed from: X */
    public boolean mo106437X() {
        if (!mo107787s() || !this.f87608i.mo17958a().f87142o) {
            return false;
        }
        if (this.f87612m.mo107874h(16)) {
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    public void mo106438Y(long j) {
        mo106445f0((String) null);
        mo106423J(new C35529d(j));
        mo106443d0((String) null);
        mo106442c0((String) null);
        if (this.f87612m.mo107874h(16)) {
            this.f87606g.mo106476d(0, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: Z */
    public void mo106439Z(long j) {
        String uuid = UUID.randomUUID().toString();
        this.f87618s = uuid;
        C36059m.m148406b("New session: %s", uuid);
        if (this.f87621v == null) {
            mo106445f0(this.f87622w);
        }
        mo106423J(new C35547e(j));
    }

    /* renamed from: a0 */
    public void mo106440a0(@C0359n0 String str, @C0359n0 String str2) {
        String lowerCase = str.toLowerCase();
        String replace = str2.replace(",", "");
        List<String> list = this.f87624y;
        list.add(lowerCase + C33124s.f80355c + replace);
    }

    /* renamed from: b0 */
    public void mo106441b0(@C0359n0 C35528c cVar) {
        this.f87614o.remove(cVar);
    }

    /* renamed from: c0 */
    public void mo106442c0(@C0363p0 String str) {
        C36059m.m148406b("Setting conversion metadata: %s", str);
        this.f87620u = str;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d0 */
    public void mo106443d0(@C0363p0 String str) {
        C36059m.m148406b("Setting conversion send ID: %s", str);
        this.f87619t = str;
    }

    @Deprecated
    /* renamed from: e0 */
    public void mo106444e0(boolean z) {
        if (z) {
            this.f87612m.mo107870d(16);
            return;
        }
        this.f87612m.mo107869c(16);
    }

    /* renamed from: f0 */
    public void mo106445f0(@C0363p0 String str) {
        String str2 = this.f87621v;
        if (str2 == null || !str2.equals(str)) {
            String str3 = this.f87621v;
            if (str3 != null) {
                C35570p pVar = new C35570p(str3, this.f87622w, this.f87623x, System.currentTimeMillis());
                this.f87622w = this.f87621v;
                mo106423J(pVar);
            }
            this.f87621v = str;
            if (str != null) {
                for (C35528c a : this.f87614o) {
                    a.mo17479a(str);
                }
            }
            this.f87623x = System.currentTimeMillis();
        }
    }

    /* renamed from: g0 */
    public void mo106446g0() {
        if (this.f87612m.mo107874h(16)) {
            this.f87606g.mo106476d(10, TimeUnit.SECONDS);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: n */
    public int mo17620n() {
        return 1;
    }

    /* renamed from: r */
    public void mo17625r() {
        super.mo17625r();
        this.f87605f.mo18485f(this.f87607h);
        if (this.f87605f.mo18483d()) {
            mo106439Z(System.currentTimeMillis());
        }
        this.f87609j.mo17780M(new C35520b());
        this.f87612m.mo107868a(new C35521c());
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: x */
    public JobResult mo17814x(@C0359n0 UAirship uAirship, @C0359n0 C9304f fVar) {
        if (!C35545f.f87686j.equals(fVar.mo18712a())) {
            return JobResult.SUCCESS;
        }
        if (!mo106437X()) {
            return JobResult.SUCCESS;
        }
        if (this.f87609j.mo17793Z() == null) {
            C36059m.m148406b("No channel ID, skipping analytics send.", new Object[0]);
            return JobResult.SUCCESS;
        } else if (!this.f87606g.mo106477e(mo106429P())) {
            return JobResult.RETRY;
        } else {
            return JobResult.SUCCESS;
        }
    }

    @C0344h1
    public C35518b(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C9061a aVar, @C0359n0 C36075v vVar, @C0359n0 C9008d dVar, @C0359n0 C36030b bVar, @C0359n0 C9342b bVar2, @C0359n0 Executor executor, @C0359n0 C35545f fVar, @C0359n0 C9439p pVar) {
        super(context, uVar);
        this.f87614o = new CopyOnWriteArrayList();
        this.f87615p = new CopyOnWriteArrayList();
        this.f87616q = new CopyOnWriteArrayList();
        this.f87617r = new Object();
        this.f87624y = new ArrayList();
        this.f87608i = aVar;
        this.f87612m = vVar;
        this.f87609j = dVar;
        this.f87605f = bVar;
        this.f87611l = bVar2;
        this.f87610k = executor;
        this.f87606g = fVar;
        this.f87613n = pVar;
        this.f87618s = UUID.randomUUID().toString();
        this.f87607h = new C35519a();
    }
}
