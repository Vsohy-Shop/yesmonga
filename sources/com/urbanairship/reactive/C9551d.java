package com.urbanairship.reactive;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36064q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.reactive.d */
public class C9551d<T> {
    @C0363p0

    /* renamed from: a */
    public final C9550c<C9586e<T>, C9596k> f26143a;

    /* renamed from: com.urbanairship.reactive.d$a */
    public class C9552a implements C9550c<C9586e<T>, C9596k> {

        /* renamed from: a */
        public final /* synthetic */ Object f26144a;

        /* renamed from: com.urbanairship.reactive.d$a$a */
        public class C9553a implements C9586e<T> {

            /* renamed from: a */
            public final /* synthetic */ C9586e f26146a;

            /* renamed from: b */
            public final /* synthetic */ AtomicBoolean f26147b;

            public C9553a(C9586e eVar, AtomicBoolean atomicBoolean) {
                this.f26146a = eVar;
                this.f26147b = atomicBoolean;
            }

            /* renamed from: a */
            public void mo19470a(@C0359n0 Exception exc) {
                this.f26146a.mo19471b();
            }

            /* renamed from: b */
            public void mo19471b() {
                if (this.f26147b.get()) {
                    this.f26146a.mo17490c(C9552a.this.f26144a);
                }
                this.f26146a.mo19471b();
            }

            /* renamed from: c */
            public void mo17490c(@C0359n0 T t) {
                this.f26146a.mo17490c(t);
                this.f26147b.set(false);
            }
        }

        public C9552a(Object obj) {
            this.f26144a = obj;
        }

        @C0359n0
        /* renamed from: a */
        public C9596k apply(@C0359n0 C9586e<T> eVar) {
            return C9551d.this.mo19467u(new C9553a(eVar, new AtomicBoolean(true)));
        }
    }

    /* renamed from: com.urbanairship.reactive.d$b */
    public class C9554b implements C9550c<C9586e<T>, C9596k> {

        /* renamed from: a */
        public final /* synthetic */ C9587f f26149a;

        /* renamed from: com.urbanairship.reactive.d$b$a */
        public class C9555a implements C9586e<T> {

            /* renamed from: a */
            public final /* synthetic */ C9592h f26151a;

            /* renamed from: b */
            public final /* synthetic */ C9586e f26152b;

            /* renamed from: com.urbanairship.reactive.d$b$a$a */
            public class C9556a implements Runnable {

                /* renamed from: a */
                public final /* synthetic */ Object f26154a;

                public C9556a(Object obj) {
                    this.f26154a = obj;
                }

                public void run() {
                    if (!C9555a.this.f26151a.mo19508d()) {
                        C9555a.this.f26152b.mo17490c(this.f26154a);
                    }
                }
            }

            /* renamed from: com.urbanairship.reactive.d$b$a$b */
            public class C9557b implements Runnable {
                public C9557b() {
                }

                public void run() {
                    if (!C9555a.this.f26151a.mo19508d()) {
                        C9555a.this.f26152b.mo19471b();
                    }
                }
            }

            /* renamed from: com.urbanairship.reactive.d$b$a$c */
            public class C9558c implements Runnable {

                /* renamed from: a */
                public final /* synthetic */ Exception f26157a;

                public C9558c(Exception exc) {
                    this.f26157a = exc;
                }

                public void run() {
                    if (!C9555a.this.f26151a.mo19508d()) {
                        C9555a.this.f26152b.mo19470a(this.f26157a);
                    }
                }
            }

            public C9555a(C9592h hVar, C9586e eVar) {
                this.f26151a = hVar;
                this.f26152b = eVar;
            }

            /* renamed from: a */
            public void mo19470a(@C0359n0 Exception exc) {
                C9554b.this.f26149a.mo19500b(new C9558c(exc));
            }

            /* renamed from: b */
            public void mo19471b() {
                C9554b.this.f26149a.mo19500b(new C9557b());
            }

            /* renamed from: c */
            public void mo17490c(@C0359n0 T t) {
                C9554b.this.f26149a.mo19500b(new C9556a(t));
            }
        }

