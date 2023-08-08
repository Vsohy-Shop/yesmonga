package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.logging.C40195a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.datatransport.runtime.p */
public class C40199p implements Executor {

    /* renamed from: a */
    public final Executor f102454a;

    /* renamed from: com.google.android.datatransport.runtime.p$a */
    public static class C40200a implements Runnable {

        /* renamed from: a */
        public final Runnable f102455a;

        public C40200a(Runnable runnable) {
            this.f102455a = runnable;
        }

        public void run() {
            try {
                this.f102455a.run();
            } catch (Exception e) {
                C40195a.m163495f("Executor", "Background execution failure.", e);
            }
        }
    }

    public C40199p(Executor executor) {
        this.f102454a = executor;
    }

    public void execute(Runnable runnable) {
        this.f102454a.execute(new C40200a(runnable));
    }
}
