package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.tasks.e0 */
public final class C31036e0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31047k f74293a;

    /* renamed from: b */
    public final /* synthetic */ C31038f0 f74294b;

    public C31036e0(C31038f0 f0Var, C31047k kVar) {
        this.f74294b = f0Var;
        this.f74293a = kVar;
    }

    public final void run() {
        synchronized (this.f74294b.f74296b) {
            C31038f0 f0Var = this.f74294b;
            if (f0Var.f74297c != null) {
                f0Var.f74297c.onFailure((Exception) C40843u.m166202l(this.f74293a.mo87733q()));
            }
        }
    }
}
