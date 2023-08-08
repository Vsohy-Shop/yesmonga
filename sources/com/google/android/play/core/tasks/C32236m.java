package com.google.android.play.core.tasks;

import android.support.annotation.Nullable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.m */
public final class C32236m<ResultT> implements C32237n<ResultT> {

    /* renamed from: a */
    public final Executor f78586a;

    /* renamed from: b */
    public final Object f78587b = new Object();
    @Nullable

    /* renamed from: c */
    public final C32226c<? super ResultT> f78588c;

    public C32236m(Executor executor, C32226c<? super ResultT> cVar) {
        this.f78586a = executor;
        this.f78588c = cVar;
    }

    /* renamed from: a */
    public final void mo93025a(C32227d<ResultT> dVar) {
        if (dVar.mo93023k()) {
            synchronized (this.f78587b) {
                if (this.f78588c != null) {
                    this.f78586a.execute(new C32235l(this, dVar));
                }
            }
        }
    }
}
