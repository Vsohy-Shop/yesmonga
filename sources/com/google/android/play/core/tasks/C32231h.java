package com.google.android.play.core.tasks;

import android.support.annotation.Nullable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.h */
public final class C32231h<ResultT> implements C32237n<ResultT> {

    /* renamed from: a */
    public final Executor f78576a;

    /* renamed from: b */
    public final Object f78577b = new Object();
    @Nullable

    /* renamed from: c */
    public final C32224a<ResultT> f78578c;

    public C32231h(Executor executor, C32224a<ResultT> aVar) {
        this.f78576a = executor;
        this.f78578c = aVar;
    }

    /* renamed from: a */
    public final void mo93025a(C32227d<ResultT> dVar) {
        synchronized (this.f78577b) {
            if (this.f78578c != null) {
                this.f78576a.execute(new C32230g(this, dVar));
            }
        }
    }
}
