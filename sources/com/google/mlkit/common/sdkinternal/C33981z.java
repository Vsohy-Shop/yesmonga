package com.google.mlkit.common.sdkinternal;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.mlkit.common.sdkinternal.z */
public final /* synthetic */ class C33981z implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ ThreadFactory f82488a;

    public /* synthetic */ C33981z(ThreadFactory threadFactory) {
        this.f82488a = threadFactory;
    }

    public final Thread newThread(Runnable runnable) {
        return this.f82488a.newThread(new C33980y(runnable));
    }
}
