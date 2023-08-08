package com.google.android.gms.analytics;

import android.os.Process;

/* renamed from: com.google.android.gms.analytics.z */
public final class C40414z extends Thread {
    public C40414z(Runnable runnable, String str) {
        super(runnable, str);
    }

    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
