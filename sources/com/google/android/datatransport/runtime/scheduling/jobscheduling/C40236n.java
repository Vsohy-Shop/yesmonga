package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.C40203r;
import com.google.android.datatransport.runtime.synchronization.C40306a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.n */
public final /* synthetic */ class C40236n implements C40306a.C40307a {

    /* renamed from: a */
    public final /* synthetic */ C40240r f102536a;

    /* renamed from: b */
    public final /* synthetic */ Iterable f102537b;

    /* renamed from: c */
    public final /* synthetic */ C40203r f102538c;

    /* renamed from: d */
    public final /* synthetic */ long f102539d;

    public /* synthetic */ C40236n(C40240r rVar, Iterable iterable, C40203r rVar2, long j) {
        this.f102536a = rVar;
        this.f102537b = iterable;
        this.f102538c = rVar2;
        this.f102539d = j;
    }

    public final Object execute() {
        return this.f102536a.m163603n(this.f102537b, this.f102538c, this.f102539d);
    }
}
