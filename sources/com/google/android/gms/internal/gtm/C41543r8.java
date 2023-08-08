package com.google.android.gms.internal.gtm;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.gtm.r8 */
public final class C41543r8 implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "google-tag-manager-scheduler-thread");
    }
}
