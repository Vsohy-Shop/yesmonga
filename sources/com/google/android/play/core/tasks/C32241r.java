package com.google.android.play.core.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.r */
public final class C32241r implements Executor {

    /* renamed from: a */
    public final Handler f78593a = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f78593a.post(runnable);
    }
}
