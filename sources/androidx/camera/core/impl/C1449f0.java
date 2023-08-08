package androidx.camera.core.impl;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.C32487a;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.f0 */
public final /* synthetic */ class C1449f0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Executor f4203a;

    /* renamed from: b */
    public final /* synthetic */ C32487a f4204b;

    /* renamed from: c */
    public final /* synthetic */ CallbackToFutureAdapter.C16559a f4205c;

    /* renamed from: d */
    public final /* synthetic */ long f4206d;

    public /* synthetic */ C1449f0(Executor executor, C32487a aVar, CallbackToFutureAdapter.C16559a aVar2, long j) {
        this.f4203a = executor;
        this.f4204b = aVar;
        this.f4205c = aVar2;
        this.f4206d = j;
    }

    public final void run() {
        this.f4203a.execute(new C1446e0(this.f4204b, this.f4205c, this.f4206d));
    }
}
