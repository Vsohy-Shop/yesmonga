package com.google.android.gms.measurement.internal;

import android.os.Process;
import androidx.annotation.C0323b0;
import com.google.android.gms.common.internal.C40843u;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.measurement.internal.b5 */
public final class C30666b5 extends Thread {

    /* renamed from: a */
    public final Object f73242a;

    /* renamed from: b */
    public final BlockingQueue f73243b;
    @C0323b0("threadLifeCycleLock")

    /* renamed from: c */
    public boolean f73244c = false;

    /* renamed from: d */
    public final /* synthetic */ C30692d5 f73245d;

    public C30666b5(C30692d5 d5Var, String str, BlockingQueue blockingQueue) {
        this.f73245d = d5Var;
        C40843u.m166202l(str);
        C40843u.m166202l(blockingQueue);
        this.f73242a = new Object();
        this.f73243b = blockingQueue;
        setName(str);
    }

    /* renamed from: a */
    public final void mo86896a() {
        synchronized (this.f73242a) {
            this.f73242a.notifyAll();
        }
    }

    /* renamed from: c */
    public final void mo86897c() {
        synchronized (this.f73245d.f73294i) {
            if (!this.f73244c) {
                this.f73245d.f73295j.release();
                this.f73245d.f73294i.notifyAll();
                C30692d5 d5Var = this.f73245d;
                if (this == d5Var.f73288c) {
                    d5Var.f73288c = null;
                } else if (this == d5Var.f73289d) {
                    d5Var.f73289d = null;
                } else {
                    d5Var.f74136a.mo86903d().mo87489r().mo87463a("Current scheduler thread is neither worker nor network");
                }
                this.f73244c = true;
            }
        }
    }

    /* renamed from: d */
    public final void mo86898d(InterruptedException interruptedException) {
        this.f73245d.f74136a.mo86903d().mo87494w().mo87464b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void run() {
        int i;
        boolean z = false;
        while (!z) {
            try {
                this.f73245d.f73295j.acquire();
                z = true;
            } catch (InterruptedException e) {
                mo86898d(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C30653a5 a5Var = (C30653a5) this.f73243b.poll();
                if (a5Var != null) {
                    if (true != a5Var.f73219b) {
                        i = 10;
                    } else {
                        i = threadPriority;
                    }
                    Process.setThreadPriority(i);
                    a5Var.run();
                } else {
                    synchronized (this.f73242a) {
                        if (this.f73243b.peek() == null) {
                            boolean unused = this.f73245d.f73296k;
                            try {
                                this.f73242a.wait(30000);
                            } catch (InterruptedException e2) {
                                mo86898d(e2);
                            }
                        }
                    }
                    synchronized (this.f73245d.f73294i) {
                        if (this.f73243b.peek() == null) {
                            mo86897c();
                            mo86897c();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            mo86897c();
            throw th;
        }
    }
}
