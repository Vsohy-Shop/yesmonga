package androidx.dynamicanimation.animation;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.annotation.C0376v0;
import androidx.collection.C1886l;
import java.util.ArrayList;

/* renamed from: androidx.dynamicanimation.animation.a */
public class C18967a {

    /* renamed from: g */
    public static final long f48271g = 10;

    /* renamed from: h */
    public static final ThreadLocal<C18967a> f48272h = new ThreadLocal<>();

    /* renamed from: a */
    public final C1886l<C18969b, Long> f48273a = new C1886l<>();

    /* renamed from: b */
    public final ArrayList<C18969b> f48274b = new ArrayList<>();

    /* renamed from: c */
    public final C18968a f48275c = new C18968a();

    /* renamed from: d */
    public C18970c f48276d;

    /* renamed from: e */
    public long f48277e = 0;

    /* renamed from: f */
    public boolean f48278f = false;

    /* renamed from: androidx.dynamicanimation.animation.a$a */
    public class C18968a {
        public C18968a() {
        }

        /* renamed from: a */
        public void mo55846a() {
            C18967a.this.f48277e = SystemClock.uptimeMillis();
            C18967a aVar = C18967a.this;
            aVar.mo55841c(aVar.f48277e);
            if (C18967a.this.f48274b.size() > 0) {
                C18967a.this.mo55842f().mo55848a();
            }
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.a$b */
    public interface C18969b {
        /* renamed from: a */
        boolean mo55847a(long j);
    }

    /* renamed from: androidx.dynamicanimation.animation.a$c */
    public static abstract class C18970c {

        /* renamed from: a */
        public final C18968a f48280a;

        public C18970c(C18968a aVar) {
            this.f48280a = aVar;
        }

        /* renamed from: a */
        public abstract void mo55848a();
    }

    /* renamed from: androidx.dynamicanimation.animation.a$d */
    public static class C18971d extends C18970c {

        /* renamed from: b */
        public final Runnable f48281b = new C18972a();

        /* renamed from: c */
        public final Handler f48282c = new Handler(Looper.myLooper());

        /* renamed from: d */
        public long f48283d = -1;

        /* renamed from: androidx.dynamicanimation.animation.a$d$a */
        public class C18972a implements Runnable {
            public C18972a() {
            }

            public void run() {
                C18971d.this.f48283d = SystemClock.uptimeMillis();
                C18971d.this.f48280a.mo55846a();
            }
        }

        public C18971d(C18968a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        public void mo55848a() {
            this.f48282c.postDelayed(this.f48281b, Math.max(10 - (SystemClock.uptimeMillis() - this.f48283d), 0));
        }
    }

    @C0376v0(16)
    /* renamed from: androidx.dynamicanimation.animation.a$e */
    public static class C18973e extends C18970c {

        /* renamed from: b */
        public final Choreographer f48285b = Choreographer.getInstance();

        /* renamed from: c */
        public final Choreographer.FrameCallback f48286c = new C18974a();

        /* renamed from: androidx.dynamicanimation.animation.a$e$a */
        public class C18974a implements Choreographer.FrameCallback {
            public C18974a() {
            }

            public void doFrame(long j) {
                C18973e.this.f48280a.mo55846a();
            }
        }

        public C18973e(C18968a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        public void mo55848a() {
            this.f48285b.postFrameCallback(this.f48286c);
        }
    }

    /* renamed from: d */
    public static long m88677d() {
        ThreadLocal<C18967a> threadLocal = f48272h;
        if (threadLocal.get() == null) {
            return 0;
        }
        return threadLocal.get().f48277e;
    }

    /* renamed from: e */
    public static C18967a m88678e() {
        ThreadLocal<C18967a> threadLocal = f48272h;
        if (threadLocal.get() == null) {
            threadLocal.set(new C18967a());
        }
        return threadLocal.get();
    }

    /* renamed from: a */
    public void mo55839a(C18969b bVar, long j) {
        if (this.f48274b.size() == 0) {
            mo55842f().mo55848a();
        }
        if (!this.f48274b.contains(bVar)) {
            this.f48274b.add(bVar);
        }
        if (j > 0) {
            this.f48273a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    /* renamed from: b */
    public final void mo55840b() {
        if (this.f48278f) {
            for (int size = this.f48274b.size() - 1; size >= 0; size--) {
                if (this.f48274b.get(size) == null) {
                    this.f48274b.remove(size);
                }
            }
            this.f48278f = false;
        }
    }

    /* renamed from: c */
    public void mo55841c(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f48274b.size(); i++) {
            C18969b bVar = this.f48274b.get(i);
            if (bVar != null && mo55843g(bVar, uptimeMillis)) {
                bVar.mo55847a(j);
            }
        }
        mo55840b();
    }

    /* renamed from: f */
    public C18970c mo55842f() {
        if (this.f48276d == null) {
            this.f48276d = new C18973e(this.f48275c);
        }
        return this.f48276d;
    }

    /* renamed from: g */
    public final boolean mo55843g(C18969b bVar, long j) {
        Long l = this.f48273a.get(bVar);
        if (l == null) {
            return true;
        }
        if (l.longValue() >= j) {
            return false;
        }
        this.f48273a.remove(bVar);
        return true;
    }

    /* renamed from: h */
    public void mo55844h(C18969b bVar) {
        this.f48273a.remove(bVar);
        int indexOf = this.f48274b.indexOf(bVar);
        if (indexOf >= 0) {
            this.f48274b.set(indexOf, (Object) null);
            this.f48278f = true;
        }
    }

    /* renamed from: i */
    public void mo55845i(C18970c cVar) {
        this.f48276d = cVar;
    }
}
