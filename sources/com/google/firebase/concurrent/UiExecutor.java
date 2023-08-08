package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public enum UiExecutor implements Executor {
    INSTANCE;
    
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: b */
    public static final Handler f79141b = null;

    /* access modifiers changed from: public */
    static {
        f79141b = new Handler(Looper.getMainLooper());
    }

    public void execute(Runnable runnable) {
        f79141b.post(runnable);
    }
}
