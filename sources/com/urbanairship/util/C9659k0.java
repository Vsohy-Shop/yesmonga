package com.urbanairship.util;

import com.urbanairship.util.RetryingExecutor;

/* renamed from: com.urbanairship.util.k0 */
public final /* synthetic */ class C9659k0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ RetryingExecutor.C9632a f26470a;

    /* renamed from: b */
    public final /* synthetic */ RetryingExecutor.C9634c f26471b;

    /* renamed from: c */
    public final /* synthetic */ long f26472c;

    public /* synthetic */ C9659k0(RetryingExecutor.C9632a aVar, RetryingExecutor.C9634c cVar, long j) {
        this.f26470a = aVar;
        this.f26471b = cVar;
        this.f26472c = j;
    }

    public final void run() {
        this.f26470a.m36109b(this.f26471b, this.f26472c);
    }
}
