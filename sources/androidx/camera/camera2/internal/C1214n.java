package androidx.camera.camera2.internal;

import androidx.camera.core.impl.C1448f;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.internal.n */
public final /* synthetic */ class C1214n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1254v f3486a;

    /* renamed from: b */
    public final /* synthetic */ Executor f3487b;

    /* renamed from: c */
    public final /* synthetic */ C1448f f3488c;

    public /* synthetic */ C1214n(C1254v vVar, Executor executor, C1448f fVar) {
        this.f3486a = vVar;
        this.f3487b = executor;
        this.f3488c = fVar;
    }

    public final void run() {
        this.f3486a.m5154X(this.f3487b, this.f3488c);
    }
}
