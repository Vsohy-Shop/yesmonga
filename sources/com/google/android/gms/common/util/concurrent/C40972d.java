package com.google.android.gms.common.util.concurrent;

import android.os.Process;

/* renamed from: com.google.android.gms.common.util.concurrent.d */
public final class C40972d implements Runnable {

    /* renamed from: a */
    public final Runnable f104217a;

    public C40972d(Runnable runnable, int i) {
        this.f104217a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.f104217a.run();
    }
}
