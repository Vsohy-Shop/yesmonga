package com.urbanairship.util;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.util.l0 */
public class C9661l0 implements Executor {

    /* renamed from: a */
    public final Executor f26473a;

    /* renamed from: b */
    public final ArrayDeque<Runnable> f26474b = new ArrayDeque<>();

    /* renamed from: c */
    public boolean f26475c = false;

    /* renamed from: com.urbanairship.util.l0$a */
    public class C9662a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Runnable f26476a;

        public C9662a(Runnable runnable) {
            this.f26476a = runnable;
        }

        public void run() {
            try {
                this.f26476a.run();
            } finally {
                C9661l0.this.mo19626b();
            }
        }
    }

    public C9661l0(@C0359n0 Executor executor) {
        this.f26473a = executor;
    }

    /* renamed from: b */
    public final void mo19626b() {
        synchronized (this.f26474b) {
            Runnable pollFirst = this.f26474b.pollFirst();
            if (pollFirst != null) {
                this.f26475c = true;
                this.f26473a.execute(pollFirst);
            } else {
                this.f26475c = false;
            }
        }
    }

    public void execute(@C0363p0 Runnable runnable) {
        if (runnable != null) {
            C9662a aVar = new C9662a(runnable);
            synchronized (this.f26474b) {
                this.f26474b.offer(aVar);
                if (!this.f26475c) {
                    mo19626b();
                }
            }
        }
    }
}
