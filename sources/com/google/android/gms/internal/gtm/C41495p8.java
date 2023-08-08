package com.google.android.gms.internal.gtm;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.gtm.p8 */
public final class C41495p8 implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "google-tag-manager-background-thread");
    }
}
