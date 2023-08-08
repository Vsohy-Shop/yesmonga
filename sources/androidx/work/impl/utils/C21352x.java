package androidx.work.impl.utils;

import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.work.impl.utils.taskexecutor.C21344a;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: androidx.work.impl.utils.x */
public class C21352x implements C21344a {

    /* renamed from: a */
    public final ArrayDeque<C21353a> f55064a = new ArrayDeque<>();

    /* renamed from: b */
    public final Executor f55065b;
    @C0323b0("mLock")

    /* renamed from: c */
    public Runnable f55066c;

    /* renamed from: d */
    public final Object f55067d = new Object();

    /* renamed from: androidx.work.impl.utils.x$a */
    public static class C21353a implements Runnable {

        /* renamed from: a */
        public final C21352x f55068a;

        /* renamed from: b */
        public final Runnable f55069b;

        public C21353a(@C0359n0 C21352x xVar, @C0359n0 Runnable runnable) {
            this.f55068a = xVar;
            this.f55069b = runnable;
        }

        public void run() {
            try {
                this.f55069b.run();
                synchronized (this.f55068a.f55067d) {
                    this.f55068a.mo63706b();
                }
            } catch (Throwable th) {
                synchronized (this.f55068a.f55067d) {
                    this.f55068a.mo63706b();
                    throw th;
                }
            }
        }
    }

    public C21352x(@C0359n0 Executor executor) {
        this.f55065b = executor;
    }

    /* renamed from: W */
    public boolean mo63697W() {
        boolean z;
        synchronized (this.f55067d) {
            if (!this.f55064a.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @C0344h1
    @C0359n0
    /* renamed from: a */
    public Executor mo63705a() {
        return this.f55065b;
    }

    @C0323b0("mLock")
    /* renamed from: b */
    public void mo63706b() {
        Runnable poll = this.f55064a.poll();
        this.f55066c = poll;
        if (poll != null) {
            this.f55065b.execute(poll);
        }
    }

    public void execute(@C0359n0 Runnable runnable) {
        synchronized (this.f55067d) {
            this.f55064a.add(new C21353a(this, runnable));
            if (this.f55066c == null) {
                mo63706b();
            }
        }
    }
}
