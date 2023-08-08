package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.C40088i;
import com.google.android.datatransport.runtime.C40190j;
import com.google.android.datatransport.runtime.C40203r;

/* renamed from: com.google.android.datatransport.runtime.scheduling.b */
public final /* synthetic */ class C40210b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40211c f102462a;

    /* renamed from: b */
    public final /* synthetic */ C40203r f102463b;

    /* renamed from: c */
    public final /* synthetic */ C40088i f102464c;

    /* renamed from: d */
    public final /* synthetic */ C40190j f102465d;

    public /* synthetic */ C40210b(C40211c cVar, C40203r rVar, C40088i iVar, C40190j jVar) {
        this.f102462a = cVar;
        this.f102463b = rVar;
        this.f102464c = iVar;
        this.f102465d = jVar;
    }

    public final void run() {
        this.f102462a.m163535e(this.f102463b, this.f102464c, this.f102465d);
    }
}
