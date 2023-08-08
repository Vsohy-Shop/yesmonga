package com.google.android.play.core.internal;

import android.support.annotation.Nullable;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.internal.l */
public abstract class C32065l implements Runnable {
    @Nullable

    /* renamed from: a */
    public final C32239p<?> f78277a;

    public C32065l() {
        this.f78277a = null;
    }

    /* renamed from: a */
    public abstract void mo92420a();

    /* renamed from: b */
    public final void mo92784b(Exception exc) {
        C32239p<?> pVar = this.f78277a;
        if (pVar != null) {
            pVar.mo93033d(exc);
        }
    }

    @Nullable
    /* renamed from: c */
    public final C32239p<?> mo92785c() {
        return this.f78277a;
    }

    public final void run() {
        try {
            mo92420a();
        } catch (Exception e) {
            mo92784b(e);
        }
    }

    public C32065l(@Nullable C32239p<?> pVar) {
        this.f78277a = pVar;
    }
}
