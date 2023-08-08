package androidx.recyclerview.widget;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.C20141h0;
import androidx.recyclerview.widget.C20155i0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.recyclerview.widget.v */
public class C20212v<T> implements C20141h0<T> {

    /* renamed from: androidx.recyclerview.widget.v$a */
    public class C20213a implements C20141h0.C20143b<T> {

        /* renamed from: f */
        public static final int f52167f = 1;

        /* renamed from: g */
        public static final int f52168g = 2;

        /* renamed from: h */
        public static final int f52169h = 3;

        /* renamed from: a */
        public final C20217c f52170a = new C20217c();

        /* renamed from: b */
        public final Handler f52171b = new Handler(Looper.getMainLooper());

        /* renamed from: c */
        public Runnable f52172c = new C20214a();

        /* renamed from: d */
        public final /* synthetic */ C20141h0.C20143b f52173d;

        /* renamed from: androidx.recyclerview.widget.v$a$a */
        public class C20214a implements Runnable {
            public C20214a() {
            }

            public void run() {
                C20218d a = C20213a.this.f52170a.mo60678a();
                while (a != null) {
                    int i = a.f52191b;
                    if (i == 1) {
                        C20213a.this.f52173d.mo60295c(a.f52192c, a.f52193d);
                    } else if (i == 2) {
                        C20213a.this.f52173d.mo60294b(a.f52192c, (C20155i0.C20156a) a.f52197h);
                    } else if (i != 3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unsupported message, what=");
                        sb.append(a.f52191b);
                    } else {
                        C20213a.this.f52173d.mo60293a(a.f52192c, a.f52193d);
                    }
                    a = C20213a.this.f52170a.mo60678a();
                }
            }
        }

        public C20213a(C20141h0.C20143b bVar) {
            this.f52173d = bVar;
        }

        /* renamed from: a */
        public void mo60293a(int i, int i2) {
            mo60672d(C20218d.m94556a(3, i, i2));
        }

        /* renamed from: b */
        public void mo60294b(int i, C20155i0.C20156a<T> aVar) {
            mo60672d(C20218d.m94558c(2, i, aVar));
        }

        /* renamed from: c */
        public void mo60295c(int i, int i2) {
            mo60672d(C20218d.m94556a(1, i, i2));
        }

        /* renamed from: d */
        public final void mo60672d(C20218d dVar) {
            this.f52170a.mo60680c(dVar);
            this.f52171b.post(this.f52172c);
        }
    }

    /* renamed from: androidx.recyclerview.widget.v$b */
    public class C20215b implements C20141h0.C20142a<T> {

        /* renamed from: g */
        public static final int f52176g = 1;

        /* renamed from: h */
        public static final int f52177h = 2;

        /* renamed from: i */
        public static final int f52178i = 3;

        /* renamed from: j */
        public static final int f52179j = 4;

        /* renamed from: a */
        public final C20217c f52180a = new C20217c();

        /* renamed from: b */
        public final Executor f52181b = AsyncTask.THREAD_POOL_EXECUTOR;

        /* renamed from: c */
        public AtomicBoolean f52182c = new AtomicBoolean(false);

        /* renamed from: d */
        public Runnable f52183d = new C20216a();

        /* renamed from: e */
        public final /* synthetic */ C20141h0.C20142a f52184e;

        /* renamed from: androidx.recyclerview.widget.v$b$a */
        public class C20216a implements Runnable {
            public C20216a() {
            }

            public void run() {
                while (true) {
                    C20218d a = C20215b.this.f52180a.mo60678a();
                    if (a == null) {
                        C20215b.this.f52182c.set(false);
                        return;
                    }
                    int i = a.f52191b;
                    if (i == 1) {
                        C20215b.this.f52180a.mo60679b(1);
                        C20215b.this.f52184e.mo60300c(a.f52192c);
                    } else if (i == 2) {
                        C20215b.this.f52180a.mo60679b(2);
                        C20215b.this.f52180a.mo60679b(3);
                        C20215b.this.f52184e.mo60298a(a.f52192c, a.f52193d, a.f52194e, a.f52195f, a.f52196g);
                    } else if (i == 3) {
                        C20215b.this.f52184e.mo60299b(a.f52192c, a.f52193d);
                    } else if (i != 4) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unsupported message, what=");
                        sb.append(a.f52191b);
                    } else {
                        C20215b.this.f52184e.mo60301d((C20155i0.C20156a) a.f52197h);
                    }
                }
            }
        }

        public C20215b(C20141h0.C20142a aVar) {
            this.f52184e = aVar;
        }

        /* renamed from: a */
        public void mo60298a(int i, int i2, int i3, int i4, int i5) {
            mo60676g(C20218d.m94557b(2, i, i2, i3, i4, i5, (Object) null));
        }

        /* renamed from: b */
        public void mo60299b(int i, int i2) {
            mo60675f(C20218d.m94556a(3, i, i2));
        }

        /* renamed from: c */
        public void mo60300c(int i) {
            mo60676g(C20218d.m94558c(1, i, (Object) null));
        }

        /* renamed from: d */
        public void mo60301d(C20155i0.C20156a<T> aVar) {
            mo60675f(C20218d.m94558c(4, 0, aVar));
        }

        /* renamed from: e */
        public final void mo60674e() {
            if (this.f52182c.compareAndSet(false, true)) {
                this.f52181b.execute(this.f52183d);
            }
        }

