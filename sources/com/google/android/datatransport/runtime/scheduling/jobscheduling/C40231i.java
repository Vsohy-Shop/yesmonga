package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.C40203r;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.i */
public final /* synthetic */ class C40231i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40240r f102524a;

    /* renamed from: b */
    public final /* synthetic */ C40203r f102525b;

    /* renamed from: c */
    public final /* synthetic */ int f102526c;

    /* renamed from: d */
    public final /* synthetic */ Runnable f102527d;

    public /* synthetic */ C40231i(C40240r rVar, C40203r rVar2, int i, Runnable runnable) {
        this.f102524a = rVar;
        this.f102525b = rVar2;
        this.f102526c = i;
        this.f102527d = runnable;
    }

    public final void run() {
        this.f102524a.m163609t(this.f102525b, this.f102526c, this.f102527d);
    }
}
