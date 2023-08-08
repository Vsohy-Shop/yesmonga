package androidx.lifecycle;

import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.arch.core.executor.C0829c;
import androidx.arch.core.internal.C0836b;
import androidx.lifecycle.Lifecycle;
import java.util.Iterator;
import java.util.Map;

public abstract class LiveData<T> {

    /* renamed from: k */
    public static final int f49694k = -1;

    /* renamed from: l */
    public static final Object f49695l = new Object();

    /* renamed from: a */
    public final Object f49696a;

    /* renamed from: b */
    public C0836b<C19426h0<? super T>, LiveData<T>.c> f49697b;

    /* renamed from: c */
    public int f49698c;

    /* renamed from: d */
    public boolean f49699d;

    /* renamed from: e */
    public volatile Object f49700e;

    /* renamed from: f */
    public volatile Object f49701f;

    /* renamed from: g */
    public int f49702g;

    /* renamed from: h */
    public boolean f49703h;

    /* renamed from: i */
    public boolean f49704i;

    /* renamed from: j */
    public final Runnable f49705j;

    public class LifecycleBoundObserver extends LiveData<T>.c implements C19470t {
        @C0359n0

        /* renamed from: e */
        public final C19499w f49706e;

        public LifecycleBoundObserver(@C0359n0 C19499w wVar, C19426h0<? super T> h0Var) {
            super(h0Var);
            this.f49706e = wVar;
        }

        /* renamed from: b */
        public void mo57497b() {
            this.f49706e.getLifecycle().mo57467d(this);
        }

        /* renamed from: c */
        public boolean mo57498c(C19499w wVar) {
            return this.f49706e == wVar;
        }

        /* renamed from: d */
        public boolean mo57499d() {
            return this.f49706e.getLifecycle().mo57465b().mo57474q(Lifecycle.State.STARTED);
        }

