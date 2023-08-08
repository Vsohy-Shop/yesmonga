package com.urbanairship.reactive;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.reactive.k */
public class C9596k {
    @C0363p0

    /* renamed from: a */
    public Runnable f26246a;

    /* renamed from: b */
    public boolean f26247b = false;

    public C9596k() {
    }

    @C0359n0
    /* renamed from: b */
    public static C9596k m35944b(@C0363p0 Runnable runnable) {
        return new C9596k(runnable);
    }

    @C0359n0
    /* renamed from: c */
    public static C9596k m35945c() {
        return new C9596k();
    }

    /* renamed from: a */
    public synchronized void mo19457a() {
        Runnable runnable = this.f26246a;
        if (runnable != null) {
            runnable.run();
            this.f26246a = null;
        }
        this.f26247b = true;
    }

    /* renamed from: d */
    public synchronized boolean mo19508d() {
        return this.f26247b;
    }

    public C9596k(@C0363p0 Runnable runnable) {
        this.f26246a = runnable;
    }
}
