package com.google.mlkit.common.sdkinternal;

import androidx.annotation.C0359n0;
import java.util.concurrent.Executor;

enum zzh implements Executor {
    INSTANCE;

    public final void execute(@C0359n0 Runnable runnable) {
        C33943h.m136576b().f82364a.post(runnable);
    }
}
