package com.google.android.play.core.tasks;

/* renamed from: com.google.android.play.core.tasks.l */
public final class C32235l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C32227d f78584a;

    /* renamed from: b */
    public final /* synthetic */ C32236m f78585b;

    public C32235l(C32236m mVar, C32227d dVar) {
        this.f78585b = mVar;
        this.f78584a = dVar;
    }

    public final void run() {
        synchronized (this.f78585b.f78587b) {
            if (this.f78585b.f78588c != null) {
                this.f78585b.f78588c.mo32778a(this.f78584a.mo93020h());
            }
        }
    }
}
