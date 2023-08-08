package com.urbanairship.automation.limits;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36044d;
import com.urbanairship.C36059m;
import com.urbanairship.C36062p;
import com.urbanairship.automation.limits.storage.C8915a;
import com.urbanairship.automation.limits.storage.C8916b;
import com.urbanairship.automation.limits.storage.C8922d;
import com.urbanairship.automation.limits.storage.FrequencyLimitDatabase;
import com.urbanairship.config.C9061a;
import com.urbanairship.util.C9656j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.automation.limits.c */
public class C8909c {

    /* renamed from: a */
    public final Map<C8915a, List<C8922d>> f23876a;

    /* renamed from: b */
    public final List<C8922d> f23877b;

    /* renamed from: c */
    public final Object f23878c;

    /* renamed from: d */
    public final C8916b f23879d;

    /* renamed from: e */
    public final C9656j f23880e;

    /* renamed from: f */
    public final Executor f23881f;

    /* renamed from: com.urbanairship.automation.limits.c$a */
    public class C8910a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Collection f23882a;

        /* renamed from: b */
        public final /* synthetic */ C36062p f23883b;

        /* renamed from: com.urbanairship.automation.limits.c$a$a */
        public class C8911a implements C8905a {

            /* renamed from: a */
            public final /* synthetic */ Collection f23885a;

            public C8911a(Collection collection) {
                this.f23885a = collection;
            }

            /* renamed from: a */
            public boolean mo17536a() {
                return C8909c.this.mo17553k(this.f23885a);
            }

            /* renamed from: b */
            public boolean mo17537b() {
                return C8909c.this.mo17548f(this.f23885a);
            }
        }

        public C8910a(Collection collection, C36062p pVar) {
            this.f23882a = collection;
            this.f23883b = pVar;
        }

