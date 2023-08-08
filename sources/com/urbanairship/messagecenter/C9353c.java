package com.urbanairship.messagecenter;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.C36044d;
import com.urbanairship.C36050h;
import com.urbanairship.C36051i;
import com.urbanairship.C36059m;
import com.urbanairship.C36064q;
import com.urbanairship.C36071u;
import com.urbanairship.UAirship;
import com.urbanairship.app.C36030b;
import com.urbanairship.app.C36031c;
import com.urbanairship.app.C36035g;
import com.urbanairship.channel.C9008d;
import com.urbanairship.channel.C9016e;
import com.urbanairship.channel.C9029l;
import com.urbanairship.job.C9302e;
import com.urbanairship.job.C9304f;
import com.urbanairship.job.JobResult;
import com.urbanairship.json.C9323b;
import com.urbanairship.messagecenter.C9420z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.urbanairship.messagecenter.c */
public class C9353c {

    /* renamed from: x */
    public static final C9365l f25550x = new C9365l();

    /* renamed from: y */
    public static final Object f25551y = new Object();

    /* renamed from: a */
    public final List<C9370f> f25552a;

    /* renamed from: b */
    public final Set<String> f25553b;

    /* renamed from: c */
    public final Map<String, C9371g> f25554c;

    /* renamed from: d */
    public final Map<String, C9371g> f25555d;

    /* renamed from: e */
    public final Map<String, C9371g> f25556e;

    /* renamed from: f */
    public final C9378j f25557f;

    /* renamed from: g */
    public final C9420z f25558g;

    /* renamed from: h */
    public final Executor f25559h;

    /* renamed from: i */
    public final Context f25560i;

    /* renamed from: j */
    public final Handler f25561j;

    /* renamed from: k */
    public final C36071u f25562k;

    /* renamed from: l */
    public final C9302e f25563l;

    /* renamed from: m */
    public final C36031c f25564m;

    /* renamed from: n */
    public final C9016e f25565n;

    /* renamed from: o */
    public final C9008d.C9015g f25566o;

    /* renamed from: p */
    public final C9420z.C9421a f25567p;

    /* renamed from: q */
    public final C36030b f25568q;

    /* renamed from: r */
    public final C9008d f25569r;

    /* renamed from: s */
    public boolean f25570s;
    @C0363p0
    @C0344h1

    /* renamed from: t */
    public C9369e f25571t;

    /* renamed from: u */
    public final AtomicBoolean f25572u;

    /* renamed from: v */
    public final AtomicBoolean f25573v;

    /* renamed from: w */
    public final List<C9364k> f25574w;

    /* renamed from: com.urbanairship.messagecenter.c$a */
    public class C9354a implements C36031c {

        /* renamed from: a */
        public final /* synthetic */ C9302e f25575a;

        public C9354a(C9302e eVar) {
            this.f25575a = eVar;
        }

        /* renamed from: a */
        public void mo17410a(long j) {
            this.f25575a.mo18704c(C9304f.m34907i().mo18725k(C9369e.f25603g).mo18726l(C9372h.class).mo18728n(2).mo18724j());
        }

        /* renamed from: b */
        public void mo17411b(long j) {
            this.f25575a.mo18704c(C9304f.m34907i().mo18725k(C9369e.f25604h).mo18726l(C9372h.class).mo18728n(2).mo18724j());
        }
    }

    /* renamed from: com.urbanairship.messagecenter.c$b */
    public class C9355b implements C9016e {
        public C9355b() {
        }

        /* renamed from: a */
        public void mo17818a(@C0359n0 String str) {
            C9353c.this.mo18923f(true);
        }

        /* renamed from: b */
        public void mo17819b(@C0359n0 String str) {
        }
    }

    /* renamed from: com.urbanairship.messagecenter.c$c */
    public class C9356c implements C9008d.C9015g {
        public C9356c() {
        }

        @C0359n0
        /* renamed from: a */
        public C9029l.C9031b mo17825a(@C0359n0 C9029l.C9031b bVar) {
            return bVar.mo17874Q(C9353c.this.mo18940w().mo19088d());
        }
    }

    /* renamed from: com.urbanairship.messagecenter.c$d */
    public class C9357d implements C9420z.C9421a {
        public C9357d() {
        }

        /* renamed from: a */
        public void mo18944a(boolean z) {
            if (z) {
                C9353c.this.mo18926i();
            }
        }
    }

    /* renamed from: com.urbanairship.messagecenter.c$e */
    public class C9358e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Set f25580a;

        public C9358e(Set set) {
            this.f25580a = set;
        }

