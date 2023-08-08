package com.urbanairship.util;

import com.urbanairship.util.RetryingExecutor;

/* renamed from: com.urbanairship.util.j0 */
public final /* synthetic */ class C9657j0 implements RetryingExecutor.C9634c {

    /* renamed from: a */
    public final /* synthetic */ Runnable f26469a;

    public /* synthetic */ C9657j0(Runnable runnable) {
        this.f26469a = runnable;
    }

    public final RetryingExecutor.C9635d run() {
        return this.f26469a.run();
    }
}
