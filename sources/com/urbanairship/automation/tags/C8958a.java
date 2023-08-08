package com.urbanairship.automation.tags;

import androidx.annotation.C0359n0;
import com.urbanairship.channel.C9004a0;
import com.urbanairship.channel.C9008d;
import com.urbanairship.channel.C9024h;
import com.urbanairship.channel.C9025i;
import com.urbanairship.channel.C9058x;
import com.urbanairship.contacts.C9074e;
import com.urbanairship.contacts.C9087m;
import com.urbanairship.util.C9656j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.urbanairship.automation.tags.a */
public class C8958a {

    /* renamed from: a */
    public final C9656j f24050a;

    /* renamed from: b */
    public final C9008d f24051b;

    /* renamed from: c */
    public final C9074e f24052c;

    /* renamed from: d */
    public final List<C8964f<C9004a0>> f24053d = new ArrayList();

    /* renamed from: e */
    public final List<C8964f<C9025i>> f24054e = new ArrayList();

    /* renamed from: com.urbanairship.automation.tags.a$a */
    public class C8959a implements C9058x {
        public C8959a() {
        }

        /* renamed from: a */
        public void mo17695a(@C0359n0 List<C9004a0> list) {
            C8958a.this.mo17694j(list, 1);
        }
    }

    /* renamed from: com.urbanairship.automation.tags.a$b */
    public class C8960b implements C9024h {
        public C8960b() {
        }

        /* renamed from: a */
        public void mo17696a(@C0359n0 List<C9025i> list) {
            C8958a.this.mo17693i(list, 1);
        }
    }

    /* renamed from: com.urbanairship.automation.tags.a$c */
    public class C8961c implements C9058x {
        public C8961c() {
        }

        /* renamed from: a */
        public void mo17695a(@C0359n0 List<C9004a0> list) {
            C8958a.this.mo17694j(list, 1);
        }
    }

    /* renamed from: com.urbanairship.automation.tags.a$d */
    public class C8962d implements C9024h {
        public C8962d() {
        }

        /* renamed from: a */
        public void mo17696a(@C0359n0 List<C9025i> list) {
            C8958a.this.mo17693i(list, 1);
        }
    }

    /* renamed from: com.urbanairship.automation.tags.a$e */
    public class C8963e implements C9087m {
        public C8963e() {
        }

        /* renamed from: a */
        public void mo17697a() {
            C8958a.this.mo17688d();
        }
    }

    /* renamed from: com.urbanairship.automation.tags.a$f */
    public static class C8964f<T> {

        /* renamed from: d */
        public static final int f24060d = 0;

        /* renamed from: e */
        public static final int f24061e = 1;

        /* renamed from: a */
        public final int f24062a;

        /* renamed from: b */
        public final long f24063b;

        /* renamed from: c */
        public final T f24064c;

        public C8964f(int i, long j, @C0359n0 T t) {
            this.f24062a = i;
            this.f24063b = j;
            this.f24064c = t;
        }
    }

    public C8958a(@C0359n0 C9008d dVar, @C0359n0 C9074e eVar, @C0359n0 C9656j jVar) {
        this.f24051b = dVar;
        this.f24052c = eVar;
        this.f24050a = jVar;
    }

    /* renamed from: d */
    public final void mo17688d() {
        synchronized (this.f24053d) {
            Iterator it = new ArrayList(this.f24053d).iterator();
            while (it.hasNext()) {
                C8964f fVar = (C8964f) it.next();
                if (fVar.f24062a == 1) {
                    this.f24053d.remove(fVar);
                }
            }
        }
        synchronized (this.f24054e) {
            Iterator it2 = new ArrayList(this.f24054e).iterator();
            while (it2.hasNext()) {
                C8964f fVar2 = (C8964f) it2.next();
                if (fVar2.f24062a == 1) {
                    this.f24054e.remove(fVar2);
                }
            }
        }
    }

    /* renamed from: e */
    public final <T> List<T> mo17689e(List<C8964f<T>> list, long j) {
        ArrayList arrayList = new ArrayList();
        for (C8964f next : list) {
            if (next.f24063b >= j) {
                arrayList.add(next.f24064c);
            }
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: f */
    public List<C9025i> mo17690f(long j) {
        List<C9025i> e;
        synchronized (this.f24054e) {
            e = mo17689e(this.f24054e, j);
        }
        return e;
    }

    @C0359n0
    /* renamed from: g */
    public List<C9004a0> mo17691g(long j) {
        List<C9004a0> e;
        synchronized (this.f24053d) {
            e = mo17689e(this.f24053d, j);
        }
        return e;
    }

    /* renamed from: h */
    public void mo17692h() {
        this.f24051b.mo17783P(new C8959a());
        this.f24051b.mo17779L(new C8960b());
        this.f24052c.mo18021N(new C8961c());
        this.f24052c.mo18016K(new C8962d());
        this.f24052c.mo18018L(new C8963e());
    }

    /* renamed from: i */
    public final void mo17693i(@C0359n0 List<C9025i> list, int i) {
        synchronized (this.f24054e) {
            long a = this.f24050a.mo19623a();
            for (C9025i fVar : list) {
                this.f24054e.add(new C8964f(i, a, fVar));
            }
        }
    }

    /* renamed from: j */
    public final void mo17694j(@C0359n0 List<C9004a0> list, int i) {
        synchronized (this.f24053d) {
            long a = this.f24050a.mo19623a();
            for (C9004a0 fVar : list) {
                this.f24053d.add(new C8964f(i, a, fVar));
            }
        }
    }
}