        /* renamed from: f */
        public final void mo60675f(C20218d dVar) {
            this.f52180a.mo60680c(dVar);
            mo60674e();
        }

        /* renamed from: g */
        public final void mo60676g(C20218d dVar) {
            this.f52180a.mo60681d(dVar);
            mo60674e();
        }
    }

    /* renamed from: androidx.recyclerview.widget.v$c */
    public static class C20217c {

        /* renamed from: a */
        public C20218d f52187a;

        /* renamed from: a */
        public synchronized C20218d mo60678a() {
            C20218d dVar = this.f52187a;
            if (dVar == null) {
                return null;
            }
            this.f52187a = dVar.f52190a;
            return dVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0013  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void mo60679b(int r5) {
            /*
                r4 = this;
                monitor-enter(r4)
            L_0x0001:
                androidx.recyclerview.widget.v$d r0 = r4.f52187a     // Catch:{ all -> 0x0028 }
                if (r0 == 0) goto L_0x0011
                int r1 = r0.f52191b     // Catch:{ all -> 0x0028 }
                if (r1 != r5) goto L_0x0011
                androidx.recyclerview.widget.v$d r1 = r0.f52190a     // Catch:{ all -> 0x0028 }
                r4.f52187a = r1     // Catch:{ all -> 0x0028 }
                r0.mo60682d()     // Catch:{ all -> 0x0028 }
                goto L_0x0001
            L_0x0011:
                if (r0 == 0) goto L_0x0026
                androidx.recyclerview.widget.v$d r1 = r0.f52190a     // Catch:{ all -> 0x0028 }
            L_0x0015:
                if (r1 == 0) goto L_0x0026
                androidx.recyclerview.widget.v$d r2 = r1.f52190a     // Catch:{ all -> 0x0028 }
                int r3 = r1.f52191b     // Catch:{ all -> 0x0028 }
                if (r3 != r5) goto L_0x0023
                r0.f52190a = r2     // Catch:{ all -> 0x0028 }
                r1.mo60682d()     // Catch:{ all -> 0x0028 }
                goto L_0x0024
            L_0x0023:
                r0 = r1
            L_0x0024:
                r1 = r2
                goto L_0x0015
            L_0x0026:
                monitor-exit(r4)
                return
            L_0x0028:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C20212v.C20217c.mo60679b(int):void");
        }

        /* renamed from: c */
        public synchronized void mo60680c(C20218d dVar) {
            C20218d dVar2 = this.f52187a;
            if (dVar2 == null) {
                this.f52187a = dVar;
                return;
            }
            while (true) {
                C20218d dVar3 = dVar2.f52190a;
                if (dVar3 != null) {
                    dVar2 = dVar3;
                } else {
                    dVar2.f52190a = dVar;
                    return;
                }
            }
        }

        /* renamed from: d */
        public synchronized void mo60681d(C20218d dVar) {
            dVar.f52190a = this.f52187a;
            this.f52187a = dVar;
        }
    }

    /* renamed from: androidx.recyclerview.widget.v$d */
    public static class C20218d {

        /* renamed from: i */
        public static C20218d f52188i;

        /* renamed from: j */
        public static final Object f52189j = new Object();

        /* renamed from: a */
        public C20218d f52190a;

        /* renamed from: b */
        public int f52191b;

        /* renamed from: c */
        public int f52192c;

        /* renamed from: d */
        public int f52193d;

        /* renamed from: e */
        public int f52194e;

        /* renamed from: f */
        public int f52195f;

        /* renamed from: g */
        public int f52196g;

        /* renamed from: h */
        public Object f52197h;

        /* renamed from: a */
        public static C20218d m94556a(int i, int i2, int i3) {
            return m94557b(i, i2, i3, 0, 0, 0, (Object) null);
        }

        /* renamed from: b */
        public static C20218d m94557b(int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            C20218d dVar;
            synchronized (f52189j) {
                dVar = f52188i;
                if (dVar == null) {
                    dVar = new C20218d();
                } else {
                    f52188i = dVar.f52190a;
                    dVar.f52190a = null;
                }
                dVar.f52191b = i;
                dVar.f52192c = i2;
                dVar.f52193d = i3;
                dVar.f52194e = i4;
                dVar.f52195f = i5;
                dVar.f52196g = i6;
                dVar.f52197h = obj;
            }
            return dVar;
        }

        /* renamed from: c */
        public static C20218d m94558c(int i, int i2, Object obj) {
            return m94557b(i, i2, 0, 0, 0, 0, obj);
        }

        /* renamed from: d */
        public void mo60682d() {
            this.f52190a = null;
            this.f52196g = 0;
            this.f52195f = 0;
            this.f52194e = 0;
            this.f52193d = 0;
            this.f52192c = 0;
            this.f52191b = 0;
            this.f52197h = null;
            synchronized (f52189j) {
                C20218d dVar = f52188i;
                if (dVar != null) {
                    this.f52190a = dVar;
                }
                f52188i = this;
            }
        }
    }

    /* renamed from: a */
    public C20141h0.C20142a<T> mo60425a(C20141h0.C20142a<T> aVar) {
        return new C20215b(aVar);
    }

    /* renamed from: b */
    public C20141h0.C20143b<T> mo60426b(C20141h0.C20143b<T> bVar) {
        return new C20213a(bVar);
    }
}