        public void run() {
            C9353c.this.f25557f.mo19032v(new ArrayList(this.f25580a));
        }
    }

    /* renamed from: com.urbanairship.messagecenter.c$f */
    public class C9359f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Set f25582a;

        public C9359f(Set set) {
            this.f25582a = set;
        }

        public void run() {
            C9353c.this.f25557f.mo19036z(new ArrayList(this.f25582a));
        }
    }

    /* renamed from: com.urbanairship.messagecenter.c$g */
    public class C9360g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Set f25584a;

        public C9360g(Set set) {
            this.f25584a = set;
        }

        public void run() {
            C9353c.this.f25557f.mo19030t(new ArrayList(this.f25584a));
        }
    }

    /* renamed from: com.urbanairship.messagecenter.c$h */
    public class C9361h implements Runnable {
        public C9361h() {
        }

        public void run() {
            C9353c.this.f25557f.mo19013b();
        }
    }

    /* renamed from: com.urbanairship.messagecenter.c$i */
    public class C9362i implements Runnable {
        public C9362i() {
        }

        public void run() {
            for (C9370f a : C9353c.this.f25552a) {
                a.mo18875a();
            }
        }
    }

    /* renamed from: com.urbanairship.messagecenter.c$j */
    public interface C9363j {
        /* renamed from: a */
        void mo18950a(boolean z);
    }

    /* renamed from: com.urbanairship.messagecenter.c$k */
    public static class C9364k extends C36051i {

        /* renamed from: v */
        public final C9363j f25588v;

        /* renamed from: w */
        public boolean f25589w;

        public C9364k(C9363j jVar, Looper looper) {
            super(looper);
            this.f25588v = jVar;
        }

        /* renamed from: h */
        public void mo17473h() {
            C9363j jVar = this.f25588v;
            if (jVar != null) {
                jVar.mo18950a(this.f25589w);
            }
        }
    }

    /* renamed from: com.urbanairship.messagecenter.c$l */
    public static class C9365l implements Comparator<C9371g> {
        /* renamed from: a */
        public int compare(@C0359n0 C9371g gVar, @C0359n0 C9371g gVar2) {
            if (gVar2.mo18987i0() == gVar.mo18987i0()) {
                return gVar.mo18977W().compareTo(gVar2.mo18977W());
            }
            return Long.valueOf(gVar2.mo18987i0()).compareTo(Long.valueOf(gVar.mo18987i0()));
        }
    }

    public C9353c(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C9008d dVar, @C0359n0 AirshipConfigOptions airshipConfigOptions) {
        this(context, uVar, C9302e.m34896n(context), new C9420z(uVar, dVar), MessageDatabase.m35119Q(context, airshipConfigOptions).mo18895S(), C36044d.m148369a(), C36035g.m148341t(context), dVar);
    }

    /* renamed from: A */
    public final void mo18912A() {
        this.f25561j.post(new C9362i());
    }

    @C0348i1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: B */
    public JobResult mo18913B(@C0359n0 UAirship uAirship, @C0359n0 C9304f fVar) {
        if (!this.f25572u.get()) {
            return JobResult.SUCCESS;
        }
        if (this.f25571t == null) {
            this.f25571t = new C9369e(this.f25560i, this, mo18940w(), this.f25569r, uAirship.mo106205G(), this.f25562k, this.f25557f);
        }
        return this.f25571t.mo18968e(fVar);
    }

    /* renamed from: C */
    public void mo18914C(boolean z) {
        synchronized (this.f25574w) {
            for (C9364k next : this.f25574w) {
                next.f25589w = z;
                next.run();
            }
            this.f25570s = false;
            this.f25574w.clear();
        }
    }

    /* renamed from: D */
    public void mo18915D(boolean z) {
        List<C9383m> m = this.f25557f.mo19024m();
        synchronized (f25551y) {
            HashSet hashSet = new HashSet(this.f25554c.keySet());
            HashSet hashSet2 = new HashSet(this.f25555d.keySet());
            HashSet hashSet3 = new HashSet(this.f25553b);
            this.f25554c.clear();
            this.f25555d.clear();
            this.f25556e.clear();
            for (C9383m next : m) {
                C9371g a = next.mo19041a(next);
                if (a != null) {
                    if (!a.mo18989m0()) {
                        if (!hashSet3.contains(a.mo18977W())) {
                            if (a.mo18990n0()) {
                                this.f25553b.add(a.mo18977W());
                            } else {
                                this.f25556e.put(a.mo18976Q(), a);
                                if (hashSet.contains(a.mo18977W())) {
                                    a.f25626X = true;
                                    this.f25554c.put(a.mo18977W(), a);
                                } else if (hashSet2.contains(a.mo18977W())) {
                                    a.f25626X = false;
                                    this.f25555d.put(a.mo18977W(), a);
                                } else if (a.f25626X) {
                                    this.f25554c.put(a.mo18977W(), a);
                                } else {
                                    this.f25555d.put(a.mo18977W(), a);
                                }
                            }
                        }
                    }
                    this.f25553b.add(a.mo18977W());
                }
            }
        }
        if (z) {
            mo18912A();
        }
    }

    /* renamed from: E */
    public void mo18916E(@C0359n0 C9370f fVar) {
        this.f25552a.remove(fVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: F */
    public void mo18917F(boolean z) {
        this.f25572u.set(z);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: G */
    public void mo18918G() {
        this.f25568q.mo18481b(this.f25564m);
        this.f25569r.mo17807q0(this.f25565n);
        this.f25569r.mo17808r0(this.f25566o);
        this.f25558g.mo19095l(this.f25567p);
        this.f25573v.set(false);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: H */
    public void mo18919H() {
        if (!this.f25572u.get()) {
            mo18921d();
            C9369e eVar = this.f25571t;
            if (eVar != null) {
                eVar.mo18969f();
            }
            mo18918G();
        } else if (!this.f25573v.getAndSet(true)) {
            this.f25558g.mo19087a(this.f25567p);
            mo18915D(false);
            this.f25568q.mo18485f(this.f25564m);
            this.f25569r.mo17780M(this.f25565n);
            if (this.f25558g.mo19098o()) {
                mo18923f(true);
            }
            this.f25569r.mo17781N(this.f25566o);
        }
    }

    /* renamed from: c */
    public void mo18920c(@C0359n0 C9370f fVar) {
        this.f25552a.add(fVar);
    }

    /* renamed from: d */
    public final void mo18921d() {
        this.f25559h.execute(new C9361h());
        synchronized (f25551y) {
            this.f25554c.clear();
            this.f25555d.clear();
            this.f25553b.clear();
        }
        mo18912A();
    }

    /* renamed from: e */
    public void mo18922e(@C0359n0 Set<String> set) {
        this.f25559h.execute(new C9360g(set));
        synchronized (f25551y) {
            for (String next : set) {
                C9371g l = mo18929l(next);
                if (l != null) {
                    l.f25638z = true;
                    this.f25554c.remove(next);
                    this.f25555d.remove(next);
                    this.f25553b.add(next);
                }
            }
        }
        mo18912A();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f */
    public void mo18923f(boolean z) {
        int i = 0;
        C36059m.m148406b("Updating user.", new Object[0]);
        C9304f.C9306b o = C9304f.m34907i().mo18725k(C9369e.f25605i).mo18726l(C9372h.class).mo18729o(C9323b.m35017y().mo18824h(C9369e.f25606j, z).mo18817a());
        if (!z) {
            i = 2;
        }
        this.f25563l.mo18704c(o.mo18728n(i).mo18724j());
    }

    @C0363p0
    /* renamed from: g */
    public C36050h mo18924g(@C0363p0 Looper looper, @C0363p0 C9363j jVar) {
        C9364k kVar = new C9364k(jVar, looper);
        synchronized (this.f25574w) {
            this.f25574w.add(kVar);
            if (!this.f25570s) {
                this.f25563l.mo18704c(C9304f.m34907i().mo18725k(C9369e.f25603g).mo18726l(C9372h.class).mo18728n(0).mo18724j());
            }
            this.f25570s = true;
        }
        return kVar;
    }

    @C0363p0
    /* renamed from: h */
    public C36050h mo18925h(@C0363p0 C9363j jVar) {
        return mo18924g((Looper) null, jVar);
    }

    /* renamed from: i */
    public void mo18926i() {
        mo18924g((Looper) null, (C9363j) null);
    }

    @C0359n0
    /* renamed from: j */
    public final Collection<C9371g> mo18927j(@C0359n0 Collection<C9371g> collection, @C0363p0 C36064q<C9371g> qVar) {
        ArrayList arrayList = new ArrayList();
        if (qVar == null) {
            return collection;
        }
        for (C9371g next : collection) {
            if (qVar.apply(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public int mo18928k() {
        int size;
        synchronized (f25551y) {
            size = this.f25554c.size() + this.f25555d.size();
        }
        return size;
    }

    @C0363p0
    /* renamed from: l */
    public C9371g mo18929l(@C0363p0 String str) {
        if (str == null) {
            return null;
        }
        synchronized (f25551y) {
            if (this.f25554c.containsKey(str)) {
                C9371g gVar = this.f25554c.get(str);
                return gVar;
            }
            C9371g gVar2 = this.f25555d.get(str);
            return gVar2;
        }
    }

    @C0363p0
    /* renamed from: m */
    public C9371g mo18930m(@C0363p0 String str) {
        C9371g gVar;
        if (str == null) {
            return null;
        }
        synchronized (f25551y) {
            gVar = this.f25556e.get(str);
        }
        return gVar;
    }

    @C0359n0
    /* renamed from: n */
    public Set<String> mo18931n() {
        HashSet hashSet;
        synchronized (f25551y) {
            hashSet = new HashSet(mo18928k());
            hashSet.addAll(this.f25555d.keySet());
            hashSet.addAll(this.f25554c.keySet());
        }
        return hashSet;
    }

    @C0359n0
    /* renamed from: o */
    public List<C9371g> mo18932o() {
        return mo18933p((C36064q<C9371g>) null);
    }

    @C0359n0
    /* renamed from: p */
    public List<C9371g> mo18933p(@C0363p0 C36064q<C9371g> qVar) {
        ArrayList arrayList;
        synchronized (f25551y) {
            arrayList = new ArrayList();
            arrayList.addAll(mo18927j(this.f25554c.values(), qVar));
            arrayList.addAll(mo18927j(this.f25555d.values(), qVar));
            Collections.sort(arrayList, f25550x);
        }
        return arrayList;
    }

    /* renamed from: q */
    public int mo18934q() {
        int size;
        synchronized (f25551y) {
            size = this.f25555d.size();
        }
        return size;
    }

    @C0359n0
    /* renamed from: r */
    public List<C9371g> mo18935r() {
        return mo18936s((C36064q<C9371g>) null);
    }

    @C0359n0
    /* renamed from: s */
    public List<C9371g> mo18936s(@C0363p0 C36064q<C9371g> qVar) {
        ArrayList arrayList;
        synchronized (f25551y) {
            arrayList = new ArrayList(mo18927j(this.f25555d.values(), qVar));
            Collections.sort(arrayList, f25550x);
        }
        return arrayList;
    }

    /* renamed from: t */
    public int mo18937t() {
        int size;
        synchronized (f25551y) {
            size = this.f25554c.size();
        }
        return size;
    }

    @C0359n0
    /* renamed from: u */
    public List<C9371g> mo18938u() {
        return mo18939v((C36064q<C9371g>) null);
    }

    @C0359n0
    /* renamed from: v */
    public List<C9371g> mo18939v(@C0363p0 C36064q<C9371g> qVar) {
        ArrayList arrayList;
        synchronized (f25551y) {
            arrayList = new ArrayList(mo18927j(this.f25554c.values(), qVar));
            Collections.sort(arrayList, f25550x);
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: w */
    public C9420z mo18940w() {
        return this.f25558g;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: x */
    public void mo18941x() {
        mo18919H();
    }

    /* renamed from: y */
    public void mo18942y(@C0359n0 Set<String> set) {
        this.f25559h.execute(new C9358e(set));
        synchronized (f25551y) {
            for (String next : set) {
                C9371g gVar = this.f25554c.get(next);
                if (gVar != null) {
                    gVar.f25626X = false;
                    this.f25554c.remove(next);
                    this.f25555d.put(next, gVar);
                }
            }
            mo18912A();
        }
    }

    /* renamed from: z */
    public void mo18943z(@C0359n0 Set<String> set) {
        this.f25559h.execute(new C9359f(set));
        synchronized (f25551y) {
            for (String next : set) {
                C9371g gVar = this.f25555d.get(next);
                if (gVar != null) {
                    gVar.f25626X = true;
                    this.f25555d.remove(next);
                    this.f25554c.put(next, gVar);
                }
            }
        }
        mo18912A();
    }

    @C0344h1
    public C9353c(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C9302e eVar, @C0359n0 C9420z zVar, @C0359n0 C9378j jVar, @C0359n0 Executor executor, @C0359n0 C36030b bVar, @C0359n0 C9008d dVar) {
        this.f25552a = new CopyOnWriteArrayList();
        this.f25553b = new HashSet();
        this.f25554c = new HashMap();
        this.f25555d = new HashMap();
        this.f25556e = new HashMap();
        this.f25561j = new Handler(Looper.getMainLooper());
        this.f25570s = false;
        this.f25572u = new AtomicBoolean(false);
        this.f25573v = new AtomicBoolean(false);
        this.f25574w = new ArrayList();
        this.f25560i = context.getApplicationContext();
        this.f25562k = uVar;
        this.f25558g = zVar;
        this.f25557f = jVar;
        this.f25559h = executor;
        this.f25563l = eVar;
        this.f25569r = dVar;
        this.f25564m = new C9354a(eVar);
        this.f25565n = new C9355b();
        this.f25566o = new C9356c();
        this.f25567p = new C9357d();
        this.f25568q = bVar;
    }
}
