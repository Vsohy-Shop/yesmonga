package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.camera.view.C1814q;
import androidx.collection.C1866a;
import androidx.core.p027os.C17842w0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.internal.C40531d;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40967c;
import com.google.android.gms.common.util.C40996v;
import com.google.android.gms.common.util.C40998x;
import com.google.android.material.badge.C31132a;
import com.google.firebase.components.C32580g;
import com.google.firebase.components.C32588j;
import com.google.firebase.components.C32600s;
import com.google.firebase.components.C32611y;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.events.C33031c;
import com.google.firebase.heartbeatinfo.C33046g;
import com.google.firebase.inject.C33058b;
import com.google.firebase.internal.C33127a;
import com.google.firebase.messaging.C33202j0;
import com.google.firebase.provider.FirebaseInitProvider;
import com.google.firebase.tracing.C33591b;
import com.google.firebase.tracing.C33592c;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.firebase.f */
public class C33033f {

    /* renamed from: k */
    public static final String f80144k = "FirebaseApp";
    @C0359n0

    /* renamed from: l */
    public static final String f80145l = "[DEFAULT]";

    /* renamed from: m */
    public static final Object f80146m = new Object();
    @C0323b0("LOCK")

    /* renamed from: n */
    public static final Map<String, C33033f> f80147n = new C1866a();

    /* renamed from: a */
    public final Context f80148a;

    /* renamed from: b */
    public final String f80149b;

    /* renamed from: c */
    public final C33262n f80150c;

    /* renamed from: d */
    public final C32600s f80151d;

    /* renamed from: e */
    public final AtomicBoolean f80152e = new AtomicBoolean(false);

    /* renamed from: f */
    public final AtomicBoolean f80153f = new AtomicBoolean();

    /* renamed from: g */
    public final C32611y<C33127a> f80154g;

    /* renamed from: h */
    public final C33058b<C33046g> f80155h;

    /* renamed from: i */
    public final List<C33034a> f80156i = new CopyOnWriteArrayList();

    /* renamed from: j */
    public final List<C33038g> f80157j = new CopyOnWriteArrayList();

    @C40473a
    /* renamed from: com.google.firebase.f$a */
    public interface C33034a {
        @C40473a
        /* renamed from: a */
        void mo95623a(boolean z);
    }

    @TargetApi(14)
    /* renamed from: com.google.firebase.f$b */
    public static class C33035b implements C40531d.C40532a {

        /* renamed from: a */
        public static AtomicReference<C33035b> f80158a = new AtomicReference<>();

