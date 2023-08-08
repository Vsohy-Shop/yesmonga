package com.google.firebase.crashlytics.internal.common;

import android.os.Process;

/* renamed from: com.google.firebase.crashlytics.internal.common.c */
public abstract class C32671c implements Runnable {
    /* renamed from: a */
    public abstract void mo94860a();

    public final void run() {
        Process.setThreadPriority(10);
        mo94860a();
    }
}