        public C9554b(C9587f fVar) {
            this.f26149a = fVar;
        }

        @C0359n0
        /* renamed from: a */
        public C9596k apply(@C0359n0 C9586e<T> eVar) {
            C9592h hVar = new C9592h();
            hVar.mo19503e(C9551d.this.mo19467u(new C9555a(hVar, eVar)));
            return hVar;
        }
    }

    /* renamed from: com.urbanairship.reactive.d$c */
    public class C9559c implements C9550c<C9586e<T>, C9596k> {

        /* renamed from: a */
        public final /* synthetic */ C9587f f26159a;

        /* renamed from: com.urbanairship.reactive.d$c$a */
        public class C9560a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C9549b f26161a;

            /* renamed from: b */
            public final /* synthetic */ C9586e f26162b;

            public C9560a(C9549b bVar, C9586e eVar) {
                this.f26161a = bVar;
                this.f26162b = eVar;
            }

            public void run() {
                this.f26161a.mo19458e(C9551d.this.mo19467u(this.f26162b));
            }
        }

        public C9559c(C9587f fVar) {
            this.f26159a = fVar;
        }

        @C0359n0
        /* renamed from: a */
        public C9596k apply(@C0359n0 C9586e<T> eVar) {
            C9549b bVar = new C9549b();
            bVar.mo19458e(this.f26159a.mo19500b(new C9560a(bVar, eVar)));
            return bVar;
        }
    }

    /* renamed from: com.urbanairship.reactive.d$d */
    public class C9561d implements C9550c<C9586e<T>, C9596k> {

        /* renamed from: b */
        public final /* synthetic */ C9551d f26165b;

        /* renamed from: com.urbanairship.reactive.d$d$a */
        public class C9562a implements C9586e<T> {

            /* renamed from: a */
            public final /* synthetic */ C9586e f26166a;

            /* renamed from: b */
            public final /* synthetic */ AtomicInteger f26167b;

            /* renamed from: c */
            public final /* synthetic */ C9549b f26168c;

            public C9562a(C9586e eVar, AtomicInteger atomicInteger, C9549b bVar) {
                this.f26166a = eVar;
                this.f26167b = atomicInteger;
                this.f26168c = bVar;
            }

            /* renamed from: a */
            public void mo19470a(@C0359n0 Exception exc) {
                synchronized (this.f26166a) {
                    this.f26168c.mo19457a();
                    this.f26166a.mo19470a(exc);
                }
            }

            /* renamed from: b */
            public void mo19471b() {
                synchronized (this.f26166a) {
                    if (this.f26167b.incrementAndGet() == 2) {
                        this.f26166a.mo19471b();
                    }
                }
            }

            /* renamed from: c */
            public void mo17490c(@C0359n0 T t) {
                synchronized (this.f26166a) {
                    this.f26166a.mo17490c(t);
                }
            }
        }

        public C9561d(C9551d dVar) {
            this.f26165b = dVar;
        }

        @C0359n0
        /* renamed from: a */
        public C9596k apply(@C0359n0 C9586e<T> eVar) {
            AtomicInteger atomicInteger = new AtomicInteger(0);
            C9549b bVar = new C9549b();
            C9562a aVar = new C9562a(eVar, atomicInteger, bVar);
            bVar.mo19458e(C9551d.this.mo19467u(aVar));
            bVar.mo19458e(this.f26165b.mo19467u(aVar));
            return bVar;
        }
    }

    /* renamed from: com.urbanairship.reactive.d$e */
    public class C9563e implements C9550c<C9586e<T>, C9596k> {

        /* renamed from: a */
        public final /* synthetic */ C9549b f26170a;

        /* renamed from: b */
        public final /* synthetic */ C9551d f26171b;

        /* renamed from: c */
        public final /* synthetic */ C9551d f26172c;

        /* renamed from: com.urbanairship.reactive.d$e$a */
        public class C9564a implements C9586e<T> {

            /* renamed from: a */
            public final /* synthetic */ C9586e f26173a;

            public C9564a(C9586e eVar) {
                this.f26173a = eVar;
            }

            /* renamed from: a */
            public void mo19470a(@C0359n0 Exception exc) {
                this.f26173a.mo19470a(exc);
            }

            /* renamed from: b */
            public void mo19471b() {
                C9563e eVar = C9563e.this;
                eVar.f26170a.mo19458e(eVar.f26172c.mo19467u(this.f26173a));
            }

            /* renamed from: c */
            public void mo17490c(@C0359n0 T t) {
                this.f26173a.mo17490c(t);
            }
        }

        /* renamed from: com.urbanairship.reactive.d$e$b */
        public class C9565b implements Runnable {
            public C9565b() {
            }

            public void run() {
                C9563e.this.f26170a.mo19457a();
            }
        }

        public C9563e(C9549b bVar, C9551d dVar, C9551d dVar2) {
            this.f26170a = bVar;
            this.f26171b = dVar;
            this.f26172c = dVar2;
        }

        @C0359n0
        /* renamed from: a */
        public C9596k apply(@C0359n0 C9586e<T> eVar) {
            this.f26170a.mo19458e(this.f26171b.mo19467u(new C9564a(eVar)));
            return C9596k.m35944b(new C9565b());
        }
    }

    /* renamed from: com.urbanairship.reactive.d$f */
    public class C9566f implements C9550c<C9586e<T>, C9596k> {

        /* renamed from: a */
        public final /* synthetic */ C9597l f26176a;

        public C9566f(C9597l lVar) {
            this.f26176a = lVar;
        }

        @C0359n0
        /* renamed from: a */
        public C9596k apply(@C0359n0 C9586e<T> eVar) {
            return ((C9551d) this.f26176a.mo17412a()).mo19467u(eVar);
        }
    }

    /* renamed from: com.urbanairship.reactive.d$g */
    public class C9567g implements C9550c<C9586e<R>, C9596k> {

        /* renamed from: a */
        public final /* synthetic */ C9548a f26177a;

        /* renamed from: b */
        public final /* synthetic */ C9551d f26178b;

        /* renamed from: c */
        public final /* synthetic */ C9551d f26179c;

        /* renamed from: com.urbanairship.reactive.d$g$a */
        public class C9568a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C9586e f26180a;

            /* renamed from: b */
            public final /* synthetic */ C9583r f26181b;

            /* renamed from: c */
            public final /* synthetic */ C9583r f26182c;

            /* renamed from: d */
            public final /* synthetic */ ArrayList f26183d;

            /* renamed from: e */
            public final /* synthetic */ C9583r f26184e;

            /* renamed from: f */
            public final /* synthetic */ ArrayList f26185f;

            /* renamed from: g */
            public final /* synthetic */ C9549b f26186g;

            public C9568a(C9586e eVar, C9583r rVar, C9583r rVar2, ArrayList arrayList, C9583r rVar3, ArrayList arrayList2, C9549b bVar) {
                this.f26180a = eVar;
                this.f26181b = rVar;
                this.f26182c = rVar2;
                this.f26183d = arrayList;
                this.f26184e = rVar3;
                this.f26185f = arrayList2;
                this.f26186g = bVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r3 = this;
                    com.urbanairship.reactive.e r0 = r3.f26180a
                    monitor-enter(r0)
                    com.urbanairship.reactive.d$r r1 = r3.f26181b     // Catch:{ all -> 0x0052 }
                    java.lang.Object r1 = r1.mo19495a()     // Catch:{ all -> 0x0052 }
                    java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0052 }
                    boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0052 }
                    if (r1 == 0) goto L_0x0013
                    monitor-exit(r0)     // Catch:{ all -> 0x0052 }
                    return
                L_0x0013:
                    com.urbanairship.reactive.d$r r1 = r3.f26182c     // Catch:{ all -> 0x0052 }
                    java.lang.Object r1 = r1.mo19495a()     // Catch:{ all -> 0x0052 }
                    java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0052 }
                    boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0052 }
                    if (r1 == 0) goto L_0x0050
                    java.util.ArrayList r1 = r3.f26183d     // Catch:{ all -> 0x0052 }
                    int r1 = r1.size()     // Catch:{ all -> 0x0052 }
                    if (r1 != 0) goto L_0x0050
                    com.urbanairship.reactive.d$r r1 = r3.f26184e     // Catch:{ all -> 0x0052 }
                    java.lang.Object r1 = r1.mo19495a()     // Catch:{ all -> 0x0052 }
                    java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0052 }
                    boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0052 }
                    if (r1 == 0) goto L_0x0050
                    java.util.ArrayList r1 = r3.f26185f     // Catch:{ all -> 0x0052 }
                    int r1 = r1.size()     // Catch:{ all -> 0x0052 }
                    if (r1 != 0) goto L_0x0050
                    com.urbanairship.reactive.d$r r1 = r3.f26181b     // Catch:{ all -> 0x0052 }
                    java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0052 }
                    r1.mo19496b(r2)     // Catch:{ all -> 0x0052 }
                    com.urbanairship.reactive.b r1 = r3.f26186g     // Catch:{ all -> 0x0052 }
                    r1.mo19457a()     // Catch:{ all -> 0x0052 }
                    com.urbanairship.reactive.e r1 = r3.f26180a     // Catch:{ all -> 0x0052 }
                    r1.mo19471b()     // Catch:{ all -> 0x0052 }
                L_0x0050:
                    monitor-exit(r0)     // Catch:{ all -> 0x0052 }
                    return
                L_0x0052:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0052 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.reactive.C9551d.C9567g.C9568a.run():void");
            }
        }

        /* renamed from: com.urbanairship.reactive.d$g$b */
        public class C9569b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C9586e f26188a;

            /* renamed from: b */
            public final /* synthetic */ ArrayList f26189b;

            /* renamed from: c */
            public final /* synthetic */ ArrayList f26190c;

            /* renamed from: d */
            public final /* synthetic */ Runnable f26191d;

            public C9569b(C9586e eVar, ArrayList arrayList, ArrayList arrayList2, Runnable runnable) {
                this.f26188a = eVar;
                this.f26189b = arrayList;
                this.f26190c = arrayList2;
                this.f26191d = runnable;
            }

            public void run() {
                synchronized (this.f26188a) {
                    if (this.f26189b.size() > 0 && this.f26190c.size() > 0) {
                        Object apply = C9567g.this.f26177a.apply(this.f26189b.get(0), this.f26190c.get(0));
                        this.f26189b.remove(0);
                        this.f26190c.remove(0);
                        this.f26188a.mo17490c(apply);
                        this.f26191d.run();
                    }
                }
            }
        }

        /* renamed from: com.urbanairship.reactive.d$g$c */
        public class C9570c extends C9595j<T> {

            /* renamed from: a */
            public final /* synthetic */ C9586e f26193a;

            /* renamed from: b */
            public final /* synthetic */ ArrayList f26194b;

            /* renamed from: c */
            public final /* synthetic */ Runnable f26195c;

            /* renamed from: d */
            public final /* synthetic */ C9583r f26196d;

            /* renamed from: e */
            public final /* synthetic */ Runnable f26197e;

            /* renamed from: f */
            public final /* synthetic */ C9549b f26198f;

            public C9570c(C9586e eVar, ArrayList arrayList, Runnable runnable, C9583r rVar, Runnable runnable2, C9549b bVar) {
                this.f26193a = eVar;
                this.f26194b = arrayList;
                this.f26195c = runnable;
                this.f26196d = rVar;
                this.f26197e = runnable2;
                this.f26198f = bVar;
            }

            /* renamed from: a */
            public void mo19470a(@C0359n0 Exception exc) {
                synchronized (this.f26193a) {
                    this.f26198f.mo19457a();
                    this.f26193a.mo19470a(exc);
                }
            }

            /* renamed from: b */
            public void mo19471b() {
                synchronized (this.f26193a) {
                    this.f26196d.mo19496b(Boolean.TRUE);
                    this.f26197e.run();
                }
            }

            /* renamed from: c */
            public void mo17490c(@C0359n0 T t) {
                synchronized (this.f26193a) {
                    this.f26194b.add(t);
                    this.f26195c.run();
                }
            }
        }

        /* renamed from: com.urbanairship.reactive.d$g$d */
        public class C9571d extends C9595j<T> {

            /* renamed from: a */
            public final /* synthetic */ C9586e f26200a;

            /* renamed from: b */
            public final /* synthetic */ ArrayList f26201b;

            /* renamed from: c */
            public final /* synthetic */ Runnable f26202c;

            /* renamed from: d */
            public final /* synthetic */ C9583r f26203d;

            /* renamed from: e */
            public final /* synthetic */ Runnable f26204e;

            /* renamed from: f */
            public final /* synthetic */ C9549b f26205f;

            public C9571d(C9586e eVar, ArrayList arrayList, Runnable runnable, C9583r rVar, Runnable runnable2, C9549b bVar) {
                this.f26200a = eVar;
                this.f26201b = arrayList;
                this.f26202c = runnable;
                this.f26203d = rVar;
                this.f26204e = runnable2;
                this.f26205f = bVar;
            }

            /* renamed from: a */
            public void mo19470a(@C0359n0 Exception exc) {
                synchronized (this.f26200a) {
                    this.f26205f.mo19457a();
                    this.f26200a.mo19470a(exc);
                }
            }

            /* renamed from: b */
            public void mo19471b() {
                synchronized (this.f26200a) {
                    this.f26203d.mo19496b(Boolean.TRUE);
                    this.f26204e.run();
                }
            }

            /* renamed from: c */
            public void mo17490c(@C0359n0 T t) {
                synchronized (this.f26200a) {
                    this.f26201b.add(t);
                    this.f26202c.run();
                }
            }
        }

        public C9567g(C9548a aVar, C9551d dVar, C9551d dVar2) {
            this.f26177a = aVar;
            this.f26178b = dVar;
            this.f26179c = dVar2;
        }

        @C0359n0
        /* renamed from: a */
        public C9596k apply(@C0359n0 C9586e<R> eVar) {
            C9549b bVar = new C9549b();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Boolean bool = Boolean.FALSE;
            C9583r rVar = new C9583r(bool);
            C9583r rVar2 = new C9583r(bool);
            C9586e<R> eVar2 = eVar;
            C9568a aVar = new C9568a(eVar2, new C9583r(bool), rVar, arrayList, rVar2, arrayList2, bVar);
            ArrayList arrayList3 = arrayList;
            C9569b bVar2 = new C9569b(eVar2, arrayList3, arrayList2, aVar);
            C9583r rVar3 = rVar;
            C9570c cVar = r0;
            C9568a aVar2 = aVar;
            C9551d dVar = this.f26178b;
            C9549b bVar3 = bVar;
            C9570c cVar2 = new C9570c(eVar2, arrayList3, bVar2, rVar3, aVar2, bVar3);
            bVar.mo19458e(dVar.mo19467u(cVar));
            bVar.mo19458e(this.f26179c.mo19467u(new C9571d(eVar2, arrayList2, bVar2, rVar2, aVar2, bVar3)));
            return bVar;
        }
    }

    /* renamed from: com.urbanairship.reactive.d$h */
    public class C9572h implements C9550c<C9586e<R>, C9596k> {

        /* renamed from: a */
        public final /* synthetic */ C9549b f26207a;

        /* renamed from: b */
        public final /* synthetic */ WeakReference f26208b;

        /* renamed from: c */
        public final /* synthetic */ C9550c f26209c;

        /* renamed from: com.urbanairship.reactive.d$h$a */
        public class C9573a extends C9595j<T> {

            /* renamed from: a */
            public final /* synthetic */ C9584s f26211a;

            /* renamed from: b */
            public final /* synthetic */ C9592h f26212b;

            /* renamed from: c */
            public final /* synthetic */ C9586e f26213c;

            public C9573a(C9584s sVar, C9592h hVar, C9586e eVar) {
                this.f26211a = sVar;
                this.f26212b = hVar;
                this.f26213c = eVar;
            }

            /* renamed from: a */
            public void mo19470a(@C0359n0 Exception exc) {
                C9572h.this.f26207a.mo19457a();
                this.f26213c.mo19470a(exc);
            }

            /* renamed from: b */
            public void mo19471b() {
                this.f26211a.mo19498d(this.f26212b);
            }

            /* renamed from: c */
            public void mo17490c(@C0359n0 T t) {
                if (!C9572h.this.f26207a.mo19508d()) {
                    this.f26211a.mo19497c((C9551d) C9572h.this.f26209c.apply(t));
                    return;
                }
                this.f26212b.mo19457a();
                this.f26211a.mo19498d(this.f26212b);
            }
        }

        public C9572h(C9549b bVar, WeakReference weakReference, C9550c cVar) {
            this.f26207a = bVar;
            this.f26208b = weakReference;
            this.f26209c = cVar;
        }

        @C0359n0
        /* renamed from: a */
        public C9596k apply(@C0359n0 C9586e<R> eVar) {
            C9584s sVar = new C9584s(eVar, this.f26207a);
            C9551d dVar = (C9551d) this.f26208b.get();
            if (dVar == null) {
                eVar.mo19471b();
                return C9596k.m35945c();
            }
            C9592h hVar = new C9592h();
            this.f26207a.mo19458e(hVar);
            hVar.mo19503e(dVar.mo19467u(new C9573a(sVar, hVar, eVar)));
            return this.f26207a;
        }
    }

    /* renamed from: com.urbanairship.reactive.d$i */
    public class C9574i implements C9550c<C9586e<T>, C9596k> {

        /* renamed from: a */
        public final /* synthetic */ Object f26215a;

        public C9574i(Object obj) {
            this.f26215a = obj;
        }

        @C0359n0
        /* renamed from: a */
        public C9596k apply(@C0359n0 C9586e<T> eVar) {
            eVar.mo17490c(this.f26215a);
            eVar.mo19471b();
            return C9596k.m35945c();
        }
    }

    /* renamed from: com.urbanairship.reactive.d$j */
    public class C9575j implements C9550c<C9586e<T>, C9596k> {
        @C0359n0
        /* renamed from: a */
        public C9596k apply(@C0359n0 C9586e<T> eVar) {
            eVar.mo19471b();
            return C9596k.m35945c();
        }
    }

    /* renamed from: com.urbanairship.reactive.d$k */
    public class C9576k implements C9550c<C9586e<T>, C9596k> {
        @C0359n0
        /* renamed from: a */
        public C9596k apply(@C0359n0 C9586e<T> eVar) {
            return C9596k.m35945c();
        }
    }

    /* renamed from: com.urbanairship.reactive.d$l */
    public class C9577l implements C9550c<C9586e<T>, C9596k> {

        /* renamed from: a */
        public final /* synthetic */ Exception f26216a;

        public C9577l(Exception exc) {
            this.f26216a = exc;
        }

        @C0359n0
        /* renamed from: a */
        public C9596k apply(@C0359n0 C9586e<T> eVar) {
            eVar.mo19470a(this.f26216a);
            return C9596k.m35945c();
        }
    }

    /* renamed from: com.urbanairship.reactive.d$m */
    public class C9578m implements C9550c<C9586e<T>, C9596k> {

        /* renamed from: a */
        public final /* synthetic */ Collection f26217a;

        public C9578m(Collection collection) {
            this.f26217a = collection;
        }

        @C0359n0
        /* renamed from: a */
        public C9596k apply(@C0359n0 C9586e<T> eVar) {
            for (Object c : this.f26217a) {
                eVar.mo17490c(c);
            }
            eVar.mo19471b();
            return C9596k.m35945c();
        }
    }

    /* renamed from: com.urbanairship.reactive.d$n */
    public class C9579n implements C9550c<T, C9551d<R>> {

        /* renamed from: a */
        public final /* synthetic */ C9550c f26218a;

        public C9579n(C9550c cVar) {
            this.f26218a = cVar;
        }

        @C0359n0
        /* renamed from: a */
        public C9551d<R> apply(@C0359n0 T t) {
            return (C9551d) this.f26218a.apply(t);
        }
    }

    /* renamed from: com.urbanairship.reactive.d$o */
    public class C9580o implements C9550c<T, C9551d<R>> {

        /* renamed from: a */
        public final /* synthetic */ C9550c f26220a;

        public C9580o(C9550c cVar) {
            this.f26220a = cVar;
        }

        @C0359n0
        /* renamed from: a */
        public C9551d<R> apply(@C0359n0 T t) {
            return C9551d.m35860o(this.f26220a.apply(t));
        }
    }

    /* renamed from: com.urbanairship.reactive.d$p */
    public class C9581p implements C9550c<T, C9551d<T>> {

        /* renamed from: a */
        public final /* synthetic */ C36064q f26222a;

        public C9581p(C36064q qVar) {
            this.f26222a = qVar;
        }

        @C0359n0
        /* renamed from: a */
        public C9551d<T> apply(@C0359n0 T t) {
            if (this.f26222a.apply(t)) {
                return C9551d.m35860o(t);
            }
            return C9551d.m35857j();
        }
    }

    /* renamed from: com.urbanairship.reactive.d$q */
    public class C9582q implements C9550c<T, C9551d<T>> {

        /* renamed from: a */
        public final /* synthetic */ C9583r f26224a;

        public C9582q(C9583r rVar) {
            this.f26224a = rVar;
        }

        @C0359n0
        /* renamed from: a */
        public C9551d<T> apply(@C0359n0 T t) {
            if (this.f26224a.mo19495a() != null && t.equals(this.f26224a.mo19495a())) {
                return C9551d.m35857j();
            }
            this.f26224a.mo19496b(t);
            return C9551d.m35860o(t);
        }
    }

    /* renamed from: com.urbanairship.reactive.d$r */
    public static class C9583r<T> {

        /* renamed from: a */
        public T f26226a;

        public C9583r() {
        }

        /* renamed from: a */
        public T mo19495a() {
            return this.f26226a;
        }

        /* renamed from: b */
        public void mo19496b(T t) {
            this.f26226a = t;
        }

        public C9583r(T t) {
            this.f26226a = t;
        }
    }

    /* renamed from: com.urbanairship.reactive.d$s */
    public static class C9584s<T> {

        /* renamed from: a */
        public final C9586e<T> f26227a;

        /* renamed from: b */
        public final C9549b f26228b;

        /* renamed from: c */
        public final AtomicInteger f26229c = new AtomicInteger(1);

        /* renamed from: com.urbanairship.reactive.d$s$a */
        public class C9585a implements C9586e<T> {

            /* renamed from: a */
            public final /* synthetic */ C9592h f26230a;

            public C9585a(C9592h hVar) {
                this.f26230a = hVar;
            }

            /* renamed from: a */
            public void mo19470a(@C0359n0 Exception exc) {
                C9584s.this.f26228b.mo19457a();
                C9584s.this.f26227a.mo19470a(exc);
            }

            /* renamed from: b */
            public void mo19471b() {
                C9584s.this.mo19498d(this.f26230a);
            }

            /* renamed from: c */
            public void mo17490c(@C0359n0 T t) {
                C9584s.this.f26227a.mo17490c(t);
            }
        }

        public C9584s(C9586e<T> eVar, C9549b bVar) {
            this.f26227a = eVar;
            this.f26228b = bVar;
        }

        /* renamed from: c */
        public void mo19497c(@C0359n0 C9551d<T> dVar) {
            this.f26229c.getAndIncrement();
            C9592h hVar = new C9592h();
            hVar.mo19503e(dVar.mo19467u(new C9585a(hVar)));
        }

        /* renamed from: d */
        public void mo19498d(@C0359n0 C9596k kVar) {
            if (this.f26229c.decrementAndGet() == 0) {
                this.f26227a.mo19471b();
                this.f26228b.mo19457a();
                return;
            }
            this.f26228b.mo19459f(kVar);
        }
    }

    public C9551d() {
        this((C9550c) null);
    }

    @C0359n0
    /* renamed from: e */
    public static <T> C9551d<T> m35854e(@C0359n0 C9551d<T> dVar, @C0359n0 C9551d<T> dVar2) {
        return m35855f(new C9563e(new C9549b(), dVar, dVar2));
    }

    @C0359n0
    /* renamed from: f */
    public static <T> C9551d<T> m35855f(@C0359n0 C9550c<C9586e<T>, C9596k> cVar) {
        return new C9551d<>(cVar);
    }

    @C0359n0
    /* renamed from: h */
    public static <T> C9551d<T> m35856h(@C0359n0 C9597l<C9551d<T>> lVar) {
        return m35855f(new C9566f(lVar));
    }

    @C0359n0
    /* renamed from: j */
    public static <T> C9551d<T> m35857j() {
        return m35855f(new C9575j());
    }

    @C0359n0
    /* renamed from: k */
    public static <T> C9551d<T> m35858k(@C0359n0 Exception exc) {
        return m35855f(new C9577l(exc));
    }

    @C0359n0
    /* renamed from: n */
    public static <T> C9551d<T> m35859n(@C0359n0 Collection<T> collection) {
        return m35855f(new C9578m(collection));
    }

    @C0359n0
    /* renamed from: o */
    public static <T> C9551d<T> m35860o(@C0359n0 T t) {
        return m35855f(new C9574i(t));
    }

    @C0359n0
    /* renamed from: q */
    public static <T> C9551d<T> m35861q(@C0359n0 C9551d<T> dVar, @C0359n0 C9551d<T> dVar2) {
        return m35855f(new C9561d(dVar2));
    }

    @C0359n0
    /* renamed from: r */
    public static <T> C9551d<T> m35862r(@C0359n0 Collection<C9551d<T>> collection) {
        C9551d<T> j = m35857j();
        for (C9551d<T> q : collection) {
            j = m35861q(j, q);
        }
        return j;
    }

    @C0359n0
    /* renamed from: s */
    public static <T> C9551d<T> m35863s() {
        return m35855f(new C9576k());
    }

    @C0359n0
    /* renamed from: w */
    public static <T, R> C9551d<R> m35864w(@C0359n0 C9551d<T> dVar, @C0359n0 C9551d<T> dVar2, @C0359n0 C9548a<T, T, R> aVar) {
        return m35855f(new C9567g(aVar, dVar, dVar2));
    }

    @C0359n0
    /* renamed from: d */
    public final <R> C9551d<R> mo19460d(@C0359n0 C9550c<T, C9551d<R>> cVar) {
        return m35855f(new C9572h(new C9549b(), new WeakReference(this), cVar));
    }

    @C0359n0
    /* renamed from: g */
    public C9551d<T> mo19461g(@C0359n0 T t) {
        return m35855f(new C9552a(t));
    }

    @C0359n0
    /* renamed from: i */
    public C9551d<T> mo19462i() {
        return mo19460d(new C9582q(new C9583r()));
    }

    @C0359n0
    /* renamed from: l */
    public C9551d<T> mo19463l(@C0359n0 C36064q<T> qVar) {
        return mo19464m(new C9581p(qVar));
    }

    @C0359n0
    /* renamed from: m */
    public <R> C9551d<R> mo19464m(@C0359n0 C9550c<T, C9551d<R>> cVar) {
        return mo19460d(new C9579n(cVar));
    }

    @C0359n0
    /* renamed from: p */
    public <R> C9551d<R> mo19465p(@C0359n0 C9550c<T, R> cVar) {
        return mo19464m(new C9580o(cVar));
    }

    @C0359n0
    /* renamed from: t */
    public C9551d<T> mo19466t(@C0359n0 C9587f fVar) {
        return m35855f(new C9554b(fVar));
    }

    @C0359n0
    /* renamed from: u */
    public C9596k mo19467u(@C0359n0 C9586e<T> eVar) {
        C9550c<C9586e<T>, C9596k> cVar = this.f26143a;
        if (cVar != null) {
            return cVar.apply(eVar);
        }
        return C9596k.m35945c();
    }

    @C0359n0
    /* renamed from: v */
    public C9551d<T> mo19468v(@C0359n0 C9587f fVar) {
        return m35855f(new C9559c(fVar));
    }

    public C9551d(@C0363p0 C9550c<C9586e<T>, C9596k> cVar) {
        this.f26143a = cVar;
    }
}
