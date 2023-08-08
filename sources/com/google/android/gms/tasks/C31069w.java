package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.w */
public final class C31069w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31047k f74342a;

    /* renamed from: b */
    public final /* synthetic */ C31070x f74343b;

    public C31069w(C31070x xVar, C31047k kVar) {
        this.f74343b = xVar;
        this.f74342a = kVar;
    }

    public final void run() {
        if (this.f74342a.mo87736t()) {
            this.f74343b.f74346c.mo87752A();
            return;
        }
        try {
            this.f74343b.f74346c.mo87760z(this.f74343b.f74345b.mo85756a(this.f74342a));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f74343b.f74346c.mo87759y((Exception) e.getCause());
            } else {
                this.f74343b.f74346c.mo87759y(e);
            }
        } catch (Exception e2) {
            this.f74343b.f74346c.mo87759y(e2);
        }
    }
}
