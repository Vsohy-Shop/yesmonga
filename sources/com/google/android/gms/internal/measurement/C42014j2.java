package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.measurement.j2 */
public final class C42014j2 implements ThreadFactory {

    /* renamed from: a */
    public final ThreadFactory f106231a = Executors.defaultThreadFactory();

    public C42014j2(C41979h3 h3Var) {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f106231a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
