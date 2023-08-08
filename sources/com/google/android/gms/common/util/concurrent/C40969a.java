package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.internal.common.C41114p;
import java.util.concurrent.Executor;

@C40473a
/* renamed from: com.google.android.gms.common.util.concurrent.a */
public class C40969a implements Executor {

    /* renamed from: a */
    public final Handler f104211a;

    @C40473a
    public C40969a(@C0359n0 Looper looper) {
        this.f104211a = new C41114p(looper);
    }

    public final void execute(@C0359n0 Runnable runnable) {
        this.f104211a.post(runnable);
    }
}