        /* renamed from: c */
        public static void m133361c(Context context) {
            if (C40996v.m166678c() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f80158a.get() == null) {
                    C33035b bVar = new C33035b();
                    if (C1814q.m7242a(f80158a, (Object) null, bVar)) {
                        C40531d.m164958c(application);
                        C40531d.m164957b().mo133850a(bVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo95728a(boolean z) {
            synchronized (C33033f.f80146m) {
                Iterator it = new ArrayList(C33033f.f80147n.values()).iterator();
                while (it.hasNext()) {
                    C33033f fVar = (C33033f) it.next();
                    if (fVar.f80152e.get()) {
                        fVar.mo95707F(z);
                    }
                }
            }
        }
    }

    @TargetApi(24)
    /* renamed from: com.google.firebase.f$c */
    public static class C33036c extends BroadcastReceiver {

        /* renamed from: b */
        public static AtomicReference<C33036c> f80159b = new AtomicReference<>();

        /* renamed from: a */
        public final Context f80160a;

        public C33036c(Context context) {
            this.f80160a = context;
        }

        /* renamed from: b */
        public static void m133364b(Context context) {
            if (f80159b.get() == null) {
                C33036c cVar = new C33036c(context);
                if (C1814q.m7242a(f80159b, (Object) null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void mo95729c() {
            this.f80160a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (C33033f.f80146m) {
                for (C33033f d : C33033f.f80147n.values()) {
                    d.mo95726v();
                }
            }
            mo95729c();
        }
    }

    public C33033f(Context context, String str, C33262n nVar) {
        this.f80148a = (Context) C40843u.m166202l(context);
        this.f80149b = C40843u.m166198h(str);
        this.f80150c = (C33262n) C40843u.m166202l(nVar);
        C33277p b = FirebaseInitProvider.m135091b();
        C33592c.m135333b(C33202j0.f80717a);
        C33592c.m135333b(C32588j.f79074c);
        List<C33058b<ComponentRegistrar>> c = C32588j.m131686d(context, ComponentDiscoveryService.class).mo94715c();
        C33592c.m135332a();
        C33592c.m135333b("Runtime");
        C32600s.C32602b g = C32600s.m131703o(UiExecutor.INSTANCE).mo94734d(c).mo94733c(new FirebaseCommonRegistrar()).mo94733c(new ExecutorsRegistrar()).mo94732b(C32580g.m131628D(context, Context.class, new Class[0])).mo94732b(C32580g.m131628D(this, C33033f.class, new Class[0])).mo94732b(C32580g.m131628D(nVar, C33262n.class, new Class[0])).mo94736g(new C33591b());
        if (C17842w0.m81309a(context) && FirebaseInitProvider.m135092c()) {
            g.mo94732b(C32580g.m131628D(b, C33277p.class, new Class[0]));
        }
        C32600s e = g.mo94735e();
        this.f80151d = e;
        C33592c.m135332a();
        this.f80154g = new C32611y<>(new C32976d(this, context));
        this.f80155h = e.mo94710h(C33046g.class);
        mo95715g(new C32992e(this));
        C33592c.m135332a();
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ C33127a m133321C(Context context) {
        return new C33127a(context, mo95724t(), (C33031c) this.f80151d.get(C33031c.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m133322D(boolean z) {
        if (!z) {
            this.f80155h.get().mo95748l();
        }
    }

    /* renamed from: E */
    public static String m133323E(@C0359n0 String str) {
        return str.trim();
    }

    @C0344h1
    /* renamed from: j */
    public static void m133330j() {
        synchronized (f80146m) {
            f80147n.clear();
        }
    }

    /* renamed from: m */
    public static List<String> m133331m() {
        ArrayList arrayList = new ArrayList();
        synchronized (f80146m) {
            for (C33033f r : f80147n.values()) {
                arrayList.add(r.mo95722r());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @C0359n0
    /* renamed from: o */
    public static List<C33033f> m133332o(@C0359n0 Context context) {
        ArrayList arrayList;
        synchronized (f80146m) {
            arrayList = new ArrayList(f80147n.values());
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: p */
    public static C33033f m133333p() {
        C33033f fVar;
        synchronized (f80146m) {
            fVar = f80147n.get(f80145l);
            if (fVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C40998x.m166697a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return fVar;
    }

    @C0359n0
    /* renamed from: q */
    public static C33033f m133334q(@C0359n0 String str) {
        C33033f fVar;
        String str2;
        synchronized (f80146m) {
            fVar = f80147n.get(m133323E(str));
            if (fVar != null) {
                fVar.f80155h.get().mo95748l();
            } else {
                List<String> m = m133331m();
                if (m.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", m);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", new Object[]{str, str2}));
            }
        }
        return fVar;
    }

    @C40473a
    /* renamed from: u */
    public static String m133335u(String str, C33262n nVar) {
        return C40967c.m166598f(str.getBytes(Charset.defaultCharset())) + C31132a.f74628J0 + C40967c.m166598f(nVar.mo96248j().getBytes(Charset.defaultCharset()));
    }

    @C0363p0
    /* renamed from: x */
    public static C33033f m133336x(@C0359n0 Context context) {
        synchronized (f80146m) {
            if (f80147n.containsKey(f80145l)) {
                C33033f p = m133333p();
                return p;
            }
            C33262n h = C33262n.m134154h(context);
            if (h == null) {
                return null;
            }
            C33033f y = m133337y(context, h);
            return y;
        }
    }

    @C0359n0
    /* renamed from: y */
    public static C33033f m133337y(@C0359n0 Context context, @C0359n0 C33262n nVar) {
        return m133338z(context, nVar, f80145l);
    }

    @C0359n0
    /* renamed from: z */
    public static C33033f m133338z(@C0359n0 Context context, @C0359n0 C33262n nVar, @C0359n0 String str) {
        boolean z;
        C33033f fVar;
        C33035b.m133361c(context);
        String E = m133323E(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f80146m) {
            Map<String, C33033f> map = f80147n;
            if (!map.containsKey(E)) {
                z = true;
            } else {
                z = false;
            }
            C40843u.m166209s(z, "FirebaseApp name " + E + " already exists!");
            C40843u.m166203m(context, "Application context cannot be null.");
            fVar = new C33033f(context, E, nVar);
            map.put(E, fVar);
        }
        fVar.mo95726v();
        return fVar;
    }

    @C40473a
    /* renamed from: A */
    public boolean mo95705A() {
        mo95718i();
        return this.f80154g.get().mo95913b();
    }

    @C40473a
    @C0344h1
    /* renamed from: B */
    public boolean mo95706B() {
        return f80145l.equals(mo95722r());
    }

    /* renamed from: F */
    public final void mo95707F(boolean z) {
        for (C33034a a : this.f80156i) {
            a.mo95623a(z);
        }
    }

    /* renamed from: G */
    public final void mo95708G() {
        for (C33038g a : this.f80157j) {
            a.mo95731a(this.f80149b, this.f80150c);
        }
    }

    @C40473a
    /* renamed from: H */
    public void mo95709H(C33034a aVar) {
        mo95718i();
        this.f80156i.remove(aVar);
    }

    @C40473a
    /* renamed from: I */
    public void mo95710I(@C0359n0 C33038g gVar) {
        mo95718i();
        C40843u.m166202l(gVar);
        this.f80157j.remove(gVar);
    }

    /* renamed from: J */
    public void mo95711J(boolean z) {
        mo95718i();
        if (this.f80152e.compareAndSet(!z, z)) {
            boolean d = C40531d.m164957b().mo133851d();
            if (z && d) {
                mo95707F(true);
            } else if (!z && d) {
                mo95707F(false);
            }
        }
    }

    @C40473a
    /* renamed from: K */
    public void mo95712K(Boolean bool) {
        mo95718i();
        this.f80154g.get().mo95916e(bool);
    }

    @C40473a
    @Deprecated
    /* renamed from: L */
    public void mo95713L(boolean z) {
        mo95712K(Boolean.valueOf(z));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C33033f)) {
            return false;
        }
        return this.f80149b.equals(((C33033f) obj).mo95722r());
    }

    @C40473a
    /* renamed from: g */
    public void mo95715g(C33034a aVar) {
        mo95718i();
        if (this.f80152e.get() && C40531d.m164957b().mo133851d()) {
            aVar.mo95623a(true);
        }
        this.f80156i.add(aVar);
    }

    @C40473a
    /* renamed from: h */
    public void mo95716h(@C0359n0 C33038g gVar) {
        mo95718i();
        C40843u.m166202l(gVar);
        this.f80157j.add(gVar);
    }

    public int hashCode() {
        return this.f80149b.hashCode();
    }

    /* renamed from: i */
    public final void mo95718i() {
        C40843u.m166209s(!this.f80153f.get(), "FirebaseApp was deleted");
    }

    /* renamed from: k */
    public void mo95719k() {
        if (this.f80153f.compareAndSet(false, true)) {
            synchronized (f80146m) {
                f80147n.remove(this.f80149b);
            }
            mo95708G();
        }
    }

    @C40473a
    /* renamed from: l */
    public <T> T mo95720l(Class<T> cls) {
        mo95718i();
        return this.f80151d.get(cls);
    }

    @C0359n0
    /* renamed from: n */
    public Context mo95721n() {
        mo95718i();
        return this.f80148a;
    }

    @C0359n0
    /* renamed from: r */
    public String mo95722r() {
        mo95718i();
        return this.f80149b;
    }

    @C0359n0
    /* renamed from: s */
    public C33262n mo95723s() {
        mo95718i();
        return this.f80150c;
    }

    @C40473a
    /* renamed from: t */
    public String mo95724t() {
        return C40967c.m166598f(mo95722r().getBytes(Charset.defaultCharset())) + C31132a.f74628J0 + C40967c.m166598f(mo95723s().mo96248j().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return C40808s.m166012d(this).mo134475a("name", this.f80149b).mo134475a("options", this.f80150c).toString();
    }

    /* renamed from: v */
    public final void mo95726v() {
        if (!C17842w0.m81309a(this.f80148a)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            sb.append(mo95722r());
            C33036c.m133364b(this.f80148a);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Device unlocked: initializing all Firebase APIs for app ");
        sb2.append(mo95722r());
        this.f80151d.mo94730t(mo95706B());
        this.f80155h.get().mo95748l();
    }

    @C0344h1
    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: w */
    public void mo95727w() {
        this.f80151d.mo94729s();
    }
}
