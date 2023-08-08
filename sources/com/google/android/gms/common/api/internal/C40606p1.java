package com.google.android.gms.common.api.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.api.internal.p1 */
public final /* synthetic */ class C40606p1 implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f103537a;

    public /* synthetic */ C40606p1(Handler handler) {
        this.f103537a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f103537a.post(runnable);
    }
}
