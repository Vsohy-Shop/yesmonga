package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0359n0;
import com.google.android.gms.internal.tasks.C30305a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.o0 */
public final class C31056o0 implements Executor {

    /* renamed from: a */
    public final Handler f74316a = new C30305a(Looper.getMainLooper());

    public final void execute(@C0359n0 Runnable runnable) {
        this.f74316a.post(runnable);
    }
}
