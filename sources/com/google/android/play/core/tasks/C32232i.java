package com.google.android.play.core.tasks;

/* renamed from: com.google.android.play.core.tasks.i */
public final class C32232i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C32227d f78579a;

    /* renamed from: b */
    public final /* synthetic */ C32234k f78580b;

    public C32232i(C32234k kVar, C32227d dVar) {
        this.f78580b = kVar;
        this.f78579a = dVar;
    }

    public final void run() {
        synchronized (this.f78580b.f78582b) {
            if (this.f78580b.f78583c != null) {
                this.f78580b.f78583c.onFailure(this.f78579a.mo93019g());
            }
        }
    }
}
