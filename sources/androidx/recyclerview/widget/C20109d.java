package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.C20106c;
import androidx.recyclerview.widget.C20157j;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: androidx.recyclerview.widget.d */
public class C20109d<T> {

    /* renamed from: h */
    public static final Executor f51721h = new C20114c();

    /* renamed from: a */
    public final C20211u f51722a;

    /* renamed from: b */
    public final C20106c<T> f51723b;

    /* renamed from: c */
    public Executor f51724c;

    /* renamed from: d */
    public final List<C20113b<T>> f51725d;
    @C0363p0

    /* renamed from: e */
    public List<T> f51726e;
    @C0359n0

    /* renamed from: f */
    public List<T> f51727f;

    /* renamed from: g */
    public int f51728g;

    /* renamed from: androidx.recyclerview.widget.d$a */
    public class C20110a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ List f51729a;

        /* renamed from: b */
        public final /* synthetic */ List f51730b;

        /* renamed from: c */
        public final /* synthetic */ int f51731c;

        /* renamed from: d */
        public final /* synthetic */ Runnable f51732d;

        /* renamed from: androidx.recyclerview.widget.d$a$a */
        public class C20111a extends C20157j.C20159b {
            public C20111a() {
            }

            /* renamed from: a */
            public boolean mo59153a(int i, int i2) {
                Object obj = C20110a.this.f51729a.get(i);
                Object obj2 = C20110a.this.f51730b.get(i2);
                if (obj != null && obj2 != null) {
                    return C20109d.this.f51723b.mo60235b().mo60477a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* renamed from: b */
            public boolean mo59154b(int i, int i2) {
                Object obj = C20110a.this.f51729a.get(i);
                Object obj2 = C20110a.this.f51730b.get(i2);
                if (obj != null && obj2 != null) {
                    return C20109d.this.f51723b.mo60235b().mo60478b(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                return false;
            }

            @C0363p0
            /* renamed from: c */
            public Object mo60270c(int i, int i2) {
                Object obj = C20110a.this.f51729a.get(i);
                Object obj2 = C20110a.this.f51730b.get(i2);
                if (obj != null && obj2 != null) {
                    return C20109d.this.f51723b.mo60235b().mo60479c(obj, obj2);
                }
                throw new AssertionError();
            }

            /* renamed from: d */
            public int mo59155d() {
                return C20110a.this.f51730b.size();
            }

            /* renamed from: e */
            public int mo59156e() {
                return C20110a.this.f51729a.size();
            }
        }

        /* renamed from: androidx.recyclerview.widget.d$a$b */
        public class C20112b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C20157j.C20162e f51735a;

            public C20112b(C20157j.C20162e eVar) {
                this.f51735a = eVar;
            }

            public void run() {
                C20110a aVar = C20110a.this;
                C20109d dVar = C20109d.this;
                if (dVar.f51728g == aVar.f51731c) {
                    dVar.mo60264c(aVar.f51730b, this.f51735a, aVar.f51732d);
                }
            }
        }

        public C20110a(List list, List list2, int i, Runnable runnable) {
            this.f51729a = list;
            this.f51730b = list2;
            this.f51731c = i;
            this.f51732d = runnable;
        }

        public void run() {
            C20109d.this.f51724c.execute(new C20112b(C20157j.m94272b(new C20111a())));
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    public interface C20113b<T> {
        /* renamed from: a */
        void mo60272a(@C0359n0 List<T> list, @C0359n0 List<T> list2);
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    public static class C20114c implements Executor {

        /* renamed from: a */
        public final Handler f51737a = new Handler(Looper.getMainLooper());

        public void execute(@C0359n0 Runnable runnable) {
            this.f51737a.post(runnable);
        }
    }

    public C20109d(@C0359n0 RecyclerView.Adapter adapter, @C0359n0 C20157j.C20163f<T> fVar) {
        this((C20211u) new C20104b(adapter), new C20106c.C20107a(fVar).mo60237a());
    }

    /* renamed from: a */
    public void mo60262a(@C0359n0 C20113b<T> bVar) {
        this.f51725d.add(bVar);
    }

    @C0359n0
    /* renamed from: b */
    public List<T> mo60263b() {
        return this.f51727f;
    }

    /* renamed from: c */
    public void mo60264c(@C0359n0 List<T> list, @C0359n0 C20157j.C20162e eVar, @C0363p0 Runnable runnable) {
        List<T> list2 = this.f51727f;
        this.f51726e = list;
        this.f51727f = Collections.unmodifiableList(list);
        eVar.mo60472d(this.f51722a);
        mo60265d(list2, runnable);
    }

    /* renamed from: d */
    public final void mo60265d(@C0359n0 List<T> list, @C0363p0 Runnable runnable) {
        for (C20113b<T> a : this.f51725d) {
            a.mo60272a(list, this.f51727f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: e */
    public void mo60266e(@C0359n0 C20113b<T> bVar) {
        this.f51725d.remove(bVar);
    }

    /* renamed from: f */
    public void mo60267f(@C0363p0 List<T> list) {
        mo60268g(list, (Runnable) null);
    }

    /* renamed from: g */
    public void mo60268g(@C0363p0 List<T> list, @C0363p0 Runnable runnable) {
        int i = this.f51728g + 1;
        this.f51728g = i;
        List<T> list2 = this.f51726e;
        if (list != list2) {
            List<T> list3 = this.f51727f;
            if (list == null) {
                int size = list2.size();
                this.f51726e = null;
                this.f51727f = Collections.emptyList();
                this.f51722a.mo60231b(0, size);
                mo60265d(list3, runnable);
            } else if (list2 == null) {
                this.f51726e = list;
                this.f51727f = Collections.unmodifiableList(list);
                this.f51722a.mo60230a(0, list.size());
                mo60265d(list3, runnable);
            } else {
                this.f51723b.mo60234a().execute(new C20110a(list2, list, i, runnable));
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public C20109d(@C0359n0 C20211u uVar, @C0359n0 C20106c<T> cVar) {
        this.f51725d = new CopyOnWriteArrayList();
        this.f51727f = Collections.emptyList();
        this.f51722a = uVar;
        this.f51723b = cVar;
        if (cVar.mo60236c() != null) {
            this.f51724c = cVar.mo60236c();
        } else {
            this.f51724c = f51721h;
        }
    }
}
