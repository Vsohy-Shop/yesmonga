package com.google.android.play.core.tasks;

/* renamed from: com.google.android.play.core.tasks.g */
public final class C32230g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C32227d f78574a;

    /* renamed from: b */
    public final /* synthetic */ C32231h f78575b;

    public C32230g(C32231h hVar, C32227d dVar) {
        this.f78575b = hVar;
        this.f78574a = dVar;
    }

    public final void run() {
        synchronized (this.f78575b.f78577b) {
            if (this.f78575b.f78578c != null) {
                this.f78575b.f78578c.mo21579a(this.f78574a);
            }
        }
    }
}
