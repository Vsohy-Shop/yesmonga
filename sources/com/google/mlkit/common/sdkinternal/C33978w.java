package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.tasks.C31049l;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;

/* renamed from: com.google.mlkit.common.sdkinternal.w */
public final /* synthetic */ class C33978w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Callable f82484a;

    /* renamed from: b */
    public final /* synthetic */ C31049l f82485b;

    public /* synthetic */ C33978w(Callable callable, C31049l lVar) {
        this.f82484a = callable;
        this.f82485b = lVar;
    }

    public final void run() {
        Callable callable = this.f82484a;
        C31049l lVar = this.f82485b;
        try {
            lVar.mo87743c(callable.call());
        } catch (MlKitException e) {
            lVar.mo87742b(e);
        } catch (Exception e2) {
            lVar.mo87742b(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e2));
        }
    }
}