        /* renamed from: i */
        public void mo750i(@C0359n0 C19499w wVar, @C0359n0 Lifecycle.C19372Event event) {
            Lifecycle.State b = this.f49706e.getLifecycle().mo57465b();
            if (b == Lifecycle.State.DESTROYED) {
                LiveData.this.mo57494p(this.f49710a);
                return;
            }
            Lifecycle.State state = null;
            while (state != b) {
                mo57501a(mo57499d());
                state = b;
                b = this.f49706e.getLifecycle().mo57465b();
            }
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    public class C19376a implements Runnable {
        public C19376a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f49696a) {
                obj = LiveData.this.f49701f;
                LiveData.this.f49701f = LiveData.f49695l;
            }
            LiveData.this.mo57496r(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    public class C19377b extends LiveData<T>.c {
        public C19377b(C19426h0<? super T> h0Var) {
            super(h0Var);
        }

        /* renamed from: d */
        public boolean mo57499d() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    public abstract class C19378c {

        /* renamed from: a */
        public final C19426h0<? super T> f49710a;

        /* renamed from: b */
        public boolean f49711b;

        /* renamed from: c */
        public int f49712c = -1;

        public C19378c(C19426h0<? super T> h0Var) {
            this.f49710a = h0Var;
        }

        /* renamed from: a */
        public void mo57501a(boolean z) {
            int i;
            if (z != this.f49711b) {
                this.f49711b = z;
                LiveData liveData = LiveData.this;
                if (z) {
                    i = 1;
                } else {
                    i = -1;
                }
                liveData.mo57484c(i);
                if (this.f49711b) {
                    LiveData.this.mo57486e(this);
                }
            }
        }

        /* renamed from: b */
        public void mo57497b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo57498c(C19499w wVar) {
            return false;
        }

        /* renamed from: d */
        public abstract boolean mo57499d();
    }

    public LiveData(T t) {
        this.f49696a = new Object();
        this.f49697b = new C0836b<>();
        this.f49698c = 0;
        this.f49701f = f49695l;
        this.f49705j = new C19376a();
        this.f49700e = t;
        this.f49702g = 0;
    }

    /* renamed from: b */
    public static void m90541b(String str) {
        if (!C0829c.m3971h().mo3796c()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    @C0353k0
    /* renamed from: c */
    public void mo57484c(int i) {
        boolean z;
        boolean z2;
        int i2 = this.f49698c;
        this.f49698c = i + i2;
        if (!this.f49699d) {
            this.f49699d = true;
            while (true) {
                try {
                    int i3 = this.f49698c;
                    if (i2 != i3) {
                        if (i2 != 0 || i3 <= 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (i2 <= 0 || i3 != 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z) {
                            mo57444m();
                        } else if (z2) {
                            mo57445n();
                        }
                        i2 = i3;
                    } else {
                        return;
                    }
                } finally {
                    this.f49699d = false;
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo57485d(LiveData<T>.c cVar) {
        if (cVar.f49711b) {
            if (!cVar.mo57499d()) {
                cVar.mo57501a(false);
                return;
            }
            int i = cVar.f49712c;
            int i2 = this.f49702g;
            if (i < i2) {
                cVar.f49712c = i2;
                cVar.f49710a.mo4590a(this.f49700e);
            }
        }
    }

    /* renamed from: e */
    public void mo57486e(@C0363p0 LiveData<T>.c cVar) {
        if (this.f49703h) {
            this.f49704i = true;
            return;
        }
        this.f49703h = true;
        do {
            this.f49704i = false;
            if (cVar == null) {
                C0836b<K, V>.d i = this.f49697b.mo3810i();
                while (i.hasNext()) {
                    mo57485d((C19378c) ((Map.Entry) i.next()).getValue());
                    if (this.f49704i) {
                        break;
                    }
                }
            } else {
                mo57485d(cVar);
                cVar = null;
            }
        } while (this.f49704i);
        this.f49703h = false;
    }

    @C0363p0
    /* renamed from: f */
    public T mo4610f() {
        T t = this.f49700e;
        if (t != f49695l) {
            return t;
        }
        return null;
    }

    /* renamed from: g */
    public int mo57487g() {
        return this.f49702g;
    }

    /* renamed from: h */
    public boolean mo57488h() {
        return this.f49698c > 0;
    }

    /* renamed from: i */
    public boolean mo57489i() {
        return this.f49697b.size() > 0;
    }

    /* renamed from: j */
    public boolean mo57490j() {
        return this.f49700e != f49695l;
    }

    @C0353k0
    /* renamed from: k */
    public void mo57491k(@C0359n0 C19499w wVar, @C0359n0 C19426h0<? super T> h0Var) {
        m90541b("observe");
        if (wVar.getLifecycle().mo57465b() != Lifecycle.State.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(wVar, h0Var);
            C19378c r = this.f49697b.mo3803r(h0Var, lifecycleBoundObserver);
            if (r != null && !r.mo57498c(wVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (r == null) {
                wVar.getLifecycle().mo57464a(lifecycleBoundObserver);
            }
        }
    }

    @C0353k0
    /* renamed from: l */
    public void mo57492l(@C0359n0 C19426h0<? super T> h0Var) {
        m90541b("observeForever");
        C19377b bVar = new C19377b(h0Var);
        C19378c r = this.f49697b.mo3803r(h0Var, bVar);
        if (r instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (r == null) {
            bVar.mo57501a(true);
        }
    }

    /* renamed from: m */
    public void mo57444m() {
    }

    /* renamed from: n */
    public void mo57445n() {
    }

    /* renamed from: o */
    public void mo57493o(T t) {
        boolean z;
        synchronized (this.f49696a) {
            if (this.f49701f == f49695l) {
                z = true;
            } else {
                z = false;
            }
            this.f49701f = t;
        }
        if (z) {
            C0829c.m3971h().mo3797d(this.f49705j);
        }
    }

    @C0353k0
    /* renamed from: p */
    public void mo57494p(@C0359n0 C19426h0<? super T> h0Var) {
        m90541b("removeObserver");
        C19378c w = this.f49697b.mo3804w(h0Var);
        if (w != null) {
            w.mo57497b();
            w.mo57501a(false);
        }
    }

    @C0353k0
    /* renamed from: q */
    public void mo57495q(@C0359n0 C19499w wVar) {
        m90541b("removeObservers");
        Iterator<Map.Entry<C19426h0<? super T>, LiveData<T>.c>> it = this.f49697b.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (((C19378c) next.getValue()).mo57498c(wVar)) {
                mo57494p((C19426h0) next.getKey());
            }
        }
    }

    @C0353k0
    /* renamed from: r */
    public void mo57496r(T t) {
        m90541b("setValue");
        this.f49702g++;
        this.f49700e = t;
        mo57486e((LiveData<T>.c) null);
    }

    public LiveData() {
        this.f49696a = new Object();
        this.f49697b = new C0836b<>();
        this.f49698c = 0;
        Object obj = f49695l;
        this.f49701f = obj;
        this.f49705j = new C19376a();
        this.f49700e = obj;
        this.f49702g = -1;
    }
}
