package com.google.android.play.core.tasks;

import android.support.annotation.Nullable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.k */
public final class C32234k<ResultT> implements C32237n<ResultT> {

    /* renamed from: a */
    public final Executor f78581a;

    /* renamed from: b */
    public final Object f78582b = new Object();
    @Nullable

    /* renamed from: c */
    public final C32225b f78583c;

    public C32234k(Executor executor, C32225b bVar) {
        this.f78581a = executor;
        this.f78583c = bVar;
    }

    /* renamed from: a */
    public final void mo93025a(C32227d<ResultT> dVar) {
        if (!dVar.mo93023k()) {
            synchronized (this.f78582b) {
                if (this.f78583c != null) {
                    this.f78581a.execute(new C32232i(this, dVar));
                }
            }
        }
    }
}