        public void run() {
            try {
                this.f23883b.mo107828g(new C8911a(C8909c.this.mo17549g(this.f23882a)));
            } catch (Exception unused) {
                C36059m.m148409e("Failed to fetch constraints.", new Object[0]);
                this.f23883b.mo107828g(null);
            }
        }
    }

    /* renamed from: com.urbanairship.automation.limits.c$b */
    public class C8912b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Collection f23887a;

        /* renamed from: b */
        public final /* synthetic */ C36062p f23888b;

        public C8912b(Collection collection, C36062p pVar) {
            this.f23887a = collection;
            this.f23888b = pVar;
        }

        public void run() {
            try {
                List<C8915a> e = C8909c.this.f23879d.mo17578e();
                HashMap hashMap = new HashMap();
                for (C8915a next : e) {
                    hashMap.put(next.f23894b, next);
                }
                for (C8906b bVar : this.f23887a) {
                    C8915a aVar = new C8915a();
                    aVar.f23894b = bVar.mo17539b();
                    aVar.f23895c = bVar.mo17538a();
                    aVar.f23896d = bVar.mo17540c();
                    C8915a aVar2 = (C8915a) hashMap.remove(bVar.mo17539b());
                    if (aVar2 == null) {
                        C8909c.this.f23879d.mo17575b(aVar);
                    } else if (aVar2.f23896d != aVar.f23896d) {
                        C8909c.this.f23879d.mo17576c(aVar2);
                        C8909c.this.f23879d.mo17575b(aVar);
                    } else {
                        C8909c.this.f23879d.mo17574a(aVar);
                    }
                }
                C8909c.this.f23879d.mo17577d(hashMap.keySet());
                this.f23888b.mo107828g(Boolean.TRUE);
            } catch (Exception e2) {
                C36059m.m148411g(e2, "Failed to update constraints", new Object[0]);
                this.f23888b.mo107828g(Boolean.FALSE);
            }
        }
    }

    /* renamed from: com.urbanairship.automation.limits.c$c */
    public class C8913c implements Runnable {
        public C8913c() {
        }

        public void run() {
            C8909c.this.mo17556n();
        }
    }

    public C8909c(@C0359n0 Context context, @C0359n0 C9061a aVar) {
        this(FrequencyLimitDatabase.m33069Q(context, aVar).mo17560R(), C9656j.f26468a, C36044d.m148369a());
    }

    /* renamed from: f */
    public final boolean mo17548f(@C0359n0 Collection<C8915a> collection) {
        if (collection.isEmpty()) {
            return true;
        }
        synchronized (this.f23878c) {
            if (mo17553k(collection)) {
                return false;
            }
            mo17554l(mo17550h(collection));
            return true;
        }
    }

    @C0359n0
    /* renamed from: g */
    public final Collection<C8915a> mo17549g(@C0363p0 Collection<String> collection) {
        if (collection == null || collection.isEmpty()) {
            return Collections.emptyList();
        }
        List<C8915a> h = this.f23879d.mo17581h(collection);
        for (C8915a next : h) {
            List<C8922d> f = this.f23879d.mo17579f(next.f23894b);
            synchronized (this.f23878c) {
                for (C8922d next2 : this.f23877b) {
                    if (next2.f23907b.equals(next.f23894b)) {
                        f.add(next2);
                    }
                }
                this.f23876a.put(next, f);
            }
        }
        return h;
    }

    @C0359n0
    /* renamed from: h */
    public final Set<String> mo17550h(@C0359n0 Collection<C8915a> collection) {
        HashSet hashSet = new HashSet();
        for (C8915a aVar : collection) {
            hashSet.add(aVar.f23894b);
        }
        return hashSet;
    }

    @C0359n0
    /* renamed from: i */
    public Future<C8905a> mo17551i(@C0363p0 Collection<String> collection) {
        C36062p pVar = new C36062p();
        this.f23881f.execute(new C8910a(collection, pVar));
        return pVar;
    }

    /* renamed from: j */
    public final boolean mo17552j(@C0359n0 C8915a aVar) {
        List list = this.f23876a.get(aVar);
        if (list == null || list.size() < aVar.f23895c || this.f23880e.mo19623a() - ((C8922d) list.get(list.size() - aVar.f23895c)).f23908c > aVar.f23896d) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final boolean mo17553k(@C0359n0 Collection<C8915a> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        synchronized (this.f23878c) {
            for (C8915a j : collection) {
                if (mo17552j(j)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: l */
    public final void mo17554l(@C0359n0 Set<String> set) {
        if (!set.isEmpty()) {
            long a = this.f23880e.mo19623a();
            for (String next : set) {
                C8922d dVar = new C8922d();
                dVar.f23907b = next;
                dVar.f23908c = a;
                this.f23877b.add(dVar);
                for (Map.Entry next2 : this.f23876a.entrySet()) {
                    C8915a aVar = (C8915a) next2.getKey();
                    if (aVar != null && next.equals(aVar.f23894b)) {
                        ((List) next2.getValue()).add(dVar);
                    }
                }
            }
            this.f23881f.execute(new C8913c());
        }
    }

    /* renamed from: m */
    public Future<Boolean> mo17555m(@C0359n0 Collection<C8906b> collection) {
        C36062p pVar = new C36062p();
        this.f23881f.execute(new C8912b(collection, pVar));
        return pVar;
    }

    /* renamed from: n */
    public final void mo17556n() {
        ArrayList<C8922d> arrayList;
        synchronized (this.f23878c) {
            arrayList = new ArrayList<>(this.f23877b);
            this.f23877b.clear();
        }
        for (C8922d g : arrayList) {
            try {
                this.f23879d.mo17580g(g);
            } catch (SQLiteException e) {
                C36059m.m148420p(e);
            }
        }
    }

    @C0344h1
    public C8909c(@C0359n0 C8916b bVar, @C0359n0 C9656j jVar, @C0359n0 Executor executor) {
        this.f23876a = new WeakHashMap();
        this.f23877b = new ArrayList();
        this.f23878c = new Object();
        this.f23879d = bVar;
        this.f23880e = jVar;
        this.f23881f = executor;
    }
}
